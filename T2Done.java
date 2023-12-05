package JavaGroupProject;
/*
Create an array of integer values.
After the array is created, calculate the
sum of all stored elements in that array.
 */
public class T2Done {
    public static void main(String[] args) {
        int[][] array={
                {77,99,55,33,44,22,11,19}

        };
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=0;
            for(int j=0;j<array[i].length;j++){
                sum = sum + array[i][j];
            }
            System.out.println("The sum of this array is "+ sum);
        }

    }


}
