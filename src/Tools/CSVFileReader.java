package Tools;

import Models.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Classe utilitária responsável por ler ficheiros CSV e converter cada linha em objetos do modelo.
 * Disponibiliza métodos estáticos para carregar listas de entidades (clientes, guias, reservas,
 * experiências, logins, quartos, tipologias e vendas) a partir de ficheiros CSV.
 */
public class CSVFileReader {

    /**
     * Lê um ficheiro CSV de clientes e devolve uma lista de objetos Client.
     *
     * @param filePath caminho do ficheiro CSV a ler.
     * @return lista de clientes carregada a partir do ficheiro.
     * @throws FileNotFoundException se o ficheiro não for encontrado.
     */
    public static ArrayList<Client> readClientsCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Client> clientsArray = new ArrayList<Client>();

        File clientsFile = new File(filePath);
        Scanner fileScanner = new Scanner(clientsFile);

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

            Client newClient = new Client(newClientID, newClientName, newClientNationality, newClientEmail, newClientPhone, newClientBorn, newClientMkt);
            clientsArray.add(newClient);

        }

        return clientsArray;
    }

    /**
     * Lê um ficheiro CSV de guias de experiências e devolve uma lista de objetos GuideExperience.
     *
     * @param filePath caminho do ficheiro CSV a ler.
     * @return lista de guias carregada a partir do ficheiro.
     * @throws FileNotFoundException se o ficheiro não for encontrado.
     */
    public static ArrayList<GuideExperience> readGuidesCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<GuideExperience> guidesArray = new ArrayList<GuideExperience>();

        File guidesFile = new File(filePath);
        Scanner fileScanner = new Scanner(guidesFile);

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            String newguideID = separatedLine[0];
            String newguideName = separatedLine[1];
            String newguideNationality = separatedLine[2];
            String newguideEmail = separatedLine[3];
            int newguidePhone = Integer.parseInt(separatedLine[4]);

            GuideExperience newGuide = new GuideExperience(newguideID, newguideName, newguideNationality, newguideEmail, newguidePhone);
            guidesArray.add(newGuide);
        }
        return guidesArray;
    }

    /**
     * Lê um ficheiro CSV de reservas de quartos e devolve uma lista de objetos Booking.
     *
     * @param filePath caminho do ficheiro CSV a ler.
     * @return lista de reservas carregada a partir do ficheiro.
     * @throws FileNotFoundException se o ficheiro não for encontrado.
     */
    public static ArrayList<Booking> readBookingCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Booking> bookingsArray = new ArrayList<Booking>();

        File bookFile = new File(filePath);
        Scanner fileScanner = new Scanner(bookFile);

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

            Booking newBook = new Booking(newbookID, newroomID, newclientID, newbookYear, newbookMonth, newbookWeek);
            bookingsArray.add(newBook);
        }
        return bookingsArray;
    }

    /**
     * Lê um ficheiro CSV de experiências e devolve uma lista de objetos Experience.
     *
     * @param filePath caminho do ficheiro CSV a ler.
     * @return lista de experiências carregada a partir do ficheiro.
     * @throws FileNotFoundException se o ficheiro não for encontrado.
     */
    public static ArrayList<Experience> readExperiencesCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Experience> experiencesArray = new ArrayList<Experience>();

        File experienceFile = new File(filePath);
        Scanner fileScanner = new Scanner(experienceFile);

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            String newexperienceID = separatedLine[0];
            String newexperienceName = separatedLine[1];
            String newguiaID = separatedLine[2];
            int newadultPrice = Integer.parseInt(separatedLine[3]);
            int newchildPrice = Integer.parseInt(separatedLine[4]);

            Experience newExperience = new Experience(newexperienceID, newexperienceName, newguiaID, newadultPrice, newchildPrice);
            experiencesArray.add(newExperience);
        }
        return experiencesArray;
    }

    /**
     * Lê um ficheiro CSV de logins e devolve uma lista de objetos Login.
     *
     * @param filePath caminho do ficheiro CSV a ler.
     * @return lista de logins carregada a partir do ficheiro.
     * @throws FileNotFoundException se o ficheiro não for encontrado.
     */
    public static ArrayList<Login> readLoginsCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Login> loginsArray = new ArrayList<Login>();

        File loginFile = new File(filePath);
        Scanner fileScanner = new Scanner(loginFile);

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            String newuserName = separatedLine[0];
            String newuserPassword = separatedLine[1];
            String newuserType = separatedLine[2];

            Login newLogin = new Login(newuserName, newuserPassword, newuserType);
            loginsArray.add(newLogin);
        }
        return loginsArray;
    }

    /**
     * Lê um ficheiro CSV de quartos e devolve uma lista de objetos Room.
     *
     * @param filePath caminho do ficheiro CSV a ler.
     * @return lista de quartos carregada a partir do ficheiro.
     * @throws FileNotFoundException se o ficheiro não for encontrado.
     */
    public static ArrayList<Room> readRoomsCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Room> roomsArray = new ArrayList<Room>();

        File roomFile = new File(filePath);
        Scanner fileScanner = new Scanner(roomFile);

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            int newNumQuarto = Integer.parseInt(separatedLine[0]);
            int newTipologyID = Integer.parseInt(separatedLine[1]);

            Room newRoom = new Room(newNumQuarto, newTipologyID);
            roomsArray.add(newRoom);
        }
        return roomsArray;
    }

    /**
     * Lê um ficheiro CSV de tipologias e devolve uma lista de objetos Tipology.
     *
     * @param filePath caminho do ficheiro CSV a ler.
     * @return lista de tipologias carregada a partir do ficheiro.
     * @throws FileNotFoundException se o ficheiro não for encontrado.
     */
    public static ArrayList<Tipology> readTipologiesCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Tipology> tipologyArrayList = new ArrayList<Tipology>();

        File tipologyFile = new File(filePath);
        Scanner fileScanner = new Scanner(tipologyFile);

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            int newtypologyID = Integer.parseInt(separatedLine[0]);
            String newdescription = separatedLine[1];
            int newtypologyPrice = Integer.parseInt(separatedLine[2]);

            Tipology newTipology = new Tipology(newtypologyID, newdescription, newtypologyPrice);
            tipologyArrayList.add(newTipology);
        }
        return tipologyArrayList;
    }

    /**
     * Lê um ficheiro CSV de vendas de experiências e devolve uma lista de objetos Sales.
     *
     * @param filePath caminho do ficheiro CSV a ler.
     * @return lista de vendas carregada a partir do ficheiro.
     * @throws FileNotFoundException se o ficheiro não for encontrado.
     */
    public static ArrayList<Sales> readSalesCsvFile(String filePath) throws FileNotFoundException {

        ArrayList<Sales> salesArrayList = new ArrayList<Sales>();

        File salesFile = new File(filePath);
        Scanner fileScanner = new Scanner(salesFile);

        fileScanner.nextLine();

        while (fileScanner.hasNextLine()) {

            String line = fileScanner.nextLine();
            String[] separatedLine = line.split(",");

            String newsaleID = separatedLine[0];
            String newexperienceID = separatedLine[1];
            String newclientType = separatedLine[2];
            int newyear = Integer.parseInt(separatedLine[3]);
            int newmonth = Integer.parseInt(separatedLine[4]);

            Sales newSale = new Sales(newsaleID, newexperienceID, newclientType, newyear, newmonth);
            salesArrayList.add(newSale);
        }
        return salesArrayList;
    }
}
