package Models;

/**
 * Representa credenciais de acesso de um utilizador interno do sistema.
 * Contém o username, a password e o tipo de utilizador associado (perfil de acesso).
 */
public class Login {

    /** Username do utilizador. */
    private String userName;

    /** Password do utilizador. */
    private String userPassword;

    /** Tipo/perfil do utilizador (por exemplo: ADMIN, GESTAO, GUIA). */
    private String userType;

    /**
     * Constrói uma instância de Login com as credenciais e perfil do utilizador.
     *
     * @param userName username do utilizador.
     * @param userPassword password do utilizador.
     * @param userType tipo/perfil do utilizador.
     */
    public Login(String userName, String userPassword, String userType) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    /**
     * Devolve o username do utilizador.
     *
     * @return username do utilizador.
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Devolve a password do utilizador.
     *
     * @return password do utilizador.
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Devolve o tipo/perfil do utilizador.
     *
     * @return tipo/perfil do utilizador.
     */
    public String getUserType() {
        return userType;
    }
}