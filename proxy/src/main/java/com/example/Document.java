package com.example;


public class Document implements  IDocument {
    private String id;
    private String creationDate;
    private String content;
    private boolean isProtected;
    private DocumentProxy documentproxy;

    public Document(String id, String creationDate, String content, boolean isProtected) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
        this.isProtected = isProtected;
    }
    
    public String getId() {
        return id;
    }
    @Override
    public String getCreationDate() {
        return creationDate;
    }

    @Override
    public String getContent(User user) {
        return content;
    }

    public boolean isProtected() {
        return isProtected;
    }

}
