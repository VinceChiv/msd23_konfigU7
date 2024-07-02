package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class DrinkQueueTest {

    private DrinkQueue drinkQueue;
    private Drink drink1;
    private Drink drink2;
    private Drink drink3;

    @BeforeEach
    public void setUp() {
        drinkQueue = new DrinkQueue(2);
        drink1 = new TestDrink("Drink1", 1.0, 10.0);
        drink2 = new TestDrink("Drink2", 1.5, 0.0);
        drink3 = new TestDrink("Drink3", 2.0, 5.0);
    }

    @Test
    public void testOffer() {
        assertTrue(drinkQueue.offer(drink1));
        assertTrue(drinkQueue.offer(drink2));
        assertFalse(drinkQueue.offer(drink3)); // Should fail because max size is 2
    }

    @Test
    public void testPoll() {
        assertNull(drinkQueue.poll());
        drinkQueue.offer(drink1);
        drinkQueue.offer(drink2);
        assertEquals("Drink1", drinkQueue.poll());
        assertEquals("Drink2", drinkQueue.poll());
        assertNull(drinkQueue.poll());
    }

    @Test
    public void testRemove() {
        assertThrows(NoSuchElementException.class, () -> {
            drinkQueue.remove();
        });

        drinkQueue.offer(drink1);
        drinkQueue.offer(drink2);
        assertEquals("Drink1", drinkQueue.remove());
        assertEquals("Drink2", drinkQueue.remove());

        assertThrows(NoSuchElementException.class, () -> {
            drinkQueue.remove();
        });
    }

    @Test
    public void testPeek() {
        assertNull(drinkQueue.peek());
        drinkQueue.offer(drink1);
        assertEquals("Drink1", drinkQueue.peek());
        drinkQueue.offer(drink2);
        assertEquals("Drink1", drinkQueue.peek());
        drinkQueue.poll();
        assertEquals("Drink2", drinkQueue.peek());
    }

    @Test
    public void testElement() {
        assertThrows(NoSuchElementException.class, () -> {
            drinkQueue.element();
        });

        drinkQueue.offer(drink1);
        assertEquals("Drink1", drinkQueue.element());
        drinkQueue.offer(drink2);
        assertEquals("Drink1", drinkQueue.element());
        drinkQueue.poll();
        assertEquals("Drink2", drinkQueue.element());
    }

    // Dummy Drink subclass for testing
    class TestDrink extends Drink {
        private double volume;
        private double alcoholPercent;

        public TestDrink(String name, double volume, double alcoholPercent) {
            super(name);
            this.volume = volume;
            this.alcoholPercent = alcoholPercent;
        }

        @Override
        public double getVolume() {
            return volume;
        }

        @Override
        public double getAlcoholPercent() {
            return alcoholPercent;
        }

        @Override
        public boolean isAlcoholic() {
            return alcoholPercent > 0;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}
