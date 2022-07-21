package java0721stduy;

import java.util.Scanner;

//https://www.acmicpc.net/problem/9498
//시험 성적
public class if02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        //삼항연산자
        String result = (a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 70) ? "C" : (a >= 60) ? "D" : "F";
        System.out.println("삼항연산자 " + result);

        if (a >= 90) {
            System.out.println("IF문 " + "A");
        } else if (a >= 80) {
            System.out.println("IF문 " + "B");
        } else if (a >= 70) {
            System.out.println("IF문 " + "C");
        } else if (a >= 60) {
            System.out.println("IF문 " + "D");
        } else {
            System.out.println("IF문 " + "F");
        }

        switch (a / 10) {
            case (10):
            case (9):
                System.out.println("switch문 " + "A");
                break;
            case (8):
                System.out.println("switch문 " + "B");
                break;
            case (7):
                System.out.println("switch문 " + "C");
                break;
            case (6):
                System.out.println("switch문 " + "D");
                break;
            default:
                System.out.println("switch문 " + "F");
                break;
        }

    }
}
