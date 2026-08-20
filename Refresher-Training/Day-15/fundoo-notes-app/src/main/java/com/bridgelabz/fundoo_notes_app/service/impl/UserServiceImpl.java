package com.bridgelabz.fundoo_notes_app.service.impl;

import com.bridgelabz.fundoo_notes_app.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String getStatusMessage() {
        return "User service is ready";
    }
}
