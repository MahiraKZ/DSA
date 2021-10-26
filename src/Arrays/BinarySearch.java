package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{3,6,7,9,12,15,17};
        int target = 9;

        int index = binarySearch(nums, target);
        if(index == -1) {
            System.out.println("Target Not found");
        } else {
            System.out.println("Target at index:"+index);
        }
    }

    private static int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {
            int mid = low + (high - low) /2;

            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
