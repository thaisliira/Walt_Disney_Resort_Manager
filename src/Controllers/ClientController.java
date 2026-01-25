package Controllers;

import Models.Room;
import Models.Tipology;
import Repositories.BookingRepo;
import Repositories.ExperiencesRepo;
import Repositories.RoomsRepo;
import Repositories.TipologyRepo;

import java.io.FileNotFoundException;

/**
 * Controller responsável pelas funcionalidades disponíveis para o perfil de Cliente.
 * Disponibiliza operações de consulta de informação do resort, recorrendo aos repositórios
 * de quartos, tipologias, reservas e experiências.
 */
public class ClientController {

    /** Repositório de quartos do sistema. */
    private RoomsRepo roomsRepo;

    /** Repositório de experiências do sistema. */
    private ExperiencesRepo experiencesRepo;

    /** Repositório de reservas (bookings) do sistema. */
    private BookingRepo bookingRepo;

    /** Repositório de tipologias (tipos de quarto) do sistema. */
    private TipologyRepo tipologyRepo;

    /**
     * Constrói uma instância de ClientController e inicializa os repositórios necessários.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicializar os repositórios não for encontrado.
     */
    public ClientController() throws FileNotFoundException {
        this.roomsRepo = RoomsRepo.getInstance();
        this.experiencesRepo = ExperiencesRepo.getInstance();
        this.bookingRepo = BookingRepo.getInstance();
        this.tipologyRepo = TipologyRepo.getInstance();
    }

    /**
     * Apresenta o catálogo de quartos do resort, incluindo número do quarto, tipologia e preço por semana.
     *
     * @throws FileNotFoundException se ocorrer falha ao aceder a ficheiros necessários aos repositórios utilizados.
     */
    public void quartosDisponiveis() throws FileNotFoundException {
        System.out.println("\n====================================================");
        System.out.println("          CATÁLOGO DE QUARTOS DO CESAE RESORT             ");
        System.out.println("====================================================");
        System.out.println("Nº Quarto | Tipologia | Preço/Semana");
        System.out.println("----------------------------------------------------");

        TipologyRepo tipRepo = TipologyRepo.getInstance();

        for (Room roomatual : roomsRepo.getRoomsArrayList()) {
            Tipology tip = tipRepo.getTipologyById(roomatual.getTypologyID());
            if (tip != null) {
                System.out.println(
                        roomatual.getNumQuarto() + " | " +
                                tip.getDescription() + " | " +
                                tip.getTypologyPrice() + "€"
                );
            }
        }
        System.out.println("====================================================\n");
    }

    /**
     * Apresenta uma mensagem indicando que a funcionalidade selecionada não está disponível.
     * Utilizado como feedback visual para opções em construção no menu de cliente.
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
}
