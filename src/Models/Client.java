package Models;

public class Client {

    private String clientID ;
    private String clientName;
    private String clientNationality;
    private String clientEmail;
    private double clientPhone;
    private String clientBorn;
    private boolean clientMkt;

    public Client(String clientID, String clientName, String clientNationality, String clientEmail, double clientPhone, String clientBorn, boolean clientMkt) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientNationality = clientNationality;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
        this.clientBorn = clientBorn;
        this.clientMkt = clientMkt;
    }

    public String getClientID() {
        return clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientNationality() {
        return clientNationality;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public double getClientPhone() {
        return clientPhone;
    }

    public String getClientBorn() {
        return clientBorn;
    }

    public boolean isClientMkt() {
        return clientMkt;
    }
}
