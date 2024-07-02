package at.fhj.msd;

/**
 * This interface represents a simple Queue which features methods of which
 * are to be used for adding/removing objects
 */
public interface IQueue {
  /**
   * Adds element object to a list.
   *
   * @param obj Element to be added.
   * @return if successfully added, false if not
   */
  boolean offer(String obj);

  /**
   * Adds drink object to a list.
   *
   * @param obj Element to be added.
   * @return if successfully added, false if not
   */
  boolean offer(Drink obj);

  /**
   * Retrieves first element of list and then deletes it.
   *
   * @return Element to be shown
   */
  String poll();

  /**
   * Retrieves first element of list and then deletes it.
   *
   * @return An Exception if list is empty (nothing to be removed), otherwise returns
   * element to be shown
   */
  String remove();

  // 1st element without dlete, otherwise null

  /**
   * Returns the first element of the list
   *
   * @return First element to be shown, null if list is empty
   */
  String peek();


  /**
   * Returns the first element of the list
   *
   * @return An Exception if nothing can be shown (list is emtpty), otherwise
   * first element to be shown
   */
  String element();
}