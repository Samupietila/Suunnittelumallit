package chain_of_responsibility;


public class ComplaintHandler extends MessageHandler {

    @Override
    public void processMessage(Message message) {
        if (message.getType() == Message.MessageType.COMPLAINT) {
            System.out.println("Complaint Handler: " + message.getMessage() + " from " + message.getSender());
        } else {
            System.out.println("Complaint Handler: Passing the message to the next handler");
            this.getNextHandler().processMessage(message);
        }
    }
}