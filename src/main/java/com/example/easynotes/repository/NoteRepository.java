package com.example.easynotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easynotes.model.Note;

/**
 * Created by syed ali .
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
