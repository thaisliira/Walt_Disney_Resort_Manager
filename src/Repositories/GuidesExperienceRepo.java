package Repositories;

import Models.GuideExperience;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

    public class GuidesExperienceRepo {

        private ArrayList<GuideExperience> guidesArrayList;

        public GuidesExperienceRepo () throws FileNotFoundException {
            this.guidesArrayList = CSVFileReader.readGuidesCsvFile("Cesae_Hotel_Resort/Files/guias_experiencias.csv");
        }

        public ArrayList<GuideExperience> getGuidesArrayList() {
            return guidesArrayList;
        }
    }
