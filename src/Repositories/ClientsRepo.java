package Repositories;

import Models.Client;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ClientsRepo {

    private ArrayList<Client> clientArrayList;

    public ClientsRepo() throws FileNotFoundException {
        this.clientArrayList = CSVFileReader.readClientsCsvFile("Cesae_Hotel_Resort/Files/clientes.csv");
    }

    public ArrayList<Client> getClientArrayList() {
        return clientArrayList;
    }
}
