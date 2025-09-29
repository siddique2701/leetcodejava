public class searchInsertPosition_3 {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 7;
        int result = searchInsert(nums, target);
        System.out.println(result);
    }

    public static int searchInsert(int[] nums, int target) {
        if (target < nums[0]) {
            return 0;
        }
        int left=0;
        int right = nums.length -1;
        while (left <= right) {
            int mid = (left+right) /2;
            if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] < target) {
                left = mid +1;
            } else {
                return mid;
            }
        }
        return left;

    }
}
