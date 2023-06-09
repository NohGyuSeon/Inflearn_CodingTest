package section01.p08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public String solution(String str) {
        String answer = "";
        str = str.toLowerCase();

        String newStr = "";

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                newStr += c;
            }
        }

        for (int i = 0; i <= newStr.length() / 2; i++) {
            if (newStr.charAt(i) != newStr.charAt(newStr.length() - i - 1)) {
                answer = "NO";
                break;
            } else {
                answer = "YES";
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main main = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(main.solution(str));
    }

}
