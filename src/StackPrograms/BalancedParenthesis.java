package StackPrograms;

import java.util.Stack;

public class BalancedParenthesis {

    public static Boolean isBalancedParenthesis(String exp) {
        Stack<Character> stack = new Stack<>();
        char[] arr = exp.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '{' || arr[i] == '[' || arr[i] == '(') {
                stack.push(arr[i]);
            } else {
                if (stack.isEmpty()) {  // if open brackets are not there
                    return false;
                } else if (arr[i] == '}' || arr[i] == ']' || arr[i] == ')') {
                    char top = stack.pop();
                    if (arr[i] == ')' && top == '(' || arr[i] == ']' && top == '[' || arr[i] == '}' && top == '{') {
                    }
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr1 = "{[()]}";
        String expr2 = "{[(])}";
        System.out.println(expr1 + " -> " + isBalancedParenthesis(expr1));
        System.out.println(expr2 + " -> " + isBalancedParenthesis(expr2));
    }
}
