package tasks.number_of_Employees_Who_Met_the_Target;

import java.util.Arrays;

class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        long count = Arrays.stream(hours)
                .filter(x -> x >= target)
                .count();
        return (int) count;
    }
}
