package Stacks;

import java.util.Stack;

public class MatchingParentheses {

    public static boolean hasMatchingParentheses(String s) {
            Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(') {
                stack.push(current);
            } else if (current == ')') {
                if(!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(hasMatchingParentheses("((algorithm()))"));
        System.out.println(hasMatchingParentheses("()(algorithm())"));
        System.out.println(hasMatchingParentheses("((algorithm))"));
        System.out.println(hasMatchingParentheses("(algorithm)"));

        System.out.println();

        System.out.println(hasMatchingParentheses("(algorithm("));
        System.out.println(hasMatchingParentheses(")algorithm)"));
        System.out.println(hasMatchingParentheses(")algorithm("));
        System.out.println(hasMatchingParentheses("algorithm(("));
        System.out.println(hasMatchingParentheses("(algorithm"));
        System.out.println(hasMatchingParentheses("((algorithm)"));
    }
}