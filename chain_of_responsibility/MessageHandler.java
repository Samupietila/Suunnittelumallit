package chain_of_responsibility;

public class MessageHandler {
    private MessageHandler nextHandler;
    public void processMessage(Message message) {
        if (nextHandler != null) {
            nextHandler.processMessage(message);
        }
    }
    public void setNextHandler(MessageHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public MessageHandler getNextHandler() {
        return nextHandler;
    }
    
}
