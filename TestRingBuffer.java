public class TestRingBuffer
{
  public static void main(String[] args)
  {
    RingBuffer buffer = new RingBuffer(5);
    assert buffer.size() == 0: "Buffer should be empty";

    try
    {
    buffer.enqueue(0.2);
    }
    catch (Exception E)
    {
      System.out.println(E.toString());
    }
    
    assert buffer.size() == 1: "Buffer should have one sample";
    assert buffer.peak() == 0.2: "0.2 should be the head of the list";
    assert buffer.getHead() == 0: "Head should point at 0";
    assert buffer.getTail() == 0: "Tail should be at 1";

    // Case 2
    buffer.enqueue(0.1);
    buffer.enqueue(0.3);
    buffer.enqueue(0.6);
    buffer.enqueue(0.4);
    assert buffer.size() == 5: "Buffer should have one sample";
    assert buffer.peak() == 0.2: "0.2 should be the head of the list";
    assert buffer.getHead() == 0: "Head should point at 0";
    assert buffer.getTail() == 4: "Tail should be at 4";
    buffer.enqueue(0.8);
  }
}
