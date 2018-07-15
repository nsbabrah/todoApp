package com.example.demo.web.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.web.Repository.NoteRepository;
import com.example.demo.web.model.Folder;
import com.example.demo.web.model.Note;

@Controller
//@RequestMapping("/api")
public class NoteController {

    @Autowired
    NoteRepository noteRepository;
    
    @RequestMapping(value = "/note/{title}", method = RequestMethod.GET)
    public String listBooks(@PathVariable("title") String title, Model model) { 
    	List<Note> listNotes = noteRepository.findByTitle(title); 
    	model.addAttribute("Notes", listNotes);
    return "listNotes";
    	}

    @GetMapping("/notes")
    public String getAllNotes(Model model) {
     	model.addAttribute("Notes", noteRepository.findAll());
        return "ShowNotes";
    }
  
    
    @RequestMapping(value = "/AddNotes", method = RequestMethod.GET)
    public String listNotes(Model model) {
    	model.addAttribute("Notes", noteRepository.findAll());
        return "noteslist";
    }  	

    @PostMapping("/AddNotes")
    public   String savenotes(@Valid Note content, @Valid Note title, BindingResult errors, @ModelAttribute(value="notes") Note notes) {
         	Note n = new Note();  
    		n.setContent(notes.content);
    		n.setTitle(notes.title);
    		noteRepository.save(n); 
    		return "redirect:/AddNotes";
    }
//    @PostMapping("/delet")
//    public   String delet(@Valid Note content, @Valid Note title, BindingResult errors, @ModelAttribute(value="delet") Note notes) {
//         	Note n = new Note();  
//    		
//    		noteRepository.save(n); 
//    		return "redirect:/AddNotes";
//    }
//    @GetMapping("/notes/{id}")
//    public ResponseEntity<Note> getNoteById(@PathVariable(value = "id") Long noteId,Model model) {
//        Note note = noteRepository.findOne(noteId);
//        if(note == null) {
//            return ResponseEntity.notFound().build();
//        }
//        
//        return ResponseEntity.ok().body(note);
//    }
//
    @GetMapping("/notes/{id}")
    public ModelAndView getNoteById(@PathVariable(value = "id") Long noteId,Model model) {
        Note note = noteRepository.findOne(noteId);
//        if(note == null) {
//            return ;
//        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("ShowNotes");
        mav.addObject("Notes", note);
        return mav;
    }

//    @PutMapping("/notes/{id}")
//    public ResponseEntity<Note> updateNote(@PathVariable(value = "id") Long noteId,
//                                           @Valid @RequestBody Note noteDetails) {
//        Note note = noteRepository.findOne(noteId);
//        if(note == null) {
//            return ResponseEntity.notFound().build();
//        }
//        note.setTitle(noteDetails.getTitle());
//        note.setContent(noteDetails.getContent());
//
//        Note updatedNote = noteRepository.save(note);
//        return ResponseEntity.ok(updatedNote);
//    }
//
    @GetMapping("/delet/{id}")
    public String  deleteNote(@PathVariable(value = "id") Long noteId) {
        Note note = noteRepository.findOne(noteId);
      

        noteRepository.delete(note);
        return "redirect:/AddNotes";
    }
}
	


