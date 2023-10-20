package root.server1.mvc.service;

import root.server1.mvc.dao.MessageDAO;

public class MessageService {
    private MessageDAO md;

    public MessageService(){
        this.md = new MessageDAO();
    }


}
