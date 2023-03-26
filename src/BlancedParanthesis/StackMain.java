package BlancedParanthesis;

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();

        String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (a == '(') {
                stack.push(a);
            } else if (a == ')') {
                stack.pop(a);
            }
        }
        stack.check();
    }
}
