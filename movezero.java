import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class movezeros{
    public static int[] moves(int[] nums){
        int left = 0;
        for(int right = 1;right<nums.length;right++){
            if(nums[right]!=0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int[] result = moves(nums);
        System.out.println(Arrays.toString(result));
    }
}