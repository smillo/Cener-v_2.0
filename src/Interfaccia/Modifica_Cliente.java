package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Modifica_Cliente extends JFrame {

	private JTextField text_Cliente, text_indirizzo, text_cap,
	text_descrizione, text_descrizione_2, text_imponibile,
	text_imposta;
	private JTextField text_cliente_2, text_città, text_piva, text_importo,
	text_importo_2, text_iva, text_tot_fattura, text_tot_dovuto,
	text_ritenuta;
	private JComboBox combo_ritenuta, combo_gen, combo_feb, combo_mar,
	combo_apr, combo_mag, combo_giu, combo_lug, combo_ago, combo_set,
	combo_ott, combo_nov, combo_dic, combo_select_all;
	private JButton btnIndietro, btnSalva;
	private JScrollPane scrollPane;
	private JList list;

	public Modifica_Cliente() {
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

		combo_select_all = new JComboBox();
		combo_select_all.addItem("---------------");
		combo_select_all.addItem("Seleziona tutti");
		combo_select_all.setBounds(46, 369, 214, 20);
		getContentPane().add(combo_select_all);

		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(296, 368, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnSalva = new JButton("Salva");
		btnSalva.setBounds(423, 368, 89, 23);
		getContentPane().add(btnSalva);
		btnSalva.addActionListener(new ButtonListener());

		list = new JList();

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

			}
		}

	}
}