package br.com.recipeBridge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @GetMapping("/random")
    public String randomRecipe() {
        return "RecipeBridge is running!";
    }
}