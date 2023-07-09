package com.lessons.springilmiofotoalbum.api;

import com.lessons.springilmiofotoalbum.model.Photo;
import com.lessons.springilmiofotoalbum.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/v1/photos")
public class PhotoRestController {

    @Autowired
    private PhotoRepository photoRepository;

    @GetMapping
    public List<Photo> index(){
        List<Photo> allPhotos = photoRepository.findAll();
        List<Photo> visiblePhotos = new ArrayList<>();

        for (Photo photo : allPhotos) {
            if (photo.isPosted()) {
                visiblePhotos.add(photo);
            }
        }

        return visiblePhotos;
    }
}
