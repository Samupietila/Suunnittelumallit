package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccessControlService {
    private static AccessControlService instance;
    private Map<String, Set<String>> accessMap;

    // Private constructor to prevent instantiation
    private AccessControlService() {
        accessMap = new HashMap<>();
    }

    // Public method to provide access to the instance
    public static AccessControlService getInstance() {
        if (instance == null) {
            instance = new AccessControlService();
        }
        return instance;
    }

    public boolean isAllowed(String id, String user) {
        return accessMap.containsKey(id) && accessMap.get(id).contains(user);
    }

    public void addAccess(String id, String user) {
        accessMap.computeIfAbsent(id, k -> new HashSet<>()).add(user);
    }
}
