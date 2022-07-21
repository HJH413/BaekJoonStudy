package java0721stduy;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1330
//두 수 비교하기 복습
public class if01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //삼항연산자
        String result = (a > b) ? ">" : (a < b) ? "<" : "==";
        System.out.println(result);

        // if문
        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }
}
