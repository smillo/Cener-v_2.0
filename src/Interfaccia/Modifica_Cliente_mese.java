package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import General.Cliente;
import General.Database;

public class Modifica_Cliente_mese extends JFrame {

	private JTextField text_Cliente, text_indirizzo, text_cap,
	text_descrizione, text_descrizione_2, text_imponibile,
	text_imposta;
	private JTextField text_cliente_2, text_città, text_piva, text_importo,
	text_importo_2, text_iva, text_tot_fattura, text_tot_dovuto,
	text_ritenuta;
	private JComboBox combo_ritenuta;
	private JButton btnIndietro, btnSalva;
	private JScrollPane scrollPane;
	private JList list;
	private String mese,nome_cliente ;
	private Database database;

	public Modifica_Cliente_mese(Database database,String mese) {
		this.mese = mese;
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(10, 10, 872, 460);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 25, 70, 14);
		getContentPane().add(lblCliente);

		JLabel lblCliente_1 = new JLabel("Cliente (2)");
		lblCliente_1.setBounds(270, 25, 70, 14);
		getContentPane().add(lblCliente_1);

		JLabel lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setBounds(10, 55, 70, 14);
		getContentPane().add(lblIndirizzo);

		JLabel lblCitt = new JLabel("Citt\u00E0");
		lblCitt.setBounds(270, 55, 70, 14);
		getContentPane().add(lblCitt);

		JLabel lblCap = new JLabel("Cap");
		lblCap.setBounds(10, 85, 46, 14);
		getContentPane().add(lblCap);

		JLabel lblPiva = new JLabel("P.IVA");
		lblPiva.setBounds(270, 85, 70, 14);
		getContentPane().add(lblPiva);

		JLabel lblDescrizione = new JLabel("Descrizione");
		lblDescrizione.setBounds(10, 115, 70, 14);
		getContentPane().add(lblDescrizione);

		JLabel lblImporto = new JLabel("Importo");
		lblImporto.setBounds(270, 115, 70, 14);
		getContentPane().add(lblImporto);

		JLabel lblDescrizione_1 = new JLabel("Descrizione (2)");
		lblDescrizione_1.setBounds(10, 145, 84, 14);
		getContentPane().add(lblDescrizione_1);

		JLabel lblImporto_1 = new JLabel("Importo (2)");
		lblImporto_1.setBounds(270, 145, 78, 14);
		getContentPane().add(lblImporto_1);

		JLabel lblImponibile = new JLabel("Imponibile");
		lblImponibile.setBounds(10, 175, 84, 14);
		getContentPane().add(lblImponibile);

		JLabel lblIva = new JLabel("Iva");
		lblIva.setBounds(270, 175, 84, 14);
		getContentPane().add(lblIva);

		JLabel lblImposta = new JLabel("Imposta");
		lblImposta.setBounds(10, 205, 92, 14);
		getContentPane().add(lblImposta);

		JLabel lblTotFattura = new JLabel("Tot. Fattura");
		lblTotFattura.setBounds(270, 205, 128, 14);
		getContentPane().add(lblTotFattura);

		JLabel lblRitenuta = new JLabel("Ritenuta");
		lblRitenuta.setBounds(10, 235, 78, 14);
		getContentPane().add(lblRitenuta);

		JLabel lblTotDovuto = new JLabel("Tot. Dovuto");
		lblTotDovuto.setBounds(270, 235, 84, 14);
		getContentPane().add(lblTotDovuto);

		text_Cliente = new JTextField();
		text_Cliente.setBounds(88, 22, 172, 20);
		getContentPane().add(text_Cliente);
		text_Cliente.setColumns(10);

		text_indirizzo = new JTextField();
		text_indirizzo.setBounds(88, 52, 172, 20);
		getContentPane().add(text_indirizzo);
		text_indirizzo.setColumns(10);

		text_cap = new JTextField();
		text_cap.setBounds(88, 82, 172, 20);
		getContentPane().add(text_cap);
		text_cap.setColumns(10);

		text_descrizione = new JTextField();
		text_descrizione.setBounds(88, 112, 172, 20);
		getContentPane().add(text_descrizione);
		text_descrizione.setColumns(10);

