class MyTask implements Runnable {

    public void run() {

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

            try {
                Thread.sleep(500); // 0.5 sec delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RThread {
    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();
    }
}