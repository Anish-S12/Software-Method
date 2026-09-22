package parking;

/**
 * Represents a date and time for a parking activity.
 * @author Anish
 * @author Sai
 */
public class Timestamp implements Comparable<Timestamp> {
    private Date date;
    private byte hour;
    private byte minute;

    // TODO: add constructors and methods (no new instance variables)

    @Override
    public String toString() {
        // TODO: implement
        return null;
    }

    @Override
    public int compareTo(Timestamp timestamp) {
        // TODO: implement
        return 0;
    }

    /**
     * Testbed main for unit testing compareTo().
     * Design 3 cases returning -1, 3 returning 1, and 1 returning 0.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        // TODO: implement 7 test cases from Test Specification
    }
}
