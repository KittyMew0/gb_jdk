package geekbrains_course.jdk.lesson5.lecture.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Race extends Thread{
    private List<Runner> runners;
    private CountDownLatch cdl;

    public Race() {
        cdl = new CountDownLatch(3);

        runners = new ArrayList<>(3);
        runners.add(new Runner("�������", cdl));
        runners.add(new Runner("����", cdl));
        runners.add(new Runner("�����", cdl));
    }

    @Override
    public void run() {
        try {
            goOnStart();
            cdl.await();
            goAll();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    private void goAll() throws InterruptedException {
        sleep(1000);
        System.out.println("�� �����");
        sleep(1000);
        System.out.println("��������");
        sleep(1000);
        System.out.println("����");
        for (Runner runner: runners){
            runner.go();
        }
    }

    private void goOnStart() {
        for (Runner runner: runners){
            runner.start();
        }
    }
}