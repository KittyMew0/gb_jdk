package geekbrains_course.jdk.lesson2.seminar.server;

public class ServerGUI extends JFrame implements ServerView {
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;

    private JTextArea log;
    private ServerControllerInterface serverController;

    public ServerGUI(ServerControllerInterface serverController) {
        this.serverController = serverController;
        setting();
        createPanel();
        setVisible(true);
    }

    @Override
    public void appendLog(String text) {
        log.append(text + "\n");
    }

    private void setting() {
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createPanel() {
        log = new JTextArea();
        log.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(log);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelBottom = new JPanel(new GridLayout(1, 2));
        JButton btnStart = new JButton("Start");
        btnStart.addActionListener(e -> serverController.startServer());
        JButton btnStop = new JButton("Stop");
        btnStop.addActionListener(e -> serverController.stopServer());
        panelBottom.add(btnStart);
        panelBottom.add(btnStop);
        add(panelBottom, BorderLayout.SOUTH);
    }
}
