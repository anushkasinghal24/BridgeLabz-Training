package org.example.fundoo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.fundoo.Status;
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Checklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long checklistId;

    private String itemName;

    private Status status = Status.UNCHECKED;

    private boolean isDeleted = false;

    @ManyToOne
    @JoinColumn
    private Note note;

}
