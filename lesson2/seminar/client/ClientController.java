package geekbrains_course.jdk.lesson2.seminar.client;

public class ClientController implements ClientControllerInterface {
    private boolean connected;
    private String name;
    private ClientView clientView;
    private ServerControllerInterface server;

    public void setClientView(ClientView clientView) {
        this.clientView = clientView;
    }

    public void setServer(ServerControllerInterface server) {
        this.server = server;
    }

    @Override
    public boolean connectToServer(String name) {
        this.name = name;
        if (server.connectUser(clientView)) {
            clientView.showMessage("Вы успешно подключились!");
            connected = true;
            String log = server.getHistory();
            if (log != null) {
                clientView.showMessage(log);
            }
            return true;
        } else {
            clientView.showMessage("Подключение не удалось");
            return false;
        }
    }

    @Override
    public void disconnectFromServer() {
        if (connected) {
            server.disconnectUser(clientView);
            connected = false;
            clientView.disconnectedFromServer();
            clientView.showMessage("Вы были отключены от сервера!");
        }
    }

    @Override
    public void message(String text) {
        if (connected && !text.isEmpty()) {
            server.message(name + ": " + text);
        } else {
            clientView.showMessage("Нет подключения к серверу");
        }
    }
}
