import java.util.Scanner;
import java.util.Arrays;
class LargestElement{
    public static int largestelement(int[] nums){
        int max = nums[0];
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            max = Math.max(max , Math.max(nums[left],nums[right]));
            left++;
            right--;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = largestelement(nums);
        System.out.println("Largest Element in array :"+result);

    }
}