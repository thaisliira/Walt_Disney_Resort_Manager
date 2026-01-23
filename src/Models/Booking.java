package Models;

public class Booking {

    private String bookID;
    private int roomID;
    private String clientID;
    private String bookYear;
    private String bookMonth;
    private String bookWeek;

    public Booking(String bookID, int roomID, String clientID, String bookYear, String bookMonth, String bookWeek) {
        this.bookID = bookID;
        this.roomID = roomID;
        this.clientID = clientID;
        this.bookYear = bookYear;
        this.bookMonth = bookMonth;
        this.bookWeek = bookWeek;
    }

    public String getBookID() {
        return bookID;
    }

    public int getRoomID() {
        return roomID;
    }

    public String getClientID() {
        return clientID;
    }

    public String getBookYear() {
        return bookYear;
    }

    public String getBookMonth() {
        return bookMonth;
    }

    public String getBookWeek() {
        return bookWeek;
    }
}
