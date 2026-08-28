package org.example.fundoo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long noteId;

    private String title;

    private String description;

    private String color;

    private String typeOfNote;

    private boolean isPinned = false;

    private boolean isArchived = false;

    private boolean isDeleted = false;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Label label;

    @OneToMany(mappedBy = "note", cascade = CascadeType.ALL)
    private List<Checklist> checklists;

}
