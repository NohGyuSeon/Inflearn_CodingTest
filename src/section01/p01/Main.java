package section01.p01;

import java.util.Scanner;

public class Main {

    int solution(String str, char c) {
        int answer = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);

        for (char x: str.toCharArray()) {
            if(x == c) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(main.solution(str, c));
    }

}