package Repositories;

import Models.Login;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class LoginRepo {

    private ArrayList<Login> loginsArrayList;
    private static LoginRepo instance;

    public LoginRepo () throws FileNotFoundException {
        this.loginsArrayList = CSVFileReader.readLoginsCsvFile("Files/logins.csv");
    }

    public static LoginRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new LoginRepo();
        }
        return instance;
    }

    public ArrayList<Login> getLoginsArrayList() {
        return loginsArrayList;
    }
}
