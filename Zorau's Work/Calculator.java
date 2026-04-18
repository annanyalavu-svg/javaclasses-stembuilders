public class Calculator {
    /* BEWARE THIS IS SUPER MESSY CODE CAUSE I'M NEW TO JAVA
    I did some overloads, which isn't really necessary.
    Java automatically performs a widening conversion from int to double because all 32-bit int values can be exactly represented in a 64-bit floating-point number.
    That means theoretically just keeping the doubles would be enough and just casting them back to int would work.
    However, idk I just don't like that lol, I'd rather have it return a int when I put ints instead of having to cast it.
    Also I did make a print function, stone me for it idc.
    The test is also overloaded, and uses multi-dimensional arrays, cause it can.
     */
    public static void print(String s) {
        // Typing out System.out.prinln every time is annoying lol
        System.out.println(s);
    }
    // int operations
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero...");
        }
        return a / b;
    }

    // double operations
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b;}
    public static double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Cannot divide by zero...");
        }
        return a / b;
    }

    public static void test(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int a = numbers[i][0];
            int b = numbers[i][1];

            print("Integer Testing Set " + i);
            print("Numbers: [" + a + ", " + b + "]");
            print("Add: " + add(a, b));
            print("Subtract: " + subtract(a, b));
            print("Multiply: " + multiply(a, b));

            try {
                print("Divide: " + divide(a, b));
            } catch (ArithmeticException e) {
                print("Divide: Can't divide by 0");
            }

            print("");
        }
    }
    public static void test(double[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            double a = numbers[i][0];
            double b = numbers[i][1];

            print("Double Testing Set " + i);
            print("Numbers: [" + a + ", " + b + "]");
            print("Add: " + add(a, b));
            print("Subtract: " + subtract(a, b));
            print("Multiply: " + multiply(a, b));

            try {
                print("Divide: " + divide(a, b));
            } catch (ArithmeticException e) {
                print("Divide: Can't divide by 0");
            }

            print("");
        }
    }

    public static void main (String[] args) {
        int [][] numbersInt = {
                {1,2},
                {5,9},
                {10,12},
                {6,0}
        };
        double [][] numbersDouble = {
                {1.5, 2.3},
                {5.0, 9.2},
                {10.7, 12.4},
                {6.1, 0.0}
        };
        test(numbersInt);
        test(numbersDouble);
    }
}