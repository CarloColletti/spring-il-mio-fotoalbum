package com.lessons.springilmiofotoalbum.controller;

import com.lessons.springilmiofotoalbum.model.Photo;
import com.lessons.springilmiofotoalbum.repository.CategoryRepository;
import com.lessons.springilmiofotoalbum.repository.PhotoRepository;
import com.lessons.springilmiofotoalbum.service.PhotoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/photo")
public class PhotoController {
    @Autowired
    private PhotoRepository photoRepository;
    @Autowired
    private PhotoService photoService;

    @Autowired
    private CategoryRepository categoryRepository;

    //INDEX -> lista delle foto_____________
    @GetMapping
    public String index(Model model) {
        //prendo la lista delle foto
        List<Photo> photos = photoRepository.findAll();
        //le inserisco nel model
        model.addAttribute("photos", photos);
        return "/photo/index";
    }

    //SHOW -> dettaglio singola img_____________
    @GetMapping("/{id}")
    public String show(@PathVariable("id") Integer id, Model model) {
        Photo photo = photoService.getPhotoById(id);
        model.addAttribute("photo", photo);
        return "/photo/show";
    }

    //create -> creiamo un nuovo oggetto foto_____________
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("photo", new Photo());
        return "/photo/edit";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("photo") Photo formPhoto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        if (bindingResult.hasErrors()){
            model.addAttribute("photo", photoRepository);
        }
        photoRepository.save(formPhoto);
        return "redirect:/photo";
    }

    //edit -> modifichiamo un elemento gia presente_____________
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        Photo photo = photoService.getPhotoById(id);
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("photo", photo);
        return "/photo/edit";
    };

    @PostMapping("/edit/{id}")
    public String toEdit(@PathVariable Integer id, Model model, @ModelAttribute("photo") Photo formPhoto) {
        Photo photo = photoService.getPhotoById(id);
        model.addAttribute("photo", photo);
        //trasferisco i dati non compresi nel form
        formPhoto.setId(photo.getId());
        //salvo il resto del form
        photoRepository.save(formPhoto);
        return "redirect:/photo";
    }

    //delete -> eliminiamo un elemento_____________

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        // verifichiamo che esiste il book con quell'id
        Photo photoToDelete = photoService.getPhotoById(id);
        // lo cancelliamo
        photoRepository.delete(photoToDelete);
//        // aggiungo un messaggio di successo come flashAttribute
//        redirectAttributes.addFlashAttribute("message",
//                new AlertMessage(AlertMessageType.SUCCESS,
//                        "Book " + bookToDelete.getTitle() + " deleted!"));
        // facciamo la redirect alla lista dei book
        return "redirect:/photo";
    }


}
