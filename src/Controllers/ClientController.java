package Controllers;

import Models.Room;
import Models.Tipology;
import Repositories.BookingRepo;
import Repositories.ExperiencesRepo;
import Repositories.RoomsRepo;
import Repositories.TipologyRepo;

import java.io.FileNotFoundException;

public class ClientController {

    private RoomsRepo roomsRepo;
    private ExperiencesRepo experiencesRepo;
    private BookingRepo bookingRepo;
    private TipologyRepo tipologyRepo;

    public ClientController() throws FileNotFoundException {
        this.roomsRepo = RoomsRepo.getInstance();
        this.experiencesRepo =  ExperiencesRepo.getInstance();
        this.bookingRepo = BookingRepo.getInstance();
        this.tipologyRepo = TipologyRepo.getInstance();
    }

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
}
