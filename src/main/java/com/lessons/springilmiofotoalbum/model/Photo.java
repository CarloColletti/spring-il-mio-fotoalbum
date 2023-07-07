package com.lessons.springilmiofotoalbum.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "photos")
public class Photo {
    // Attributi____________________________
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "Il titolo non può essere vuoto")
    @Column(nullable = false)
    private String title;

    @Lob
    @NotBlank(message = "La descrizione non può essere vuota")
    private String description;

    @Column(nullable = false) //da rimetere unique quando si va a gestire
    private String url;

    @Column
    private boolean isPost;

    @ManyToMany
    @JoinTable(
            name = "category_photo",
            joinColumns = @JoinColumn(name = "photo_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<Category> categories = new ArrayList<>();

    // Getter____________________________

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    public boolean isPost() {
        return isPost;
    }

    public List<Category> getCategories() {
        return categories;
    }

    // setters____________________________

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPost(boolean post) {
        isPost = post;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }
}
