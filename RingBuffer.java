//----------------------------------------
// Name: Grayson Meadows
// Class: CS 1233
// Program: Buffer data structure as fifo
// ---------------------------------------
public class RingBuffer
{
  // Attribute
  private int head; // head of the list(where to remove next element)
  private int tail; // tail of the list (where to ass next element)
  private int size; // number of elements in the list
  private int[] buffer; // contains list of samples

  // Default Constructor
  public RingBuffer()
  {
    head = 0;
    tail = 0;
    size = 0;
    
  }
}
