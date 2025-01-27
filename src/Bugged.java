public class Bugged {
    /**
     * Prints a string and performs a calculation.
     *
     * @param val  A string value.
     * @param num1 An integer value.
     * @param num2 A double value.
     * @return A boolean indicating if the calculation matches.
     */
    public static boolean printer(String val, int num1, double num2) { 
        System.out.println(val + " is my favorite color!");
        int num3 = 42;

        double num4 = num1 + num2 * num3;
        System.out.println("Your number is " + num3);

        System.out.println();
        return num4 == num1 + num2 * num3;
    }

    /**
     * A calculator with fixed behavior.
     * @param val An integer value.
     * @return Always returns true, unless val is 0.
     */
    public static boolean jammedCalculator(int val) { 
        int jammedVal = 3;
        if (val == 0) {
            System.out.println("Error: Division by zero.");
            return false;
        }
        System.out.println("Your result is " + (jammedVal % val));
        return true;
    }

    /**
     * The main method to run the program.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) { 
        System.out.println(printer("Indigo", 1, 4.0));
        System.out.println(jammedCalculator(4));
        System.out.println("Done!");
    }
}
