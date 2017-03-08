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
  private int count; // number of elements in the list
  private double[] buffer; // contains list of samples

  // Default Constructor
  public RingBuffer()
  {
    head = 0;
    tail = 0;
    count = 0;
  }

  public int size()  // returns number of elements in the buffer
  {
    return count; // (tail - head) % N
  }

  // Checks if buffer is empty
  public boolean isEmpty()
  {
    return count == 0;
  }
}
