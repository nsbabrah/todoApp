package com.example.demo.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.web.Repository.FolderRepository;
import com.example.demo.web.model.Folder;
import com.example.demo.web.service.FolderService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@Controller
@RequestMapping("/api")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @GetMapping("/folder")
    @ResponseBody
    public List<Folder> getAllFolders(@Valid @RequestBody Long folder) {
        return (List<Folder>) folderRepository.findOne(folder);
    }

  /*  @GetMapping("/notes/{id}")
    public ResponseEntity<Folder> getNoteById(@PathVariable(value = "id") Long noteId) {
        Folder folder = folderRepository.findOne(noteId);
        if(folder == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(folder);
    }
*/
//    @GetMapping("/folders")
//    public String createFolder( Folder folder) {
//    	Object md;
//    	List<String> dataNum = (List<String>) folderRepository.save(folder);
//		Folder.addAttribute("data1",(Folder) dataNum);
//        return null;
//    }  
    @GetMapping("/allfolder")
    public String createFolder1( Folder folder) {
    	Object md;
    	List<String> dataNum = (List<String>) folderRepository.save(folder);
		Folder.addAttribute("data1",(Folder) dataNum);
        return "data";
    }

    /*@PutMapping("/folders/{id}")
    public ResponseEntity<folder> updateNote(@PathVariable(value = "id") Long noteId,
                                           @Valid @RequestBody Note noteDetails) {
        Note note = noteRepository.findOne(noteId);
        if(note == null) {
            return ResponseEntity.notFound().build();
        }
        note.setTitle(noteDetails.getTitle());
        note.setContent(noteDetails.getContent());

        Note updatedNote = noteRepository.save(note);
        return ResponseEntity.ok(updatedNote);
    }

    @DeleteMapping("/notes/{id}")
    public ResponseEntity<Note> deleteNote(@PathVariable(value = "id") Long noteId) {
        Note note = noteRepository.findOne(noteId);
        if(note == null) {
            return ResponseEntity.notFound().build();
        }

        noteRepository.delete(note);
        return ResponseEntity.ok().build();
    }
}


//@RequestMapping("/api")
//
//@Controller
//public class Foldercontroller {
//	
//	@Autowired
//	FolderRepository folderRepository;
//
//	/* @RequestMapping(value = "/addfolder", method = RequestMethod.POST)
//      
//	  public  String addfolder(@ModelAttribute("folder") Folder folder) {
//		return "data";
//
//}*/
//	
//	// Get All Notes
//	@GetMapping("/folders")
//	public List<Folder> getAllFolders() {
//	    return folderRepository.findAll();
//	}
//	
//	@PostMapping("/folders")
//	public Folder createFolder(@Valid @RequestBody Folder folder) {
//	    return folderRepository.save(folder);
//	}
//	
//	/*@RequestMapping("/folders")
//	public Folders getFolders() {
//		return folderService.getAllFolders();	
//	}
//	
//	@RequestMapping("/folders/{id}")
//	public Todo getFolder(@PathVariable String id) {
//		return folderService.getFolder(id);
//	}
//	
//	@RequestMapping(method=RequestMethod.POST, value="/folders")
//	public void addFolder(@RequestBody Todo folder) {
//		folderService.addFolder(folder);
//	}
//	 
//	@RequestMapping(method=RequestMethod.PUT, value="/folders/{id}")
//	public void updateFolder(@RequestBody Todo folder, @PathVariable String id) {
//		folderService.updateFolder(id, folder);
//	}
//	
//	@RequestMapping(method=RequestMethod.DELETE, value="/folders/{id}")
//	public void deleteFolder(@PathVariable String id) {
//		folderService.getFolder(id);
//		*/
}
