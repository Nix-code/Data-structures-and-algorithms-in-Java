import java.io.*;
import java.util.*;

public class QueueCollection{

  public static void main(String[] args) {
    Queue<Integer> q = new ArrayDeque<>();

    q.add(10);
    q.add(50);
    q.add(12);
    q.add(24);
    

    System.out.println(q);

    System.out.println(q.remove());
    System.out.println(q);
  }
}
