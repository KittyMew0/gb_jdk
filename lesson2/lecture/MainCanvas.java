package geekbrains_course.jdk.lesson2.lecture;

import java.awt.*;
import javax.swing.*;

public class MainCanvas extends JFrame {
	MainCanvas() {
		setBackground(Color.BLUE);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
	
	public int getLeft() { return 0; }
	public int getRight() { return getWidth() - 1; }
	public int getTop() { return 0; }
	public int getBottom() { return getHeight() - 1; }
}
