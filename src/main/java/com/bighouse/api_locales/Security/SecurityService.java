package com.bighouse.api_locales.Security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    public String getUser() {
        var context = SecurityContextHolder.getContext();
        return context.getAuthentication().getName();
    }

    public boolean isAuthenticate() {
        if (getUser().equals("anonymousUser")) {
            System.out.println("Unknown User");
            return false;
        }
        var context = SecurityContextHolder.getContext();
        boolean authenticated = context.getAuthentication().isAuthenticated();
        if (authenticated) {
            System.out.println("Authenticate user");
        }
        return authenticated;
    }

    public boolean isNotAuthenticated() {
        return !isAuthenticate();
    }

}