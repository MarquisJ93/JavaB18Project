package JavaGroupProject;
/*
Write a program to print out duplicate
elements from an Array of Strings?
 */
public class T10Done {
    public static void main(String[] args) {
        String[] food = {"Carrot", "Broccoli", "Carrot", "Beet", "Potato", "Beet"};
        for (int i = 0; i < food.length; i++) {
            for (int j = i + 1; j < food.length; j++) {
                if (food[i].equals(food[j])) {
                    System.out.println("Duplicate is " + food[i]);
                }
            }
        }
    }
}