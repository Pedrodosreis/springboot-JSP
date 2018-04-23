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
		recipes.add(new Recipe("Brigadeiro Gourmet", "30", "Pedro"));
		recipes.add(new Recipe("Massa de Pizza", "120", "Pedro"));

		return getMV();
	}

	/**
	 * It must create a new object to get ID from constructor.
	 * 
	 * @param recipe
	 * @return
	 */
	@PostMapping("/lerValores")
	public ModelAndView lerValores(Recipe recipe) {
		recipes.add(new Recipe(recipe.getName(), recipe.getTimeRecipe(), recipe.getCreatedBy()));
		return getMV();
	}
	
	/**
	 * redirect to the page which will edit the recipe choosen.
	 * 
	 * @param recipe
	 * @return
	 */
	@RequestMapping("/editRecipe")
	public ModelAndView editMV(Recipe recipe) {
		Recipe editRecipe = getRecipeFromList(recipe.getId());
		ModelAndView mv = new ModelAndView("edit");
		
		mv.addObject("recipe", editRecipe);		
		return mv;
	}
	
	/**
	 * Edit the recipe and replace the old one.
	 * 
	 * @param recipe
	 * @return
	 */
	@PostMapping("/editrecipe")
	public ModelAndView editRecipe(Recipe recipe) {
		
		Recipe oldRecipe =  getRecipeFromList(recipe.getId());			
		
		oldRecipe.setCreatedBy(recipe.getCreatedBy());
		oldRecipe.setName(recipe.getName());
		oldRecipe.setTimeRecipe(recipe.getTimeRecipe());
		
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
	
	
	public Recipe getRecipeFromList(String id) {
		for (Recipe r : recipes) {
			if(r.getId().equals(id)) {
				return r;
			}			
		}
		return null;		
	}
	
}
