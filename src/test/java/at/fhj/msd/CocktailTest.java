package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CocktailTest {

    private Cocktail cocktail;
    private Liquid vodka;
    private Liquid orangeJuice;

    @BeforeEach
    public void setUp() {
        cocktail = new Cocktail("Screwdriver");
        vodka = new Liquid("Vodka", 0.05, 40);
        orangeJuice = new Liquid("Orange Juice", 0.15, 0);
    }

    @Test
    public void testAddIngredient() {
        cocktail.addIngredient(vodka);
        assertEquals(1, cocktail.getNumberOfIngredients());
        assertTrue(cocktail.ingredients.contains(vodka));
    }

    @Test
    public void testGetNumberOfIngredients() {
        assertEquals(0, cocktail.getNumberOfIngredients());
        cocktail.addIngredient(vodka);
        assertEquals(1, cocktail.getNumberOfIngredients());
        cocktail.addIngredient(orangeJuice);
        assertEquals(2, cocktail.getNumberOfIngredients());
    }

    @Test
    public void testGetVolume() {
        assertEquals(0.0, cocktail.getVolume(), 0.001);
        cocktail.addIngredient(vodka);
        assertEquals(0.05, cocktail.getVolume(), 0.001);
        cocktail.addIngredient(orangeJuice);
        assertEquals(0.20, cocktail.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(0.0, cocktail.getAlcoholPercent(), 0.001);
        cocktail.addIngredient(vodka);
        assertEquals(40.0, cocktail.getAlcoholPercent(), 0.001);
        cocktail.addIngredient(orangeJuice);
        assertEquals(10.0, cocktail.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testIsAlcoholic() {
        assertFalse(cocktail.isAlcoholic());
        cocktail.addIngredient(vodka);
        assertTrue(cocktail.isAlcoholic());
        cocktail.addIngredient(orangeJuice);
        assertTrue(cocktail.isAlcoholic());
    }
}
