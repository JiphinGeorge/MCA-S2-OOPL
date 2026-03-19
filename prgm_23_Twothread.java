class SquareThread extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Square: " + (i * i));
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class CubeThread implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Cube: " + (i * i * i));
                Thread.sleep(700);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class prgm_23_Twothread {

    public static void main(String[] args) {

        SquareThread t1 = new SquareThread();
        Thread t2 = new Thread(new CubeThread());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Calculations Complete!");
    }
}
