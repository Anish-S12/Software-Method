package parking;

/**
 * Represents a calendar date used as part of a parking timestamp.
 * @author Anish
 * @author Sai
 */
public class Date implements Comparable<Date> {
    private int year;
    private int month;
    private int day;

    // TODO: add constructors and constants (no new instance variables)

    /**
     * Checks whether this date is a valid calendar date.
     * @return true if valid; false otherwise
     */
    public boolean isValid() {
        // TODO: implement
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO: implement
        return false;
    }

    @Override
    public String toString() {
        // TODO: implement
        return null;
    }

    @Override
    public int compareTo(Date date) {
        // TODO: implement
        return 0;
    }

    /**
     * Testbed main for unit testing isValid() and related methods.
     * Design 4 invalid + 2 valid test cases in Test Specification first.
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        // TODO: implement 6 test cases from Test Specification
    }
}
