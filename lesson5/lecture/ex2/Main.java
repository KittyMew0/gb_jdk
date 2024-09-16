package geekbrains_course.jdk.lesson5.lecture.ex2;

public class Main {
    /*
    � ������ ���������� ������ ����������:
    �������� ��� ������ A � B.
    ����� A ������ �������� Boolean ���������� switcher � ��������� 1000 �����������
    (true � ��������� false � ��������).
    ����� B ������� ��������� true ���������� switcher � ������� �� ������� �������� ������ �� 100
    � ��������� 100 ����������� � ���������������� ���� ��������, ��� ������ ����� A ���������� switcher
    � ��������� false.
    �������� ���������� ������ ������� �������� ���������� ������� ������� �������.
    ����� ��������������� �������������� ��� ���������� �������� ���������� ��� volatile
     */
    public static void main(String[] args) {
        MyProgramState state = new MyProgramState();

        MyThread1 thread1 = new MyThread1(state);
        MyThread2 thread2 = new MyThread2(state);

        thread1.start();
        thread2.start();
    }
}