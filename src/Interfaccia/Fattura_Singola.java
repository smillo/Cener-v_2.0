package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import General.Cliente;
import General.Database;

public class Fattura_Singola extends JFrame {

	private JTextField text_indirizzo, text_cap,
			text_descrizione, text_descrizione_2, text_imponibile,
			text_imposta;
	private JTextField text_cliente_2, text_città, text_piva, text_importo,
			text_importo_2, text_iva, text_tot_fattura, text_tot_dovuto,
			text_ritenuta;
	private JComboBox combo_ritenuta,comboBox, combo_giorno, combo_mese, combo_anno;
	private JButton btnIndietro, btnStampa;
	private Database database;

	public Fattura_Singola(Database database) {
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(100, 100, 555, 454);

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
		text_imponibile.setEditable(false);
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

		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(103, 334, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnStampa = new JButton("Stampa");
		btnStampa.setBounds(316, 334, 89, 23);
		getContentPane().add(btnStampa);

		JLabel lblData = new JLabel("Data");
		lblData.setBounds(88, 292, 46, 14);
		getContentPane().add(lblData);

		combo_giorno = new JComboBox();
		combo_giorno.addItem("01");
		combo_giorno.addItem("02");
		combo_giorno.addItem("03");
		combo_giorno.addItem("04");
		combo_giorno.addItem("05");
		combo_giorno.addItem("06");
		combo_giorno.addItem("07");
		combo_giorno.addItem("08");
		combo_giorno.addItem("09");
		combo_giorno.addItem("10");
		combo_giorno.addItem("11");
		combo_giorno.addItem("12");
		combo_giorno.addItem("13");
		combo_giorno.addItem("14");
		combo_giorno.addItem("15");
		combo_giorno.addItem("16");
		combo_giorno.addItem("17");
		combo_giorno.addItem("18");
		combo_giorno.addItem("19");
		combo_giorno.addItem("20");
		combo_giorno.addItem("21");
		combo_giorno.addItem("22");
		combo_giorno.addItem("23");
		combo_giorno.addItem("24");
		combo_giorno.addItem("25");
		combo_giorno.addItem("26");
		combo_giorno.addItem("27");
		combo_giorno.addItem("28");
		combo_giorno.addItem("29");
		combo_giorno.addItem("30");
		combo_giorno.addItem("31");

		combo_giorno.setBounds(140, 289, 52, 20);
		getContentPane().add(combo_giorno);

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
		combo_mese.setBounds(202, 289, 90, 20);
		getContentPane().add(combo_mese);

		combo_anno = new JComboBox();
		combo_anno.addItem("2014");
		combo_anno.addItem("2015");
		combo_anno.addItem("2016");
		combo_anno.addItem("2017");
		combo_anno.addItem("2018");
		combo_anno.addItem("2019");
		combo_anno.addItem("2020");
		combo_anno.addItem("2021");
		combo_anno.addItem("2022");
		combo_anno.addItem("2023");
		combo_anno.addItem("2024");
		combo_anno.addItem("2025");
		combo_anno.addItem("2026");
		combo_anno.addItem("2027");
		combo_anno.addItem("2028");
		combo_anno.addItem("2029");
		combo_anno.addItem("2030");
		combo_anno.addItem("2031");
		combo_anno.addItem("2032");
		combo_anno.addItem("2033");
		combo_anno.addItem("2034");
		combo_anno.addItem("2035");
		combo_anno.addItem("2036");
		combo_anno.addItem("2037");
		combo_anno.addItem("2038");
		combo_anno.addItem("2039");
		combo_anno.addItem("2040");

		combo_anno.setBounds(302, 289, 52, 20);
		getContentPane().add(combo_anno);
		
		comboBox = new JComboBox(database.elenco_clienti());
		comboBox.setBounds(90, 22, 172, 19);
		getContentPane().add(comboBox);
		comboBox.addActionListener(new Selezione());
		btnStampa.addActionListener(new ButtonListener());

		this.setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnIndietro) {
				dispose();
			}

			if (e.getSource() == btnStampa) {
				boolean missing = true;			
				double totale = 0, importo2 = 0, ritenuta = 0, tot_dovuto = 0;
				String nome2, descrizione2;
				String nome = (String) comboBox.getSelectedItem();
				calcola();

				if (!text_cliente_2.getText().isEmpty()) {
					nome2 = text_cliente_2.getText();
				} else {
					nome2 = "";
				}

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

				database.print(nome, nome2,
						text_indirizzo.getText(), text_città.getText(),
						text_cap.getText(), text_piva.getText(),
						text_descrizione.getText(),
						Double.parseDouble(text_importo.getText()),
						descrizione2, importo2,
						Double.parseDouble(text_imponibile.getText()),
						Double.parseDouble(text_iva.getText()),
						Double.parseDouble(text_imposta.getText()),
						Double.parseDouble(text_tot_fattura.getText()),
						ritenuta, tot_dovuto,
						(String) combo_giorno.getSelectedItem(),
						(String) combo_mese.getSelectedItem(),
						(String) combo_anno.getSelectedItem());

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
	
	private class Selezione implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			String nome = (String) comboBox.getSelectedItem();
			Cliente cli = database.seleziona(nome);
			
			text_cliente_2.setText(cli.getNome2());
			text_indirizzo.setText(cli.getIndirizzo());
			text_città.setText(cli.getCittà());
			text_cap.setText(cli.getCap());
			text_piva.setText(cli.getPiva());
			text_descrizione.setText(cli.getDescrizione());
			text_importo.setText(String.valueOf(cli.getImporto()));
			text_descrizione_2.setText(cli.getDescrizione2());
			text_importo_2.setText(String.valueOf(cli.getImporto2()));
			text_imponibile.setText(String.valueOf(cli.getImponibile()));
			text_iva.setText(String.valueOf(cli.getIva()));
			text_imposta.setText(String.valueOf(cli.getImposta()));
			text_tot_fattura.setText(String.valueOf(cli.getTot_fattura()));
			text_ritenuta.setText(String.valueOf(cli.getRitenuta()));
			text_tot_dovuto.setText(String.valueOf(cli.getTot_dovuto()));
			
			if(cli.getRitenuta() == 0.0){
				combo_ritenuta.setSelectedItem("No");
				text_ritenuta.setText("");
				text_tot_dovuto.setText("");
			}
			else {combo_ritenuta.setSelectedItem("Si");}
			
			if(cli.getImporto2() == 0.0){
				text_importo_2.setText("");
			}
			
			
		}
		
	}
}


