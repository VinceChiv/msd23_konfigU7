package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

/**
 * GITTeamWork
 * <Description>
 * Author: Matio
 * Last Change: 02.07.2024
 */
public class DrinkQueue implements IQueue {
    private final List<Drink> elements = new ArrayList<Drink>();
    private int maxSize = 5;

    /**
     * Constructor
     * @param maxSize maximum size of the queue
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }


    @Override
    public boolean offer(String obj) {
        return false;
    }

    /**
     * Adds a drink to the queue
     * @param obj the drink to add
     */
    @Override
    public boolean offer(Drink obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
        } else {
            return false;
        }
        return true;
    }

    /**
     * Returns and removes the first drink of the queue
     *
     * @return the first drink of the queue
     */
    @Override
    public String poll() {
        String element = peek();

        if (element != null) {
            elements.remove(0);
        }

        return element;
    }
    /**
     * Returns and removes the first drink of the queue
     *
     * @return the first drink of the queue
     */
    @Override
    public String remove() {
        String element = poll();

        if (element == null) {
            throw new java.util.NoSuchElementException("there's no element any more");
        }

        return element;
    }

    /**
     * Returns the first drink of the queue
     *
     * @return the first drink of the queue
     */
    @Override
    public String peek() {
        String element;
        if (elements.size() > 0) {
            element = elements.get(0).toString();
        } else {
            element = null;
        }

        return element;
    }

    /**
     * Returns the first drink of the queue
     *
     * @return the first drink of the queue
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new java.util.NoSuchElementException("there's no element any more");
        }

        return element;
    }
}
