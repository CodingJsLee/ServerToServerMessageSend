import root.server1.mvc.controller.MessageController;
import root.server1.mvc.view.Display;

public class run {
    public static void main(String[] args){

        new Display(new MessageController()).Display(false);

    }
}
