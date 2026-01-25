package Controllers;

import Models.Experience;
import Models.Sales;
import Repositories.BookingRepo;
import Repositories.ExperiencesRepo;
import Repositories.LoginRepo;
import Repositories.RoomsRepo;

import java.io.FileNotFoundException;

/**
 * Controller responsável por operações administrativas do sistema.
 * Fornece funcionalidades de consulta e estatística para apoio à gestão,
 * utilizando os repositórios de experiências, quartos, reservas e logins.
 */
public class AdminController {

    /** Repositório de experiências disponível no sistema. */
    private ExperiencesRepo experiencesRepo;

    /** Repositório de quartos disponível no sistema. */
    private RoomsRepo roomsRepo;

    /** Repositório de reservas (bookings) do sistema. */
    private BookingRepo bookRepo;

    /** Repositório de credenciais/logins do sistema. */
    private LoginRepo loginRepo;

    /**
     * Constrói uma instância de AdminController e inicializa os repositórios necessários.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicializar os repositórios não for encontrado.
     */
    public AdminController() throws FileNotFoundException {
        this.experiencesRepo = ExperiencesRepo.getInstance();
        this.roomsRepo = RoomsRepo.getInstance();
        this.bookRepo = BookingRepo.getInstance();
        this.loginRepo = LoginRepo.getInstance();
    }

    /**
     * Apresenta uma mensagem indicando que a funcionalidade selecionada não está disponível.
     * Utilizado como feedback visual para opções em construção no menu de administração.
     */
    public void optionNotAvailable() {
        System.out.println("""
　　　　　　　　　　      r@
        ニニニニヽ　　　/ /|｜
　　　　　 ∥.　    / /  |｜
        0( ｡дﾟ) ∥ 　/ /   |｜
        ]( つ¶つ¶　 / / 　 r―､
        ﾄ┳ヽ厂￣`/ /　　  |   |
      ｢￣￣￣L/_/　　　　jjjjj　　　
      （◎￣◎)三)=)三)
      
      Lamentamos o inconveniente, estamos em construção!
    """);
    }

    /**
     * Determina e apresenta a experiência mais procurada por adultos, com base nas vendas registadas.
     * O cálculo é efetuado percorrendo todas as experiências e obtendo a quantidade de adultos
     * associada a cada uma através do modelo Sales.
     *
     * @throws FileNotFoundException se ocorrer falha ao aceder a ficheiros necessários ao cálculo.
     */
    public void expMostPopAdult() throws FileNotFoundException {
        Experience mostPopular = null;
        int maxAdults = -1;

        for (Experience exp : experiencesRepo.getExperienceArrayList()) {
            int adults = Sales.adultsQuant(exp.getExperienceID());
            if (adults > maxAdults) {
                maxAdults = adults;
                mostPopular = exp;
            }
        }
        if (mostPopular != null) {
            System.out.println("\n--- Experiência Mais Procurada (Adultos) ---");
            System.out.println("Nome: " + mostPopular.getExperienceName());
            System.out.println("Total de Adultos: " + maxAdults);
        }
    }

    /**
     * Determina e apresenta a experiência mais procurada por crianças, com base nas vendas registadas.
     * O cálculo é efetuado percorrendo todas as experiências e obtendo a quantidade de crianças
     * associada a cada uma através do modelo Sales.
     *
     * @throws FileNotFoundException se ocorrer falha ao aceder a ficheiros necessários ao cálculo.
     */
    public void expMostPopChild() throws FileNotFoundException {
        Experience mostPopular = null;
        int maxChild = -1;

        for (Experience exp : experiencesRepo.getExperienceArrayList()) {
            int children = Sales.childrenQuant(exp.getExperienceID());
            if (children > maxChild) {
                maxChild = children;
                mostPopular = exp;
            }
        }
        if (mostPopular != null) {
            System.out.println("\n--- Experiência Mais Procurada (Crianças) ---");
            System.out.println("Nome: " + mostPopular.getExperienceName());
            System.out.println("Total de Crianças: " + maxChild);
        }
    }
}