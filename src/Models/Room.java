package Models;

public class Room {

    private int numQuarto;
    private int typologyID;

    public Room(int numQuarto, int typologyID) {
        this.numQuarto = numQuarto;
        this.typologyID = typologyID;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public int getTypologyID() {
        return typologyID;
    }
}
