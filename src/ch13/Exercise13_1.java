package ch13;

public class Exercise13_1 {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread th1 = new Thread(r);

        th1.start();
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print('-');
        }
    }
}