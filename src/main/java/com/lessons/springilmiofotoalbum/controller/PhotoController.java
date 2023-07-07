package com.lessons.springilmiofotoalbum.controller;

import com.lessons.springilmiofotoalbum.model.Photo;
import com.lessons.springilmiofotoalbum.repository.PhotoRepository;
import com.lessons.springilmiofotoalbum.service.PhotoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/photo")
public class PhotoController {
    @Autowired
    private PhotoRepository photoRepository;
    @Autowired
    private PhotoService photoService;

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
        model.addAttribute(new Photo());
        return "/photo/create";
    }

    @PostMapping("/create")
    public String store(@Valid @ModelAttribute("photo") Photo formPhoto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()){
            model.addAttribute("photo", photoRepository);
        }
        photoRepository.save(formPhoto);
        return "redirect:/photo";
    }

    //metodi___________________________________


}
