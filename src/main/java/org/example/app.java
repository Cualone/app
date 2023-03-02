package org.example;
import java.util.Scanner;
public class app {
    private final Scanner sc;
    public app(Scanner sc) {
        this.sc = sc;
    }


    public void run() {
        System.out.println("==명언 앱==");

        while (true) {
            System.out.print("명령) ");
            String com = sc.nextLine().trim();  //.trim==좌우공백제거
            if (com.equals("종료")) {
                break;
            } else if (com.equals("등록")) {
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String name = sc.nextLine().trim();
                System.out.println("1번명언이 등록되었습니다.");

            }
        }
    }
}
