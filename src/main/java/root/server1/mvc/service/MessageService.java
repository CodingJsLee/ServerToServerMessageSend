package root.server1.mvc.service;

import root.server1.mvc.dao.MessageDAO;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedHashMap;

public class MessageService {

    private LinkedHashMap<String, Object> returnValue = new LinkedHashMap();
    private MessageDAO md;

    public MessageService(){
        this.md = new MessageDAO();
    }


    public LinkedHashMap<String, Object> messageInsert(LinkedHashMap<String, Object> input) {
        returnValue.clear();

        try {
            byte[] lengthCheckString = ((String) input.get("Message")).getBytes("euc-kr");

            if(lengthCheckString.length > 254) {
                returnValue.put("MessageLength", lengthCheckString.length);
                returnValue.put("ResultValue",2);
                return returnValue;
            }
            returnValue = md.messageInsert(input);

        } catch(UnsupportedEncodingException e){
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        return returnValue;
    }
}
