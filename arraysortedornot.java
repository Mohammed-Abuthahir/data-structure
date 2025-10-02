import java.util.Arrays;
import java.util.Scanner;
class Arraysortedornot{
    public static String sortedornot(int[] nums){
        int left = 0;
        for(int right = 1;right<nums.length;right++){
            if(nums[left]<nums[right]){
                left++;
            }
            else{
                return "Arrays is Not Sorted";
            }
        }
        return "Arrays is Sorted";
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
        String result = sortedornot(nums);
        System.out.println(result);
    }
}