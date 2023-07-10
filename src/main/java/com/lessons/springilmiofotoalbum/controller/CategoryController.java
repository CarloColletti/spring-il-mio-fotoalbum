package com.lessons.springilmiofotoalbum.controller;

import com.lessons.springilmiofotoalbum.model.Category;
import com.lessons.springilmiofotoalbum.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    //INDEX -> lista delle categorie_____________
    @GetMapping
    public String index(Model model) {
        //prendo la lista delle category
        List<Category> categories = categoryRepository.findAll();
        //le inserisco nel model
        model.addAttribute("categories", categories);
        model.addAttribute("newCategory", new Category());
        return "/category/listCategory";
    }

    @PostMapping
    public String save(@ModelAttribute("newCategory") Category category) {
        categoryRepository.save(category);
        return "redirect:/category";
    }
}
