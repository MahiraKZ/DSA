package Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{5,7,7,8,8,10};
        int target = 7;

        int firstPosition = binarySearch(nums, target, true);
        if(firstPosition == -1) {
            System.out.println("Element Not Present");
            return;
        }

        int lastPosition = binarySearch(nums, target, false);
        System.out.println(firstPosition + " " + lastPosition);
    }

    private static int binarySearch(int[] nums, int target, boolean isFirstPos) {
        int low = 0;
        int high = nums.length - 1;

        int indexPos = -1;
        while(low <= high) {
            int mid = low + (high - low) /2;

            if(nums[mid] == target) {
                indexPos = mid;
                if(isFirstPos) {
                    high = mid - 1; //looking for the first pos in the left subarray
                } else {
                    low = mid + 1;
                }
            } else if(nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return indexPos;
    }
}
