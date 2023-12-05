package JavaGroupProject;
/*
Create a 2D array of integers.
Develop a program which will calculate the
sum of even and odd numbers for that array.
 */
public class T4Done {
    public static void main(String[] args) {
        int[][] array = {
                {9, 32, 12, 45, 77},
                {7, 3, 6, 30, 58},
                {98, 79, 67, 56, 33},
                {2, 16, 71, 83, 14},
        };
        int evenSum = 0, oddSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    evenSum += array[i][j];
                } else {
                    oddSum += array[i][j];
                }
            }
        }
        System.out.println("The sum of even numbers is "+evenSum);
        System.out.println("The sum of odd numbers is "+oddSum);
        }
        }



