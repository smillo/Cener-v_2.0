package Interfaccia;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import General.Database;

public class Elimina_Cliente_Mese extends JFrame {

	private JButton btnIndietro, btnElimina;
	private JScrollPane scrollPane;
	private JList list;
	private Database database;
	private String mese, nome_cliente;

	public Elimina_Cliente_Mese(Database database, String mese) {
		this.mese = mese;
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(100, 100, 475, 460);

		list = new JList();
		list.addListSelectionListener(new ListSelection());

		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(332, 245, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnElimina = new JButton("Elimina");
		btnElimina.setBounds(332, 105, 89, 23);
		getContentPane().add(btnElimina);
		btnElimina.addActionListener(new ButtonListener());

		if (mese.equals("Gennaio")) {
			list.setListData(database.elenco_clienti_mese("gennaio"));
		} else if (mese.equals("Febbraio")) {
			list.setListData(database.elenco_clienti_mese("febbraio"));
		} else if (mese.equals("Marzo")) {
			list.setListData(database.elenco_clienti_mese("marzo"));
		} else if (mese.equals("Aprile")) {
			list.setListData(database.elenco_clienti_mese("aprile"));
		} else if (mese.equals("Maggio")) {
			list.setListData(database.elenco_clienti_mese("maggio"));
		} else if (mese.equals("Giugno")) {
			list.setListData(database.elenco_clienti_mese("giugno"));
		} else if (mese.equals("Luglio")) {
			list.setListData(database.elenco_clienti_mese("luglio"));
		} else if (mese.equals("Agosto")) {
			list.setListData(database.elenco_clienti_mese("agosto"));
		} else if (mese.equals("Settembre")) {
			list.setListData(database.elenco_clienti_mese("settembre"));
		} else if (mese.equals("Ottobre")) {
			list.setListData(database.elenco_clienti_mese("ottobre"));
		} else if (mese.equals("Novembre")) {
			list.setListData(database.elenco_clienti_mese("novembre"));
		} else if (mese.equals("Dicembre")) {
			list.setListData(database.elenco_clienti_mese("dicembre"));
		}

		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(20, 22, 302, 368);
		getContentPane().add(scrollPane);

		setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnIndietro) {
				dispose();
			}

			if (e.getSource() == btnElimina) {
				database.elimina_Cliente_mese(nome_cliente, mese.toLowerCase());
				if (mese.equals("Gennaio")) {
					list.setListData(database.elenco_clienti_mese("gennaio"));
				} else if (mese.equals("Febbraio")) {
					list.setListData(database.elenco_clienti_mese("febbraio"));
				} else if (mese.equals("Marzo")) {
					list.setListData(database.elenco_clienti_mese("marzo"));
				} else if (mese.equals("Aprile")) {
					list.setListData(database.elenco_clienti_mese("aprile"));
				} else if (mese.equals("Maggio")) {
					list.setListData(database.elenco_clienti_mese("maggio"));
				} else if (mese.equals("Giugno")) {
					list.setListData(database.elenco_clienti_mese("giugno"));
				} else if (mese.equals("Luglio")) {
					list.setListData(database.elenco_clienti_mese("luglio"));
				} else if (mese.equals("Agosto")) {
					list.setListData(database.elenco_clienti_mese("agosto"));
				} else if (mese.equals("Settembre")) {
					list.setListData(database.elenco_clienti_mese("settembre"));
				} else if (mese.equals("Ottobre")) {
					list.setListData(database.elenco_clienti_mese("ottobre"));
				} else if (mese.equals("Novembre")) {
					list.setListData(database.elenco_clienti_mese("novembre"));
				} else if (mese.equals("Dicembre")) {
					list.setListData(database.elenco_clienti_mese("dicembre"));
				}
			}
		}

	}

	private class ListSelection implements ListSelectionListener {

		public void valueChanged(ListSelectionEvent e) {

			nome_cliente = (String) list.getSelectedValue();

		}

	}
}
