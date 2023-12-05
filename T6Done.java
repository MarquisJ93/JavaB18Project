package JavaGroupProject;
/*
Write a java program to check whether
a given number is prime or not?
 */
public class T6Done {
    public static void main(String[] args) {
        int num = 11;
        int n = 0;

        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0)
                    n++;
            }
            if (n == 2){
                System.out.println("It is a Prime number");
            } else {
                System.out.println("It is not a Prime number");
            }
        }
    }
}
