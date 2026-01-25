package Models;

/**
 * Representa um guia de experiências do resort, contendo dados de identificação e contacto,
 * bem como informações de perfil como nome e nacionalidade.
 */
public class GuideExperience {

    /** Identificador único do guia. */
    private String guideID;

    /** Nome do guia. */
    private String guideName;

    /** Nacionalidade do guia. */
    private String guideNationality;

    /** Email do guia. */
    private String guideEmail;

    /** Contacto telefónico do guia. */
    private int guidePhone;

    /**
     * Constrói uma instância de GuideExperience com os dados do guia.
     *
     * @param guideID identificador único do guia.
     * @param guideName nome do guia.
     * @param guideNationality nacionalidade do guia.
     * @param guideEmail email do guia.
     * @param guidePhone contacto telefónico do guia.
     */
    public GuideExperience(String guideID, String guideName, String guideNationality, String guideEmail, int guidePhone) {
        this.guideID = guideID;
        this.guideName = guideName;
        this.guideNationality = guideNationality;
        this.guideEmail = guideEmail;
        this.guidePhone = guidePhone;
    }

    /**
     * Devolve o identificador do guia.
     *
     * @return ID do guia.
     */
    public String getGuideID() {
        return guideID;
    }

    /**
     * Devolve o nome do guia.
     *
     * @return nome do guia.
     */
    public String getGuideName() {
        return guideName;
    }

    /**
     * Devolve a nacionalidade do guia.
     *
     * @return nacionalidade do guia.
     */
    public String getGuideNationality() {
        return guideNationality;
    }

    /**
     * Devolve o email do guia.
     *
     * @return email do guia.
     */
    public String getGuideEmail() {
        return guideEmail;
    }

    /**
     * Devolve o contacto telefónico do guia.
     *
     * @return contacto telefónico do guia.
     */
    public int getGuidePhone() {
        return guidePhone;
    }
}