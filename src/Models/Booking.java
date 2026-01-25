package Models;

/**
 * Representa uma reserva (booking) de um quarto efetuada por um cliente para um período específico.
 * A reserva é identificada por um ID único e associa um cliente a um quarto, num determinado ano,
 * mês e semana.
 */
public class Booking {

    /** Identificador único da reserva. */
    private String bookID;

    /** Identificador do quarto reservado. */
    private int roomID;

    /** Identificador do cliente que efetuou a reserva. */
    private String clientID;

    /** Ano da reserva. */
    private int bookYear;

    /** Mês da reserva. */
    private int bookMonth;

    /** Semana da reserva (dentro do mês). */
    private int bookWeek;

    /**
     * Constrói uma instância de Booking com os dados da reserva.
     *
     * @param bookID identificador único da reserva.
     * @param roomID identificador do quarto reservado.
     * @param clientID identificador do cliente que efetuou a reserva.
     * @param bookYear ano da reserva.
     * @param bookMonth mês da reserva.
     * @param bookWeek semana da reserva (dentro do mês).
     */
    public Booking(String bookID, int roomID, String clientID, int bookYear, int bookMonth, int bookWeek) {
        this.bookID = bookID;
        this.roomID = roomID;
        this.clientID = clientID;
        this.bookYear = bookYear;
        this.bookMonth = bookMonth;
        this.bookWeek = bookWeek;
    }

    /**
     * Devolve o identificador único da reserva.
     *
     * @return ID da reserva.
     */
    public String getBookID() {
        return bookID;
    }

    /**
     * Devolve o identificador do quarto reservado.
     *
     * @return ID do quarto.
     */
    public int getRoomID() {
        return roomID;
    }

    /**
     * Devolve o identificador do cliente associado à reserva.
     *
     * @return ID do cliente.
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Devolve o ano associado à reserva.
     *
     * @return ano da reserva.
     */
    public int getBookYear() {
        return bookYear;
    }

    /**
     * Devolve o mês associado à reserva.
     *
     * @return mês da reserva.
     */
    public int getBookMonth() {
        return bookMonth;
    }

    /**
     * Devolve a semana associada à reserva.
     *
     * @return semana da reserva (dentro do mês).
     */
    public int getBookWeek() {
        return bookWeek;
    }
}