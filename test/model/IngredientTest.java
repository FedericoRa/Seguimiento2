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
	
	@Test
	void test2() {
		setupStage1();
		boolean hipo = false;
		try {
			ingredient.addWeight(-100);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			hipo = true;
		}
		
		//assert
		assertTrue(hipo);
		assertEquals(245, ingredient.getWeight());
	}
	
	@Test
	void test3() {
		setupStage1();
		try {
			ingredient.removeWeight(45);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//assert
		assertEquals(200, ingredient.getWeight());
	}
	
	@Test
	void test4() {
		setupStage1();
		boolean hipo = false;
		try {
			ingredient.removeWeight(-100);
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			hipo = true;
		}
		
		//assert
		assertTrue(hipo);
		assertEquals(245, ingredient.getWeight());
	}
	
	
		

}