		text_descrizione_2 = new JTextField();
		text_descrizione_2.setBounds(88, 142, 172, 20);
		getContentPane().add(text_descrizione_2);
		text_descrizione_2.setColumns(10);

		text_imponibile = new JTextField();
		text_imponibile.setBounds(88, 172, 172, 20);
		getContentPane().add(text_imponibile);
		text_imponibile.setEditable(false);
		text_imponibile.setColumns(10);

		text_imposta = new JTextField();
		text_imposta.setEditable(false);
		text_imposta.setBounds(88, 202, 172, 20);
		getContentPane().add(text_imposta);
		text_imposta.setColumns(10);

		text_cliente_2 = new JTextField();
		text_cliente_2.setBounds(340, 22, 172, 20);
		getContentPane().add(text_cliente_2);
		text_cliente_2.setColumns(10);

		text_città = new JTextField();
		text_città.setBounds(340, 52, 172, 20);
		getContentPane().add(text_città);
		text_città.setColumns(10);

		text_piva = new JTextField();
		text_piva.setBounds(340, 82, 172, 20);
		getContentPane().add(text_piva);
		text_piva.setColumns(10);

		text_importo = new JTextField();
		text_importo.setBounds(340, 112, 172, 20);
		getContentPane().add(text_importo);
		text_importo.setColumns(10);

		text_importo_2 = new JTextField();
		text_importo_2.setBounds(340, 142, 172, 20);
		getContentPane().add(text_importo_2);
		text_importo_2.setColumns(10);

		text_iva = new JTextField();
		text_iva.setBounds(340, 172, 172, 20);
		getContentPane().add(text_iva);
		text_iva.setColumns(10);

		text_tot_fattura = new JTextField();
		text_tot_fattura.setEditable(false);
		text_tot_fattura.setBounds(340, 202, 172, 20);
		getContentPane().add(text_tot_fattura);
		text_tot_fattura.setColumns(10);

		text_tot_dovuto = new JTextField();
		text_tot_dovuto.setEditable(false);
		text_tot_dovuto.setBounds(340, 232, 172, 20);
		getContentPane().add(text_tot_dovuto);
		text_tot_dovuto.setColumns(10);

		text_ritenuta = new JTextField();
		text_ritenuta.setEditable(false);
		text_ritenuta.setBounds(180, 232, 80, 20);
		getContentPane().add(text_ritenuta);
		text_ritenuta.setColumns(10);

		combo_ritenuta = new JComboBox();
		combo_ritenuta.addItem("No");
		combo_ritenuta.addItem("Si");
		combo_ritenuta.setBounds(88, 232, 80, 20);
		getContentPane().add(combo_ritenuta);

		
		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(296, 368, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnSalva = new JButton("Salva");
		btnSalva.setBounds(423, 368, 89, 23);
		getContentPane().add(btnSalva);
		btnSalva.addActionListener(new ButtonListener());

		list = new JList(database.elenco_clienti());
		list.addListSelectionListener(new ListSelection());

		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(544, 22, 302, 368);
		getContentPane().add(scrollPane);

		this.setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnIndietro) {
				dispose();
			}

