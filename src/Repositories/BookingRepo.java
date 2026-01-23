package Repositories;

import Models.Booking;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BookingRepo {

    private ArrayList<Booking> bookingsArrayList;

    public BookingRepo() throws FileNotFoundException {
        this.bookingsArrayList = CSVFileReader.readBookingCsvFile("Cesae_Hotel_Resort/Files/reservas_quartos.csv");
    }

    public ArrayList<Booking> getBookingsArrayList() {
        return bookingsArrayList;
    }
}
