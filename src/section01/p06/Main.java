package section01.p06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    
    private Stack<Character> stack = new Stack<>();

    public String solution(String str) {

        StringBuffer sb = new StringBuffer();

        for (Character c : str.toCharArray()) {
            if (!isExist(stack, c)) {
                stack.add(c);
            }
        }

        for (Character character : stack) {
            sb.append(character);
        }

        return sb.toString();
    }

    public boolean isExist(Stack stack, char c) {
        if (stack.contains(c)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(main.solution(str));
    }

}
