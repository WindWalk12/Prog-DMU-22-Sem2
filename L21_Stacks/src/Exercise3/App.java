package Exercise3;

import Exercise1.ArrayStack;

import java.util.Stack;

public class App {
    public static void main(String[] args) {
        String s = "(3+{5{99{*}}[23[{67}67]]})";
        String s2 = "(}){";
        String s3 = "(H)";

        System.out.println(checkParenteses(s));
    }

    public static boolean checkParenteses(String s) {
        ArrayStack brackets = new ArrayStack();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                brackets.push(c);
            } else if (c == ')' && brackets.peek().equals('(')) {
                brackets.pop();
            } else if (c == '{') {
                brackets.push(c);
            } else if (c == '}'  && brackets.peek().equals('{')) {
                brackets.pop();
            } else if (c == '[') {
                brackets.push(c);
            } else if (c == ']'  && brackets.peek().equals('[')) {
                brackets.pop();
            }
        }
        return brackets.isEmpty();
    }
}
