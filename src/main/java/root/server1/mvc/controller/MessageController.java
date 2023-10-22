package root.server1.mvc.controller;

import root.server1.mvc.service.MessageService;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class MessageController {
    private MessageService ms;
    private LinkedHashMap<String, Object> returnValue = new LinkedHashMap();
    public MessageController(){
        ms = new MessageService();
    }

    /**
     * byte 1024 초과하는지 check한다
     * @param input
     * @retrun
     * 1 - 정상
     * 0 - 비정상
     * 2 - 바이트가 254보다 큼
     */
    public LinkedHashMap messageInsert(LinkedHashMap<String, Object> input) {
        returnValue.clear();

        System.out.println("[Controller : 넘어온메시지]");
        System.out.println(input.get("Message"));

        returnValue = ms.messageInsert(input);

        return returnValue;
    }
}
