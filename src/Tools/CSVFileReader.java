package Tools;

import Models.Client;
import Models.GuideExperience;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFileReader {
    public static ArrayList<Client> readClientsCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Client> clientsArray = new ArrayList<Client>();

        File clientsFile = new File(filePath);
        Scanner fileScanner = new Scanner(clientsFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(";");

            int newClientID = Integer.parseInt(separatedLine[0]);
            String newClientName = separatedLine[1];
            String newClientNationality = separatedLine[2];
            String newClientEmail = separatedLine[3];
            double newClientPhone = Double.parseDouble(separatedLine[4]);
            String newClientBorn = separatedLine[5];
            boolean newClientMkt = Boolean.parseBoolean(separatedLine[6]);

            Client newClient = new Client (newClientID, newClientName, newClientNationality, newClientEmail, newClientPhone, newClientBorn, newClientMkt);
            clientsArray.add(newClient);

        }

        return clientsArray;
    }

    public static ArrayList<GuideExperience> readGuidesCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<GuideExperience> guidesArray = new ArrayList<GuideExperience>();

        File guidesFile = new File(filePath);
        Scanner fileScanner = new Scanner(guidesFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(";");

            int newguideID = Integer.parseInt(separatedLine[0]) ;
            String newguideName = separatedLine[1];
            String newguideNationality = separatedLine[2];
            String newguideEmail = separatedLine[3];
            int newguidePhone= Integer.parseInt(separatedLine[4]);

            GuideExperience newGuide = new GuideExperience (newguideID, newguideName, newguideNationality, newguideEmail, newguidePhone);
            guidesArray.add(newGuide);
        }
        return guidesArray;
    }

    }
