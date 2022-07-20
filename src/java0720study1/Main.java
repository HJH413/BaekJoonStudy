package java0720study1;

import java.util.Scanner;
//오븐 시계
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        int cookTime = scanner.nextInt();

        h += cookTime / 60; //요리시간을 나눈 수가 시
        m += cookTime % 60; //요리시간의 나머지 수가 분

        if(m >= 60){ // 분이 60분이 이상이라면
            h += 1; // 1시간 더하고
            m -= 60; // -60분
        }
        if(h >= 24){ // 24시 이상이면
            h -= 24; // -24
        }

        System.out.println(h + " " + m);


        //내가 작성한것
        /*if (cookTime <= 60){
            if((m+cookTime)-60 == 60){
                h++;
                if (h == 24){
                    h = 0;
                }
                System.out.println(h + " " + 0);
            } else if((m+cookTime) < 60) {
                System.out.println(h + " " + (m + cookTime));
            } else if((m+cookTime) >= 60) {
                if (h==24){
                    h = 0;
                }
                h++;
                System.out.println(h + " " + ((m + cookTime)-60));
            }
        }*/


    }
}

