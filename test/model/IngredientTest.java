package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.NegativeNumberException;


class IngredientTest {
	
	private Ingredient ingredient;
	
	public void setupStage1(){
		ingredient = new Ingredient("Tomate",245);
	}

	@Test
	void test() {
		setupStage1();
		try {
			ingredient.addWeight(54);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//assert
		assertEquals(299, ingredient.getWeight());
		
	}

}
