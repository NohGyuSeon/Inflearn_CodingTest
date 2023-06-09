package section01.p03;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        int count = 0;

        String tokens[] = str.split(" ");

        count = tokens[0].length();
        answer = tokens[0];

        for (String token : tokens) {
            if (token.length() > count) {
                count = token.length();
                answer = token;
            }
        }

        return answer;
    }
    
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }

}