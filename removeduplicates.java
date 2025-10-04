import java.util.Scanner;
import java.util.Arrays;
class removedulicates{
    public static int duplicateselement(int[] nums){
        int newIndex = 1;
        for(int right = 1;right<nums.length;right++){
            if(nums[right-1]!=nums[right]){
                nums[newIndex] = nums[right];
                newIndex++;
            }
        }
        return newIndex;
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
        int result = duplicateselement(nums);
        int[] indexArray = Arrays.copyOf(nums,result);
        System.out.println("Unique Elements of :"+Arrays.toString(indexArray));
    }
}