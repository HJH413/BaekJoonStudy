package java0718study1;

import java.util.Scanner;
//2022.07.18
//알람시계
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt(); // 2
        int m = scanner.nextInt(); // 15
        if(m<45){ // 15
            h--; // 1
            m = 60-(45-m); // 30
            if(h<0){
                h = 23;
            }
            System.out.println(h + " " + m);
        } else {
            System.out.println(h + " " + (m-45));
        }
    }
}
