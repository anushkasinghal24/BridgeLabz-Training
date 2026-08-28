package org.example.fundoo.repository;

import org.example.fundoo.entity.Note;
import org.example.fundoo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note,Long> {
    List<Note> findAllByIsDeletedFalse();

    List<Note> findAllByUser_UsernameAndIsDeleted(String userUsername, boolean isDeleted);

    Note findByUser_UsernameAndNoteId(String username, long noteId);

    List<Note> findAllByIsDeletedAndIsArchivedAndUser_Username(boolean b, boolean b1, String username);

    List<Note> user(User user);

    List<Note> findAllByIsArchivedAndUser_Username(boolean b, String username);

    Note findByNoteIdAndUser_Username(long noteId, String username);

    List<Note> findAllByTitle(String title);

    List<Note> findAllByLabel_LabelNameAndUser_Username(String labelLabelName, String userUsername);

    List<Note> findAllByUser_UsernameAndTitle(String userUsername, String title);
}
