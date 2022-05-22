public class MultithreadThing
        // extends Thread {
        implements Runnable {

    private int threadNumber;

    public MultithreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        if (threadNumber == 3) {
            System.out.println(" ");
            //throw new RuntimeException("\n Exception in thread " + threadNumber);
        }
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
