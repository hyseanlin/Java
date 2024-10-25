package Ch4;

public class ShortCircuitedLogicDemo {
    public static void main(String[] args) {
        int a, b;
        
        a = 5;
        b = 10;

        // Using short-circuiting with &&
        boolean resultAnd = (a < 10) && (b++ > 10);
        System.out.println("Result of (a < 10) && (b++ > 10): " + resultAnd);
        System.out.println("Value of b after &&: " + b); // b should be 11

        // Resetting b
        a = 15;
        b = 10;

        // Using short-circuiting with ||
        boolean resultOr = (a > 10) || (b++ > 10);
        System.out.println("Result of (a > 10) || (b++ > 10): " + resultOr);
        System.out.println("Value of b after ||: " + b); // b should still be 10
    }
}
