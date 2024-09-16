package geekbrains_course.jdk.lesson5.seminar;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DiningPhilosophers {
    public static void main(String[] args) {
        Lock[] forks = new ReentrantLock[5];
        for (int i = 0; i < forks.length; i++) {
            forks[i] = new ReentrantLock();
        }

        Philosopher[] philosophers = new Philosopher[5];
        for (int i = 0; i < philosophers.length; i++) {
            Lock leftFork = forks[i];
            Lock rightFork = forks[(i + 1) % forks.length];
            
            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(i + 1, rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(i + 1, leftFork, rightFork);
            }
            philosophers[i].start();
        }

        for (Philosopher philosopher : philosophers) {
            try {
                philosopher.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
