package Tools;

import Models.*;

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
            String[] separatedLine = line.split(",");

            String newClientID = separatedLine[0];
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
            String[] separatedLine = line.split(",");

            String newguideID = separatedLine[0] ;
            String newguideName = separatedLine[1];
            String newguideNationality = separatedLine[2];
            String newguideEmail = separatedLine[3];
            int newguidePhone= Integer.parseInt(separatedLine[4]);

            GuideExperience newGuide = new GuideExperience (newguideID, newguideName, newguideNationality, newguideEmail, newguidePhone);
            guidesArray.add(newGuide);
        }
        return guidesArray;
    }

    public static ArrayList<Booking> readBookingCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Booking> bookingsArray = new ArrayList<Booking>();

        File bookFile = new File(filePath);
        Scanner fileScanner = new Scanner(bookFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            String newbookID = separatedLine[0];
            int newroomID = Integer.parseInt(separatedLine[1]);
            String newclientID = separatedLine[2];
            int newbookYear = Integer.parseInt(separatedLine[3]);
            int newbookMonth = Integer.parseInt(separatedLine[4]);
            int newbookWeek = Integer.parseInt(separatedLine[5]);

            Booking newBook = new Booking (newbookID, newroomID, newclientID, newbookYear, newbookMonth, newbookWeek);
            bookingsArray.add(newBook);
        }
        return bookingsArray;
    }

    public static ArrayList<Experience> readExperiencesCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Experience> experiencesArray = new ArrayList<Experience>();

        File experienceFile = new File(filePath);
        Scanner fileScanner = new Scanner(experienceFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            String newexperienceID = separatedLine[0];
            String newexperienceName = separatedLine[1];
            String newguiaID = separatedLine[2];
            int newadultPrice = Integer.parseInt(separatedLine[3]);
            int newchildPrice = Integer.parseInt(separatedLine[4]);

            Experience newExperience = new Experience (newexperienceID, newexperienceName, newguiaID, newadultPrice, newchildPrice);
            experiencesArray.add(newExperience);
        }
        return experiencesArray;
    }

    public static ArrayList<Login> readLoginsCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Login> loginsArray = new ArrayList<Login>();

        File loginFile = new File(filePath);
        Scanner fileScanner = new Scanner(loginFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            String newuserName = separatedLine[0];
            String newuserPassword = separatedLine[1];
            String newuserType = separatedLine[2];

            Login newLogin = new Login (newuserName, newuserPassword, newuserType);
            loginsArray.add(newLogin);
        }
        return loginsArray;
    }

    public static ArrayList<Room> readRoomsCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Room> roomsArray = new ArrayList<Room>();

        File roomFile = new File(filePath);
        Scanner fileScanner = new Scanner(roomFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            int newNumQuarto = Integer.parseInt(separatedLine[0]);
            int newTipologyID= Integer.parseInt(separatedLine[1]);

            Room newRoom = new Room (newNumQuarto, newTipologyID);
            roomsArray.add(newRoom);
        }
        return roomsArray;
    }

    public static ArrayList<Tipology> readTipologiesCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Tipology> tipologyArrayList = new ArrayList<Tipology>();

        File tipologyFile = new File(filePath);
        Scanner fileScanner = new Scanner(tipologyFile);

        // Avançar o cabeçalho
        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            int newtypologyID = Integer.parseInt(separatedLine[0]);
            String newdescription = separatedLine[1];
            int newtypologyPrice = Integer.parseInt(separatedLine[2]);

            Tipology newTipology = new Tipology (newtypologyID, newdescription, newtypologyPrice);
            tipologyArrayList.add(newTipology);
        }
        return tipologyArrayList;
    }

    }
