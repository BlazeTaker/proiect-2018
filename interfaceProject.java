import javax.swing.*;
import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.*;
import java.io.*;


public class interfaceProject {
	
	public interfaceProject () {
		
		frame();
		
	}
	
	public void frame() {
		
		JFrame frame = new JFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		JButton buttonOne = new JButton("Press me Gently");
		
		BufferedImage img = null;
		try {
		    img = ImageIO.read(new File("D:\\\\Net\\\\Desktop Pics\\\\Goku.jpg"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		JLabel label = new JLabel();
		label.setSize(300, 150);
		
		Image dimg = img.getScaledInstance(label.getWidth(), label.getHeight(),
		        Image.SCALE_SMOOTH);
		
		
		label.setIcon(new ImageIcon(dimg));
		
		buttonOne.addActionListener(new ActionListener() {
			
			public void actionPerformed (ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "That's the way!");
			}
			
		});
		
		JMenuBar menu = new JMenuBar();
		
		JMenu file = new JMenu("File");
		menu.add(file);
		
		frame.setJMenuBar(menu);
		
		JTextField textField = new JTextField(20);
		textField.setToolTipText("Enter something");
		
		panel.add(label);
		panel.add(textField);
		panel.add(buttonOne);
		frame.add(panel);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		new interfaceProject();
		
	}

}
