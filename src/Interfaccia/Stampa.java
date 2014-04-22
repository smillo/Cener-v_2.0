package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import General.Database;

public class Stampa extends JFrame {
	private JTextField text_giorno, text_mese, text_anno;
	private JButton btnIndietro, btnStampa;
	private JComboBox combo_mese;
	private Database database;

	public Stampa(Database database) {
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(100, 100, 360, 290);

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(10, 64, 46, 14);
		getContentPane().add(lblData);

		JLabel label = new JLabel("/");
		label.setBounds(127, 64, 22, 14);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("/");
		label_1.setBounds(206, 64, 22, 14);
		getContentPane().add(label_1);

		text_giorno = new JTextField();
		text_giorno.setBounds(63, 61, 54, 20);
		getContentPane().add(text_giorno);
		text_giorno.setColumns(10);

		text_mese = new JTextField();
		text_mese.setBounds(142, 61, 54, 20);
		getContentPane().add(text_mese);
		text_mese.setColumns(10);

		text_anno = new JTextField();
		text_anno.setBounds(221, 61, 54, 20);
		getContentPane().add(text_anno);
		text_anno.setColumns(10);

		JLabel lblMese = new JLabel("Mese");
		lblMese.setBounds(10, 113, 46, 14);
		getContentPane().add(lblMese);

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
		combo_mese.setBounds(63, 110, 213, 20);
		getContentPane().add(combo_mese);

		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(60, 159, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnStampa = new JButton("Stampa");
		btnStampa.setBounds(186, 159, 89, 23);
		getContentPane().add(btnStampa);
		btnStampa.addActionListener(new ButtonListener());

		this.setVisible(true);

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnIndietro) {
				dispose();
			}

			if (e.getSource() == btnStampa) {

				if (text_giorno.getText().length() == 2
						&& text_mese.getText().length() == 2
						&& text_anno.getText().length() == 4) {
					String data = text_giorno.getText() + "/"
							+ text_mese.getText() + "/" + text_anno.getText();

					int confirm = JOptionPane.showOptionDialog(
							null,
							"Stampare fatture di "
									+ combo_mese.getSelectedItem()
									+ " in data " + data + "?", "Stampa",
							JOptionPane.YES_NO_OPTION,
							JOptionPane.QUESTION_MESSAGE, null, null, null);

					if (confirm == 0) {
						dispose();
						database.stampafattura(
								(String) combo_mese.getSelectedItem(), data,
								text_anno.getText());

						
					} else {

					}

				} else
					JOptionPane.showMessageDialog(null,
							"ERRORE: inserire la data nel formato gg/mm/aaaa");
			}
		}

	}

}