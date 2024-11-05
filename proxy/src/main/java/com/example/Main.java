package com.example;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User("user1");
        User user2 = new User("user2");
        Document document1 = new Document("doc1", "1.1.2001", "content1", true);
        Document document2 = new Document("doc2", "2.2.2002", "content2", false);
        library.addDocument(document1);
        library.addDocument(document2);

        AccessControlService accessControlService = AccessControlService.getInstance();
        
        try {
            System.out.println(library.getDocument("doc2", user1));
            System.out.println(library.getDocument("doc1", user1));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(library.getDocument("doc2", user2));
            System.out.println(library.getDocument("doc1", user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
        accessControlService.addAccess("doc1", user1);
        try {
            System.out.println(library.getDocument("doc1", user1));
            System.out.println(library.getDocument("doc2", user1));
            System.out.println(library.getDocument("doc1", user2));
        } catch (AccessDeniedException e) {
            System.out.println(e.getMessage());
        }
        
    }
}