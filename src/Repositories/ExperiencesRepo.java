package Repositories;

import Models.Experience;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ExperiencesRepo {

    private ArrayList<Experience> experienceArrayList;

    public ExperiencesRepo() throws FileNotFoundException {
        this.experienceArrayList = CSVFileReader.readExperiencesCsvFile("Cesae_Hotel_Resort/Files/experiencias.csv");
    }

}