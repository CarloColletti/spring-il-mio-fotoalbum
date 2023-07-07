package com.lessons.springilmiofotoalbum.controller;

import com.lessons.springilmiofotoalbum.model.Photo;
import com.lessons.springilmiofotoalbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/photo")
public class PhotoController {
    @Autowired
    private PhotoRepository photoRepository;

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
        Photo photo = getPhotoById(id);
        model.addAttribute("photo", photo);
        return "/photo/show";
    }

    //metodi___________________________________
    private Photo getPhotoById(Integer id) {
        Optional<Photo> result = photoRepository.findById(id);
        if (result.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, " la foto con id: " + id + " non è stata trovata ");
        }
        return result.get();

    }

}