			if (e.getSource() == btnSalva) {

				
				String nome2, descrizione2;
				double importo2, ritenuta, tot_dovuto;

				
				calcola();

				String nome = text_Cliente.getText();
				if (!text_cliente_2.getText().isEmpty()) {
					nome2 = text_cliente_2.getText();
				} else {
					nome2 = "";
				}
				String indirizzo = text_indirizzo.getText();
				String città = text_città.getText();
				String cap = text_cap.getText();
				String piva = text_piva.getText();
				String descrizione = text_descrizione.getText();
				double importo = Double.parseDouble(text_importo.getText());
				if (!text_descrizione_2.getText().isEmpty()) {
					descrizione2 = text_descrizione_2.getText();
				} else {
					descrizione2 = "";
				}
				if (!text_importo_2.getText().isEmpty()) {
					importo2 = Double.parseDouble(text_importo_2.getText());
				} else {
					importo2 = 0.00;
				}
				double imponibile = Double.parseDouble(text_imponibile
						.getText());
				double iva = Double.parseDouble(text_iva.getText());
				double imposta = Double.parseDouble(text_imposta.getText());
				double tot_fattura = Double.parseDouble(text_tot_fattura
						.getText());
				if (!text_ritenuta.getText().isEmpty()) {
					ritenuta = Double.parseDouble(text_ritenuta.getText());
				} else {
					ritenuta = 0.00;
				}
				if (!text_tot_dovuto.getText().isEmpty()) {
					tot_dovuto = Double.parseDouble(text_tot_dovuto.getText());
				} else {
					tot_dovuto = 0.00;
				}


				try {
					database.Modifica_Cliente_mese(nome, nome2, indirizzo,
							città, cap, piva, descrizione, importo, descrizione2,
							importo2, imponibile, iva, imposta, tot_fattura,
							ritenuta, tot_dovuto,mese,nome_cliente);
					JOptionPane.showMessageDialog(null, "cliente modificato in "+mese);
					dispose();

				} catch (Exception ee) {
					JOptionPane.showMessageDialog(null,
							"ERRORE cliente non modificato!");
				}

			}
		}
	}

	private class ListSelection implements ListSelectionListener {

		public void valueChanged(ListSelectionEvent e) {

			nome_cliente = (String) list.getSelectedValue();
			Cliente client = database.seleziona(nome_cliente);
			

			text_Cliente.setText(client.getNome());
			String test = client.getNome2();
			if (test.equals("null")) {
				text_cliente_2.setText("");
			} else {
				text_cliente_2.setText(test);
			}
			text_indirizzo.setText(client.getIndirizzo());
			text_città.setText(client.getCittà());
			text_cap.setText(client.getCap());
			text_piva.setText(client.getPiva());
			text_descrizione.setText(client.getDescrizione());
			text_importo.setText(String.valueOf(client.getImporto()));
			String test2 = client.getDescrizione2();
			if (test2.equals("null")) {
				text_descrizione_2.setText("");
			} else {
				text_descrizione_2.setText(test2);
			}
			String test3 = String.valueOf(client.getImporto2());
			if (test3.equals("0.0")) {
				text_importo_2.setText("");
			} else {
				text_importo_2.setText(test3);
			}
			text_imponibile.setText(String.valueOf(client.getImponibile()));
			text_iva.setText(String.valueOf(client.getIva()));
			text_imposta.setText(String.valueOf(client.getImposta()));
			text_tot_fattura.setText(String.valueOf(client.getTot_fattura()));
			String test4 = String.valueOf(client.getRitenuta());
			if (test4.equals("0.0")) {
				text_ritenuta.setText("");
				combo_ritenuta.setSelectedItem("No");
			} else {
				text_ritenuta.setText(test4);
				combo_ritenuta.setSelectedItem("Si");
			}
			String test5 = String.valueOf(client.getTot_dovuto());
			if (test5.equals("0.0")) {
				text_tot_dovuto.setText("");
			} else {
				text_tot_dovuto.setText(test5);
			}
			
			
		}
	}

	private void calcola() {

		double importo2;
		double importo = Double.parseDouble(text_importo.getText());
		if (!text_importo_2.getText().isEmpty()) {
			importo2 = Double.parseDouble(text_importo_2.getText());
		} else {
			importo2 = 0;
		}
		double imponibile = importo + importo2;
		double iva = Double.parseDouble(text_iva.getText());
		double imposta = imponibile * (iva / 100);
		double totale_fattura = imponibile + imposta;

		if (combo_ritenuta.getSelectedItem() == "Si") {
			double ritenuta = imponibile * 0.04;
			double totale_dovuto = totale_fattura - ritenuta;
			ritenuta = Math.rint(ritenuta * 100) / 100;
			totale_dovuto = Math.rint(totale_dovuto * 100) / 100;
			text_ritenuta.setText(String.valueOf(ritenuta));
			text_tot_dovuto.setText(String.valueOf(totale_dovuto));
		} else {
			text_ritenuta.setText("0.00");
			text_tot_dovuto.setText("0.00");
		}

		imponibile = Math.rint(imponibile * 100) / 100;
		imposta = Math.rint(imposta * 100) / 100;
		totale_fattura = Math.rint(totale_fattura * 100) / 100;
		text_imponibile.setText(String.valueOf(imponibile));
		text_imposta.setText(String.valueOf(imposta));
		text_tot_fattura.setText(String.valueOf(totale_fattura));
	}

}