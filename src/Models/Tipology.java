package Models;

public class Tipology {

    private int typologyID;
    private String description;
    private int typologyPrice;

    public Tipology(int typologyID, String description, int typologyPrice) {
        this.typologyID = typologyID;
        this.description = description;
        this.typologyPrice = typologyPrice;
    }

    public int getTypologyID() {
        return typologyID;
    }

    public String getDescription() {
        return description;
    }

    public int getTypologyPrice() {
        return typologyPrice;
    }
}
