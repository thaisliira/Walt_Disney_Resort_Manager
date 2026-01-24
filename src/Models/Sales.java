package Models;

import Repositories.SalesExpRepo;

import java.io.FileNotFoundException;

public class Sales {

    private String saleID;
    private String experienceID;
    private String clientType;
    private int year;
    private int month;

    public Sales(String saleID, String experienceID, String clientType, int year, int month) {
        this.saleID = saleID;
        this.experienceID = experienceID;
        this.clientType = clientType;
        this.year = year;
        this.month = month;
    }

    public String getSaleID() {
        return saleID;
    }

    public String getExperienceID() {
        return experienceID;
    }

    public String getClientType() {
        return clientType;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public static int adultsQuant(String experienceID) throws FileNotFoundException {
        SalesExpRepo salerepo = SalesExpRepo.getInstance();
        int adult = 0;
        for (Sales sale : salerepo.getSalesArrayList()) {
            if (sale.getExperienceID().equals(experienceID) && sale.getClientType().equals("adulto")) {
                adult++;
            }
        }return adult;
    }

    public static int childrenQuant(String experienceID) throws FileNotFoundException {
        SalesExpRepo salerepo = SalesExpRepo.getInstance();
        int child = 0;
        for (Sales sale : salerepo.getSalesArrayList()) {
            if (sale.getExperienceID().equals(experienceID) && sale.getClientType().equals("crianca")) {
                child++;
            }
        }return child;
    }
}
