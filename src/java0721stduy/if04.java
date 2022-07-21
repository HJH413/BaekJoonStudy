package java0721stduy;

import java.util.Scanner;

//https://www.acmicpc.net/problem/14681
//사분면 고르기
public class if04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        String result = (x>0&&y>0) ? "삼항연산자 1" : (x<0&&y>0) ? "삼항연산자 2" : (x<0&&y<0) ? "삼항연산자 3" : (x>0&&y<0) ? "삼항연산자 4" : "삼항연산자 0,0";
        System.out.println(result);

        if (x > 0 && y > 0) {
            System.out.println("if문 1");
        } else if (x < 0 && y > 0) {
            System.out.println("if문 2");
        } else if (x < 0 && y < 0) {
            System.out.println("if문 3");
        } else if (x > 0 && y < 0) {
            System.out.println("if문 4");
        } else {
            System.out.println("if문 0,0");
        }

    }
}
