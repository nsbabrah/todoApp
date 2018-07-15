package com.example.demo.web.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.web.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long>{
	
	List <Note> findByTitle(String title);
	List <Note> findAll();
	
}
