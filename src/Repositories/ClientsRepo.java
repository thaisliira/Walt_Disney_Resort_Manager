package Repositories;

import Models.Client;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientsRepo {

    private ArrayList<Client> clientArrayList;
    private static ClientsRepo instance;

    public ClientsRepo() throws FileNotFoundException {
        this.clientArrayList = CSVFileReader.readClientsCsvFile("Files/clientes.csv");
    }

    public static ClientsRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new ClientsRepo();
        }
        return instance;
    }

    public ArrayList<Client> getClientArrayList() {
        return clientArrayList;
    }
}
