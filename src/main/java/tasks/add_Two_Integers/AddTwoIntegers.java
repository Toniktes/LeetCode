package tasks.add_Two_Integers;

public class AddTwoIntegers {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.sum(12, 5));
        System.out.println(solution.sum(-10, 4));
        System.out.println(solution.sum(-200, 4));
    }
}
    /*Given two integers num1 and num2, return the sum of the two integers.


Example 1:

Input: num1 = 12, num2 = 5
Output: 17
Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.
Example 2:

Input: num1 = -10, num2 = 4
Output: -6
Explanation: num1 + num2 = -6, so -6 is returned.


Constraints:

-100 <= num1, num2 <= 100*/
