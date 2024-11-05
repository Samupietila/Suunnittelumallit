package com.example;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, IDocument> documents;
    
    public Library() {
        documents = new HashMap<>();
    }

    public void addDocument(Document document){
        if (document.isProtected()) {
            DocumentProxy proxy = new DocumentProxy(document, AccessControlService.getInstance());
            documents.put(document.getId(), proxy);
        } else {
            documents.put(document.getId(), document);
        }
    }

    public String getDocument(String id, User user){
        IDocument document = documents.get(id);
        if (document != null) {
            return document.getContent(user);
        } else {
            throw new IllegalArgumentException("Document not found");
        }
    }
        
}

