import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        for (int i = 2; i < nums.length; i++)
            if (nums[i] != nums[k - 2])
                nums[k++] = nums[i];
        return k;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        Solution s = new Solution();
        int k = s.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}