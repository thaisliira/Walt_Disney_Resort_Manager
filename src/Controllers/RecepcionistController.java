package Controllers;

import Models.Room;
import Models.Tipology;
import Repositories.BookingRepo;
import Repositories.ExperiencesRepo;
import Repositories.RoomsRepo;
import Repositories.TipologyRepo;

import java.io.FileNotFoundException;

/**
 * Controller responsável pelas funcionalidades do perfil de Recepcionista/Gestão.
 * Permite consultar quartos disponíveis na semana atual e disponibiliza mensagens
 * de feedback para funcionalidades ainda não implementadas.
 */
public class RecepcionistController {

    /** Repositório de quartos do sistema. */
    private RoomsRepo roomsRepo;

    /** Repositório de experiências do sistema. */
    private ExperiencesRepo experiencesRepo;

    /** Repositório de reservas (bookings) do sistema. */
    private BookingRepo bookingRepo;

    /** Repositório de tipologias (tipos de quarto) do sistema. */
    private TipologyRepo tipologyRepo;

    /**
     * Constrói uma instância de RecepcionistController e inicializa os repositórios necessários.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para inicializar os repositórios não for encontrado.
     */
    public RecepcionistController() throws FileNotFoundException {
        this.roomsRepo = RoomsRepo.getInstance();
        this.experiencesRepo = ExperiencesRepo.getInstance();
        this.bookingRepo = BookingRepo.getInstance();
        this.tipologyRepo = TipologyRepo.getInstance();
    }

    /**
     * Apresenta o catálogo de quartos disponíveis para a semana atual (ano, mês e semana definidos no método),
     * incluindo número do quarto, tipologia e preço por semana.
     *
     * @throws FileNotFoundException se ocorrer falha ao aceder a ficheiros necessários aos repositórios utilizados.
     */
    public void freeRoomsWeek2() throws FileNotFoundException {

        int presentYear = 2025;
        int presentMonth = 7;
        int presentWeek = 1;

        System.out.println("\n====================================================");
        System.out.println("      CATÁLOGO DE QUARTOS DISPONÍVEIS POR SEMANA       ");
        System.out.println("====================================================");
        System.out.println("Nº Quarto | Tipologia | Preço/Semana");
        System.out.println("----------------------------------------------------");

        TipologyRepo tipRepo = TipologyRepo.getInstance();
        BookingRepo bookRepo = BookingRepo.getInstance();

        for (Room room : roomsRepo.getRoomsArrayList()) {
            if (bookRepo.freeRoomWeek(room.getNumQuarto(), presentYear, presentMonth, presentWeek)) {
                Tipology tip = tipRepo.getTipologyById(room.getTypologyID());
                if (tip != null) {
                    System.out.println(
                            room.getNumQuarto() + " | " +
                                    tip.getDescription() + " | " +
                                    tip.getTypologyPrice() + "€"
                    );
                }
            }
        }
        System.out.println("====================================================\n");
    }

    /**
     * Apresenta uma mensagem indicando que a funcionalidade selecionada não está disponível.
     * Utilizado como feedback visual para opções em construção no menu de receção/gestão.
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