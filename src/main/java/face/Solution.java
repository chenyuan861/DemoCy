package face;
// 示例 1:
// 输入: [[1,3],[2,6],[8,10],[15,18]]
// 输出: [[1,6],[8,10],[15,18]]
// 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].

import java.util.*;

// 示例 2:
// 输入: [[1,4],[4,5]]
// 输出: [[1,5]]
// 解释: 区间 [1,4] 和 [4,5] 可被视为重叠区间。
public class Solution {
    public static  int[][] merge(int[][] intervals) {
        // 请补充代码
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<int[]> aList = new ArrayList<>();
        aList.add(intervals[0]);
        int index = 0;
        for (int i = 1; i < intervals.length; i++) {
            int indexLow = aList.get(index)[0];
            int indexHigh = aList.get(index)[1];
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (indexLow == start) {
                if (end > indexHigh) {
                    aList.set(index, new int[] {start, end});
                }
            } else {
                if (start > indexHigh) {
                    aList.add(new int[] {start, end});
                    index++;
                } else {
                    if (end > indexHigh) {
                        aList.set(index, new int[] {indexLow, end});
                    }
                }
            }
        }
        return aList.toArray(new int[0][]);

    }

    public static void main(String[] args) {

        int[][] array ={{2,6},{1,2},{2,8}};
        System.out.println(array.length);
        System.out.println(array[0]);
         int[][] tmp =merge(array);

    }

}
