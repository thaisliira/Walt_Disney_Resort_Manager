package Repositories;

import Models.Booking;
import Models.Sales;
import Models.Tipology;
import Tools.CSVFileReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class SalesExpRepo {

    private ArrayList<Sales> salesArrayList;
    private static SalesExpRepo instance;

    private SalesExpRepo() throws FileNotFoundException {
        this.salesArrayList = CSVFileReader.readSalesCsvFile("Files/vendas_experiencias.csv");
    }

    public static SalesExpRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new SalesExpRepo();
        }
        return instance;
    }

    public ArrayList<Sales> getSalesArrayList() {
        return salesArrayList;
    }

    public Sales getExperienceById(String experienceId) {
        for (Sales sale : salesArrayList) {
            if (sale.getExperienceID() == experienceId) {
                return sale;
            }
        }
        return null;
    }
}
