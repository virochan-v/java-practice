package arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;
        int res = minEatingSpeed(piles,h);
        System.out.println("Minimum Speed : " + res);

    }
    static int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        int ans = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canFinish(piles,mid,h)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }
    static int findMax(int[] piles) {
        int maxVal = Integer.MIN_VALUE;
        for (int pile : piles) {
            maxVal = Math.max(maxVal,pile);
        }
        return maxVal;
    }
    static boolean canFinish(int[] piles,int speed,int h) {
        long totalHours = 0;
        for(int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
        }
        return totalHours <= h;
    }
}
