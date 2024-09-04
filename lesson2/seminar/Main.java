package geekbrains_course.jdk.lesson2.seminar;

import geekbrains_course.jdk.lesson2.seminar.client.ClientController;
import geekbrains_course.jdk.lesson2.seminar.client.ClientGUI;
import geekbrains_course.jdk.lesson2.seminar.client.LogRepository;
import geekbrains_course.jdk.lesson2.seminar.server.ServerController;
import geekbrains_course.jdk.lesson2.seminar.server.ServerGUI;

public class Main {
    public static void main(String[] args) {
        // Создаем репозиторий для логов
        LogRepository logRepository = new FileLogRepository("log.txt");

        // Создаем контроллер сервера
        ServerController serverController = new ServerController(logRepository);

        // Создаем GUI сервера и связываем его с контроллером
        ServerGUI serverGUI = new ServerGUI(serverController);

        // Создаем контроллер клиента и связываем его с GUI и сервером
        ClientController clientController1 = new ClientController();
        ClientGUI clientGUI1 = new ClientGUI();
        clientController1.setClientView(clientGUI1);
        clientController1.setServer(serverController);
        clientGUI1.setClient(clientController1);

        // Создаем еще одного клиента
        ClientController clientController2 = new ClientController();
        ClientGUI clientGUI2 = new ClientGUI();
        clientController2.setClientView(clientGUI2);
        clientController2.setServer(serverController);
        clientGUI2.setClient(clientController2);

        // Запуск GUI
        serverGUI.setVisible(true);
        clientGUI1.setVisible(true);
        clientGUI2.setVisible(true);
    }
}