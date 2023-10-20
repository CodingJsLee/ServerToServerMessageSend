package root.server1.mvc.controller;

import root.server1.mvc.service.MessageService;

import java.util.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;

public class MessageController {
    private MessageService ms;

    public MessageController(){
        ms = new MessageService();
    }

    /**
     * byte 1024 초과하는지 check한다
     * @param input
     */
    public void messageInsert(LinkedHashMap<String, Object> input) {
        System.out.println("[Controller : 넘어온메시지]");
        System.out.println(input.get("Message"));

        try {
            byte[] lengthCheckString = ((String) input.get("Message")).getBytes("euc-kr");
            System.out.println("UTF-8 바이트 배열: " + Arrays.toString(lengthCheckString));
            System.out.println("현재 메시지 Byte 길이 : " + lengthCheckString.length);
        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }




    }
}
