package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import General.Database;

public class Scegli_Elimina extends JFrame {
	private JButton btnSempre, btnMensile;
	private Database database;
	private JComboBox combo_mese;

	public Scegli_Elimina(Database database) {
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(10, 10, 360, 290);

		combo_mese = new JComboBox();
		combo_mese.addItem("Gennaio");
		combo_mese.addItem("Febbraio");
		combo_mese.addItem("Marzo");
		combo_mese.addItem("Aprile");
		combo_mese.addItem("Maggio");
		combo_mese.addItem("Giugno");
		combo_mese.addItem("Luglio");
		combo_mese.addItem("Agosto");
		combo_mese.addItem("Settembre");
		combo_mese.addItem("Ottobre");
		combo_mese.addItem("Novembre");
		combo_mese.addItem("Dicembre");
		combo_mese.setBounds(62, 64, 213, 20);
		getContentPane().add(combo_mese);

		btnSempre = new JButton("Per Sempre");
		btnSempre.setBounds(130, 187, 89, 23);
		getContentPane().add(btnSempre);
		btnSempre.addActionListener(new ButtonListener());

		btnMensile = new JButton("Per Questo Mese");
		btnMensile.setBounds(80, 137, 178, 20);
		getContentPane().add(btnMensile);
		btnMensile.addActionListener(new ButtonListener());

		this.setVisible(true);

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnSempre) {
				Elimina_Cliente elm = new Elimina_Cliente(database);
				dispose();
			}

			if (e.getSource() == btnMensile) {
				
				String mese = (String) combo_mese.getSelectedItem();
				
				Elimina_Cliente_Mese el = new Elimina_Cliente_Mese(database,
						mese);
				
				dispose();

			}
		}

	}
}
