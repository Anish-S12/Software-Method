package parking;

/**
 * Resizable array of Deck objects. Initial capacity 4; grows by 4.
 * @author Anish
 * @author Sai
 */
public class DeckList {
    private static final int ARRAYLENGTH = 4;
    private static final int NOTFOUND = -1;
    private Deck[] decks;
    private int numDecks;

    // TODO: add constructors and private sort helpers (no new instance variables)

    private int find(Deck deck) {
        // TODO: implement
        return NOTFOUND;
    }

    private void grow() {
        // TODO: implement — resize by +4; do NOT use System.arraycopy()
    }

    public void open(Deck deck) {
        // TODO: implement — add to end of array
    }

    public void close(Deck deck) {
        // TODO: implement — mark deck as closed (do not remove)
    }

    public boolean contains(Deck deck) {
        // TODO: implement
        return false;
    }

    public void printByLocation() {
        // TODO: implement — sort by county then deck number (in-place)
    }

    public void printVehicles(Deck deck) {
        // TODO: implement
    }
}
