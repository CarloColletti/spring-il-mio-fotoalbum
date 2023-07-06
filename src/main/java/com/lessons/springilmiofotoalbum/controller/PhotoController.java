package com.lessons.springilmiofotoalbum.controller;

import com.lessons.springilmiofotoalbum.model.Photo;
import com.lessons.springilmiofotoalbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/photo")
public class PhotoController {
    @Autowired
    private PhotoRepository photoRepository;

    @GetMapping
    public String index(Model model) {
        //prendo la lista delle foto
        List<Photo> photos = photoRepository.findAll();
        //le inserisco nel model
        model.addAttribute("photos", photos);
        return "/photo/index";
    }

    //metodi___________________________________

}
