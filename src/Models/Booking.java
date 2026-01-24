package Models;

public class Booking {

    private String bookID;
    private int roomID;
    private String clientID;
    private int bookYear;
    private int bookMonth;
    private int bookWeek;

    public Booking(String bookID, int roomID, String clientID, int bookYear, int bookMonth, int bookWeek) {
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

    public int getBookYear() {
        return bookYear;
    }

    public int getBookMonth() {
        return bookMonth;
    }

    public int getBookWeek() {
        return bookWeek;
    }
}
