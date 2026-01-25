package Models;

/**
 * Representa um cliente do resort, contendo dados de identificação e contacto,
 * bem como informação de perfil (nacionalidade, data de nascimento) e preferência
 * de marketing.
 */
public class Client {

    /** Identificador único do cliente. */
    private String clientID;

    /** Nome do cliente. */
    private String clientName;

    /** Nacionalidade do cliente. */
    private String clientNationality;

    /** Email do cliente. */
    private String clientEmail;

    /** Contacto telefónico do cliente. */
    private double clientPhone;

    /** Data de nascimento do cliente (formato conforme origem dos dados). */
    private String clientBorn;

    /** Indica se o cliente autoriza receber comunicações de marketing. */
    private boolean clientMkt;

    /**
     * Constrói uma instância de Client com os dados do cliente.
     *
     * @param clientID identificador único do cliente.
     * @param clientName nome do cliente.
     * @param clientNationality nacionalidade do cliente.
     * @param clientEmail email do cliente.
     * @param clientPhone contacto telefónico do cliente.
     * @param clientBorn data de nascimento do cliente (formato conforme origem dos dados).
     * @param clientMkt indicação de consentimento para marketing.
     */
    public Client(String clientID, String clientName, String clientNationality, String clientEmail, double clientPhone, String clientBorn, boolean clientMkt) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientNationality = clientNationality;
        this.clientEmail = clientEmail;
        this.clientPhone = clientPhone;
        this.clientBorn = clientBorn;
        this.clientMkt = clientMkt;
    }

    /**
     * Devolve o identificador do cliente.
     *
     * @return ID do cliente.
     */
    public String getClientID() {
        return clientID;
    }

    /**
     * Devolve o nome do cliente.
     *
     * @return nome do cliente.
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Devolve a nacionalidade do cliente.
     *
     * @return nacionalidade do cliente.
     */
    public String getClientNationality() {
        return clientNationality;
    }

    /**
     * Devolve o email do cliente.
     *
     * @return email do cliente.
     */
    public String getClientEmail() {
        return clientEmail;
    }

    /**
     * Devolve o contacto telefónico do cliente.
     *
     * @return contacto telefónico do cliente.
     */
    public double getClientPhone() {
        return clientPhone;
    }

    /**
     * Devolve a data de nascimento do cliente.
     *
     * @return data de nascimento (formato conforme origem dos dados).
     */
    public String getClientBorn() {
        return clientBorn;
    }

    /**
     * Indica se o cliente autoriza receber comunicações de marketing.
     *
     * @return true se autoriza marketing; false caso contrário.
     */
    public boolean isClientMkt() {
        return clientMkt;
    }
}