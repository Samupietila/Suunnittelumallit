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
            DocumentProxy proxy = new DocumentProxy(document, null);
            documents.put(document.getId(), proxy);
        } else {
            documents.put(document.getId(), document);
        }
    }

    public IDocument getDocument(String id, String user) {
        return documents.get(id);}
        
}

