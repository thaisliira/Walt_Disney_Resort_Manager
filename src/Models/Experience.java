package Models;

public class Experience {

    private int experienceID ;
    private String experienceName;
    private int guiaID;
    private double adultPrice;
    private double childPrice;

    public Experience(int experienceID, String experienceName, int guiaID, double adultPrice, double childPrice) {
        this.experienceID = experienceID;
        this.experienceName = experienceName;
        this.guiaID = guiaID;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
    }

    public int getExperienceID() {
        return experienceID;
    }

    public String getExperienceName() {
        return experienceName;
    }

    public int getGuiaID() {
        return guiaID;
    }

    public double getAdultPrice() {
        return adultPrice;
    }

    public double getChildPrice() {
        return childPrice;
    }
}
