public class Threads {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            MultithreadThing myThing = new MultithreadThing(i);
            Thread myThread = new Thread(myThing);
            // myThing.start();
            myThread.start();
            // myThread.isAlive();
            try {
                myThread.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // throw new RuntimeException("Exception in main execution class");
    }
}