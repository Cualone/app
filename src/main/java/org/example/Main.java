package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== 명언 앱 ==");
        System.out.print("명령) ");
        String com = sc.next();
        if (com=="등록") {
            System.out.println("명언 : ");
            String myeong = sc.next();
            System.out.println("작가 : ");
            String by = sc.next();
        }
    }
}