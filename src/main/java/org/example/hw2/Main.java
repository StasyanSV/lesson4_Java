package org.example.hw2;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{})"));
    }

    public static boolean isValid(String text1) {
        char[] array = text1.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < text1.length(); i++) {
            if (array[i] == '(' || array[i] == '{' || array[i] == '[') {
                stack.push(array[i]);
            }
            if (array[i] == ')' || array[i] == '}' || array[i] == ']') {
                if (stack.isEmpty()) return false;
                char temp = stack.pop();
                if ((temp == '(' && array[i] == ')') || (temp == '{' && array[i] == '}') || (temp == '[' && array[i] == ']')) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (!stack.isEmpty()) return false;
        return true;
    }
}
