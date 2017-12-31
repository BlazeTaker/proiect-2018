import javax.swing.*;
import java.awt.event.*;

public class interfaceProject {
	
	public interfaceProject () {
		
		frame();
		
	}
	
	public void frame() {
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JButton buttonOne = new JButton("Press me Gently");
		
		buttonOne.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "That's the way!");
			}
			
		});
		
		panel.add(buttonOne);
		frame.add(panel);
		
	}
	
	public static void main(String[] args) {
		
		new interfaceProject();
		
	}

}
