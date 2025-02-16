class LeetCode1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; 
    }

    public static void main(String[] args) {
        LeetCode1 solution = new LeetCode1();
        int[] nums = {3, 2, 4}; 
        int target = 6;

        int[] result = solution.twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}

// BEST FOR LEET CODE
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 1; i < nums.length; i++) {
//             for (int j = i; j < nums.length; j++) {
//                 if (nums[j] + nums[j - i] == target) {
//                     return new int[]{j - i, j}; 
//                 }
//             }
//         }
//         return new int[]{};
//     }
// }
