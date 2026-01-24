package Repositories;

import Models.GuideExperience;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

    public class GuidesExperienceRepo {

        private ArrayList<GuideExperience> guidesArrayList;
        private static GuidesExperienceRepo instance;

        public GuidesExperienceRepo () throws FileNotFoundException {
            this.guidesArrayList = CSVFileReader.readGuidesCsvFile("Files/guias_experiencias.csv");
        }

        public static GuidesExperienceRepo getInstance() throws FileNotFoundException {
            if (instance == null) {
                instance = new GuidesExperienceRepo();
            }
            return instance;
        }

        public ArrayList<GuideExperience> getGuidesArrayList() {
            return guidesArrayList;
        }
    }
