package geekbrains_course.jdk.lesson2.seminar.client;

//��������� ��� ����������� �������
public interface ClientControllerInterface {
	boolean connectToServer(String name);

	void disconnectFromServer();

	void message(String text);
}

//��������� ��� GUI �������
public interface ClientView {
	void showMessage(String msg);

	void disconnectedFromServer();
}

//��������� ��� ����������� �������
public interface ServerControllerInterface {
	boolean connectUser(ClientView client);

	void disconnectUser(ClientView client);

	void message(String text);

	String getHistory();
}

//��������� ��� GUI �������
public interface ServerView {
	void appendLog(String text);
}

//��������� ��� ����������� (������ � ������)
public interface LogRepository {
	void saveLog(String text);

	String readLog();
}
