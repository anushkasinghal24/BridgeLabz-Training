package com.bridgelabz.fundoo_notes_app.controller;

import com.bridgelabz.fundoo_notes_app.service.NoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/notes")
@RequiredArgsConstructor
public class NoteController {

    private final NoteService noteService;

    @GetMapping("/ping")
    public String ping() {
        return noteService.getStatusMessage();
    }
}
