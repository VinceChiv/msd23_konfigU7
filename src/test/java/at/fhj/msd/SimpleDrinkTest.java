package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

    private SimpleDrink simpleDrink;
    private Liquid liquid;

    @BeforeEach
    public void setUp() {
        liquid = new Liquid("Cola", 0.5, 0.0);
        simpleDrink = new SimpleDrink("Cola Drink", liquid);
    }

    @Test
    public void testGetVolume() {
        assertEquals(0.5, simpleDrink.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(0.0, simpleDrink.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testIsAlcoholic() {
        assertFalse(simpleDrink.isAlcoholic());
        liquid.setAlcoholPercent(5.0);
        assertTrue(simpleDrink.isAlcoholic());
    }

    @Test
    public void testConstructor() {
        assertEquals("Cola Drink", simpleDrink.getName());
        assertEquals(liquid, simpleDrink.l);
    }
}
