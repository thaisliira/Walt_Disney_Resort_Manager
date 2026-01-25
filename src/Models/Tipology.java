package Models;

/**
 * Representa uma tipologia de quarto do resort.
 * Contém o identificador da tipologia, a descrição e o preço por semana associado.
 */
public class Tipology {

    /** Identificador único da tipologia. */
    private int typologyID;

    /** Descrição da tipologia (ex.: Single, Double, Suite). */
    private String description;

    /** Preço por semana associado à tipologia. */
    private int typologyPrice;

    /**
     * Constrói uma instância de Tipology com os dados da tipologia.
     *
     * @param typologyID identificador único da tipologia.
     * @param description descrição da tipologia.
     * @param typologyPrice preço por semana associado à tipologia.
     */
    public Tipology(int typologyID, String description, int typologyPrice) {
        this.typologyID = typologyID;
        this.description = description;
        this.typologyPrice = typologyPrice;
    }

    /**
     * Devolve o identificador da tipologia.
     *
     * @return identificador da tipologia.
     */
    public int getTypologyID() {
        return typologyID;
    }

    /**
     * Devolve a descrição da tipologia.
     *
     * @return descrição da tipologia.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Devolve o preço por semana associado à tipologia.
     *
     * @return preço por semana.
     */
    public int getTypologyPrice() {
        return typologyPrice;
    }
}