package Interfaccia;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import General.Cliente;
import General.Database;

public class Aggiungi_Cliente extends JFrame {

	private JTextField text_Cliente, text_indirizzo, text_cap,
	text_descrizione, text_descrizione_2, text_imponibile,
	text_imposta;
	private JTextField text_cliente_2, text_città, text_piva, text_importo,
	text_importo_2, text_iva, text_tot_fattura, text_tot_dovuto,
	text_ritenuta;
	private JComboBox combo_ritenuta, combo_gen, combo_feb, combo_mar,
	combo_apr, combo_mag, combo_giu, combo_lug, combo_ago, combo_set,
	combo_ott, combo_nov, combo_dic;
	private JButton btnIndietro, btnSalva;
	private Database database;
	private boolean gennaio, febbraio, marzo, aprile, maggio, giugno, luglio,
	agosto, settembre, ottobre, novembre, dicembre;

	public Aggiungi_Cliente(Database database) {
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(10, 10, 560, 460);

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
		text_imponibile.setEditable(false);
		text_imponibile.setBounds(88, 172, 172, 20);
		getContentPane().add(text_imponibile);
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

		combo_gen = new JComboBox();
		combo_gen.addItem("No");
		combo_gen.addItem("Si");
		combo_gen.setBounds(46, 285, 46, 20);
		getContentPane().add(combo_gen);

		JLabel lblGen = new JLabel("Gen");
		lblGen.setBounds(10, 288, 46, 14);
		getContentPane().add(lblGen);

		JLabel lblFeb = new JLabel("Feb");
		lblFeb.setBounds(102, 288, 46, 14);
		getContentPane().add(lblFeb);

		combo_feb = new JComboBox();
		combo_feb.addItem("No");
		combo_feb.addItem("Si");
		combo_feb.setBounds(130, 285, 46, 20);
		getContentPane().add(combo_feb);

		JLabel lblMar = new JLabel("Mar");
		lblMar.setBounds(187, 288, 46, 14);
		getContentPane().add(lblMar);

		combo_mar = new JComboBox();
		combo_mar.addItem("No");
		combo_mar.addItem("Si");
		combo_mar.setBounds(214, 285, 46, 20);
		getContentPane().add(combo_mar);

		JLabel lblApr = new JLabel("Apr");
		lblApr.setBounds(270, 288, 46, 14);
		getContentPane().add(lblApr);

		combo_apr = new JComboBox();
		combo_apr.addItem("No");
		combo_apr.addItem("Si");
		combo_apr.setBounds(296, 285, 46, 20);
		getContentPane().add(combo_apr);

		JLabel lblMag = new JLabel("Mag");
		lblMag.setBounds(352, 288, 46, 14);
		getContentPane().add(lblMag);

		combo_mag = new JComboBox();
		combo_mag.addItem("No");
		combo_mag.addItem("Si");
		combo_mag.setBounds(380, 285, 46, 20);
		getContentPane().add(combo_mag);

		JLabel lblGiu = new JLabel("Giu");
		lblGiu.setBounds(436, 288, 46, 14);
		getContentPane().add(lblGiu);

		combo_giu = new JComboBox();
		combo_giu.addItem("No");
		combo_giu.addItem("Si");
		combo_giu.setBounds(464, 285, 46, 20);
		getContentPane().add(combo_giu);

		combo_lug = new JComboBox();
		combo_lug.addItem("No");
		combo_lug.addItem("Si");
		combo_lug.setBounds(46, 315, 46, 20);
		getContentPane().add(combo_lug);

		JLabel lblLug = new JLabel("Lug");
		lblLug.setBounds(10, 318, 46, 14);
		getContentPane().add(lblLug);

		JLabel lblAgo = new JLabel("Ago");
		lblAgo.setBounds(102, 318, 46, 14);
		getContentPane().add(lblAgo);

		combo_ago = new JComboBox();
		combo_ago.addItem("No");
		combo_ago.addItem("Si");
		combo_ago.setBounds(130, 315, 46, 20);
		getContentPane().add(combo_ago);

		JLabel lblSet = new JLabel("Set");
		lblSet.setBounds(187, 318, 46, 14);
		getContentPane().add(lblSet);

		combo_set = new JComboBox();
		combo_set.addItem("No");
		combo_set.addItem("Si");
		combo_set.setBounds(214, 315, 46, 20);
		getContentPane().add(combo_set);

		JLabel lblOtt = new JLabel("Ott");
		lblOtt.setBounds(270, 318, 46, 14);
		getContentPane().add(lblOtt);

		combo_ott = new JComboBox();
		combo_ott.addItem("No");
		combo_ott.addItem("Si");
		combo_ott.setBounds(296, 315, 46, 20);
		getContentPane().add(combo_ott);

		JLabel lblNov = new JLabel("Nov");
		lblNov.setBounds(352, 318, 46, 14);
		getContentPane().add(lblNov);

		combo_nov = new JComboBox();
		combo_nov.addItem("No");
		combo_nov.addItem("Si");
		combo_nov.setBounds(380, 315, 46, 20);
		getContentPane().add(combo_nov);

		JLabel lblDic = new JLabel("Dic");
		lblDic.setBounds(436, 318, 46, 14);
		getContentPane().add(lblDic);

		combo_dic = new JComboBox();
		combo_dic.addItem("No");
		combo_dic.addItem("Si");
		combo_dic.setBounds(464, 315, 46, 20);
		getContentPane().add(combo_dic);

		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(296, 368, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnSalva = new JButton("Salva");
		btnSalva.setBounds(423, 368, 89, 23);
		getContentPane().add(btnSalva);
		btnSalva.addActionListener(new ButtonListener());

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

				if (combo_gen.getSelectedItem() == "Si") {

					gennaio = true;

				} else {
					gennaio = false;
				}
				if (combo_feb.getSelectedItem() == "Si") {
					febbraio = true;
				} else {
					febbraio = false;
				}
				if (combo_mar.getSelectedItem() == "Si") {
					marzo = true;
				} else {
					marzo = false;
				}
				if (combo_apr.getSelectedItem() == "Si") {
					aprile = true;
				} else {
					aprile = false;
				}
				if (combo_mag.getSelectedItem() == "Si") {
					maggio = true;
				} else {
					maggio = false;
				}
				if (combo_giu.getSelectedItem() == "Si") {
					giugno = true;
				} else {
					giugno = false;
				}
				if (combo_lug.getSelectedItem() == "Si") {
					luglio = true;
				} else {
					luglio = false;
				}
				if (combo_ago.getSelectedItem() == "Si") {
					agosto = true;
				} else {
					agosto = false;
				}
				if (combo_set.getSelectedItem() == "Si") {
					settembre = true;
				} else {
					settembre = false;
				}
				if (combo_ott.getSelectedItem() == "Si") {
					ottobre = true;
				} else {
					ottobre = false;
				}
				if (combo_nov.getSelectedItem() == "Si") {
					novembre = true;
				} else {
					novembre = false;
				}
				if (combo_dic.getSelectedItem() == "Si") {
					dicembre = true;
				} else {
					dicembre = false;
				}

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

				Cliente cliente = new Cliente(nome, nome2, indirizzo, città,
						cap, piva, descrizione, importo, descrizione2,
						importo2, imponibile, iva, imposta, tot_fattura,
						ritenuta, tot_dovuto, gennaio, febbraio, marzo, aprile,
						maggio, giugno, luglio, agosto, settembre, ottobre,
						novembre, dicembre);

				try {
					database.Inserisci_Cliente(cliente);
					JOptionPane.showMessageDialog(null, "cliente inserito");
					dispose();
				} catch (Exception ee) {
					JOptionPane.showMessageDialog(null,
							"ERRORE cliente non inserito!");
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
}