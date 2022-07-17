package java0717study2;
//20220717
//https://www.acmicpc.net/step/4 조건문

import java.util.Date;
import java.util.Scanner;
public class Main {
    //1번문제
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a > b){
            System.out.print(">");
        }else if(a<b){
            System.out.print("<");
        }else if(a == b){
            System.out.print("==");
        }
    }*/
    //2번문제
   /* public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if(a>=90){
                System.out.print("A");
            }else if(a>=80){
                System.out.print("B");
            }else if(a>=70){
                System.out.print("C");
            }else if(a>=60){
                System.out.print("D");
            }else {
                System.out.print("F");
            }
        }
    }*/
    //3번 문제
   /* public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if(a%4 != 0){
                System.out.print(0);
            }else if(a%4 == 0 && a%100 != 0){
                System.out.print(1);
            }else if(a%4 == 0 && a%400 == 0){
                System.out.print(1);
            } else {
                System.out.print(0);
            }
            scanner.close();
        }
    }*/
    //4번문제
   /* public class Main{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(x > 0 && y > 0){
                System.out.print(1);
            }else if(x < 0 && y > 0){
                System.out.print(2);
            }else if(x < 0 && y < 0){
                System.out.print(3);
            }else if(x > 0 && y < 0){
                System.out.print(4);
            }
            scanner.close();
        }
    }*/
}
