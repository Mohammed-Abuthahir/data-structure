import java.util.Scanner;
import java.util.Arrays;
class reversearray{
    public static int[] reverse(int[]  nums) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size :");
        int n = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result[] = reverse(nums);
        System.out.println("After Reversing Arrays :"+Arrays.toString(nums));
    }
}