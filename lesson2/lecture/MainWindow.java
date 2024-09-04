package geekbrains_course.jdk.lesson2.lecture;

import javax.swing.*;

public class MainWindow extends JFrame {
	private static final int POS_X = 400;
	private static final int POS_Y = 200;
	private static final int WINDOW_WIDTH = 800;
	private static final int WINDOW_HEUGHT = 600;
	
	private MainWindow() {
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(POS_X, POS_Y, WINDOW_WIDTH, WINDOW_HEUGHT);
		setTitle("Circles");
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainWindow();
	}
}
