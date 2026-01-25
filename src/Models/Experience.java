package Models;

/**
 * Representa uma experiência/atividade disponibilizada pelo resort.
 * Contém informação de identificação, nome, guia responsável e preços por tipo de participante
 * (adulto e criança).
 */
public class Experience {

    /** Identificador único da experiência. */
    private String experienceID;

    /** Nome/designação da experiência. */
    private String experienceName;

    /** Identificador do guia responsável pela experiência. */
    private String guiaID;

    /** Preço por adulto associado à experiência. */
    private int adultPrice;

    /** Preço por criança associado à experiência. */
    private int childPrice;

    /**
     * Constrói uma instância de Experience com os dados da experiência.
     *
     * @param experienceID identificador único da experiência.
     * @param experienceName nome/designação da experiência.
     * @param guiaID identificador do guia responsável.
     * @param adultPrice preço por adulto.
     * @param childPrice preço por criança.
     */
    public Experience(String experienceID, String experienceName, String guiaID, int adultPrice, int childPrice) {
        this.experienceID = experienceID;
        this.experienceName = experienceName;
        this.guiaID = guiaID;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
    }

    /**
     * Devolve o identificador único da experiência.
     *
     * @return ID da experiência.
     */
    public String getExperienceID() {
        return experienceID;
    }

    /**
     * Devolve o nome/designação da experiência.
     *
     * @return nome da experiência.
     */
    public String getExperienceName() {
        return experienceName;
    }

    /**
     * Devolve o identificador do guia responsável pela experiência.
     *
     * @return ID do guia.
     */
    public String getGuiaID() {
        return guiaID;
    }

    /**
     * Devolve o preço por adulto associado à experiência.
     *
     * @return preço por adulto.
     */
    public int getAdultPrice() {
        return adultPrice;
    }

    /**
     * Devolve o preço por criança associado à experiência.
     *
     * @return preço por criança.
     */
    public int getChildPrice() {
        return childPrice;
    }
}