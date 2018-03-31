package com.pedrodosreis.recipes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.pedrodosreis.controller.RecipeController;

@SpringBootApplication
@ComponentScan(basePackageClasses= {RecipeController.class, ApplicationConfiguration.class})
public class RecipesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipesApplication.class, args);
	}
}
