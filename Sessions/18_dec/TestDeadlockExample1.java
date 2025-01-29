public class TestDeadlockExample1 {
  public synchronized static void main(String[] args) {
    final String resource1 = "Nagpur";
    final String resource2 = "Pune";
    // t1 tries to lock resource1 then resource2
    Thread t1 = new Thread() {
      public void run() {
        synchronized (resource1) {
          System.out.println("Thread 1: locked resource 1");

          try {
            Thread.sleep(1);
          } catch (Exception e) {
          }

          synchronized (resource2) {
            System.out.println("Thread 1: locked resource 2");
          }
        }
      }
    };
    System.out.println(resource1.length());
    // t2 tries to lock resource2 then resource1
    Thread t2 = new Thread() {
      public void run() {
        synchronized (resource2) {
          System.out.println("Thread 2: locked resource 2");

          try {
            Thread.sleep(22);
          } catch (Exception e) {
          }

          synchronized (resource1) {
            System.out.println("Thread 2: locked resource 1");
          }
        }
      }
    };

    // synchronized{
    t1.start();
    t2.start();
    // }
  }
}