package root.server1.mvc.view;

import root.server1.mvc.controller.MessageController;

import java.util.Scanner;

public class Display {

    private MessageController mc;
    private Scanner sc = new Scanner(System.in);

    public Display(){}

    public Display(MessageController messageController) {
        this.mc = messageController;
    }

    public final void Display(boolean sw){

        sw = true;

        String str = "";
        while(sw){

            System.out.println("=================================");
            System.out.println("1. 메시지 입력");
            System.out.println("2. 실시간 메시지 전송 프로그램실행");
            System.out.println("3. 모든 데이터 출력");
            System.out.println("0. 프로그램 종료");

            System.out.println("=================================");

            str = sc.nextLine();
            if("0".equals(str)) sw = false; System.out.println("프로그램이 종료됐습니다.");

        }



    }
}
