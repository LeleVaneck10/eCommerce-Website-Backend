package com.lele.eCommerce.controller;

import com.lele.eCommerce.model.Category;
import com.lele.eCommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public String creatCategory(@RequestBody Category category) {

        categoryService.createCategory(category);
        return "success";
    }

    @GetMapping ("/list")
    public String listCategory(@RequestBody Category category) {

        categoryService.createCategory(category);
        return "success";
    }
}