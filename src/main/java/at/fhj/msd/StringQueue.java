package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Class that administers methods via Interface <b>IQueue</b> which adds or removes string elements to the
 * list.
 */
public class StringQueue implements IQueue {

  /**
   * List of string elements
   */
  private final List<String> elements = new ArrayList<String>();

  /**
   * Amount of possible elements
   */
  private int maxSize = 5;

  /**
   * Constructor
   * @param maxSize maximum size of the queue
   */
  public StringQueue(int maxSize) {
    maxSize = maxSize;
  }

  /**
   * Adds an element to the queue
   * @param obj the element to be added
   * @return true if the element was added, false if not
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;

    return true;
  }

  /**
   * Adds a drink to the queue
   * !! DEPECRATED BUT NEEDED TO MAINTAIN INTERFACE FUNCTIONALITY !!
   *
   * @param obj the drink to be added
   * @return true if the drink was added, otherwise false
   */
  @Override
  public boolean offer(Drink obj) {
    return false;
  }

  /**
   * Returns and removes the first element of the queue
   *
   * @return the first element of the queue
   */
  @Override
  public String poll() {
    String element = peek();

    if(element == null)
    {
      return null;
    }
    else
    {
      elements.remove(0);
      return element;
    }
  }

  /**
   * Returns and removes the first element of the queue
   *
   * @return the first element of the queue
   */
  @Override
  public String remove() {
    String element = peek();
    if (element == null)
    {
      throw new NoSuchElementException("there's no element any more");
    }
    else
    {
      elements.remove(0);
      return element;
    }
  }

  /**
   * Returns the first element of the queue
   *
   * @return the first element of the queue
   */
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
    {
      element = elements.get(0);
    }
    else
    {
      element = null;
    }
    return element;
  }

  /**
   * Returns the first element of the queue
   *
   * @return the first element of the queue
   */
  @Override
  public String element() {
    String element = peek();
    if (element == null)
    {
      throw new NoSuchElementException("there's no element any more");
    }

    return element;
  }

}