package com.lele.eCommerce.controller;

import com.lele.eCommerce.common.ApiResponse;
import com.lele.eCommerce.model.Category;
import com.lele.eCommerce.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/create")
    public ResponseEntity<ApiResponse> creatCategory(@RequestBody Category category) {
        categoryService.createCategory(category);
        return new ResponseEntity<>(new ApiResponse(true, "created the category"), HttpStatus.CREATED);
    }

    @GetMapping ("/list")
    public List<Category> listCategory() {
     return categoryService.listCategory();
    }

    @PostMapping("/update/{categoryId}")
    public String updateCategory(@PathVariable("categoryId") int categoryId, @RequestBody Category category){
        System.out.println("category id " + categoryId);
        categoryService.editCategory(categoryId, category);
        return "testing";
    }
}