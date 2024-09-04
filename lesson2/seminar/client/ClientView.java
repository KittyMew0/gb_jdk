package geekbrains_course.jdk.lesson2.seminar.client;

/**
 * ��������� ����������� ���������� GUI
 */
public interface ClientView {
    /**
     * ����� ��� ����������� ��������� � GUI
     * @param message ����� ���������
     */
    void showMessage(String message);

    /**
     * ����� ���������� �� ������� �� ������� �������
     */
    void disconnectedFromServer();
}