package Repositories;

import Models.Booking;
import Tools.CSVFileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Repositório responsável por gerir as reservas de quartos (bookings).
 * Carrega os dados a partir de ficheiro CSV e disponibiliza operações de consulta
 * sobre a lista de reservas, incluindo verificação de disponibilidade por semana.
 */
public class BookingRepo {

    /** Lista de reservas de quartos carregadas a partir do ficheiro CSV. */
    private ArrayList<Booking> bookingsArrayList;

    /** Instância singleton do repositório. */
    private static BookingRepo instance;

    /**
     * Constrói o repositório e carrega as reservas a partir do ficheiro CSV.
     *
     * @throws FileNotFoundException se o ficheiro de reservas não for encontrado.
     */
    private BookingRepo() throws FileNotFoundException {
        this.bookingsArrayList = CSVFileReader.readBookingCsvFile("Files/reservas_quartos.csv");
    }

    /**
     * Devolve a instância singleton de BookingRepo.
     *
     * @return instância de BookingRepo.
     * @throws FileNotFoundException se o ficheiro de reservas não for encontrado durante a inicialização.
     */
    public static BookingRepo getInstance() throws FileNotFoundException {
        if (instance == null) {
            instance = new BookingRepo();
        }
        return instance;
    }

    /**
     * Devolve a lista de reservas carregada no repositório.
     *
     * @return lista de reservas.
     */
    public ArrayList<Booking> getBookingsArrayList() {
        return bookingsArrayList;
    }

    /**
     * Verifica se um quarto está livre num período específico (ano, mês e semana).
     * Se existir uma reserva para o mesmo quarto e para o mesmo ano/mês/semana, o quarto
     * não está disponível.
     *
     * @param numQuarto número do quarto a verificar.
     * @param year ano a verificar.
     * @param month mês a verificar.
     * @param week semana a verificar.
     * @return true se o quarto estiver livre; false se existir reserva para o período indicado.
     */
    public boolean freeRoomWeek(int numQuarto, int year, int month, int week) {
        for (Booking book : bookingsArrayList) {
            if (book.getRoomID() == numQuarto
                    && book.getBookYear() == year
                    && book.getBookMonth() == month
                    && book.getBookWeek() == week) {
                return false;
            }
        }
        return true;
    }
}
