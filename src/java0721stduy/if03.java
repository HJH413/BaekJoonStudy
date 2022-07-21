package java0721stduy;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2753
//윤년
public class if03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        int result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
        System.out.println("삼항연산자 " + result);

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("if문 " + 1);
        } else {
            System.out.println("if문 " + 0);
        }

    }
}
