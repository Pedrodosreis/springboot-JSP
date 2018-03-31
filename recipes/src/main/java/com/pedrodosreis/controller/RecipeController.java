package com.pedrodosreis.controller;

import java.util.LinkedList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pedrodosreis.model.Recipe;

@Controller
public class RecipeController {

	LinkedList<Recipe> recipes;
	Recipe recipe;

	@RequestMapping("/")
	public ModelAndView view() {

		recipes = new LinkedList<Recipe>();
		recipes.add(new Recipe("Bolo", "120", "Pedro"));
		recipes.add(new Recipe("Bolo de Chocolate", "110", "Juliana"));
		recipes.add(new Recipe("Bolo de Cenoura", "90", "Pedro"));

		return getMV();
	}

	@PostMapping("/lerValores")
	public ModelAndView lerValores(Recipe recipe) {
		recipes.add(recipe);

		return getMV();
	}

	@RequestMapping("/removeRecipe")
	public ModelAndView removeRecipe(Recipe recipe) {

		removeRecipeByName(recipe.getName());

		return getMV();
	}

	public ModelAndView getMV() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("recipes", recipes);

		return mv;
	}
	
	public Recipe getRecipe() {
		
		return null;
	}
	
	public void removeRecipeByName(String name) {
		
		for (Recipe recipe : recipes) {
			if(recipe.getId().equals(name)) {
				recipes.remove(recipe);
				break;
			}
		}
	} 
}
