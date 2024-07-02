package at.fhj.msd;

// fastly written (not really nice) comments you should adapt
public interface IQueue {
  /** 
   * I am a really bad comment
   * 
   * fasdfadsffdsadsf
   * 
   * fdsasdfadsf
   * 
   *  add object to queue, true if okay 
   * 
   * i fell asleep on my keyboard...
   * 
   * */
  boolean offer(String obj);

  //returns + del 1st element; null if nothing in there
   //
  String poll();

  /* 
  same as poll, if there is nothing in there error NoSuchElementException
   */
  String remove();

  // 1st element without dlete, otherwise null
   
  String peek();

  // element is to peek what remove is to poll
  
  String element();
}