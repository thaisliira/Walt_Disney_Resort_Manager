package Models;

public class GuideExperience {
    private int guideID ;
    private String guideName;
    private String guideNationality;
    private String guideEmail;
    private int guidePhone;

    public GuideExperience(int guideID, String guideName, String guideNationality, String guideEmail, int guidePhone) {
        this.guideID = guideID;
        this.guideName = guideName;
        this.guideNationality = guideNationality;
        this.guideEmail = guideEmail;
        this.guidePhone = guidePhone;
    }

    public int getGuideID() {
        return guideID;
    }

    public String getGuideName() {
        return guideName;
    }

    public String getGuideNationality() {
        return guideNationality;
    }

    public String getGuideEmail() {
        return guideEmail;
    }

    public int getGuidePhone() {
        return guidePhone;
    }
}
