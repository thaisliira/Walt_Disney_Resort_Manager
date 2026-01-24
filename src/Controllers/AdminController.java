package Controllers;

import Repositories.BookingRepo;
import Repositories.ExperiencesRepo;
import Repositories.LoginRepo;
import Repositories.RoomsRepo;

import java.io.FileNotFoundException;

public class AdminController {

    private ExperiencesRepo experiencesRepoRepo;
    private RoomsRepo roomsRepo;
    private BookingRepo bookRepo;
    private LoginRepo loginRepo;

    public AdminController(ExperiencesRepo experiencesRepoRepo, RoomsRepo roomsRepo, BookingRepo bookRepo, LoginRepo loginRepo) throws FileNotFoundException {
        this.experiencesRepoRepo = new ExperiencesRepo();
        this.roomsRepo = RoomsRepo.getInstance();
        this.bookRepo = BookingRepo.getInstance();
        this.loginRepo = LoginRepo.getInstance();
    }
}
