package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import General.Database;

public class Scegli_Modifica extends JFrame {
	private JButton btnSempre, btnMese;
	private Database database;
	private JComboBox combo_mese;

	public Scegli_Modifica(Database database) {
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

		btnMese = new JButton("Per questo mese");
		btnMese.setBounds(104, 128, 133, 23);
		getContentPane().add(btnMese);
		btnMese.addActionListener(new ButtonListener());

		this.setVisible(true);

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnSempre) {
				Modifica_Cliente mod = new Modifica_Cliente(database);
				dispose();
			}

			if (e.getSource() == btnMese) {

				String mese = (String) combo_mese.getSelectedItem();

				Modifica_Cliente_mese mcm = new Modifica_Cliente_mese(database,
						mese);

				dispose();
			}
		}

	}

}
