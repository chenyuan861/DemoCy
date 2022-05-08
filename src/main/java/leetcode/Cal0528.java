package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Cal0528 {
    /**
     * .两数之和
     * 题目描述：
     *
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     */

        public static  int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }


    public static void main(String[] args) {
          int[] result =  twoSum(new int[]{1, 3, 4, 5},6);
      for (int i:result){
          System.out.println(i);
      }
    }
}
