package Repositories;

import Models.Experience;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExperiencesRepo {

    private ArrayList<Experience> experienceArrayList;
    private static ExperiencesRepo instance;

    public ExperiencesRepo() throws FileNotFoundException {
        this.experienceArrayList = CSVFileReader.readExperiencesCsvFile("Files/experiencias.csv");
    }

    public static ExperiencesRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new ExperiencesRepo();
        }
        return instance;
    }
}