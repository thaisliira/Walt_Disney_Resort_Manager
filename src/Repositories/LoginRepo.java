package Repositories;

import Models.Login;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por gerir os registos de login do sistema.
 * Carrega os dados a partir de ficheiro CSV e disponibiliza acesso à lista de logins.
 */
public class LoginRepo {

    /** Lista de logins carregada a partir do ficheiro CSV. */
    private ArrayList<Login> loginsArrayList;

    /** Instância singleton do repositório. */
    private static LoginRepo instance;

    /**
     * Constrói o repositório e carrega os registos de login a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro de logins não for encontrado.
     */
    public LoginRepo() throws FileNotFoundException {
        this.loginsArrayList = CSVFileReader.readLoginsCsvFile("Files/logins.csv");
    }

    /**
     * Devolve a instância singleton de LoginRepo.
     *
     * @return instância de LoginRepo.
     * @throws FileNotFoundException se o ficheiro de logins não for encontrado durante a inicialização.
     */
    public static LoginRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new LoginRepo();
        }
        return instance;
    }

    /**
     * Devolve a lista de logins carregada no repositório.
     *
     * @return lista de logins.
     */
    public ArrayList<Login> getLoginsArrayList() {
        return loginsArrayList;
    }
}
