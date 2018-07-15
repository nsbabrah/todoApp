package com.example.demo.web.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.web.model.Folder;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
	
	//@Query("SELECT strFolderName from Folders")
	//List<Folder> findBystrFolderName();

}
	