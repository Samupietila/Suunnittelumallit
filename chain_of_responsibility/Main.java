package chain_of_responsibility;

import chain_of_responsibility.Message.MessageType;

public class Main {
    public static void main(String[] args) {
        MessageHandler complaintHandler = new ComplaintHandler();
        MessageHandler suggestionHandler = new SuggestionHandler();
        MessageHandler questioHandler = new QuestionHandler();
        MessageHandler otherHandler = new OtherHandler();
        
        complaintHandler.setNextHandler(suggestionHandler);
        suggestionHandler.setNextHandler(questioHandler);
        questioHandler.setNextHandler(otherHandler);

        Message msq1 = new Message(Message.MessageType.COMPLAINT, "I am not happy with the service", "John");
        Message msq2 = new Message(Message.MessageType.SUGGESTION, "I think we should have a new feature", "Jane");
        Message msq3 = new Message(Message.MessageType.QUESTION, "How do I use this feature?", "Doe");
        Message msq4 = new Message(Message.MessageType.OTHER, "This is a random message", "Smith");
        System.out.println("Processing messages");
        System.out.println("Message 1");
        complaintHandler.processMessage(msq1);
        System.out.println("Message 2");
        complaintHandler.processMessage(msq2);
        System.out.println("Message 3");
        complaintHandler.processMessage(msq3);
        System.out.println("Message 4");
        complaintHandler.processMessage(msq4);

    }
}
