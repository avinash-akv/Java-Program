class MyThread implements Runnable {
  public void run() {
    System.out.println("MyThread is running.");
  }
}

public class Threading {
  public static void main(String[] args) {
    MyThread myThread = new MyThread();
    Thread thread = new Thread(myThread);
    thread.start();
    
    System.out.println("Main thread is running.");
  }
}
