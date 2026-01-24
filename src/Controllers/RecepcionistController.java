package Controllers;

import Models.Room;
import Models.Tipology;
import Repositories.BookingRepo;
import Repositories.ExperiencesRepo;
import Repositories.RoomsRepo;
import Repositories.TipologyRepo;

import java.io.FileNotFoundException;

public class RecepcionistController {

    private RoomsRepo roomsRepo;
    private ExperiencesRepo experiencesRepo;
    private BookingRepo bookingRepo;
    private TipologyRepo tipologyRepo;

    public RecepcionistController() throws FileNotFoundException {
        this.roomsRepo = RoomsRepo.getInstance();
        this.experiencesRepo = ExperiencesRepo.getInstance();
        this.bookingRepo = BookingRepo.getInstance();
        this.tipologyRepo = TipologyRepo.getInstance();
    }

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
}
