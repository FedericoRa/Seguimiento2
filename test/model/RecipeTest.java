package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecipeTest {
	
	private Recipe recipe;
	
	public void setupStage1(){
		
		recipe = new Recipe();
	}
	
	public void setupStage2() {
		
		recipe = new Recipe();
		recipe.addIngredient("Cebolla",315);
		recipe.addIngredient("Ajo",58);
		recipe.addIngredient("Arroz",520);
		
	}

	@Test
	void test() {
		setupStage1();
		
	}

}
