package JavaGroupProject;
/*
Write a java program to find the
second-largest number in the array?
 */
public class T9Done {
    public static void main(String[] args) {
int[] nums={1,33,6,77,21};
        int highest = nums[0];
        int secondhighest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > highest){
                secondhighest = highest;
                highest = nums[i];
            } else if (nums[i] > secondhighest) {
                secondhighest = nums[i];
            }
        }
        System.out.println("Second largest number: "+secondhighest);

    }
}
