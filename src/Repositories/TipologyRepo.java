package Repositories;

import Models.Tipology;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class TipologyRepo {

    private ArrayList<Tipology> tipologyArrayList;
    private static TipologyRepo instance;

    private TipologyRepo() throws FileNotFoundException {
        this.tipologyArrayList = CSVFileReader.readTipologiesCsvFile("Files/tipologia.csv");
    }

    public static TipologyRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new TipologyRepo();
        }
        return instance;
    }

    public ArrayList<Tipology> getTipologyArrayList() {
        return tipologyArrayList;
    }

    public Tipology getTipologyById(int typologyId) {
        for (Tipology tip : tipologyArrayList) {
            if (tip.getTypologyID() == typologyId) {
                return tip;
            }
        }
        return null;
    }
}
