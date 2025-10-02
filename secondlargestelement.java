import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
class secondlargestelement{
    public static int secondlargest(int[] nums){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int largest = nums[right];
        while(nums[right]==largest){
            right--;
        }
        return nums[right];
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
        int result = secondlargest(nums);
        System.out.println("Second Largest Element in Arrays :"+result);
    }
}