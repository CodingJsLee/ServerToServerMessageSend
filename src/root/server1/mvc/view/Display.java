package root.server1.mvc.view;

import root.server1.mvc.controller.MessageController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Display {

    private MessageController mc;
    private Scanner sc = new Scanner(System.in);
    private LinkedHashMap<String, Object> input = new LinkedHashMap<>();
    private LinkedHashMap<String, Object> returnValue = new LinkedHashMap<>();
    public Display(){}

    public Display(MessageController messageController) {
        this.mc = messageController;
    }

    public final void Display(boolean sw){

        sw = true;

        String str = "";
        while(sw){
            System.out.println();System.out.println();System.out.println();
            System.out.println("=================================");
            System.out.println("1. 메시지 입력");
            System.out.println("2. 실시간 메시지 전송 프로그램실행");
            System.out.println("3. 전송된 내역");
            System.out.println("0. 프로그램 종료");

            System.out.println("=================================");

            str = sc.nextLine();
            if("0".equals(str)){
                sw = false;
                System.out.println("프로그램이 종료됐습니다.");
            }

            if("1".equals(str)) {
                // 메시지 입력
                try {
                    input = this.inputMessage();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mc.messageInsert(input);
            }

        }



    }

    /**
     * 1 입력후  전달할 메시지를 입력한다.
     * @return 입력한 메시지
     */
    private LinkedHashMap<String, Object> inputMessage() throws IOException {

        System.out.println("***********************");
        System.out.println("** 메시지를 입력하세요.");
        System.out.println("***********************");
        System.out.println();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String message = reader.readLine();
        System.out.println("입력한 메시지 : " + message);

        returnValue.put("Message", message);

        return returnValue;
    }








}
