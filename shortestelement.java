import java.util.Scanner;
import java.util.Arrays;
class ShortestElement{
    public static int shortestelement(int[] nums){
        int min = nums[0];
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            min = Math.min(min,Math.min(nums[left],nums[right]));
            left++;
            right--;
        }
        return min;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int nums[] = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = shortestelement(nums);
        System.out.println("Shortest Element in array :"+ result);
    }
}