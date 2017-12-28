import javax.swing.*;
import java.awt.*;

public class interfaceProject {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel(new GridBagLayout());
		
		JButton buttonOne = new JButton("Click me gently.");
		JButton buttonTwo = new JButton("Click me harder.");
		
		GridBagConstraints constraints = new GridBagConstraints();
		
		constraints.insets = new Insets(10, 10, 10, 10);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		panel.add(buttonOne, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		panel.add(buttonTwo, constraints);
		
		frame.add(panel);
	}

}
