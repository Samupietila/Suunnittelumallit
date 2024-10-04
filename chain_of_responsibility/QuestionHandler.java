package chain_of_responsibility;


public class QuestionHandler extends MessageHandler {

    @Override
    public void processMessage(Message message) {
        if (message.getType() == Message.MessageType.QUESTION) {
            System.out.println("Question Handler: " + message.getMessage() + " from " + message.getSender());
        } else {
            System.out.println("Question Handler: Passing the message to the next handler");
            this.getNextHandler().processMessage(message);
        }
    }
}