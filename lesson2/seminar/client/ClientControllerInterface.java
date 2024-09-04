package geekbrains_course.jdk.lesson2.seminar.client;

//Интерфейс для контроллера клиента
public interface ClientControllerInterface {
	boolean connectToServer(String name);

	void disconnectFromServer();

	void message(String text);
}

//Интерфейс для GUI клиента
public interface ClientView {
	void showMessage(String msg);

	void disconnectedFromServer();
}

//Интерфейс для контроллера сервера
public interface ServerControllerInterface {
	boolean connectUser(ClientView client);

	void disconnectUser(ClientView client);

	void message(String text);

	String getHistory();
}

//Интерфейс для GUI сервера
public interface ServerView {
	void appendLog(String text);
}

//Интерфейс для репозитория (работа с логами)
public interface LogRepository {
	void saveLog(String text);

	String readLog();
}
