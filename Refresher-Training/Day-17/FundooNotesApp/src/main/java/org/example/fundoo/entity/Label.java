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
@NoArgsConstructor
@AllArgsConstructor
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long labelId;

    private String labelName;

    private boolean isDeleted = false;

    @ManyToOne
    @JoinColumn
    private User user;

    @OneToMany(mappedBy = "label")
    private List<Note> notes;

}
