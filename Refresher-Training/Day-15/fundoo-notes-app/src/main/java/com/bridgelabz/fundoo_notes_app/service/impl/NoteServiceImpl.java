package com.bridgelabz.fundoo_notes_app.service.impl;

import com.bridgelabz.fundoo_notes_app.service.NoteService;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {

    @Override
    public String getStatusMessage() {
        return "Note service is ready";
    }
}
