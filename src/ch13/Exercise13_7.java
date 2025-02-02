package ch13;

public class Exercise13_7 {
    public static void main(String[] args) {
        Thread5 th1 = new Thread5();
        th1.start();

        try {
            Thread.sleep(6000);
        } catch (Exception e) {}

        stopped = true;
        th1.interrupt();
        System.out.println("stopped");
    }

    static boolean stopped = false;
}

class Thread5 extends Thread {
    @Override
    public void run() {
        for (int i = 0; !Exercise13_7.stopped; i++) {
            System.out.println(i);

            try {
                Thread.sleep(3000);
            } catch (Exception e) {}
        }
    }
}