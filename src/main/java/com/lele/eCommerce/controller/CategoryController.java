package com.lele.eCommerce.controller;

import com.lele.eCommerce.model.Category;
import com.lele.eCommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<Category> listCategory() {
     return categoryService.listCategory();
    }

    @PostMapping("/update/{categoryId}")
    public String updateCategory(@PathVariable("categoryId") int categoryId, @RequestBody Category category){
        System.out.println("category id" + categoryId);
        return "testing";
    }
}