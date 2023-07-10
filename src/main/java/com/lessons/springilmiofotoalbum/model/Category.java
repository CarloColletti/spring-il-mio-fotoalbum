package com.lessons.springilmiofotoalbum.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {


    // Attributi____________________________
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Il nome non può essere vuoto")
    private String name;

    @Lob
    @NotBlank(message = "La Descrizione non può essere vuota")
    private String description;

    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private List<Photo> photos = new ArrayList<>();

    // Getter____________________________

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    // setters____________________________

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }
}

