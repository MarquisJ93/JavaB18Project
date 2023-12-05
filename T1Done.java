package JavaGroupProject;

/*
Create a program that uses an array to
store a list of temperatures for a week,
and then uses a loop to find the highest
and lowest temperature for the week.
 */
public class T1Done {
    public static void main(String[] args) {
        int[] temp ={69,72,98,78,83,77,90};
        double highestTemp = temp[0], lowestTemp = temp[0];

        for ( int i = 0; i<temp.length; i++){
            if(temp[i] > highestTemp){
                highestTemp = temp[i];
            }else if (temp[i] < lowestTemp){
                lowestTemp = temp [i];
        }
    }
        System.out.println("Highest temp= "+highestTemp);
        System.out.println("Lowest temp= "+lowestTemp);
    }
}
