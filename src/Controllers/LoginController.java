package Controllers;

import Models.Login;
import Repositories.LoginRepo;
import java.io.FileNotFoundException;

public class LoginController {

    private LoginRepo loginRepo;

    public LoginController() throws FileNotFoundException {
        this.loginRepo = new LoginRepo();
    }

    public String validateLogin(String usernameInput, String passwordInput) {

        for (Login Loginatual : this.loginRepo.getLoginsArrayList()) {
            if (Loginatual.getUserName().equals(usernameInput) && Loginatual.getUserPassword().equals(passwordInput)) {
                return Loginatual.getUserType();
            }
        }
        return "ERROR";
    }
}
