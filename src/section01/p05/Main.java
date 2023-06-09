package section01.p05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public String solution(String str) {
        Stack<Character> stack = new Stack();
        StringBuffer sb = new StringBuffer(str);

        for (char c : str.toCharArray()) {
            if (isAlphabet(c)) {
                stack.add(c);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (isAlphabet(str.charAt(i))) {
                sb.setCharAt(i, stack.pop());
            }
        }

        return sb.toString();
    }

    public boolean isAlphabet(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(main.solution(str));
    }

}
