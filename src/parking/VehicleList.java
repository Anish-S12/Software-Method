package parking;

/**
 * Resizable array of Vehicle objects. Initial capacity 4; grows by 4.
 * @author Anish
 * @author Sai
 */
public class VehicleList {
    private static final int LENGTH = 4;
    private static final int NOTFOUND = -1;
    private Vehicle[] vehicles;
    private int numVehicles;

    // TODO: add constructors and private sort helpers (no new instance variables)

    private int find(Vehicle vehicle) {
        // TODO: implement
        return NOTFOUND;
    }

    private void grow() {
        // TODO: implement — resize by +4; do NOT use System.arraycopy()
    }

    public void add(Vehicle vehicle) {
        // TODO: implement — add to end of array
    }

    public void remove(Vehicle vehicle) {
        // TODO: implement — replace with last element
    }

    public boolean contains(Vehicle vehicle) {
        // TODO: implement
        return false;
    }

    public void printByPlate() {
        // TODO: implement — in-place selection or insertion sort, then print
    }

    public void printHistory() {
        // TODO: implement
    }
}
