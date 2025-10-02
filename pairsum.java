import java.util.Scanner;
import java.util.Arrays;
class pairsum{
    public static boolean pairs(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum == target){
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        System.out.println("Enter the Target Element :");
        int target = scan.nextInt();
        boolean result = pairs(nums,target);
        System.out.println("Pair sum is to :"+result);
    }
}