package tasks.goalParserInterpretation;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.interpret("G()(al)"));
        System.out.println(solution.interpret("G()()()()(al)"));
        System.out.println(solution.interpret("(al)G(al)()()G"));
    }
}
