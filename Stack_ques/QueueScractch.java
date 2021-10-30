import java.io.*;
import java.util.*;

class QueueScractch{
  static int front = -1, rear = -1;
  static int max= 1000;
  static int a[] = new int[max];

  void push(int x){
    if(rear == max){
      return;
    }
    else{
      rear++;
      a[rear] = x;
    }
    
  }

  int pop(){
    int k;
    if(front == rear){
      return -1;
    }
    else{
      front++;
      k = a[front++];
    }
    return k;
  }

  int size(){
    return rear+1;
  }

  public static void main(String[] args) {
    
    QueueScratch q = new QueueScratch();
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);

    q.pop();
    q.pop();
    System.out.println(q.pop());
  }

  
}
