package chain_of_responsibility;

public class Message {
    private MessageType type;
    private String message;
    private String sender;
    public enum MessageType {
        COMPLAINT, SUGGESTION, QUESTION, OTHER
    }
    public Message(MessageType type, String message, String sender) {
        this.type = type;
        this.message = message;
        this.sender = sender;
    }
    public MessageType getType() {
        return type;
    }
    public String getMessage() {
        return message;
    }
    public String getSender() {
        return sender;
    }
    public void setType(MessageType type) {
        this.type = type;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    public static void main(String[] args) {
        Message msg = new Message(MessageType.COMPLAINT, "I am not happy with the service", "John");

        System.out.println(msg.getType());
    }
}
