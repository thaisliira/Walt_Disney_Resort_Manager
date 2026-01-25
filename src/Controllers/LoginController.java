package Controllers;

import Models.Login;
import Repositories.LoginRepo;
import java.io.FileNotFoundException;

/**
 * Controller responsável pela validação de credenciais de utilizadores internos (staff).
 * Consulta o repositório de logins e devolve o tipo de utilizador associado às credenciais.
 */
public class LoginController {

    /** Repositório de logins do sistema. */
    private LoginRepo loginRepo;

    /**
     * Constrói uma instância de LoginController e inicializa o repositório de logins.
     *
     * @throws FileNotFoundException se algum ficheiro necessário para carregar os logins não for encontrado.
     */
    public LoginController() throws FileNotFoundException {
        this.loginRepo = new LoginRepo();
    }

    /**
     * Valida as credenciais fornecidas comparando com os registos existentes no repositório.
     * Em caso de sucesso devolve o tipo de utilizador (por exemplo: ADMIN, GESTAO, GUIA).
     * Em caso de falha devolve "ERROR".
     *
     * @param usernameInput username introduzido pelo utilizador.
     * @param passwordInput password introduzida pelo utilizador.
     * @return o tipo de utilizador associado às credenciais ou "ERROR" se não forem válidas.
     */
    public String validateLogin(String usernameInput, String passwordInput) {

        for (Login Loginatual : this.loginRepo.getLoginsArrayList()) {
            if (Loginatual.getUserName().equals(usernameInput) && Loginatual.getUserPassword().equals(passwordInput)) {
                return Loginatual.getUserType();
            }
        }
        return "ERROR";
    }
}
