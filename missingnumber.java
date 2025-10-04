import java.util.Scanner;
import java.util.Arrays;
class missingnumber{
    public static int missing(int[]  nums,int n){
        int left = 0;
        int right = 1;
        while(left<nums.length && right<=n){
            if(nums[left]==right){
                left++;
                right++;
            }
            else{
                return right;
            }
        }
        if(right<=n){
            return right;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size :");
        int n = scan.nextInt();
        System.out.println("Enter the Target :");
        int target = scan.nextInt();
        System.out.println("Enter the Arrays :");
        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i] = scan.nextInt();
        }
        int result = missing(nums,target);
        if(result!=0){
            System.out.println("Missing Element is : "+result);
        }
        else{
            System.out.println(result + "Missing Element");
        }
    }
}