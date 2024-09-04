package geekbrains_course.jdk.lesson2.seminar.client;

public class ClientGUI extends JFrame implements ClientView {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private JTextArea log;
    private JTextField tfMessage;
    private ClientControllerInterface clientController;

    public ClientGUI() {
        setting();
        createPanel();
        setVisible(true);
    }

    public void setClient(ClientControllerInterface clientController) {
        this.clientController = clientController;
    }

    @Override
    public void showMessage(String msg) {
        log.append(msg + "\n");
    }

    @Override
    public void disconnectedFromServer() {
        showMessage("Вы были отключены от сервера!");
    }

    private void setting() {
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat client");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createPanel() {
        log = new JTextArea();
        log.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(log);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelBottom = new JPanel(new BorderLayout());
        tfMessage = new JTextField();
        tfMessage.addActionListener(e -> sendMessage());
        JButton btnSend = new JButton("Send");
        btnSend.addActionListener(e -> sendMessage());
        panelBottom.add(tfMessage, BorderLayout.CENTER);
        panelBottom.add(btnSend, BorderLayout.EAST);
        add(panelBottom, BorderLayout.SOUTH);
    }

    private void sendMessage() {
        clientController.message(tfMessage.getText());
        tfMessage.setText("");
    }
}
