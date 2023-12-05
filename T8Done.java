package JavaGroupProject;
/*
Maximum and minimum number in the array?
 */
public class T8Done {
    public static void main(String[] args) {
int[] nums={43,22,90,123,78,2};
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            } else if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
