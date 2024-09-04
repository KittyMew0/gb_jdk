package geekbrains_course.jdk.lesson2.seminar.server;

import geekbrains_course.jdk.lesson2.seminar.client.ServerControllerInterface;

public class ServerController implements ServerControllerInterface {
    private boolean work;
    private List<ClientView> clientViews;
    private LogRepository logRepository;

    public ServerController(LogRepository logRepository) {
        this.clientViews = new ArrayList<>();
        this.logRepository = logRepository;
    }

    @Override
    public boolean connectUser(ClientView clientView) {
        if (!work) return false;
        clientViews.add(clientView);
        return true;
    }

    @Override
    public void disconnectUser(ClientView clientView) {
        clientViews.remove(clientView);
        clientView.disconnectedFromServer();
    }

    @Override
    public void message(String text) {
        if (!work) return;
        logRepository.saveLog(text);
        for (ClientView clientView : clientViews) {
            clientView.showMessage(text);
        }
    }

    @Override
    public String getHistory() {
        return logRepository.readLog();
    }

    public void startServer() {
        work = true;
    }

    public void stopServer() {
        work = false;
        for (ClientView clientView : clientViews) {
            disconnectUser(clientView);
        }
    }
}
