package com.lessons.springilmiofotoalbum.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "photos")
public class Photo {
    // Attributi____________________________
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String title;

    @Lob
    private String description;

    @Column(nullable = false, unique = true)
    private String url;

    private boolean isPost = true;

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
