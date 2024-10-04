package chain_of_responsibility;


public class SuggestionHandler extends MessageHandler {

    @Override
    public void processMessage(Message message) {
        if (message.getType() == Message.MessageType.SUGGESTION) {
            System.out.println("Suggestion Handler: " + message.getMessage() + " from " + message.getSender());
        } else {
            System.out.println("Suggestion Handler: Passing the message to the next handler");
            this.getNextHandler().processMessage(message);
        }
    }
}