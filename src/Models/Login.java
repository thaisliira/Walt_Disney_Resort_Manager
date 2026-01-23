package Models;

public class Login {

    private String userName ;
    private String userPassword;
    private String userType;

    public Login(String userName, String userPassword, String userType) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserType() {
        return userType;
    }
}
