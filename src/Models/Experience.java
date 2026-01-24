package Models;

public class Experience {

    private String experienceID ;
    private String experienceName;
    private String guiaID;
    private int adultPrice;
    private int childPrice;

    public Experience(String experienceID, String experienceName, String guiaID, int adultPrice, int childPrice) {
        this.experienceID = experienceID;
        this.experienceName = experienceName;
        this.guiaID = guiaID;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
    }

    public String getExperienceID() {
        return experienceID;
    }

    public String getExperienceName() {
        return experienceName;
    }

    public String getGuiaID() {
        return guiaID;
    }

    public int getAdultPrice() {
        return adultPrice;
    }

    public int getChildPrice() {
        return childPrice;
    }
}
