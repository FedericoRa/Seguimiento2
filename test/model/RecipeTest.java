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
		recipe.addIngredient("sal", 12);
		
		//asserts
		assertEquals(1, recipe.getIngredients().size());
		
		
	}
	@Test
	void test2() {
		setupStage2();
		recipe.addIngredient("pimienta", 6);
		
		Ingredient last = recipe.getIngredients().get(recipe.getIngredients().size()-1);
		
		//asserts
		assertEquals("pimienta", last.getName());
		assertEquals(4, recipe.getIngredients().size());
				
	
	}
	@Test
	void test3() {
		setupStage2(); 
		recipe.addIngredient("ajo", 21);
		
		Ingredient requested = recipe.getIngredients().get(recipe.getIngredients().size()-2);
		
		//asserts
		assertEquals("ajo", requested.getName());
		assertEquals(79, requested.getWeight());
				
	
	}
	
	/**
	@Test
	void test4() {
		setupStage2(); 
		recipe.removeIngredient("ajo");
		
		
		//asserts
		assertEquals(2, recipe.getIngredients().size());
			
	
	}
	*/


}
