package Repositories;

import Models.Room;
import Models.Tipology;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class RoomsRepo {

    private ArrayList<Room> roomsArrayList;
    private static RoomsRepo instance;

    private RoomsRepo() throws FileNotFoundException {
        this.roomsArrayList = CSVFileReader.readRoomsCsvFile("Files/quartos.csv");
    }

    public static RoomsRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new RoomsRepo();
        }
        return instance;
    }

    public ArrayList<Room> getRoomsArrayList() {
        return roomsArrayList;
    }

}
