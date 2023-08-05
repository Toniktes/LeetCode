package tasks.add_Two_Integers;

class Solution {
    public int sum(int num1, int num2) {
        if (num1 >= -100 && num2 <= 100) {
            return num1 + num2;
        } else {
            throw new IllegalArgumentException("Constraints: -100 <= num1, num2 <= 100");
        }
    }
}

