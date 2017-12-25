import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class interfaceProject {

	public static void main(String[] args) {
		JFrame projectInterface = new JFrame ("Interface");
		projectInterface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel emptyLabel = new JLabel("");
		emptyLabel.setPreferredSize(new Dimension(175, 100));
		projectInterface.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		
		projectInterface.pack();
		projectInterface.setVisible(true);
	}

}
