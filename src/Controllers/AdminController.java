package Controllers;

import Models.Experience;
import Models.Sales;
import Repositories.BookingRepo;
import Repositories.ExperiencesRepo;
import Repositories.LoginRepo;
import Repositories.RoomsRepo;

import java.io.FileNotFoundException;

public class AdminController {

    private ExperiencesRepo experiencesRepo;
    private RoomsRepo roomsRepo;
    private BookingRepo bookRepo;
    private LoginRepo loginRepo;

    public AdminController() throws FileNotFoundException {
        this.experiencesRepo = ExperiencesRepo.getInstance();
        this.roomsRepo = RoomsRepo.getInstance();
        this.bookRepo = BookingRepo.getInstance();
        this.loginRepo = LoginRepo.getInstance();
    }

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

    public void expMostPopChild() throws FileNotFoundException {
        Experience mostPopular = null;
        int maxChild = -1;

        for (Experience exp : experiencesRepo.getExperienceArrayList()) {
            int adults = Sales.childrenQuant(exp.getExperienceID());
            if (adults > maxChild) {
                maxChild = adults;
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
