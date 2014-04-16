package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import General.Database;

public class Fattura_Singola extends JFrame {

	private JTextField text_Cliente, text_indirizzo, text_cap,
	text_descrizione, text_descrizione_2, text_imponibile,
	text_imposta;
	private JTextField text_cliente_2, text_città, text_piva, text_importo,
	text_importo_2, text_iva, text_tot_fattura, text_tot_dovuto,
	text_ritenuta;
	private JComboBox combo_ritenuta, combo_giorno, combo_mese, combo_anno;
	private JButton btnIndietro, btnStampa;
	private Database database;

	public Fattura_Singola(Database database) {
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(10, 10, 555, 454);

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
		combo_giorno.addItem("1");
		combo_giorno.addItem("2");
		combo_giorno.addItem("3");
		combo_giorno.addItem("4");
		combo_giorno.addItem("5");
		combo_giorno.addItem("6");
		combo_giorno.addItem("7");
		combo_giorno.addItem("8");
		combo_giorno.addItem("9");
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
		btnStampa.addActionListener(new ButtonListener());

		this.setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnIndietro) {
				dispose();
			}

			if (e.getSource() == btnStampa) {

			}
		}

	}
}