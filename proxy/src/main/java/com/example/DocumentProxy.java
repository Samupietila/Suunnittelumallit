package com.example;

import java.sql.Date;

public class DocumentProxy implements IDocument {
    private Document document;
    private AccessControlService accessControlService;

    public DocumentProxy(Document document, AccessControlService accessControlService) {
        this.document = document;
        this.accessControlService = accessControlService;
    }

    @Override
    public String getContent(User user) {
        if (document.isProtected()) {
            if (accessControlService.isAllowed(document.getId(), user)) {
                return document.getContent(user);
            } else {
                throw new AccessDeniedException("Access denied");
        }
    } else {
        return document.getContent(user);
    }
}

    @Override
    public String getCreationDate() {
        return document.getCreationDate();
    }
}
