package com.example.demo.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository("FolderRepository")

public class FolderService {
	
	 public List getAllFolders() {
		    return getAllFolders();
		  }

	/*private List<Todo> folders = new ArrayList<>(Arrays.asList(
			new Todo("1", "Personal Stuff", "Includes all the personal notes"),
			new Todo("2", "Work Stuff", "Includes all the work notes"),
			new Todo("3", "Fun Stuff", "Includes some friends related notes")
			));
	
     public List<Todo> getAllFolders() {
    	  return folders;
     }
     
     public Todo getFolder(String id) {
    	 return folders.stream().filter(f -> f.getId().equals(id)).findFirst().get();
    	 
     }

	public void addFolder(Todo folder) {
		folders.add(folder);	
		
	}

	public void updateFolder(String id, Todo folder) {
		for (int i = 0; i < folders.size(); i++) {
			Todo f = folders.get(i);
			if(f.getId().equals(id)) {
				folders.set(i, folder);
				return;
			}
		}
	}
	
	public void deleteFolder(String id) {
		folders.removeIf(f -> f.getId().equals(id));
	}  */

}
