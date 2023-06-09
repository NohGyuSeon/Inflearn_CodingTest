package section01.p04;

import java.util.Scanner;

public class Main {

    public void solution(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print((str.charAt(i)));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            main.solution(sc.next());
        }
    }
}
