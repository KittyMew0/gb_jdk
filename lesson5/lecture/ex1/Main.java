package geekbrains_course.jdk.lesson5.lecture.ex1;

public class Main {
    /*
    � ������ ���������� ������ ����������:
    ������� ��� ����� ObjectA, ObjectB
    ����������� ����� � ������� ��� ������ ��� ������� ����������� DeadLock ��� �������� ObjectA, ObjectB
     */
    public static void main(String[] args) {
        Friend friend1 = new Friend("����");
        Friend friend2 = new Friend("����");

        MyThread thread1 = new MyThread(friend1, friend2);
        MyThread thread2 = new MyThread(friend2, friend1);

        thread1.start();
        thread2.start();

        System.out.println("����� ������");
    }
}