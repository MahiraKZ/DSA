package Arrays;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the length of Array");
        int size = sc.nextInt();
        int[] nums = new int[size];

        System.out.println("Enter the values of Array");
        for(int i = 0; i < size; i++) {
            int scannedNum = sc.nextInt();
            nums[i] = scannedNum;
        }

        int result = maxConsecutiveOnes(nums);
        System.out.println("The result is:" + result);
    }

    private static int maxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 0;
            }
        }
        return Math.max(result, count); //3
    }
}

//[0,1,1,0,0,1,1,1] count = 3, result = 2;
//Time Complexity - O(N)
//Space Complexity - O(1)