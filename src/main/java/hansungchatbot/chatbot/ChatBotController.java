package hansungchatbot.chatbot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatBotController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
