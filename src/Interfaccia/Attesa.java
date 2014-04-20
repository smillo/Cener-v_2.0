package Interfaccia;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class Attesa extends JFrame {
	public Attesa() {
		getContentPane().setLayout(null);
		String tit = ("------ATTENDERE------");

		setTitle(tit);
		setBounds(400, 350, 401, 78);

		this.setVisible(true);
	}
}
