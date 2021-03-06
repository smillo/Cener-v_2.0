package Interfaccia;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import General.Database;

public class Elimina_Cliente extends JFrame {

	private JButton btnIndietro, btnElimina;
	private JScrollPane scrollPane;
	private JList list;
	private String nome_cliente;
	private Database database;

	public Elimina_Cliente(Database database) {
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(100, 100, 475, 460);

		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(332, 245, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnElimina = new JButton("Elimina");
		btnElimina.setBounds(332, 105, 89, 23);
		getContentPane().add(btnElimina);
		btnElimina.addActionListener(new ButtonListener());

		list = new JList(database.elenco_clienti());
		list.addListSelectionListener(new ListSelection());

		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(20, 22, 302, 368);
		getContentPane().add(scrollPane);

		this.setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnIndietro) {
				dispose();
			}

			if (e.getSource() == btnElimina) {

				database.elimina_Cliente(nome_cliente);
				list.setListData(database.elenco_clienti());
			}
		}

	}

	private class ListSelection implements ListSelectionListener {

		public void valueChanged(ListSelectionEvent e) {

			nome_cliente = (String) list.getSelectedValue();
			System.out.println(nome_cliente);

		}

	}
}
