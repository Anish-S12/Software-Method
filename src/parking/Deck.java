package parking;

/**
 * Holds information for one parking deck and its current parkings.
 * @author Anish
 * @author Sai
 */
public class Deck {
    public static final int MAXCAPACITY = 6;
    private int number; // deck number
    private Location location; // Location enum
    private Hour hour; // Hour enum
    private Parking[] parkings; // list of parking activities
    private int numParked; // number of parking activities in array
    private boolean open;

    // TODO: add constructors and methods (no new instance variables)

    private int find(Vehicle vehicle) {
        // TODO: implement
        return -1;
    }

    /**
     * Adds a parking activity to this deck.
     * @param parking the parking activity to add
     */
    public void enter(Parking parking) {
        // TODO: implement
    }

    /**
     * Removes a parking activity from this deck.
     * @param parking the parking activity to remove
     */
    public void exit(Parking parking) {
        // TODO: implement
    }

    /**
     * Textual representation, e.g.
     * Deck#301@PRINCETON[open 6:30 ~ 18:30] [capacity 5] [0 vehicles] [Mercer]
     */
    @Override
    public String toString() {
        // TODO: implement
        return null;
    }
}
