package Repositories;

import Models.Booking;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BookingRepo {

    private ArrayList<Booking> bookingsArrayList;
    private static BookingRepo instance;

    private BookingRepo() throws FileNotFoundException {
        this.bookingsArrayList = CSVFileReader.readBookingCsvFile("Files/reservas_quartos.csv");
    }

    public static BookingRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new BookingRepo();
        }
        return instance;
    }

    public ArrayList<Booking> getBookingsArrayList() {
        return bookingsArrayList;
    }

    public boolean freeRoomWeek (int numQuarto, int year, int month, int week) {
        for (Booking book : bookingsArrayList) {
            if (book.getRoomID() == numQuarto && book.getBookYear() == year && book.getBookMonth() == month && book.getBookWeek() == week) {
                return false;
            }
        }
        return true;
    }

}
