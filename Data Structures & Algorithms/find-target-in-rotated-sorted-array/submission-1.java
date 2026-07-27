class Solution {
    public int search(int[] arr, int target) {
        int lo = 0, hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[lo] <= arr[mid]) {   // Left half sorted
                if (arr[lo] <= target && target < arr[mid])
                    hi = mid - 1;
                else
                    lo = mid + 1;
            } else {                     // Right half sorted
                if (arr[mid] < target && target <= arr[hi])
                    lo = mid + 1;
                else
                    hi = mid - 1;
            }
        }

        return -1;
    }
}