package Interfaccia;

import java.awt.SystemColor;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import General.Database;
import General.Fatture;

public class Storico extends JFrame {

	private JList list_clienti, list_fatt;
	private Database database;
	private JScrollPane scrollPane_fatt, scrollPane_fatture;

	public Storico(Database database) {
		this.database = database;
		setBounds(150, 100, 469, 504);
		getContentPane().setLayout(null);
		setResizable(false);

		list_clienti = new JList(database.seleziona_fatture());
		list_clienti.addListSelectionListener(new ListSelection());
		getContentPane().add(list_clienti);

		list_fatt = new JList();
		list_fatt.setBorder(null);
		list_fatt.setBackground(SystemColor.menu);
		list_fatt.addListSelectionListener(new ListSelection());
		getContentPane().add(list_fatt);

		scrollPane_fatt = new JScrollPane(list_clienti);
		scrollPane_fatt.setBounds(10, 22, 180, 400);
		getContentPane().add(scrollPane_fatt);

		scrollPane_fatture = new JScrollPane(list_fatt);
		scrollPane_fatture.setBorder(null);
		scrollPane_fatture.setBounds(210, 22, 170, 400);
		getContentPane().add(scrollPane_fatture);

		this.setVisible(true);
	}

	public class ListSelection implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			String nome_cliente = (String) list_clienti.getSelectedValue();

			LinkedList<Fatture> ll = database.restituisci_fattura(nome_cliente);
			String[] lis = new String[ll.size()];
			for (int ia = 0; ia < ll.size(); ia++) {
				lis[ia] = ll.get(ia).getNumero() + "**" + ll.get(ia).getData()
						+ "**" + ll.get(ia).getTotale();
			}
			list_fatt.setListData(lis);

		}

	}
}
