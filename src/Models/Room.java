package Models;

/**
 * Representa um quarto do resort, identificando o número do quarto e a tipologia associada.
 * A tipologia é referenciada através do seu identificador (typologyID).
 */
public class Room {

    /** Número identificador do quarto. */
    private int numQuarto;

    /** Identificador da tipologia associada ao quarto. */
    private int typologyID;

    /**
     * Constrói uma instância de Room com o número do quarto e a tipologia associada.
     *
     * @param numQuarto número identificador do quarto.
     * @param typologyID identificador da tipologia associada ao quarto.
     */
    public Room(int numQuarto, int typologyID) {
        this.numQuarto = numQuarto;
        this.typologyID = typologyID;
    }

    /**
     * Devolve o número identificador do quarto.
     *
     * @return número do quarto.
     */
    public int getNumQuarto() {
        return numQuarto;
    }

    /**
     * Devolve o identificador da tipologia associada ao quarto.
     *
     * @return identificador da tipologia.
     */
    public int getTypologyID() {
        return typologyID;
    }
}
