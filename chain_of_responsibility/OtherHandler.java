package chain_of_responsibility;


public class OtherHandler extends MessageHandler {

    @Override
    public void processMessage(Message message) {
        {
            System.out.println("Other Handler: " + message.getMessage() + " from " + message.getSender());
    }
    }   
}