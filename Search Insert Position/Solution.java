class Solution {
    public int searchInsert(int[] nums, int target) {

        if (target <= nums[0]) return 0;
        if (target > nums[nums.length - 1]) return nums.length;
        return findIndexBase(nums, 0, nums.length - 1, target);
    }

    public int findIndexBase(int[] nums, int start, int end, int target) {
        if (end - start == 0) {
            return start;
        }
        if (end - start == 1) {
            if (nums[start] == target) {
                return start;
            }
            if (nums[end] == target) {
                return end;
            }
            /*
             * we didn't found the target, return the best
             */
            if (target < nums[start]) {
                return start;
            }
            return end;
        }

        int mid = start + ((end - start) / 2);
        if (nums[mid] == target) {
            return mid;
        }
        if (target < nums[mid]) {
            return findIndexBase(nums, start, mid, target);
        } else {
            return findIndexBase(nums, mid, end, target);
        }
    }
}
