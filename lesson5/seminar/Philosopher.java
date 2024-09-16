package geekbrains_course.jdk.lesson5.seminar;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Philosopher extends Thread {
    private final Lock leftFork;
    private final Lock rightFork;
    private final int philosopherNumber;

    public Philosopher(int philosopherNumber, Lock leftFork, Lock rightFork) {
        this.philosopherNumber = philosopherNumber;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println("Philosopher " + philosopherNumber + " " + action);
        Thread.sleep((long) (Math.random() * 100));
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 3; i++) { 

                doAction("is thinking");

                leftFork.lock();
                doAction("picked up left fork");
                rightFork.lock();
                doAction("picked up right fork - eating");

                doAction("is eating");
                
                rightFork.unlock();
                doAction("put down right fork");
                leftFork.unlock();
                doAction("put down left fork");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
