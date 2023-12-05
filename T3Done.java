package JavaGroupProject;
/*
Create a 2D array or integer type where you will store odd and even
numbers. Develop a program which will identify/print the even numbers
only
 */
public class T3Done {
    public static void main(String[] args) {
        int[][] nums={
                {13,22,42,11},
                {90,78,44,71},
                {1,4,77,52},
                {99,10293,43422,891794389}
        };
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]%2==0){
                    System.out.println(nums[i][j]+" ");
                }
            }
        }
    }
}
