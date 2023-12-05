package JavaGroupProject;
/*
Write a program to swap 2 numbers
without a temporary variable
 */
public class T5Done {
    public static void main(String[] args) {
        int num1 = 76;
        int num2 = 32;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 -num2;

        System.out.println("num1 = "+num1 +", num2 = "+num2);
    }
}
