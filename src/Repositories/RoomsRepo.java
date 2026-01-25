package Repositories;

import Models.Room;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por gerir os quartos do sistema.
 * Carrega os dados a partir de ficheiro CSV e disponibiliza acesso à lista de quartos.
 */
public class RoomsRepo {

    /** Lista de quartos carregada a partir do ficheiro CSV. */
    private ArrayList<Room> roomsArrayList;

    /** Instância singleton do repositório. */
    private static RoomsRepo instance;

    /**
     * Constrói o repositório e carrega os quartos a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro de quartos não for encontrado.
     */
    private RoomsRepo() throws FileNotFoundException {
        this.roomsArrayList = CSVFileReader.readRoomsCsvFile("Files/quartos.csv");
    }

    /**
     * Devolve a instância singleton de RoomsRepo.
     *
     * @return instância de RoomsRepo.
     * @throws FileNotFoundException se o ficheiro de quartos não for encontrado durante a inicialização.
     */
    public static RoomsRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new RoomsRepo();
        }
        return instance;
    }

    /**
     * Devolve a lista de quartos carregada no repositório.
     *
     * @return lista de quartos.
     */
    public ArrayList<Room> getRoomsArrayList() {
        return roomsArrayList;
    }
}