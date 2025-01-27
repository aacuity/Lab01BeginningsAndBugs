public class Bugged {
    /**
     * This one just prints some random stuff and does some random math
     *
     * @param val
     * @param num1
     * @param num2
     */
    public static boolean printer(String val, int num1, double num2) { // 4 errors fixed
        System.out.println(val + " is my favorite color!");
        int num3 = 42;

        double num4 = num1 + num2 * num3; // Fixed missing semicolon
        System.out.println("Your number is " + num3); // Fixed incorrect println syntax

        System.out.println();
        return num4 == num1 + num2 * num3; // Fixed missing semicolon
    }

    /**
     * A broken calculator with the number 3 permanently jammed and the remainder button also permanently jammed
     * This means the first value entered into the calculator is always 3
     * This also means the symbol used is always %
     *
     * @param val
     * @return Returns true at the end to indicate it could do the calculation
     */
    public static boolean jammedCalculator(int val) { // 4 errors fixed
        int jammedVal = 3; // Fixed incorrect variable declaration
        System.out.println("Your result is " + (jammedVal % val)); // Fixed missing concatenation and semicolon
        return true; // Fixed method type from void to boolean
    }

    /**
     * This is where your program actually runs everything
     *
     * @param args
     */
    public static void main(String[] args) { // 4 errors fixed
        System.out.println(printer("Indigo", 1, 4.0)); // Fixed missing comma
        System.out.println(jammedCalculator(4)); // Fixed incorrect parameter type
        System.out.println("Done!"); // Fixed incorrect println capitalization
    }
}
