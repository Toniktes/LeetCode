package tasks.twoSums;

import java.util.Arrays;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        long count = Arrays.stream(hours)
               .filter(x -> x > target)
                .count();
        return (int)count;
    }
}
