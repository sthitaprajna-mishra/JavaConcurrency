package com.sthmishra.concurrency;

public class ThreadStop {
    public static class StopRunnable implements Runnable {
        private boolean doStop = false;

        private int rounds = 1;

        public synchronized void doStop() {
            this.doStop = true;
        }

        private synchronized boolean keepRunning() {
            return this.doStop == false;
        }

        @Override
        public void run() {
            while(keepRunning()) {
                // Perform tasks
                System.out.println("Running round " + rounds + "......");

                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("Finished round " + rounds + ".");
                this.rounds++;
            }
        }
    }

    public static void main(String[] args) {
        StopRunnable obj = new StopRunnable();

        Thread thread = new Thread(obj);
        thread.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        obj.doStop();
    }
}
