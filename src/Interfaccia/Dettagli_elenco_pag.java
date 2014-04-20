package Interfaccia;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

import General.Database;

public class Dettagli_elenco_pag extends JFrame {

	public Dettagli_elenco_pag(Database database) {
		getContentPane().setLayout(null);
		setBounds(100, 100, 398, 487);
		JList list = new JList(database.dettagli_elenco());

		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 11, 367, 424);
		getContentPane().add(scrollPane);

		this.setVisible(true);
	}
}
