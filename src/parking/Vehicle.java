package parking;

/**
 * Represents a registered vehicle identified by its license plate.
 * @author Anish
 * @author Sai
 */
public class Vehicle {
    private String plate; // exactly 7 characters, format Xdd-XXX
    private History history; // head of singly linked list

    // TODO: add constructors and methods (no new instance variables)

    /**
     * Prints this vehicle's parking history.
     */
    public void printHistory() {
        // TODO: implement
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: implement — true if same plate
        return false;
    }

    @Override
    public String toString() {
        // TODO: implement
        return null;
    }
}
