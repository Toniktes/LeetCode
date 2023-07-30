package tasks.reverse_string;

public class reversString {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] ch = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] ch2 = new char[]{'H', 'a', 'n', 'n', 'a', 'h'};
        solution.reverseString(ch);
        solution.reverseString(ch2);
        System.out.println(ch);
        System.out.println(ch2);

    }
}
    /*Write a function that reverses a string. The input string is given as an array of characters s.

    You must do this by modifying the input array in-place with O(1) extra memory.*/
