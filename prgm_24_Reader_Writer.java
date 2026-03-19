class prgm_24_Reader_Writer{

    static final Object lock = new Object();
    static boolean written = false;

    static class Reader extends Thread {
        public void run() {
            synchronized (lock) {
                try {
                    while (!written) {
                        lock.wait();
                    }
                    System.out.println("Reading data...");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Writer extends Thread {
        public void run() {
            synchronized (lock) {
                System.out.println("Writing data...");
                written = true;
                lock.notifyAll();
            }
        }
    }

    public static void main(String[] args) {

        Reader r = new Reader();
        Writer w = new Writer();

        r.start();
        w.start();
    }
}
