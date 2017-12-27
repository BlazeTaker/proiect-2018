import javax.swing.*;
import java.awt.*;

public class interfaceProject {
	
	private JFrame frame;
	private JPanel panel;
	private JButton buttonOne;
	private JLabel label;
	
	public interfaceProject() {
		
		gui();
		
	}
	
	public void gui() {
		
		frame = new JFrame ("Interface Project");
		frame.setVisible(true);
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.CYAN);
		
		buttonOne = new JButton("Press Me Gently");
		label = new JLabel("Look at me");
		
		panel.add(buttonOne);
		panel.add(label);
		
		frame.add(panel,BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		
		new interfaceProject();
		
	}

}
