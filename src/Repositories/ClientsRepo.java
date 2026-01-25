package Repositories;

import Models.Client;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por gerir os clientes do sistema.
 * Carrega os dados a partir de ficheiro CSV e disponibiliza acesso à lista de clientes.
 */
public class ClientsRepo {

    /** Lista de clientes carregada a partir do ficheiro CSV. */
    private ArrayList<Client> clientArrayList;

    /** Instância singleton do repositório. */
    private static ClientsRepo instance;

    /**
     * Constrói o repositório e carrega os clientes a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro de clientes não for encontrado.
     */
    public ClientsRepo() throws FileNotFoundException {
        this.clientArrayList = CSVFileReader.readClientsCsvFile("Files/clientes.csv");
    }

    /**
     * Devolve a instância singleton de ClientsRepo.
     *
     * @return instância de ClientsRepo.
     * @throws FileNotFoundException se o ficheiro de clientes não for encontrado durante a inicialização.
     */
    public static ClientsRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new ClientsRepo();
        }
        return instance;
    }

    /**
     * Devolve a lista de clientes carregada no repositório.
     *
     * @return lista de clientes.
     */
    public ArrayList<Client> getClientArrayList() {
        return clientArrayList;
    }
}
