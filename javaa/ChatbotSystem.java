import java.util.ArrayList;
import java.util.List;

class ChatSession {
    private User user;
    private Chatbot chatbot;
    private List<Message> chatHistory;

    public ChatSession(User user, Chatbot chatbot) {
        this.user = user;
        this.chatbot = chatbot;
        this.chatHistory = new ArrayList<>();
    }

    public void sendMessage(String messageText) {
        try {
            Message userMsg = new Message(messageText, user.getName());
            chatHistory.add(userMsg);

            String reply = chatbot.generateReply(messageText);

            Message botMsg = new Message(reply, chatbot.botName);
            chatHistory.add(botMsg);

            System.out.println(user.getName() + ": " + messageText);
            System.out.println(chatbot.botName + ": " + reply);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showChatHistory() {
        System.out.println("\n--- Chat History ---");
        for (Message msg : chatHistory) {
            System.out.println(msg.getSender() + ": " + msg.getContent());
        }
    }
}

class User {
    private String name;

    public User(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
class Message {
    private String content;
    private String sender;

    public Message(String content, String sender) {
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Message cannot be empty");
        }
        this.content = content;
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }
}
abstract class Chatbot {
    protected String botName;

    public Chatbot(String botName) {
        this.botName = botName;
    }

    public abstract String generateReply(String userMessage);
}
class RuleBasedBot extends Chatbot {

    public RuleBasedBot(String botName) {
        super(botName);
    }

    @Override
    public String generateReply(String userMessage) {
        if (userMessage.equalsIgnoreCase("hi")) {
            return "Hello!";
        } else if (userMessage.equalsIgnoreCase("how are you")) {
            return "I'm fine!";
        } else {
            return "I don't understand.";
        }
    }
}
class AIChatbot extends Chatbot {

    public AIChatbot(String botName) {
        super(botName);
    }

    @Override
    public String generateReply(String userMessage) {
        return "AI Response: You said -> " + userMessage;
    }
}

public class ChatbotSystem {
    public static void main(String[] args) {

        User user = new User("Sarumathi");

        // Polymorphism (Parent reference)
        Chatbot bot;

        bot = new RuleBasedBot("SimpleBot");
        ChatSession session1 = new ChatSession(user, bot);

        session1.sendMessage("hi");
        session1.sendMessage("how are you");
        session1.sendMessage("bye");

        session1.showChatHistory();

        System.out.println("\n--- Switching to AI Bot ---");

        bot = new AIChatbot("SmartBot");
        ChatSession session2 = new ChatSession(user, bot);

        session2.sendMessage("Tell me a joke");
    }
}