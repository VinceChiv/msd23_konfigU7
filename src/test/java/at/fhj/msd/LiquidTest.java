package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LiquidTest {

    private Liquid liquid;

    @BeforeEach
    public void setUp() {
        liquid = new Liquid("Water", 1.0, 0.0);
    }

    @Test
    public void testGetName() {
        assertEquals("Water", liquid.getName());
    }

    @Test
    public void testSetName() {
        liquid.setName("Juice");
        assertEquals("Juice", liquid.getName());
    }

    @Test
    public void testGetVolume() {
        assertEquals(1.0, liquid.getVolume(), 0.001);
    }

    @Test
    public void testSetVolume() {
        liquid.setVolume(1.5);
        assertEquals(1.5, liquid.getVolume(), 0.001);
    }

    @Test
    public void testGetAlcoholPercent() {
        assertEquals(0.0, liquid.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testSetAlcoholPercent() {
        liquid.setAlcoholPercent(10.0);
        assertEquals(10.0, liquid.getAlcoholPercent(), 0.001);
    }

    @Test
    public void testConstructor() {
        Liquid newLiquid = new Liquid("Wine", 0.75, 12.0);
        assertEquals("Wine", newLiquid.getName());
        assertEquals(0.75, newLiquid.getVolume(), 0.001);
        assertEquals(12.0, newLiquid.getAlcoholPercent(), 0.001);
    }
}
