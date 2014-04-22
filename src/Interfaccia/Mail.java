package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import General.Database;

public class Mail extends JFrame{
private JButton btnInvia;
private JList list_clienti_mail,list_elenco_mail;
private Database database;
private String data_mail,nome_mail;
private JScrollPane scrollPane_c_mail,	scrollPane_mail;

	public Mail(Database database){
		this.database = database;
		setBounds(150, 100, 954, 504);
		setLayout(null);
	btnInvia = new JButton("Crea File");
	btnInvia.setBounds(768, 251, 100, 20);
	btnInvia.addActionListener(new ButtonListener());
getContentPane().add(btnInvia);
	list_clienti_mail = new JList(database.seleziona_fatture());
	list_clienti_mail.addListSelectionListener(new ListSelection());
	getContentPane().add(list_clienti_mail);	
	scrollPane_c_mail = new JScrollPane(list_clienti_mail);
	scrollPane_c_mail.setBounds(10, 22, 251, 368);
	getContentPane().add(scrollPane_c_mail);
	
	list_elenco_mail = new JList();
	list_elenco_mail.addListSelectionListener(new ListSelection1());		
	getContentPane().add(list_elenco_mail);
			
	scrollPane_mail = new JScrollPane(list_elenco_mail);
	scrollPane_mail.setBorder(null);
	scrollPane_mail.setBounds(367, 22, 251, 368);
	getContentPane().add(scrollPane_mail);
	
	this.setVisible(true);
	}
	
	public class ListSelection1 implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {
			 data_mail= (String) list_elenco_mail.getSelectedValue();
			
		}
		
	}
	
	public class ListSelection implements ListSelectionListener{

		@Override
		public void valueChanged(ListSelectionEvent e) {

			
			nome_mail = (String) list_clienti_mail.getSelectedValue();
			
			String[] mail = database.restituisci_mail(nome_mail);
			
			list_elenco_mail.setListData(mail);
			
			
		}
		
	}
	
	private class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			
				database.print_mail(nome_mail, data_mail);
				
				
			
			
		}
		
	}
	
}
