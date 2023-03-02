package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class app {

    private final Scanner sc;
    public app(Scanner sc) {
        this.sc = sc;
    }


    public void run() {
        System.out.println("==명언 앱==");
        long lastWiseSayingId = 0;
        List<WiseSaying> wiseSayings = new ArrayList<>();
        while (true) {

            System.out.print("명령) ");
            String com = sc.nextLine().trim();  //.trim==좌우공백제거
            if (com.equals("종료")) {
                break;
            } else if (com.equals("등록")) {
                long id = lastWiseSayingId + 1;
                System.out.print("명언 : ");
                String content = sc.nextLine().trim();
                System.out.print("작가 : ");
                String name = sc.nextLine().trim();

                WiseSaying wiseSaying = new WiseSaying(id, content, name);
                wiseSayings.add(wiseSaying);

                System.out.printf("%d번 명언이 등록되었습니다.\n", id);
                lastWiseSayingId++;
            } else if (com.equals("목록")) {
                System.out.printf("생성 명언 수 : %d\n", wiseSayings.size());
            }
        }
    }
}

