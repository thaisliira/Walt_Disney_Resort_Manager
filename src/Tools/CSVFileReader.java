package Tools;

import Models.Client;

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
    }
