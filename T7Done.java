package JavaGroupProject;
/*
Write a Java Program to print the
first 10 numbers of Fibonacci series.
 */
public class T7Done {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("The first " + n + " numbers of the Fibonacci series are:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
