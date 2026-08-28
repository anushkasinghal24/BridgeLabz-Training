package org.example.fundoo.repository;

import org.example.fundoo.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabelRepository extends JpaRepository<Label,Long> {

    Label findByLabelIdAndUser_Username(long labelId, String userUsername);
}
