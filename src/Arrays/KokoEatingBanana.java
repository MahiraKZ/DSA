package Arrays;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] nums = new int[]{3,4,7,11};
        int hour = 8;

        int K = binarySearch(nums, hour);
        System.out.println(K);
    }

    private static int binarySearch(int[] nums, int hour) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        for(int num : nums) {
            high = Math.max(high, num);
        }

        int ans = -1;
        while(low <= high) {
            int speed = low + (high - low) /2;
            if(isPossible(speed, nums, hour)) {
                ans = speed;
                high = speed - 1;
            } else {
                low = speed + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int speed, int[] nums, int hour) {
        int countHour = 0;

        for(int num : nums) {
            countHour += num / speed;
            if(num % speed != 0) {
                countHour++;
            }
        }
        return countHour <= hour;
    }
}
