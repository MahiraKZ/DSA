package Arrays;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = new int[]{3,6,1,7, 2,4};

        int target = 7;

        int index = linearSearch(nums, target);
        if(index == -1) {
            System.out.println("Target Not found");
        } else {
            System.out.println("Target at index:"+index);
        }
    }

    static int linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
