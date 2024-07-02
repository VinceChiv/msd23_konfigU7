package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

/**
 * Class that administers methods via Interface <b>IQueue</b> which adds or removes drinks to the
 * list
 */
public class DrinkQueue implements IQueue {
    /**
     * List of drinks
     */
    private final List<Drink> elements = new ArrayList<Drink>();

    /**
     * Amount of possible drinks
     */
    private int maxSize = 5;

    /**
     * Constructor
     * @param maxSize maximum size of the queue
     */
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Adds a string element to the queue
     * !! DEPECRATED BUT NEEDED TO MAINTAIN INTERFACE FUNCTIONALITY !!
     *
     * @param obj the element to be added
     * @return true if the element was added, otherwise false
     */
    @Override
    public boolean offer(String obj) {
        return false;
    }

    /**
     * Adds a drink to the queue
     * @param obj the drink to be added
     * @return true if the drink was added, false if not
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
