package Interfaccia;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import General.Cliente;
import General.Database;
import General.Fatture;

import java.awt.SystemColor;

public class Partenza extends JFrame {
	private String nome_mail,data_mail;
	GregorianCalendar gc = new GregorianCalendar();
	private JButton btnStorico;
	private String[] cause = { "costo operai", "stipendio nostro", "tornado",
			"inps", "automezzi", "carburante", "varie", "artser", "tasse" };
	private JTabbedPane tabbedPane;
	private JTextField text_Cliente, text_indirizzo, text_cap,
	text_descrizione, text_descrizione_2, text_imponibile,
	text_imposta;
	private JTextField text_cliente_2, text_città, text_piva, text_importo,
	text_importo_2, text_iva, text_tot_fattura, text_tot_dovuto,
	text_ritenuta;
	private JComboBox combo_ritenuta, combo_gen,
	combo_feb, combo_mar, combo_apr, combo_mag, combo_giu, combo_lug,
	combo_ago, combo_set, combo_ott, combo_nov, combo_dic,
	combo_ritenuta_gen, combo_ritenuta_feb, combo_ritenuta_mar,
	combo_ritenuta_apr, combo_ritenuta_mag, combo_ritenuta_giu,
	combo_ritenuta_lug, combo_ritenuta_ago, combo_ritenuta_set,
	combo_ritenuta_ott, combo_ritenuta_nov, combo_ritenuta_dic,
	combo_mese_pag, combo_anno_pag;
	private JPanel panel_home, panel_gen, panel_feb, panel_mar, panel_apr,
	panel_mag, panel_giu, panel_lug, panel_ago, panel_set, panel_ott,
	panel_fatt, panel_nov, panel_dic, panel_el_pag, panel_ent_usc,
	panel_list;
	private JTextField text_entrate, text_uscite;
	private JScrollPane scrollPane, scrollPane_gen, scrollPane_1, scrollPane_2,
	scrollPane_feb, scrollPane_mar, scrollPane_apr, scrollPane_mag,
	scrollPane_giu, scrollPane_lug, scrollPane_ago, scrollPane_set,
	scrollPane_ott, scrollPane_nov, scrollPane_dic, scrollPane_pag;
	private JButton btnAggiungiUscita, btnNuovo_cliente, btnModifica_cliente,
	btnElimina_cliente, btnStampa, btnSeleziona, btnFattura_singola,
	btnModifica_fattura, btnNuovo_anno, btnMail,
	btnRimuoviDallelenco, btnRiepilogo_pag;
	private JButton btnRiepilogo,btnInvia;
	private JList list_clienti,list_clienti_mail, list_clienti_fatt, list_fatt,
	list_cause_uscite, list_dettagli_uscite, list_clienti_gen,
	list_clienti_feb, list_clienti_mar, list_clienti_apr,
	list_clienti_mag, list_clienti_giu, list_clienti_lug,
	list_clienti_ago, list_clienti_set, list_clienti_ott,
	list_clienti_nov, list_clienti_dic, list_el_paganti,list_elenco_mail;
	private Database database;
	private JLabel Cliente_gen, indirizzo_gen, cap_gen, descrizione_gen,
	descrizione_2_gen, imponibile_gen, imposta_gen, cliente_2_gen,
	città_gen, piva_gen, importo_gen, importo_2_gen, iva_gen,
	tot_fattura_gen, tot_dovuto_gen, ritenuta_gen, Cliente_feb,
	indirizzo_feb, cap_feb, descrizione_feb, descrizione_2_feb,
	imponibile_feb, imposta_feb, cliente_2_feb, città_feb, piva_feb,
	importo_feb, importo_2_feb, iva_feb, tot_fattura_feb,
	tot_dovuto_feb, ritenuta_feb, Cliente_mar, indirizzo_mar, cap_mar,
	descrizione_mar, descrizione_2_mar, imponibile_mar, imposta_mar,
	cliente_2_mar, città_mar, piva_mar, importo_mar, importo_2_mar,
	iva_mar, tot_fattura_mar, tot_dovuto_mar, ritenuta_mar,
	Cliente_apr, indirizzo_apr, cap_apr, descrizione_apr,
	descrizione_2_apr, imponibile_apr, imposta_apr, cliente_2_apr,
	città_apr, piva_apr, importo_apr, importo_2_apr, iva_apr,
	tot_fattura_apr, tot_dovuto_apr, ritenuta_apr, Cliente_mag,
	indirizzo_mag, cap_mag, descrizione_mag, descrizione_2_mag,
	imponibile_mag, imposta_mag, cliente_2_mag, città_mag, piva_mag,
	importo_mag, importo_2_mag, iva_mag, tot_fattura_mag,
	tot_dovuto_mag, ritenuta_mag, Cliente_giu, indirizzo_giu, cap_giu,
	descrizione_giu, descrizione_2_giu, imponibile_giu, imposta_giu,
	cliente_2_giu, città_giu, piva_giu, importo_giu, importo_2_giu,
	iva_giu, tot_fattura_giu, tot_dovuto_giu, ritenuta_giu,
	Cliente_lug, indirizzo_lug, cap_lug, descrizione_lug,
	descrizione_2_lug, imponibile_lug, imposta_lug, cliente_2_lug,
	città_lug, piva_lug, importo_lug, importo_2_lug, iva_lug,
	tot_fattura_lug, tot_dovuto_lug, ritenuta_lug, Cliente_ago,
	indirizzo_ago, cap_ago, descrizione_ago, descrizione_2_ago,
	imponibile_ago, imposta_ago, cliente_2_ago, città_ago, piva_ago,
	importo_ago, importo_2_ago, iva_ago, tot_fattura_ago,
	tot_dovuto_ago, ritenuta_ago, Cliente_set, indirizzo_set, cap_set,
	descrizione_set, descrizione_2_set, imponibile_set, imposta_set,
	cliente_2_set, città_set, piva_set, importo_set, importo_2_set,
	iva_set, tot_fattura_set, tot_dovuto_set, ritenuta_set,
	Cliente_ott, indirizzo_ott, cap_ott, descrizione_ott,
	descrizione_2_ott, imponibile_ott, imposta_ott, cliente_2_ott,
	città_ott, piva_ott, importo_ott, importo_2_ott, iva_ott,
	tot_fattura_ott, tot_dovuto_ott, ritenuta_ott, Cliente_nov,
	indirizzo_nov, cap_nov, descrizione_nov, descrizione_2_nov,
	imponibile_nov, imposta_nov, cliente_2_nov, città_nov, piva_nov,
	importo_nov, importo_2_nov, iva_nov, tot_fattura_nov,
	tot_dovuto_nov, ritenuta_nov, Cliente_dic, indirizzo_dic, cap_dic,
	descrizione_dic, descrizione_2_dic, imponibile_dic, imposta_dic,
	cliente_2_dic, città_dic, piva_dic, importo_dic, importo_2_dic,
	iva_dic, tot_fattura_dic, tot_dovuto_dic, ritenuta_dic, tot_mese,
	tot;
	private JScrollPane scrollPane_fatt,scrollPane_c_mail,scrollPane_mail;
	private JScrollPane scrollPane_fatture;
	private JPanel panel_mail;
	
	public static void main(String[] args) throws ClassNotFoundException,
	InstantiationException, IllegalAccessException,
	UnsupportedLookAndFeelException {

		Partenza window = new Partenza();

	}

	public Partenza() throws ClassNotFoundException, InstantiationException,
	IllegalAccessException, UnsupportedLookAndFeelException {

		database = new Database();
		setBounds(150, 100, 954, 504);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

		panel_home = new JPanel();
		panel_home.setLayout(null);
		panel_list = new JPanel();
		panel_list.setLayout(null);
		panel_gen = new JPanel();
		panel_gen.setLayout(null);
		panel_feb = new JPanel();
		panel_feb.setLayout(null);
		panel_mar = new JPanel();
		panel_mar.setLayout(null);
		panel_apr = new JPanel();
		panel_apr.setLayout(null);
		panel_mag = new JPanel();
		panel_mag.setLayout(null);
		panel_giu = new JPanel();
		panel_giu.setLayout(null);
		panel_lug = new JPanel();
		panel_lug.setLayout(null);
		panel_ago = new JPanel();
		panel_ago.setLayout(null);
		panel_set = new JPanel();
		panel_set.setLayout(null);
		panel_ott = new JPanel();
		panel_ott.setLayout(null);
		panel_nov = new JPanel();
		panel_nov.setLayout(null);
		panel_dic = new JPanel();
		panel_dic.setLayout(null);
		panel_el_pag = new JPanel();
		panel_el_pag.setLayout(null);
		panel_ent_usc = new JPanel();
		panel_ent_usc.setLayout(null);
		panel_fatt = new JPanel();
		panel_fatt.setLayout(null);

		// TODO tasti entrate uscite

		list_cause_uscite = new JList(cause);
		scrollPane = new JScrollPane(list_cause_uscite);
		scrollPane.setBounds(10, 11, 161, 339);
		panel_ent_usc.add(scrollPane);
		list_cause_uscite.addListSelectionListener(new ListSelection());

		list_dettagli_uscite = new JList();

		scrollPane_1 = new JScrollPane(list_dettagli_uscite);
		scrollPane_1.setBounds(179, 11, 403, 339);
		panel_ent_usc.add(scrollPane_1);
		list_dettagli_uscite.addListSelectionListener(new ListSelection());

		btnAggiungiUscita = new JButton("Aggiungi Uscita");
		btnAggiungiUscita.setBounds(677, 22, 174, 30);
		panel_ent_usc.add(btnAggiungiUscita);
		btnAggiungiUscita.addActionListener(new ButtonListener());

		JLabel lblEntrate = new JLabel("Entrate");
		lblEntrate.setBounds(622, 201, 75, 14);
		panel_ent_usc.add(lblEntrate);

		JLabel lblUscite = new JLabel("Uscite");
		lblUscite.setBounds(833, 201, 75, 14);
		panel_ent_usc.add(lblUscite);

		text_entrate = new JTextField(database.entrate_anno(gc
				.get(Calendar.YEAR)));
		text_entrate.setEditable(false);
		text_entrate.setBounds(592, 226, 122, 20);
		panel_ent_usc.add(text_entrate);
		text_entrate.setColumns(10);

		text_uscite = new JTextField();
		text_uscite.setEditable(false);
		text_uscite.setBounds(786, 226, 122, 20);
		panel_ent_usc.add(text_uscite);
		text_uscite.setColumns(10);

		btnRiepilogo = new JButton("Riepilogo");
		btnRiepilogo.setBounds(677, 108, 174, 30);
		panel_ent_usc.add(btnRiepilogo);
		btnRiepilogo.addActionListener(new ButtonListener());

		// TODO lista clienti

		list_clienti = new JList(database.elenco_clienti());
		list_clienti.addListSelectionListener(new ListSelection());

		scrollPane_2 = new JScrollPane(list_clienti);
		scrollPane_2.setBounds(546, 21, 312, 405);
		panel_list.add(scrollPane_2);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 25, 70, 14);
		panel_list.add(lblCliente);

		JLabel lblCliente_1 = new JLabel("Cliente (2)");
		lblCliente_1.setBounds(270, 25, 70, 14);
		panel_list.add(lblCliente_1);

		JLabel lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setBounds(10, 55, 70, 14);
		panel_list.add(lblIndirizzo);

		JLabel lblCitt = new JLabel("Citt\u00E0");
		lblCitt.setBounds(270, 55, 70, 14);
		panel_list.add(lblCitt);

		JLabel lblCap = new JLabel("Cap");
		lblCap.setBounds(10, 85, 46, 14);
		panel_list.add(lblCap);

		JLabel lblPiva = new JLabel("P.IVA");
		lblPiva.setBounds(270, 85, 70, 14);
		panel_list.add(lblPiva);

		JLabel lblDescrizione = new JLabel("Descrizione");
		lblDescrizione.setBounds(10, 115, 70, 14);
		panel_list.add(lblDescrizione);

		JLabel lblImporto = new JLabel("Importo");
		lblImporto.setBounds(270, 115, 70, 14);
		panel_list.add(lblImporto);

		JLabel lblDescrizione_1 = new JLabel("Descrizione (2)");
		lblDescrizione_1.setBounds(10, 145, 84, 14);
		panel_list.add(lblDescrizione_1);

		JLabel lblImporto_1 = new JLabel("Importo (2)");
		lblImporto_1.setBounds(270, 145, 78, 14);
		panel_list.add(lblImporto_1);

		JLabel lblImponibile = new JLabel("Imponibile");
		lblImponibile.setBounds(10, 175, 84, 14);
		panel_list.add(lblImponibile);

		JLabel lblIva = new JLabel("Iva");
		lblIva.setBounds(270, 175, 84, 14);
		panel_list.add(lblIva);

		JLabel lblImposta = new JLabel("Imposta");
		lblImposta.setBounds(10, 205, 92, 14);
		panel_list.add(lblImposta);

		JLabel lblTotFattura = new JLabel("Tot. Fattura");
		lblTotFattura.setBounds(270, 205, 128, 14);
		panel_list.add(lblTotFattura);

		JLabel lblRitenuta = new JLabel("Ritenuta");
		lblRitenuta.setBounds(10, 235, 78, 14);
		panel_list.add(lblRitenuta);

		JLabel lblTotDovuto = new JLabel("Tot. Dovuto");
		lblTotDovuto.setBounds(270, 235, 84, 14);
		panel_list.add(lblTotDovuto);

		text_Cliente = new JTextField();
		text_Cliente.setEditable(false);
		text_Cliente.setBorder(null);
		text_Cliente.setBounds(88, 22, 172, 20);
		panel_list.add(text_Cliente);
		text_Cliente.setColumns(10);

		text_indirizzo = new JTextField();
		text_indirizzo.setEditable(false);
		text_indirizzo.setBorder(null);
		text_indirizzo.setBounds(88, 52, 172, 20);
		panel_list.add(text_indirizzo);
		text_indirizzo.setColumns(10);

		text_cap = new JTextField();
		text_cap.setEditable(false);
		text_cap.setBorder(null);
		text_cap.setBounds(88, 82, 172, 20);
		panel_list.add(text_cap);
		text_cap.setColumns(10);

		text_descrizione = new JTextField();
		text_descrizione.setEditable(false);
		text_descrizione.setBorder(null);
		text_descrizione.setBounds(88, 112, 172, 20);
		panel_list.add(text_descrizione);
		text_descrizione.setColumns(10);

		text_descrizione_2 = new JTextField();
		text_descrizione_2.setEditable(false);
		text_descrizione_2.setBorder(null);
		text_descrizione_2.setBounds(88, 142, 172, 20);
		panel_list.add(text_descrizione_2);
		text_descrizione_2.setColumns(10);

		text_imponibile = new JTextField();
		text_imponibile.setEditable(false);
		text_imponibile.setBorder(null);
		text_imponibile.setBounds(88, 172, 172, 20);
		panel_list.add(text_imponibile);
		text_imponibile.setColumns(10);

		text_imposta = new JTextField();
		text_imposta.setEditable(false);
		text_imposta.setBorder(null);
		text_imposta.setBounds(88, 202, 172, 20);
		panel_list.add(text_imposta);
		text_imposta.setColumns(10);

		text_cliente_2 = new JTextField();
		text_cliente_2.setEditable(false);
		text_cliente_2.setBorder(null);
		text_cliente_2.setBounds(340, 22, 172, 20);
		panel_list.add(text_cliente_2);
		text_cliente_2.setColumns(10);

		text_città = new JTextField();
		text_città.setEditable(false);
		text_città.setBorder(null);
		text_città.setBounds(340, 52, 172, 20);
		panel_list.add(text_città);
		text_città.setColumns(10);

		text_piva = new JTextField();
		text_piva.setEditable(false);
		text_piva.setBorder(null);
		text_piva.setBounds(340, 82, 172, 20);
		panel_list.add(text_piva);
		text_piva.setColumns(10);

		text_importo = new JTextField();
		text_importo.setEditable(false);
		text_importo.setBorder(null);
		text_importo.setBounds(340, 112, 172, 20);
		panel_list.add(text_importo);
		text_importo.setColumns(10);

		text_importo_2 = new JTextField();
		text_importo_2.setEditable(false);
		text_importo_2.setBorder(null);
		text_importo_2.setBounds(340, 142, 172, 20);
		panel_list.add(text_importo_2);
		text_importo_2.setColumns(10);

		text_iva = new JTextField();
		text_iva.setEditable(false);
		text_iva.setBorder(null);
		text_iva.setBounds(340, 172, 172, 20);
		panel_list.add(text_iva);
		text_iva.setColumns(10);

		text_tot_fattura = new JTextField();
		text_tot_fattura.setEditable(false);
		text_tot_fattura.setBorder(null);
		text_tot_fattura.setBounds(340, 202, 172, 20);
		panel_list.add(text_tot_fattura);
		text_tot_fattura.setColumns(10);

		text_tot_dovuto = new JTextField();
		text_tot_dovuto.setEditable(false);
		text_tot_dovuto.setBorder(null);
		text_tot_dovuto.setBounds(340, 232, 172, 20);
		panel_list.add(text_tot_dovuto);
		text_tot_dovuto.setColumns(10);

		text_ritenuta = new JTextField();
		text_ritenuta.setEditable(false);
		text_ritenuta.setBorder(null);
		text_ritenuta.setBounds(180, 232, 80, 20);
		panel_list.add(text_ritenuta);
		text_ritenuta.setColumns(10);

		combo_ritenuta = new JComboBox();
		combo_ritenuta.setEnabled(false);
		combo_ritenuta.addItem("No");
		combo_ritenuta.addItem("Si");
		combo_ritenuta.setBounds(88, 232, 80, 20);
		panel_list.add(combo_ritenuta);

		combo_gen = new JComboBox();
		combo_gen.setEnabled(false);
		combo_gen.addItem("No");
		combo_gen.addItem("Si");
		combo_gen.setBounds(46, 285, 46, 20);
		panel_list.add(combo_gen);

		JLabel lblGen = new JLabel("Gen");
		lblGen.setBounds(10, 288, 46, 14);
		panel_list.add(lblGen);

		JLabel lblFeb = new JLabel("Feb");
		lblFeb.setBounds(102, 288, 46, 14);
		panel_list.add(lblFeb);

		combo_feb = new JComboBox();
		combo_feb.setEnabled(false);
		combo_feb.addItem("No");
		combo_feb.addItem("Si");
		combo_feb.setBounds(130, 285, 46, 20);
		panel_list.add(combo_feb);

		JLabel lblMar = new JLabel("Mar");
		lblMar.setBounds(187, 288, 46, 14);
		panel_list.add(lblMar);

		combo_mar = new JComboBox();
		combo_mar.setEnabled(false);
		combo_mar.addItem("No");
		combo_mar.addItem("Si");
		combo_mar.setBounds(214, 285, 46, 20);
		panel_list.add(combo_mar);

		JLabel lblApr = new JLabel("Apr");
		lblApr.setBounds(270, 288, 46, 14);
		panel_list.add(lblApr);

		combo_apr = new JComboBox();
		combo_apr.setEnabled(false);
		combo_apr.addItem("No");
		combo_apr.addItem("Si");
		combo_apr.setBounds(296, 285, 46, 20);
		panel_list.add(combo_apr);

		JLabel lblMag = new JLabel("Mag");
		lblMag.setBounds(352, 288, 46, 14);
		panel_list.add(lblMag);

		combo_mag = new JComboBox();
		combo_mag.setEnabled(false);
		combo_mag.addItem("No");
		combo_mag.addItem("Si");
		combo_mag.setBounds(380, 285, 46, 20);
		panel_list.add(combo_mag);

		JLabel lblGiu = new JLabel("Giu");
		lblGiu.setBounds(436, 288, 46, 14);
		panel_list.add(lblGiu);

		combo_giu = new JComboBox();
		combo_giu.setEnabled(false);
		combo_giu.addItem("No");
		combo_giu.addItem("Si");
		combo_giu.setBounds(464, 285, 46, 20);
		panel_list.add(combo_giu);

		combo_lug = new JComboBox();
		combo_lug.setEnabled(false);
		combo_lug.addItem("No");
		combo_lug.addItem("Si");
		combo_lug.setBounds(46, 315, 46, 20);
		panel_list.add(combo_lug);

		JLabel lblLug = new JLabel("Lug");
		lblLug.setBounds(10, 318, 46, 14);
		panel_list.add(lblLug);

		JLabel lblAgo = new JLabel("Ago");
		lblAgo.setBounds(102, 318, 46, 14);
		panel_list.add(lblAgo);

		combo_ago = new JComboBox();
		combo_ago.setEnabled(false);
		combo_ago.addItem("No");
		combo_ago.addItem("Si");
		combo_ago.setBounds(130, 315, 46, 20);
		panel_list.add(combo_ago);

		JLabel lblSet = new JLabel("Set");
		lblSet.setBounds(187, 318, 46, 14);
		panel_list.add(lblSet);

		combo_set = new JComboBox();
		combo_set.setEnabled(false);
		combo_set.addItem("No");
		combo_set.addItem("Si");
		combo_set.setBounds(214, 315, 46, 20);
		panel_list.add(combo_set);

		JLabel lblOtt = new JLabel("Ott");
		lblOtt.setBounds(270, 318, 46, 14);
		panel_list.add(lblOtt);

		combo_ott = new JComboBox();
		combo_ott.setEnabled(false);
		combo_ott.addItem("No");
		combo_ott.addItem("Si");
		combo_ott.setBounds(296, 315, 46, 20);
		panel_list.add(combo_ott);

		JLabel lblNov = new JLabel("Nov");
		lblNov.setBounds(352, 318, 46, 14);
		panel_list.add(lblNov);

		combo_nov = new JComboBox();
		combo_nov.setEnabled(false);
		combo_nov.addItem("No");
		combo_nov.addItem("Si");
		combo_nov.setBounds(380, 315, 46, 20);
		panel_list.add(combo_nov);

		JLabel lblDic = new JLabel("Dic");
		lblDic.setBounds(436, 318, 46, 14);
		panel_list.add(lblDic);

		combo_dic = new JComboBox();
		combo_dic.setEnabled(false);
		combo_dic.addItem("No");
		combo_dic.addItem("Si");
		combo_dic.setBounds(464, 315, 46, 20);
		panel_list.add(combo_dic);

		// TODO gennaio

		list_clienti_gen = new JList(database.elenco_clienti_mese("gennaio"));
		list_clienti_gen.addListSelectionListener(new ListSelection());

		scrollPane_gen = new JScrollPane(list_clienti_gen);
		scrollPane_gen.setBounds(546, 21, 312, 405);
		panel_gen.add(scrollPane_gen);

		JLabel lblCliente_gen = new JLabel("Cliente");
		lblCliente_gen.setBounds(10, 25, 70, 14);
		panel_gen.add(lblCliente_gen);

		JLabel lblCliente_gen_1 = new JLabel("Cliente (2)");
		lblCliente_gen_1.setBounds(270, 25, 70, 14);
		panel_gen.add(lblCliente_gen_1);

		JLabel lblIndirizzo_gen = new JLabel("Indirizzo");
		lblIndirizzo_gen.setBounds(10, 55, 70, 14);
		panel_gen.add(lblIndirizzo_gen);

		JLabel lblCitt_gen = new JLabel("Citt\u00E0");
		lblCitt_gen.setBounds(270, 55, 70, 14);
		panel_gen.add(lblCitt_gen);

		JLabel lblCap_gen = new JLabel("Cap");
		lblCap_gen.setBounds(10, 85, 46, 14);
		panel_gen.add(lblCap_gen);

		JLabel lblPiva_gen = new JLabel("P.IVA");
		lblPiva_gen.setBounds(270, 85, 70, 14);
		panel_gen.add(lblPiva_gen);

		JLabel lblDescrizione_gen = new JLabel("Descrizione");
		lblDescrizione_gen.setBounds(10, 115, 70, 14);
		panel_gen.add(lblDescrizione_gen);

		JLabel lblImporto_gen = new JLabel("Importo");
		lblImporto_gen.setBounds(270, 115, 70, 14);
		panel_gen.add(lblImporto_gen);

		JLabel lblDescrizione_gen_1 = new JLabel("Descrizione (2)");
		lblDescrizione_gen_1.setBounds(10, 145, 84, 14);
		panel_gen.add(lblDescrizione_gen_1);

		JLabel lblImporto_gen_1 = new JLabel("Importo (2)");
		lblImporto_gen_1.setBounds(270, 145, 78, 14);
		panel_gen.add(lblImporto_gen_1);

		JLabel lblImponibile_gen = new JLabel("Imponibile");
		lblImponibile_gen.setBounds(10, 175, 84, 14);
		panel_gen.add(lblImponibile_gen);

		JLabel lblIva_gen = new JLabel("Iva");
		lblIva_gen.setBounds(270, 175, 84, 14);
		panel_gen.add(lblIva_gen);

		JLabel lblImposta_gen = new JLabel("Imposta");
		lblImposta_gen.setBounds(10, 205, 92, 14);
		panel_gen.add(lblImposta_gen);

		JLabel lblTotFattura_gen = new JLabel("Tot. Fattura");
		lblTotFattura_gen.setBounds(270, 205, 128, 14);
		panel_gen.add(lblTotFattura_gen);

		JLabel lblRitenuta_gen = new JLabel("Ritenuta");
		lblRitenuta_gen.setBounds(10, 235, 78, 14);
		panel_gen.add(lblRitenuta_gen);

		JLabel lblTotDovuto_gen = new JLabel("Tot. Dovuto");
		lblTotDovuto_gen.setBounds(270, 235, 84, 14);
		panel_gen.add(lblTotDovuto_gen);

		Cliente_gen = new JLabel("");
		Cliente_gen.setBounds(88, 22, 172, 20);
		panel_gen.add(Cliente_gen);

		indirizzo_gen = new JLabel("");
		indirizzo_gen.setBounds(88, 52, 172, 20);
		panel_gen.add(indirizzo_gen);

		cap_gen = new JLabel("");
		cap_gen.setBounds(88, 82, 172, 20);
		panel_gen.add(cap_gen);

		descrizione_gen = new JLabel("");
		descrizione_gen.setBounds(88, 112, 172, 20);
		panel_gen.add(descrizione_gen);

		descrizione_2_gen = new JLabel("");
		descrizione_2_gen.setBounds(88, 142, 172, 20);
		panel_gen.add(descrizione_2_gen);

		imponibile_gen = new JLabel("");
		imponibile_gen.setBounds(88, 172, 172, 20);
		panel_gen.add(imponibile_gen);

		imposta_gen = new JLabel("");
		imposta_gen.setBounds(88, 202, 172, 20);
		panel_gen.add(imposta_gen);

		cliente_2_gen = new JLabel("");
		cliente_2_gen.setBounds(340, 22, 172, 20);
		panel_gen.add(cliente_2_gen);

		città_gen = new JLabel("");
		città_gen.setBounds(340, 52, 172, 20);
		panel_gen.add(città_gen);

		piva_gen = new JLabel("");
		piva_gen.setBounds(340, 82, 172, 20);
		panel_gen.add(piva_gen);

		importo_gen = new JLabel("");
		importo_gen.setBounds(340, 112, 172, 20);
		panel_gen.add(importo_gen);

		importo_2_gen = new JLabel("");
		importo_2_gen.setBounds(340, 142, 172, 20);
		panel_gen.add(importo_2_gen);

		iva_gen = new JLabel("");
		iva_gen.setBounds(340, 172, 172, 20);
		panel_gen.add(iva_gen);

		tot_fattura_gen = new JLabel("");
		tot_fattura_gen.setBounds(340, 202, 172, 20);
		panel_gen.add(tot_fattura_gen);

		tot_dovuto_gen = new JLabel("");
		tot_dovuto_gen.setBounds(340, 232, 172, 20);
		panel_gen.add(tot_dovuto_gen);

		ritenuta_gen = new JLabel("");
		ritenuta_gen.setBounds(180, 232, 80, 20);
		panel_gen.add(ritenuta_gen);

		combo_ritenuta_gen = new JComboBox();
		combo_ritenuta_gen.setEnabled(false);
		combo_ritenuta_gen.addItem("No");
		combo_ritenuta_gen.addItem("Si");
		combo_ritenuta_gen.setBounds(88, 232, 80, 20);
		panel_gen.add(combo_ritenuta_gen);

		// TODO febbraio

		list_clienti_feb = new JList(database.elenco_clienti_mese("febbraio"));
		list_clienti_feb.addListSelectionListener(new ListSelection());

		scrollPane_feb = new JScrollPane(list_clienti_feb);
		scrollPane_feb.setBounds(546, 21, 312, 405);
		panel_feb.add(scrollPane_feb);

		JLabel lblCliente_feb = new JLabel("Cliente");
		lblCliente_feb.setBounds(10, 25, 70, 14);
		panel_feb.add(lblCliente_feb);

		JLabel lblCliente_feb_1 = new JLabel("Cliente (2)");
		lblCliente_feb_1.setBounds(270, 25, 70, 14);
		panel_feb.add(lblCliente_feb_1);

		JLabel lblIndirizzo_feb = new JLabel("Indirizzo");
		lblIndirizzo_feb.setBounds(10, 55, 70, 14);
		panel_feb.add(lblIndirizzo_feb);

		JLabel lblCitt_feb = new JLabel("Citt\u00E0");
		lblCitt_feb.setBounds(270, 55, 70, 14);
		panel_feb.add(lblCitt_feb);

		JLabel lblCap_feb = new JLabel("Cap");
		lblCap_feb.setBounds(10, 85, 46, 14);
		panel_feb.add(lblCap_feb);

		JLabel lblPiva_feb = new JLabel("P.IVA");
		lblPiva_feb.setBounds(270, 85, 70, 14);
		panel_feb.add(lblPiva_feb);

		JLabel lblDescrizione_feb = new JLabel("Descrizione");
		lblDescrizione_feb.setBounds(10, 115, 70, 14);
		panel_feb.add(lblDescrizione_feb);

		JLabel lblImporto_feb = new JLabel("Importo");
		lblImporto_feb.setBounds(270, 115, 70, 14);
		panel_feb.add(lblImporto_feb);

		JLabel lblDescrizione_feb_1 = new JLabel("Descrizione (2)");
		lblDescrizione_feb_1.setBounds(10, 145, 84, 14);
		panel_feb.add(lblDescrizione_feb_1);

		JLabel lblImporto_feb_1 = new JLabel("Importo (2)");
		lblImporto_feb_1.setBounds(270, 145, 78, 14);
		panel_feb.add(lblImporto_feb_1);

		JLabel lblImponibile_feb = new JLabel("Imponibile");
		lblImponibile_feb.setBounds(10, 175, 84, 14);
		panel_feb.add(lblImponibile_feb);

		JLabel lblIva_feb = new JLabel("Iva");
		lblIva_feb.setBounds(270, 175, 84, 14);
		panel_feb.add(lblIva_feb);

		JLabel lblImposta_feb = new JLabel("Imposta");
		lblImposta_feb.setBounds(10, 205, 92, 14);
		panel_feb.add(lblImposta_feb);

		JLabel lblTotFattura_feb = new JLabel("Tot. Fattura");
		lblTotFattura_feb.setBounds(270, 205, 128, 14);
		panel_feb.add(lblTotFattura_feb);

		JLabel lblRitenuta_feb = new JLabel("Ritenuta");
		lblRitenuta_feb.setBounds(10, 235, 78, 14);
		panel_feb.add(lblRitenuta_feb);

		JLabel lblTotDovuto_feb = new JLabel("Tot. Dovuto");
		lblTotDovuto_feb.setBounds(270, 235, 84, 14);
		panel_feb.add(lblTotDovuto_feb);

		Cliente_feb = new JLabel("");
		Cliente_feb.setBounds(88, 22, 172, 20);
		panel_feb.add(Cliente_feb);

		indirizzo_feb = new JLabel("");
		indirizzo_feb.setBounds(88, 52, 172, 20);
		panel_feb.add(indirizzo_feb);

		cap_feb = new JLabel("");
		cap_feb.setBounds(88, 82, 172, 20);
		panel_feb.add(cap_feb);

		descrizione_feb = new JLabel("");
		descrizione_feb.setBounds(88, 112, 172, 20);
		panel_feb.add(descrizione_feb);

		descrizione_2_feb = new JLabel("");
		descrizione_2_feb.setBounds(88, 142, 172, 20);
		panel_feb.add(descrizione_2_feb);

		imponibile_feb = new JLabel("");
		imponibile_feb.setBounds(88, 172, 172, 20);
		panel_feb.add(imponibile_feb);

		imposta_feb = new JLabel("");
		imposta_feb.setBounds(88, 202, 172, 20);
		panel_feb.add(imposta_feb);

		cliente_2_feb = new JLabel("");
		cliente_2_feb.setBounds(340, 22, 172, 20);
		panel_feb.add(cliente_2_feb);

		città_feb = new JLabel("");
		città_feb.setBounds(340, 52, 172, 20);
		panel_feb.add(città_feb);

		piva_feb = new JLabel("");
		piva_feb.setBounds(340, 82, 172, 20);
		panel_feb.add(piva_feb);

		importo_feb = new JLabel("");
		importo_feb.setBounds(340, 112, 172, 20);
		panel_feb.add(importo_feb);

		importo_2_feb = new JLabel("");
		importo_2_feb.setBounds(340, 142, 172, 20);
		panel_feb.add(importo_2_feb);

		iva_feb = new JLabel("");
		iva_feb.setBounds(340, 172, 172, 20);
		panel_feb.add(iva_feb);

		tot_fattura_feb = new JLabel("");
		tot_fattura_feb.setBounds(340, 202, 172, 20);
		panel_feb.add(tot_fattura_feb);

		tot_dovuto_feb = new JLabel("");
		tot_dovuto_feb.setBounds(340, 232, 172, 20);
		panel_feb.add(tot_dovuto_feb);

		ritenuta_feb = new JLabel("");
		ritenuta_feb.setBounds(180, 232, 80, 20);
		panel_feb.add(ritenuta_feb);

		combo_ritenuta_feb = new JComboBox();
		combo_ritenuta_feb.setEnabled(false);
		combo_ritenuta_feb.addItem("No");
		combo_ritenuta_feb.addItem("Si");
		combo_ritenuta_feb.setBounds(88, 232, 80, 20);
		panel_feb.add(combo_ritenuta_feb);

		// TODO marzo

		list_clienti_mar = new JList(database.elenco_clienti_mese("marzo"));
		list_clienti_mar.addListSelectionListener(new ListSelection());

		scrollPane_mar = new JScrollPane(list_clienti_mar);
		scrollPane_mar.setBounds(546, 21, 312, 405);
		panel_mar.add(scrollPane_mar);

		JLabel lblCliente_mar = new JLabel("Cliente");
		lblCliente_mar.setBounds(10, 25, 70, 14);
		panel_mar.add(lblCliente_mar);

		JLabel lblCliente_mar_1 = new JLabel("Cliente (2)");
		lblCliente_mar_1.setBounds(270, 25, 70, 14);
		panel_mar.add(lblCliente_mar_1);

		JLabel lblIndirizzo_mar = new JLabel("Indirizzo");
		lblIndirizzo_mar.setBounds(10, 55, 70, 14);
		panel_mar.add(lblIndirizzo_mar);

		JLabel lblCitt_mar = new JLabel("Citt\u00E0");
		lblCitt_mar.setBounds(270, 55, 70, 14);
		panel_mar.add(lblCitt_mar);

		JLabel lblCap_mar = new JLabel("Cap");
		lblCap_mar.setBounds(10, 85, 46, 14);
		panel_mar.add(lblCap_mar);

		JLabel lblPiva_mar = new JLabel("P.IVA");
		lblPiva_mar.setBounds(270, 85, 70, 14);
		panel_mar.add(lblPiva_mar);

		JLabel lblDescrizione_mar = new JLabel("Descrizione");
		lblDescrizione_mar.setBounds(10, 115, 70, 14);
		panel_mar.add(lblDescrizione_mar);

		JLabel lblImporto_mar = new JLabel("Importo");
		lblImporto_mar.setBounds(270, 115, 70, 14);
		panel_mar.add(lblImporto_mar);

		JLabel lblDescrizione_mar_1 = new JLabel("Descrizione (2)");
		lblDescrizione_mar_1.setBounds(10, 145, 84, 14);
		panel_mar.add(lblDescrizione_mar_1);

		JLabel lblImporto_mar_1 = new JLabel("Importo (2)");
		lblImporto_mar_1.setBounds(270, 145, 78, 14);
		panel_mar.add(lblImporto_mar_1);

		JLabel lblImponibile_mar = new JLabel("Imponibile");
		lblImponibile_mar.setBounds(10, 175, 84, 14);
		panel_mar.add(lblImponibile_mar);

		JLabel lblIva_mar = new JLabel("Iva");
		lblIva_mar.setBounds(270, 175, 84, 14);
		panel_mar.add(lblIva_mar);

		JLabel lblImposta_mar = new JLabel("Imposta");
		lblImposta_mar.setBounds(10, 205, 92, 14);
		panel_mar.add(lblImposta_mar);

		JLabel lblTotFattura_mar = new JLabel("Tot. Fattura");
		lblTotFattura_mar.setBounds(270, 205, 128, 14);
		panel_mar.add(lblTotFattura_mar);

		JLabel lblRitenuta_mar = new JLabel("Ritenuta");
		lblRitenuta_mar.setBounds(10, 235, 78, 14);
		panel_mar.add(lblRitenuta_mar);

		JLabel lblTotDovuto_mar = new JLabel("Tot. Dovuto");
		lblTotDovuto_mar.setBounds(270, 235, 84, 14);
		panel_mar.add(lblTotDovuto_mar);

		Cliente_mar = new JLabel("");
		Cliente_mar.setBounds(88, 22, 172, 20);
		panel_mar.add(Cliente_mar);

		indirizzo_mar = new JLabel("");
		indirizzo_mar.setBounds(88, 52, 172, 20);
		panel_mar.add(indirizzo_mar);

		cap_mar = new JLabel("");
		cap_mar.setBounds(88, 82, 172, 20);
		panel_mar.add(cap_mar);

		descrizione_mar = new JLabel("");
		descrizione_mar.setBounds(88, 112, 172, 20);
		panel_mar.add(descrizione_mar);

		descrizione_2_mar = new JLabel("");
		descrizione_2_mar.setBounds(88, 142, 172, 20);
		panel_mar.add(descrizione_2_mar);

		imponibile_mar = new JLabel("");
		imponibile_mar.setBounds(88, 172, 172, 20);
		panel_mar.add(imponibile_mar);

		imposta_mar = new JLabel("");
		imposta_mar.setBounds(88, 202, 172, 20);
		panel_mar.add(imposta_mar);

		cliente_2_mar = new JLabel("");
		cliente_2_mar.setBounds(340, 22, 172, 20);
		panel_mar.add(cliente_2_mar);

		città_mar = new JLabel("");
		città_mar.setBounds(340, 52, 172, 20);
		panel_mar.add(città_mar);

		piva_mar = new JLabel("");
		piva_mar.setBounds(340, 82, 172, 20);
		panel_mar.add(piva_mar);

		importo_mar = new JLabel("");
		importo_mar.setBounds(340, 112, 172, 20);
		panel_mar.add(importo_mar);

		importo_2_mar = new JLabel("");
		importo_2_mar.setBounds(340, 142, 172, 20);
		panel_mar.add(importo_2_mar);

		iva_mar = new JLabel("");
		iva_mar.setBounds(340, 172, 172, 20);
		panel_mar.add(iva_mar);

		tot_fattura_mar = new JLabel("");
		tot_fattura_mar.setBounds(340, 202, 172, 20);
		panel_mar.add(tot_fattura_mar);

		tot_dovuto_mar = new JLabel("");
		tot_dovuto_mar.setBounds(340, 232, 172, 20);
		panel_mar.add(tot_dovuto_mar);

		ritenuta_mar = new JLabel("");
		ritenuta_mar.setBounds(180, 232, 80, 20);
		panel_mar.add(ritenuta_mar);

		combo_ritenuta_mar = new JComboBox();
		combo_ritenuta_mar.setEnabled(false);
		combo_ritenuta_mar.addItem("No");
		combo_ritenuta_mar.addItem("Si");
		combo_ritenuta_mar.setBounds(88, 232, 80, 20);
		panel_mar.add(combo_ritenuta_mar);

		// TODO aprile

		list_clienti_apr = new JList(database.elenco_clienti_mese("aprile"));
		list_clienti_apr.addListSelectionListener(new ListSelection());

		scrollPane_apr = new JScrollPane(list_clienti_apr);
		scrollPane_apr.setBounds(546, 21, 312, 405);
		panel_apr.add(scrollPane_apr);

		JLabel lblCliente_apr = new JLabel("Cliente");
		lblCliente_apr.setBounds(10, 25, 70, 14);
		panel_apr.add(lblCliente_apr);

		JLabel lblCliente_apr_1 = new JLabel("Cliente (2)");
		lblCliente_apr_1.setBounds(270, 25, 70, 14);
		panel_apr.add(lblCliente_apr_1);

		JLabel lblIndirizzo_apr = new JLabel("Indirizzo");
		lblIndirizzo_apr.setBounds(10, 55, 70, 14);
		panel_apr.add(lblIndirizzo_apr);

		JLabel lblCitt_apr = new JLabel("Citt\u00E0");
		lblCitt_apr.setBounds(270, 55, 70, 14);
		panel_apr.add(lblCitt_apr);

		JLabel lblCap_apr = new JLabel("Cap");
		lblCap_apr.setBounds(10, 85, 46, 14);
		panel_apr.add(lblCap_apr);

		JLabel lblPiva_apr = new JLabel("P.IVA");
		lblPiva_apr.setBounds(270, 85, 70, 14);
		panel_apr.add(lblPiva_apr);

		JLabel lblDescrizione_apr = new JLabel("Descrizione");
		lblDescrizione_apr.setBounds(10, 115, 70, 14);
		panel_apr.add(lblDescrizione_apr);

		JLabel lblImporto_apr = new JLabel("Importo");
		lblImporto_apr.setBounds(270, 115, 70, 14);
		panel_apr.add(lblImporto_apr);

		JLabel lblDescrizione_apr_1 = new JLabel("Descrizione (2)");
		lblDescrizione_apr_1.setBounds(10, 145, 84, 14);
		panel_apr.add(lblDescrizione_apr_1);

		JLabel lblImporto_apr_1 = new JLabel("Importo (2)");
		lblImporto_apr_1.setBounds(270, 145, 78, 14);
		panel_apr.add(lblImporto_apr_1);

		JLabel lblImponibile_apr = new JLabel("Imponibile");
		lblImponibile_apr.setBounds(10, 175, 84, 14);
		panel_apr.add(lblImponibile_apr);

		JLabel lblIva_apr = new JLabel("Iva");
		lblIva_apr.setBounds(270, 175, 84, 14);
		panel_apr.add(lblIva_apr);

		JLabel lblImposta_apr = new JLabel("Imposta");
		lblImposta_apr.setBounds(10, 205, 92, 14);
		panel_apr.add(lblImposta_apr);

		JLabel lblTotFattura_apr = new JLabel("Tot. Fattura");
		lblTotFattura_apr.setBounds(270, 205, 128, 14);
		panel_apr.add(lblTotFattura_apr);

		JLabel lblRitenuta_apr = new JLabel("Ritenuta");
		lblRitenuta_apr.setBounds(10, 235, 78, 14);
		panel_apr.add(lblRitenuta_apr);

		JLabel lblTotDovuto_apr = new JLabel("Tot. Dovuto");
		lblTotDovuto_apr.setBounds(270, 235, 84, 14);
		panel_apr.add(lblTotDovuto_apr);

		Cliente_apr = new JLabel("");
		Cliente_apr.setBounds(88, 22, 172, 20);
		panel_apr.add(Cliente_apr);

		indirizzo_apr = new JLabel("");
		indirizzo_apr.setBounds(88, 52, 172, 20);
		panel_apr.add(indirizzo_apr);

		cap_apr = new JLabel("");
		cap_apr.setBounds(88, 82, 172, 20);
		panel_apr.add(cap_apr);

		descrizione_apr = new JLabel("");
		descrizione_apr.setBounds(88, 112, 172, 20);
		panel_apr.add(descrizione_apr);

		descrizione_2_apr = new JLabel("");
		descrizione_2_apr.setBounds(88, 142, 172, 20);
		panel_apr.add(descrizione_2_apr);

		imponibile_apr = new JLabel("");
		imponibile_apr.setBounds(88, 172, 172, 20);
		panel_apr.add(imponibile_apr);

		imposta_apr = new JLabel("");
		imposta_apr.setBounds(88, 202, 172, 20);
		panel_apr.add(imposta_apr);

		cliente_2_apr = new JLabel("");
		cliente_2_apr.setBounds(340, 22, 172, 20);
		panel_apr.add(cliente_2_apr);

		città_apr = new JLabel("");
		città_apr.setBounds(340, 52, 172, 20);
		panel_apr.add(città_apr);

		piva_apr = new JLabel("");
		piva_apr.setBounds(340, 82, 172, 20);
		panel_apr.add(piva_apr);

		importo_apr = new JLabel("");
		importo_apr.setBounds(340, 112, 172, 20);
		panel_apr.add(importo_apr);

		importo_2_apr = new JLabel("");
		importo_2_apr.setBounds(340, 142, 172, 20);
		panel_apr.add(importo_2_apr);

		iva_apr = new JLabel("");
		iva_apr.setBounds(340, 172, 172, 20);
		panel_apr.add(iva_apr);

		tot_fattura_apr = new JLabel("");
		tot_fattura_apr.setBounds(340, 202, 172, 20);
		panel_apr.add(tot_fattura_apr);

		tot_dovuto_apr = new JLabel("");
		tot_dovuto_apr.setBounds(340, 232, 172, 20);
		panel_apr.add(tot_dovuto_apr);

		ritenuta_apr = new JLabel("");
		ritenuta_apr.setBounds(180, 232, 80, 20);
		panel_apr.add(ritenuta_apr);

		combo_ritenuta_apr = new JComboBox();
		combo_ritenuta_apr.setEnabled(false);
		combo_ritenuta_apr.addItem("No");
		combo_ritenuta_apr.addItem("Si");
		combo_ritenuta_apr.setBounds(88, 232, 80, 20);
		panel_apr.add(combo_ritenuta_apr);

		// TODO maggio

		list_clienti_mag = new JList(database.elenco_clienti_mese("maggio"));
		list_clienti_mag.addListSelectionListener(new ListSelection());

		scrollPane_mag = new JScrollPane(list_clienti_mag);
		scrollPane_mag.setBounds(546, 21, 312, 405);
		panel_mag.add(scrollPane_mag);

		JLabel lblCliente_mag = new JLabel("Cliente");
		lblCliente_mag.setBounds(10, 25, 70, 14);
		panel_mag.add(lblCliente_mag);

		JLabel lblCliente_mag_1 = new JLabel("Cliente (2)");
		lblCliente_mag_1.setBounds(270, 25, 70, 14);
		panel_mag.add(lblCliente_mag_1);

		JLabel lblIndirizzo_mag = new JLabel("Indirizzo");
		lblIndirizzo_mag.setBounds(10, 55, 70, 14);
		panel_mag.add(lblIndirizzo_mag);

		JLabel lblCitt_mag = new JLabel("Citt\u00E0");
		lblCitt_mag.setBounds(270, 55, 70, 14);
		panel_mag.add(lblCitt_mag);

		JLabel lblCap_mag = new JLabel("Cap");
		lblCap_mag.setBounds(10, 85, 46, 14);
		panel_mag.add(lblCap_mag);

		JLabel lblPiva_mag = new JLabel("P.IVA");
		lblPiva_mag.setBounds(270, 85, 70, 14);
		panel_mag.add(lblPiva_mag);

		JLabel lblDescrizione_mag = new JLabel("Descrizione");
		lblDescrizione_mag.setBounds(10, 115, 70, 14);
		panel_mag.add(lblDescrizione_mag);

		JLabel lblImporto_mag = new JLabel("Importo");
		lblImporto_mag.setBounds(270, 115, 70, 14);
		panel_mag.add(lblImporto_mag);

		JLabel lblDescrizione_mag_1 = new JLabel("Descrizione (2)");
		lblDescrizione_mag_1.setBounds(10, 145, 84, 14);
		panel_mag.add(lblDescrizione_mag_1);

		JLabel lblImporto_mag_1 = new JLabel("Importo (2)");
		lblImporto_mag_1.setBounds(270, 145, 78, 14);
		panel_mag.add(lblImporto_mag_1);

		JLabel lblImponibile_mag = new JLabel("Imponibile");
		lblImponibile_mag.setBounds(10, 175, 84, 14);
		panel_mag.add(lblImponibile_mag);

		JLabel lblIva_mag = new JLabel("Iva");
		lblIva_mag.setBounds(270, 175, 84, 14);
		panel_mag.add(lblIva_mag);

		JLabel lblImposta_mag = new JLabel("Imposta");
		lblImposta_mag.setBounds(10, 205, 92, 14);
		panel_mag.add(lblImposta_mag);

		JLabel lblTotFattura_mag = new JLabel("Tot. Fattura");
		lblTotFattura_mag.setBounds(270, 205, 128, 14);
		panel_mag.add(lblTotFattura_mag);

		JLabel lblRitenuta_mag = new JLabel("Ritenuta");
		lblRitenuta_mag.setBounds(10, 235, 78, 14);
		panel_mag.add(lblRitenuta_mag);

		JLabel lblTotDovuto_mag = new JLabel("Tot. Dovuto");
		lblTotDovuto_mag.setBounds(270, 235, 84, 14);
		panel_mag.add(lblTotDovuto_mag);

		Cliente_mag = new JLabel("");
		Cliente_mag.setBounds(88, 22, 172, 20);
		panel_mag.add(Cliente_mag);

		indirizzo_mag = new JLabel("");
		indirizzo_mag.setBounds(88, 52, 172, 20);
		panel_mag.add(indirizzo_mag);

		cap_mag = new JLabel("");
		cap_mag.setBounds(88, 82, 172, 20);
		panel_mag.add(cap_mag);

		descrizione_mag = new JLabel("");
		descrizione_mag.setBounds(88, 112, 172, 20);
		panel_mag.add(descrizione_mag);

		descrizione_2_mag = new JLabel("");
		descrizione_2_mag.setBounds(88, 142, 172, 20);
		panel_mag.add(descrizione_2_mag);

		imponibile_mag = new JLabel("");
		imponibile_mag.setBounds(88, 172, 172, 20);
		panel_mag.add(imponibile_mag);

		imposta_mag = new JLabel("");
		imposta_mag.setBounds(88, 202, 172, 20);
		panel_mag.add(imposta_mag);

		cliente_2_mag = new JLabel("");
		cliente_2_mag.setBounds(340, 22, 172, 20);
		panel_mag.add(cliente_2_mag);

		città_mag = new JLabel("");
		città_mag.setBounds(340, 52, 172, 20);
		panel_mag.add(città_mag);

		piva_mag = new JLabel("");
		piva_mag.setBounds(340, 82, 172, 20);
		panel_mag.add(piva_mag);

		importo_mag = new JLabel("");
		importo_mag.setBounds(340, 112, 172, 20);
		panel_mag.add(importo_mag);

		importo_2_mag = new JLabel("");
		importo_2_mag.setBounds(340, 142, 172, 20);
		panel_mag.add(importo_2_mag);

		iva_mag = new JLabel("");
		iva_mag.setBounds(340, 172, 172, 20);
		panel_mag.add(iva_mag);

		tot_fattura_mag = new JLabel("");
		tot_fattura_mag.setBounds(340, 202, 172, 20);
		panel_mag.add(tot_fattura_mag);

		tot_dovuto_mag = new JLabel("");
		tot_dovuto_mag.setBounds(340, 232, 172, 20);
		panel_mag.add(tot_dovuto_mag);

		ritenuta_mag = new JLabel("");
		ritenuta_mag.setBounds(180, 232, 80, 20);
		panel_mag.add(ritenuta_mag);

		combo_ritenuta_mag = new JComboBox();
		combo_ritenuta_mag.setEnabled(false);
		combo_ritenuta_mag.addItem("No");
		combo_ritenuta_mag.addItem("Si");
		combo_ritenuta_mag.setBounds(88, 232, 80, 20);
		panel_mag.add(combo_ritenuta_mag);

		// TODO giugno

		list_clienti_giu = new JList(database.elenco_clienti_mese("giugno"));
		list_clienti_giu.addListSelectionListener(new ListSelection());

		scrollPane_giu = new JScrollPane(list_clienti_giu);
		scrollPane_giu.setBounds(546, 21, 312, 405);
		panel_giu.add(scrollPane_giu);

		JLabel lblCliente_giu = new JLabel("Cliente");
		lblCliente_giu.setBounds(10, 25, 70, 14);
		panel_giu.add(lblCliente_giu);

		JLabel lblCliente_giu_1 = new JLabel("Cliente (2)");
		lblCliente_giu_1.setBounds(270, 25, 70, 14);
		panel_giu.add(lblCliente_giu_1);

		JLabel lblIndirizzo_giu = new JLabel("Indirizzo");
		lblIndirizzo_giu.setBounds(10, 55, 70, 14);
		panel_giu.add(lblIndirizzo_giu);

		JLabel lblCitt_giu = new JLabel("Citt\u00E0");
		lblCitt_giu.setBounds(270, 55, 70, 14);
		panel_giu.add(lblCitt_giu);

		JLabel lblCap_giu = new JLabel("Cap");
		lblCap_giu.setBounds(10, 85, 46, 14);
		panel_giu.add(lblCap_giu);

		JLabel lblPiva_giu = new JLabel("P.IVA");
		lblPiva_giu.setBounds(270, 85, 70, 14);
		panel_giu.add(lblPiva_giu);

		JLabel lblDescrizione_giu = new JLabel("Descrizione");
		lblDescrizione_giu.setBounds(10, 115, 70, 14);
		panel_giu.add(lblDescrizione_giu);

		JLabel lblImporto_giu = new JLabel("Importo");
		lblImporto_giu.setBounds(270, 115, 70, 14);
		panel_giu.add(lblImporto_giu);

		JLabel lblDescrizione_giu_1 = new JLabel("Descrizione (2)");
		lblDescrizione_giu_1.setBounds(10, 145, 84, 14);
		panel_giu.add(lblDescrizione_giu_1);

		JLabel lblImporto_giu_1 = new JLabel("Importo (2)");
		lblImporto_giu_1.setBounds(270, 145, 78, 14);
		panel_giu.add(lblImporto_giu_1);

		JLabel lblImponibile_giu = new JLabel("Imponibile");
		lblImponibile_giu.setBounds(10, 175, 84, 14);
		panel_giu.add(lblImponibile_giu);

		JLabel lblIva_giu = new JLabel("Iva");
		lblIva_giu.setBounds(270, 175, 84, 14);
		panel_giu.add(lblIva_giu);

		JLabel lblImposta_giu = new JLabel("Imposta");
		lblImposta_giu.setBounds(10, 205, 92, 14);
		panel_giu.add(lblImposta_giu);

		JLabel lblTotFattura_giu = new JLabel("Tot. Fattura");
		lblTotFattura_giu.setBounds(270, 205, 128, 14);
		panel_giu.add(lblTotFattura_giu);

		JLabel lblRitenuta_giu = new JLabel("Ritenuta");
		lblRitenuta_giu.setBounds(10, 235, 78, 14);
		panel_giu.add(lblRitenuta_giu);

		JLabel lblTotDovuto_giu = new JLabel("Tot. Dovuto");
		lblTotDovuto_giu.setBounds(270, 235, 84, 14);
		panel_giu.add(lblTotDovuto_giu);

		Cliente_giu = new JLabel("");
		Cliente_giu.setBounds(88, 22, 172, 20);
		panel_giu.add(Cliente_giu);

		indirizzo_giu = new JLabel("");
		indirizzo_giu.setBounds(88, 52, 172, 20);
		panel_giu.add(indirizzo_giu);

		cap_giu = new JLabel("");
		cap_giu.setBounds(88, 82, 172, 20);
		panel_giu.add(cap_giu);

		descrizione_giu = new JLabel("");
		descrizione_giu.setBounds(88, 112, 172, 20);
		panel_giu.add(descrizione_giu);

		descrizione_2_giu = new JLabel("");
		descrizione_2_giu.setBounds(88, 142, 172, 20);
		panel_giu.add(descrizione_2_giu);

		imponibile_giu = new JLabel("");
		imponibile_giu.setBounds(88, 172, 172, 20);
		panel_giu.add(imponibile_giu);

		imposta_giu = new JLabel("");
		imposta_giu.setBounds(88, 202, 172, 20);
		panel_giu.add(imposta_giu);

		cliente_2_giu = new JLabel("");
		cliente_2_giu.setBounds(340, 22, 172, 20);
		panel_giu.add(cliente_2_giu);

		città_giu = new JLabel("");
		città_giu.setBounds(340, 52, 172, 20);
		panel_giu.add(città_giu);

		piva_giu = new JLabel("");
		piva_giu.setBounds(340, 82, 172, 20);
		panel_giu.add(piva_giu);

		importo_giu = new JLabel("");
		importo_giu.setBounds(340, 112, 172, 20);
		panel_giu.add(importo_giu);

		importo_2_giu = new JLabel("");
		importo_2_giu.setBounds(340, 142, 172, 20);
		panel_giu.add(importo_2_giu);

		iva_giu = new JLabel("");
		iva_giu.setBounds(340, 172, 172, 20);
		panel_giu.add(iva_giu);

		tot_fattura_giu = new JLabel("");
		tot_fattura_giu.setBounds(340, 202, 172, 20);
		panel_giu.add(tot_fattura_giu);

		tot_dovuto_giu = new JLabel("");
		tot_dovuto_giu.setBounds(340, 232, 172, 20);
		panel_giu.add(tot_dovuto_giu);

		ritenuta_giu = new JLabel("");
		ritenuta_giu.setBounds(180, 232, 80, 20);
		panel_giu.add(ritenuta_giu);

		combo_ritenuta_giu = new JComboBox();
		combo_ritenuta_giu.setEnabled(false);
		combo_ritenuta_giu.addItem("No");
		combo_ritenuta_giu.addItem("Si");
		combo_ritenuta_giu.setBounds(88, 232, 80, 20);
		panel_giu.add(combo_ritenuta_giu);

		// TODO luglio

		list_clienti_lug = new JList(database.elenco_clienti_mese("luglio"));
		list_clienti_lug.addListSelectionListener(new ListSelection());

		scrollPane_lug = new JScrollPane(list_clienti_lug);
		scrollPane_lug.setBounds(546, 21, 312, 405);
		panel_lug.add(scrollPane_lug);

		JLabel lblCliente_lug = new JLabel("Cliente");
		lblCliente_lug.setBounds(10, 25, 70, 14);
		panel_lug.add(lblCliente_lug);

		JLabel lblCliente_lug_1 = new JLabel("Cliente (2)");
		lblCliente_lug_1.setBounds(270, 25, 70, 14);
		panel_lug.add(lblCliente_lug_1);

		JLabel lblIndirizzo_lug = new JLabel("Indirizzo");
		lblIndirizzo_lug.setBounds(10, 55, 70, 14);
		panel_lug.add(lblIndirizzo_lug);

		JLabel lblCitt_lug = new JLabel("Citt\u00E0");
		lblCitt_lug.setBounds(270, 55, 70, 14);
		panel_lug.add(lblCitt_lug);

		JLabel lblCap_lug = new JLabel("Cap");
		lblCap_lug.setBounds(10, 85, 46, 14);
		panel_lug.add(lblCap_lug);

		JLabel lblPiva_lug = new JLabel("P.IVA");
		lblPiva_lug.setBounds(270, 85, 70, 14);
		panel_lug.add(lblPiva_lug);

		JLabel lblDescrizione_lug = new JLabel("Descrizione");
		lblDescrizione_lug.setBounds(10, 115, 70, 14);
		panel_lug.add(lblDescrizione_lug);

		JLabel lblImporto_lug = new JLabel("Importo");
		lblImporto_lug.setBounds(270, 115, 70, 14);
		panel_lug.add(lblImporto_lug);

		JLabel lblDescrizione_lug_1 = new JLabel("Descrizione (2)");
		lblDescrizione_lug_1.setBounds(10, 145, 84, 14);
		panel_lug.add(lblDescrizione_lug_1);

		JLabel lblImporto_lug_1 = new JLabel("Importo (2)");
		lblImporto_lug_1.setBounds(270, 145, 78, 14);
		panel_lug.add(lblImporto_lug_1);

		JLabel lblImponibile_lug = new JLabel("Imponibile");
		lblImponibile_lug.setBounds(10, 175, 84, 14);
		panel_lug.add(lblImponibile_lug);

		JLabel lblIva_lug = new JLabel("Iva");
		lblIva_lug.setBounds(270, 175, 84, 14);
		panel_lug.add(lblIva_lug);

		JLabel lblImposta_lug = new JLabel("Imposta");
		lblImposta_lug.setBounds(10, 205, 92, 14);
		panel_lug.add(lblImposta_lug);

		JLabel lblTotFattura_lug = new JLabel("Tot. Fattura");
		lblTotFattura_lug.setBounds(270, 205, 128, 14);
		panel_lug.add(lblTotFattura_lug);

		JLabel lblRitenuta_lug = new JLabel("Ritenuta");
		lblRitenuta_lug.setBounds(10, 235, 78, 14);
		panel_lug.add(lblRitenuta_lug);

		JLabel lblTotDovuto_lug = new JLabel("Tot. Dovuto");
		lblTotDovuto_lug.setBounds(270, 235, 84, 14);
		panel_lug.add(lblTotDovuto_lug);

		Cliente_lug = new JLabel("");
		Cliente_lug.setBounds(88, 22, 172, 20);
		panel_lug.add(Cliente_lug);

		indirizzo_lug = new JLabel("");
		indirizzo_lug.setBounds(88, 52, 172, 20);
		panel_lug.add(indirizzo_lug);

		cap_lug = new JLabel("");
		cap_lug.setBounds(88, 82, 172, 20);
		panel_lug.add(cap_lug);

		descrizione_lug = new JLabel("");
		descrizione_lug.setBounds(88, 112, 172, 20);
		panel_lug.add(descrizione_lug);

		descrizione_2_lug = new JLabel("");
		descrizione_2_lug.setBounds(88, 142, 172, 20);
		panel_lug.add(descrizione_2_lug);

		imponibile_lug = new JLabel("");
		imponibile_lug.setBounds(88, 172, 172, 20);
		panel_lug.add(imponibile_lug);

		imposta_lug = new JLabel("");
		imposta_lug.setBounds(88, 202, 172, 20);
		panel_lug.add(imposta_lug);

		cliente_2_lug = new JLabel("");
		cliente_2_lug.setBounds(340, 22, 172, 20);
		panel_lug.add(cliente_2_lug);

		città_lug = new JLabel("");
		città_lug.setBounds(340, 52, 172, 20);
		panel_lug.add(città_lug);

		piva_lug = new JLabel("");
		piva_lug.setBounds(340, 82, 172, 20);
		panel_lug.add(piva_lug);

		importo_lug = new JLabel("");
		importo_lug.setBounds(340, 112, 172, 20);
		panel_lug.add(importo_lug);

		importo_2_lug = new JLabel("");
		importo_2_lug.setBounds(340, 142, 172, 20);
		panel_lug.add(importo_2_lug);

		iva_lug = new JLabel("");
		iva_lug.setBounds(340, 172, 172, 20);
		panel_lug.add(iva_lug);

		tot_fattura_lug = new JLabel("");
		tot_fattura_lug.setBounds(340, 202, 172, 20);
		panel_lug.add(tot_fattura_lug);

		tot_dovuto_lug = new JLabel("");
		tot_dovuto_lug.setBounds(340, 232, 172, 20);
		panel_lug.add(tot_dovuto_lug);

		ritenuta_lug = new JLabel("");
		ritenuta_lug.setBounds(180, 232, 80, 20);
		panel_lug.add(ritenuta_lug);

		combo_ritenuta_lug = new JComboBox();
		combo_ritenuta_lug.setEnabled(false);
		combo_ritenuta_lug.addItem("No");
		combo_ritenuta_lug.addItem("Si");
		combo_ritenuta_lug.setBounds(88, 232, 80, 20);
		panel_lug.add(combo_ritenuta_lug);

		// TODO agosto

		list_clienti_ago = new JList(database.elenco_clienti_mese("agosto"));
		list_clienti_ago.addListSelectionListener(new ListSelection());

		scrollPane_ago = new JScrollPane(list_clienti_ago);
		scrollPane_ago.setBounds(546, 21, 312, 405);
		panel_ago.add(scrollPane_ago);

		JLabel lblCliente_ago = new JLabel("Cliente");
		lblCliente_ago.setBounds(10, 25, 70, 14);
		panel_ago.add(lblCliente_ago);

		JLabel lblCliente_ago_1 = new JLabel("Cliente (2)");
		lblCliente_ago_1.setBounds(270, 25, 70, 14);
		panel_ago.add(lblCliente_ago_1);

		JLabel lblIndirizzo_ago = new JLabel("Indirizzo");
		lblIndirizzo_ago.setBounds(10, 55, 70, 14);
		panel_ago.add(lblIndirizzo_ago);

		JLabel lblCitt_ago = new JLabel("Citt\u00E0");
		lblCitt_ago.setBounds(270, 55, 70, 14);
		panel_ago.add(lblCitt_ago);

		JLabel lblCap_ago = new JLabel("Cap");
		lblCap_ago.setBounds(10, 85, 46, 14);
		panel_ago.add(lblCap_ago);

		JLabel lblPiva_ago = new JLabel("P.IVA");
		lblPiva_ago.setBounds(270, 85, 70, 14);
		panel_ago.add(lblPiva_ago);

		JLabel lblDescrizione_ago = new JLabel("Descrizione");
		lblDescrizione_ago.setBounds(10, 115, 70, 14);
		panel_ago.add(lblDescrizione_ago);

		JLabel lblImporto_ago = new JLabel("Importo");
		lblImporto_ago.setBounds(270, 115, 70, 14);
		panel_ago.add(lblImporto_ago);

		JLabel lblDescrizione_ago_1 = new JLabel("Descrizione (2)");
		lblDescrizione_ago_1.setBounds(10, 145, 84, 14);
		panel_ago.add(lblDescrizione_ago_1);

		JLabel lblImporto_ago_1 = new JLabel("Importo (2)");
		lblImporto_ago_1.setBounds(270, 145, 78, 14);
		panel_ago.add(lblImporto_ago_1);

		JLabel lblImponibile_ago = new JLabel("Imponibile");
		lblImponibile_ago.setBounds(10, 175, 84, 14);
		panel_ago.add(lblImponibile_ago);

		JLabel lblIva_ago = new JLabel("Iva");
		lblIva_ago.setBounds(270, 175, 84, 14);
		panel_ago.add(lblIva_ago);

		JLabel lblImposta_ago = new JLabel("Imposta");
		lblImposta_ago.setBounds(10, 205, 92, 14);
		panel_ago.add(lblImposta_ago);

		JLabel lblTotFattura_ago = new JLabel("Tot. Fattura");
		lblTotFattura_ago.setBounds(270, 205, 128, 14);
		panel_ago.add(lblTotFattura_ago);

		JLabel lblRitenuta_ago = new JLabel("Ritenuta");
		lblRitenuta_ago.setBounds(10, 235, 78, 14);
		panel_ago.add(lblRitenuta_ago);

		JLabel lblTotDovuto_ago = new JLabel("Tot. Dovuto");
		lblTotDovuto_ago.setBounds(270, 235, 84, 14);
		panel_ago.add(lblTotDovuto_ago);

		Cliente_ago = new JLabel("");
		Cliente_ago.setBounds(88, 22, 172, 20);
		panel_ago.add(Cliente_ago);

		indirizzo_ago = new JLabel("");
		indirizzo_ago.setBounds(88, 52, 172, 20);
		panel_ago.add(indirizzo_ago);

		cap_ago = new JLabel("");
		cap_ago.setBounds(88, 82, 172, 20);
		panel_ago.add(cap_ago);

		descrizione_ago = new JLabel("");
		descrizione_ago.setBounds(88, 112, 172, 20);
		panel_ago.add(descrizione_ago);

		descrizione_2_ago = new JLabel("");
		descrizione_2_ago.setBounds(88, 142, 172, 20);
		panel_ago.add(descrizione_2_ago);

		imponibile_ago = new JLabel("");
		imponibile_ago.setBounds(88, 172, 172, 20);
		panel_ago.add(imponibile_ago);

		imposta_ago = new JLabel("");
		imposta_ago.setBounds(88, 202, 172, 20);
		panel_ago.add(imposta_ago);

		cliente_2_ago = new JLabel("");
		cliente_2_ago.setBounds(340, 22, 172, 20);
		panel_ago.add(cliente_2_ago);

		città_ago = new JLabel("");
		città_ago.setBounds(340, 52, 172, 20);
		panel_ago.add(città_ago);

		piva_ago = new JLabel("");
		piva_ago.setBounds(340, 82, 172, 20);
		panel_ago.add(piva_ago);

		importo_ago = new JLabel("");
		importo_ago.setBounds(340, 112, 172, 20);
		panel_ago.add(importo_ago);

		importo_2_ago = new JLabel("");
		importo_2_ago.setBounds(340, 142, 172, 20);
		panel_ago.add(importo_2_ago);

		iva_ago = new JLabel("");
		iva_ago.setBounds(340, 172, 172, 20);
		panel_ago.add(iva_ago);

		tot_fattura_ago = new JLabel("");
		tot_fattura_ago.setBounds(340, 202, 172, 20);
		panel_ago.add(tot_fattura_ago);

		tot_dovuto_ago = new JLabel("");
		tot_dovuto_ago.setBounds(340, 232, 172, 20);
		panel_ago.add(tot_dovuto_ago);

		ritenuta_ago = new JLabel("");
		ritenuta_ago.setBounds(180, 232, 80, 20);
		panel_ago.add(ritenuta_ago);

		combo_ritenuta_ago = new JComboBox();
		combo_ritenuta_ago.setEnabled(false);
		combo_ritenuta_ago.addItem("No");
		combo_ritenuta_ago.addItem("Si");
		combo_ritenuta_ago.setBounds(88, 232, 80, 20);
		panel_ago.add(combo_ritenuta_ago);

		// TODO settembre

		list_clienti_set = new JList(database.elenco_clienti_mese("settembre"));
		list_clienti_set.addListSelectionListener(new ListSelection());

		scrollPane_set = new JScrollPane(list_clienti_set);
		scrollPane_set.setBounds(546, 21, 312, 405);
		panel_set.add(scrollPane_set);

		JLabel lblCliente_set = new JLabel("Cliente");
		lblCliente_set.setBounds(10, 25, 70, 14);
		panel_set.add(lblCliente_set);

		JLabel lblCliente_set_1 = new JLabel("Cliente (2)");
		lblCliente_set_1.setBounds(270, 25, 70, 14);
		panel_set.add(lblCliente_set_1);

		JLabel lblIndirizzo_set = new JLabel("Indirizzo");
		lblIndirizzo_set.setBounds(10, 55, 70, 14);
		panel_set.add(lblIndirizzo_set);

		JLabel lblCitt_set = new JLabel("Citt\u00E0");
		lblCitt_set.setBounds(270, 55, 70, 14);
		panel_set.add(lblCitt_set);

		JLabel lblCap_set = new JLabel("Cap");
		lblCap_set.setBounds(10, 85, 46, 14);
		panel_set.add(lblCap_set);

		JLabel lblPiva_set = new JLabel("P.IVA");
		lblPiva_set.setBounds(270, 85, 70, 14);
		panel_set.add(lblPiva_set);

		JLabel lblDescrizione_set = new JLabel("Descrizione");
		lblDescrizione_set.setBounds(10, 115, 70, 14);
		panel_set.add(lblDescrizione_set);

		JLabel lblImporto_set = new JLabel("Importo");
		lblImporto_set.setBounds(270, 115, 70, 14);
		panel_set.add(lblImporto_set);

		JLabel lblDescrizione_set_1 = new JLabel("Descrizione (2)");
		lblDescrizione_set_1.setBounds(10, 145, 84, 14);
		panel_set.add(lblDescrizione_set_1);

		JLabel lblImporto_set_1 = new JLabel("Importo (2)");
		lblImporto_set_1.setBounds(270, 145, 78, 14);
		panel_set.add(lblImporto_set_1);

		JLabel lblImponibile_set = new JLabel("Imponibile");
		lblImponibile_set.setBounds(10, 175, 84, 14);
		panel_set.add(lblImponibile_set);

		JLabel lblIva_set = new JLabel("Iva");
		lblIva_set.setBounds(270, 175, 84, 14);
		panel_set.add(lblIva_set);

		JLabel lblImposta_set = new JLabel("Imposta");
		lblImposta_set.setBounds(10, 205, 92, 14);
		panel_set.add(lblImposta_set);

		JLabel lblTotFattura_set = new JLabel("Tot. Fattura");
		lblTotFattura_set.setBounds(270, 205, 128, 14);
		panel_set.add(lblTotFattura_set);

		JLabel lblRitenuta_set = new JLabel("Ritenuta");
		lblRitenuta_set.setBounds(10, 235, 78, 14);
		panel_set.add(lblRitenuta_set);

		JLabel lblTotDovuto_set = new JLabel("Tot. Dovuto");
		lblTotDovuto_set.setBounds(270, 235, 84, 14);
		panel_set.add(lblTotDovuto_set);

		Cliente_set = new JLabel("");
		Cliente_set.setBounds(88, 22, 172, 20);
		panel_set.add(Cliente_set);

		indirizzo_set = new JLabel("");
		indirizzo_set.setBounds(88, 52, 172, 20);
		panel_set.add(indirizzo_set);

		cap_set = new JLabel("");
		cap_set.setBounds(88, 82, 172, 20);
		panel_set.add(cap_set);

		descrizione_set = new JLabel("");
		descrizione_set.setBounds(88, 112, 172, 20);
		panel_set.add(descrizione_set);

		descrizione_2_set = new JLabel("");
		descrizione_2_set.setBounds(88, 142, 172, 20);
		panel_set.add(descrizione_2_set);

		imponibile_set = new JLabel("");
		imponibile_set.setBounds(88, 172, 172, 20);
		panel_set.add(imponibile_set);

		imposta_set = new JLabel("");
		imposta_set.setBounds(88, 202, 172, 20);
		panel_set.add(imposta_set);

		cliente_2_set = new JLabel("");
		cliente_2_set.setBounds(340, 22, 172, 20);
		panel_set.add(cliente_2_set);

		città_set = new JLabel("");
		città_set.setBounds(340, 52, 172, 20);
		panel_set.add(città_set);

		piva_set = new JLabel("");
		piva_set.setBounds(340, 82, 172, 20);
		panel_set.add(piva_set);

		importo_set = new JLabel("");
		importo_set.setBounds(340, 112, 172, 20);
		panel_set.add(importo_set);

		importo_2_set = new JLabel("");
		importo_2_set.setBounds(340, 142, 172, 20);
		panel_set.add(importo_2_set);

		iva_set = new JLabel("");
		iva_set.setBounds(340, 172, 172, 20);
		panel_set.add(iva_set);

		tot_fattura_set = new JLabel("");
		tot_fattura_set.setBounds(340, 202, 172, 20);
		panel_set.add(tot_fattura_set);

		tot_dovuto_set = new JLabel("");
		tot_dovuto_set.setBounds(340, 232, 172, 20);
		panel_set.add(tot_dovuto_set);

		ritenuta_set = new JLabel("");
		ritenuta_set.setBounds(180, 232, 80, 20);
		panel_set.add(ritenuta_set);

		combo_ritenuta_set = new JComboBox();
		combo_ritenuta_set.setEnabled(false);
		combo_ritenuta_set.addItem("No");
		combo_ritenuta_set.addItem("Si");
		combo_ritenuta_set.setBounds(88, 232, 80, 20);
		panel_set.add(combo_ritenuta_set);

		// TODO ottobre

		list_clienti_ott = new JList(database.elenco_clienti_mese("ottobre"));
		list_clienti_ott.addListSelectionListener(new ListSelection());

		scrollPane_ott = new JScrollPane(list_clienti_ott);
		scrollPane_ott.setBounds(546, 21, 312, 405);
		panel_ott.add(scrollPane_ott);

		JLabel lblCliente_ott = new JLabel("Cliente");
		lblCliente_ott.setBounds(10, 25, 70, 14);
		panel_ott.add(lblCliente_ott);

		JLabel lblCliente_ott_1 = new JLabel("Cliente (2)");
		lblCliente_ott_1.setBounds(270, 25, 70, 14);
		panel_ott.add(lblCliente_ott_1);

		JLabel lblIndirizzo_ott = new JLabel("Indirizzo");
		lblIndirizzo_ott.setBounds(10, 55, 70, 14);
		panel_ott.add(lblIndirizzo_ott);

		JLabel lblCitt_ott = new JLabel("Citt\u00E0");
		lblCitt_ott.setBounds(270, 55, 70, 14);
		panel_ott.add(lblCitt_ott);

		JLabel lblCap_ott = new JLabel("Cap");
		lblCap_ott.setBounds(10, 85, 46, 14);
		panel_ott.add(lblCap_ott);

		JLabel lblPiva_ott = new JLabel("P.IVA");
		lblPiva_ott.setBounds(270, 85, 70, 14);
		panel_ott.add(lblPiva_ott);

		JLabel lblDescrizione_ott = new JLabel("Descrizione");
		lblDescrizione_ott.setBounds(10, 115, 70, 14);
		panel_ott.add(lblDescrizione_ott);

		JLabel lblImporto_ott = new JLabel("Importo");
		lblImporto_ott.setBounds(270, 115, 70, 14);
		panel_ott.add(lblImporto_ott);

		JLabel lblDescrizione_ott_1 = new JLabel("Descrizione (2)");
		lblDescrizione_ott_1.setBounds(10, 145, 84, 14);
		panel_ott.add(lblDescrizione_ott_1);

		JLabel lblImporto_ott_1 = new JLabel("Importo (2)");
		lblImporto_ott_1.setBounds(270, 145, 78, 14);
		panel_ott.add(lblImporto_ott_1);

		JLabel lblImponibile_ott = new JLabel("Imponibile");
		lblImponibile_ott.setBounds(10, 175, 84, 14);
		panel_ott.add(lblImponibile_ott);

		JLabel lblIva_ott = new JLabel("Iva");
		lblIva_ott.setBounds(270, 175, 84, 14);
		panel_ott.add(lblIva_ott);

		JLabel lblImposta_ott = new JLabel("Imposta");
		lblImposta_ott.setBounds(10, 205, 92, 14);
		panel_ott.add(lblImposta_ott);

		JLabel lblTotFattura_ott = new JLabel("Tot. Fattura");
		lblTotFattura_ott.setBounds(270, 205, 128, 14);
		panel_ott.add(lblTotFattura_ott);

		JLabel lblRitenuta_ott = new JLabel("Ritenuta");
		lblRitenuta_ott.setBounds(10, 235, 78, 14);
		panel_ott.add(lblRitenuta_ott);

		JLabel lblTotDovuto_ott = new JLabel("Tot. Dovuto");
		lblTotDovuto_ott.setBounds(270, 235, 84, 14);
		panel_ott.add(lblTotDovuto_ott);

		Cliente_ott = new JLabel("");
		Cliente_ott.setBounds(88, 22, 172, 20);
		panel_ott.add(Cliente_ott);

		indirizzo_ott = new JLabel("");
		indirizzo_ott.setBounds(88, 52, 172, 20);
		panel_ott.add(indirizzo_ott);

		cap_ott = new JLabel("");
		cap_ott.setBounds(88, 82, 172, 20);
		panel_ott.add(cap_ott);

		descrizione_ott = new JLabel("");
		descrizione_ott.setBounds(88, 112, 172, 20);
		panel_ott.add(descrizione_ott);

		descrizione_2_ott = new JLabel("");
		descrizione_2_ott.setBounds(88, 142, 172, 20);
		panel_ott.add(descrizione_2_ott);

		imponibile_ott = new JLabel("");
		imponibile_ott.setBounds(88, 172, 172, 20);
		panel_ott.add(imponibile_ott);

		imposta_ott = new JLabel("");
		imposta_ott.setBounds(88, 202, 172, 20);
		panel_ott.add(imposta_ott);

		cliente_2_ott = new JLabel("");
		cliente_2_ott.setBounds(340, 22, 172, 20);
		panel_ott.add(cliente_2_ott);

		città_ott = new JLabel("");
		città_ott.setBounds(340, 52, 172, 20);
		panel_ott.add(città_ott);

		piva_ott = new JLabel("");
		piva_ott.setBounds(340, 82, 172, 20);
		panel_ott.add(piva_ott);

		importo_ott = new JLabel("");
		importo_ott.setBounds(340, 112, 172, 20);
		panel_ott.add(importo_ott);

		importo_2_ott = new JLabel("");
		importo_2_ott.setBounds(340, 142, 172, 20);
		panel_ott.add(importo_2_ott);

		iva_ott = new JLabel("");
		iva_ott.setBounds(340, 172, 172, 20);
		panel_ott.add(iva_ott);

		tot_fattura_ott = new JLabel("");
		tot_fattura_ott.setBounds(340, 202, 172, 20);
		panel_ott.add(tot_fattura_ott);

		tot_dovuto_ott = new JLabel("");
		tot_dovuto_ott.setBounds(340, 232, 172, 20);
		panel_ott.add(tot_dovuto_ott);

		ritenuta_ott = new JLabel("");
		ritenuta_ott.setBounds(180, 232, 80, 20);
		panel_ott.add(ritenuta_ott);

		combo_ritenuta_ott = new JComboBox();
		combo_ritenuta_ott.setEnabled(false);
		combo_ritenuta_ott.addItem("No");
		combo_ritenuta_ott.addItem("Si");
		combo_ritenuta_ott.setBounds(88, 232, 80, 20);
		panel_ott.add(combo_ritenuta_ott);

		// TODO novembre

		list_clienti_nov = new JList(database.elenco_clienti_mese("novembre"));
		list_clienti_nov.addListSelectionListener(new ListSelection());

		scrollPane_nov = new JScrollPane(list_clienti_nov);
		scrollPane_nov.setBounds(546, 21, 312, 405);
		panel_nov.add(scrollPane_nov);

		JLabel lblCliente_nov = new JLabel("Cliente");
		lblCliente_nov.setBounds(10, 25, 70, 14);
		panel_nov.add(lblCliente_nov);

		JLabel lblCliente_nov_1 = new JLabel("Cliente (2)");
		lblCliente_nov_1.setBounds(270, 25, 70, 14);
		panel_nov.add(lblCliente_nov_1);

		JLabel lblIndirizzo_nov = new JLabel("Indirizzo");
		lblIndirizzo_nov.setBounds(10, 55, 70, 14);
		panel_nov.add(lblIndirizzo_nov);

		JLabel lblCitt_nov = new JLabel("Citt\u00E0");
		lblCitt_nov.setBounds(270, 55, 70, 14);
		panel_nov.add(lblCitt_nov);

		JLabel lblCap_nov = new JLabel("Cap");
		lblCap_nov.setBounds(10, 85, 46, 14);
		panel_nov.add(lblCap_nov);

		JLabel lblPiva_nov = new JLabel("P.IVA");
		lblPiva_nov.setBounds(270, 85, 70, 14);
		panel_nov.add(lblPiva_nov);

		JLabel lblDescrizione_nov = new JLabel("Descrizione");
		lblDescrizione_nov.setBounds(10, 115, 70, 14);
		panel_nov.add(lblDescrizione_nov);

		JLabel lblImporto_nov = new JLabel("Importo");
		lblImporto_nov.setBounds(270, 115, 70, 14);
		panel_nov.add(lblImporto_nov);

		JLabel lblDescrizione_nov_1 = new JLabel("Descrizione (2)");
		lblDescrizione_nov_1.setBounds(10, 145, 84, 14);
		panel_nov.add(lblDescrizione_nov_1);

		JLabel lblImporto_nov_1 = new JLabel("Importo (2)");
		lblImporto_nov_1.setBounds(270, 145, 78, 14);
		panel_nov.add(lblImporto_nov_1);

		JLabel lblImponibile_nov = new JLabel("Imponibile");
		lblImponibile_nov.setBounds(10, 175, 84, 14);
		panel_nov.add(lblImponibile_nov);

		JLabel lblIva_nov = new JLabel("Iva");
		lblIva_nov.setBounds(270, 175, 84, 14);
		panel_nov.add(lblIva_nov);

		JLabel lblImposta_nov = new JLabel("Imposta");
		lblImposta_nov.setBounds(10, 205, 92, 14);
		panel_nov.add(lblImposta_nov);

		JLabel lblTotFattura_nov = new JLabel("Tot. Fattura");
		lblTotFattura_nov.setBounds(270, 205, 128, 14);
		panel_nov.add(lblTotFattura_nov);

		JLabel lblRitenuta_nov = new JLabel("Ritenuta");
		lblRitenuta_nov.setBounds(10, 235, 78, 14);
		panel_nov.add(lblRitenuta_nov);

		JLabel lblTotDovuto_nov = new JLabel("Tot. Dovuto");
		lblTotDovuto_nov.setBounds(270, 235, 84, 14);
		panel_nov.add(lblTotDovuto_nov);

		Cliente_nov = new JLabel("");
		Cliente_nov.setBounds(88, 22, 172, 20);
		panel_nov.add(Cliente_nov);

		indirizzo_nov = new JLabel("");
		indirizzo_nov.setBounds(88, 52, 172, 20);
		panel_nov.add(indirizzo_nov);

		cap_nov = new JLabel("");
		cap_nov.setBounds(88, 82, 172, 20);
		panel_nov.add(cap_nov);

		descrizione_nov = new JLabel("");
		descrizione_nov.setBounds(88, 112, 172, 20);
		panel_nov.add(descrizione_nov);

		descrizione_2_nov = new JLabel("");
		descrizione_2_nov.setBounds(88, 142, 172, 20);
		panel_nov.add(descrizione_2_nov);

		imponibile_nov = new JLabel("");
		imponibile_nov.setBounds(88, 172, 172, 20);
		panel_nov.add(imponibile_nov);

		imposta_nov = new JLabel("");
		imposta_nov.setBounds(88, 202, 172, 20);
		panel_nov.add(imposta_nov);

		cliente_2_nov = new JLabel("");
		cliente_2_nov.setBounds(340, 22, 172, 20);
		panel_nov.add(cliente_2_nov);

		città_nov = new JLabel("");
		città_nov.setBounds(340, 52, 172, 20);
		panel_nov.add(città_nov);

		piva_nov = new JLabel("");
		piva_nov.setBounds(340, 82, 172, 20);
		panel_nov.add(piva_nov);

		importo_nov = new JLabel("");
		importo_nov.setBounds(340, 112, 172, 20);
		panel_nov.add(importo_nov);

		importo_2_nov = new JLabel("");
		importo_2_nov.setBounds(340, 142, 172, 20);
		panel_nov.add(importo_2_nov);

		iva_nov = new JLabel("");
		iva_nov.setBounds(340, 172, 172, 20);
		panel_nov.add(iva_nov);

		tot_fattura_nov = new JLabel("");
		tot_fattura_nov.setBounds(340, 202, 172, 20);
		panel_nov.add(tot_fattura_nov);

		tot_dovuto_nov = new JLabel("");
		tot_dovuto_nov.setBounds(340, 232, 172, 20);
		panel_nov.add(tot_dovuto_nov);

		ritenuta_nov = new JLabel("");
		ritenuta_nov.setBounds(180, 232, 80, 20);
		panel_nov.add(ritenuta_nov);

		combo_ritenuta_nov = new JComboBox();
		combo_ritenuta_nov.setEnabled(false);
		combo_ritenuta_nov.addItem("No");
		combo_ritenuta_nov.addItem("Si");
		combo_ritenuta_nov.setBounds(88, 232, 80, 20);
		panel_nov.add(combo_ritenuta_nov);

		// TODO dicembre

		list_clienti_dic = new JList(database.elenco_clienti_mese("dicembre"));
		list_clienti_dic.addListSelectionListener(new ListSelection());

		scrollPane_dic = new JScrollPane(list_clienti_dic);
		scrollPane_dic.setBounds(546, 21, 312, 405);
		panel_dic.add(scrollPane_dic);

		JLabel lblCliente_dic = new JLabel("Cliente");
		lblCliente_dic.setBounds(10, 25, 70, 14);
		panel_dic.add(lblCliente_dic);

		JLabel lblCliente_dic_1 = new JLabel("Cliente (2)");
		lblCliente_dic_1.setBounds(270, 25, 70, 14);
		panel_dic.add(lblCliente_dic_1);

		JLabel lblIndirizzo_dic = new JLabel("Indirizzo");
		lblIndirizzo_dic.setBounds(10, 55, 70, 14);
		panel_dic.add(lblIndirizzo_dic);

		JLabel lblCitt_dic = new JLabel("Citt\u00E0");
		lblCitt_dic.setBounds(270, 55, 70, 14);
		panel_dic.add(lblCitt_dic);

		JLabel lblCap_dic = new JLabel("Cap");
		lblCap_dic.setBounds(10, 85, 46, 14);
		panel_dic.add(lblCap_dic);

		JLabel lblPiva_dic = new JLabel("P.IVA");
		lblPiva_dic.setBounds(270, 85, 70, 14);
		panel_dic.add(lblPiva_dic);

		JLabel lblDescrizione_dic = new JLabel("Descrizione");
		lblDescrizione_dic.setBounds(10, 115, 70, 14);
		panel_dic.add(lblDescrizione_dic);

		JLabel lblImporto_dic = new JLabel("Importo");
		lblImporto_dic.setBounds(270, 115, 70, 14);
		panel_dic.add(lblImporto_dic);

		JLabel lblDescrizione_dic_1 = new JLabel("Descrizione (2)");
		lblDescrizione_dic_1.setBounds(10, 145, 84, 14);
		panel_dic.add(lblDescrizione_dic_1);

		JLabel lblImporto_dic_1 = new JLabel("Importo (2)");
		lblImporto_dic_1.setBounds(270, 145, 78, 14);
		panel_dic.add(lblImporto_dic_1);

		JLabel lblImponibile_dic = new JLabel("Imponibile");
		lblImponibile_dic.setBounds(10, 175, 84, 14);
		panel_dic.add(lblImponibile_dic);

		JLabel lblIva_dic = new JLabel("Iva");
		lblIva_dic.setBounds(270, 175, 84, 14);
		panel_dic.add(lblIva_dic);

		JLabel lblImposta_dic = new JLabel("Imposta");
		lblImposta_dic.setBounds(10, 205, 92, 14);
		panel_dic.add(lblImposta_dic);

		JLabel lblTotFattura_dic = new JLabel("Tot. Fattura");
		lblTotFattura_dic.setBounds(270, 205, 128, 14);
		panel_dic.add(lblTotFattura_dic);

		JLabel lblRitenuta_dic = new JLabel("Ritenuta");
		lblRitenuta_dic.setBounds(10, 235, 78, 14);
		panel_dic.add(lblRitenuta_dic);

		JLabel lblTotDovuto_dic = new JLabel("Tot. Dovuto");
		lblTotDovuto_dic.setBounds(270, 235, 84, 14);
		panel_dic.add(lblTotDovuto_dic);

		Cliente_dic = new JLabel("");
		Cliente_dic.setBounds(88, 22, 172, 20);
		panel_dic.add(Cliente_dic);

		indirizzo_dic = new JLabel("");
		indirizzo_dic.setBounds(88, 52, 172, 20);
		panel_dic.add(indirizzo_dic);

		cap_dic = new JLabel("");
		cap_dic.setBounds(88, 82, 172, 20);
		panel_dic.add(cap_dic);

		descrizione_dic = new JLabel("");
		descrizione_dic.setBounds(88, 112, 172, 20);
		panel_dic.add(descrizione_dic);

		descrizione_2_dic = new JLabel("");
		descrizione_2_dic.setBounds(88, 142, 172, 20);
		panel_dic.add(descrizione_2_dic);

		imponibile_dic = new JLabel("");
		imponibile_dic.setBounds(88, 172, 172, 20);
		panel_dic.add(imponibile_dic);

		imposta_dic = new JLabel("");
		imposta_dic.setBounds(88, 202, 172, 20);
		panel_dic.add(imposta_dic);

		cliente_2_dic = new JLabel("");
		cliente_2_dic.setBounds(340, 22, 172, 20);
		panel_dic.add(cliente_2_dic);

		città_dic = new JLabel("");
		città_dic.setBounds(340, 52, 172, 20);
		panel_dic.add(città_dic);

		piva_dic = new JLabel("");
		piva_dic.setBounds(340, 82, 172, 20);
		panel_dic.add(piva_dic);

		importo_dic = new JLabel("");
		importo_dic.setBounds(340, 112, 172, 20);
		panel_dic.add(importo_dic);

		importo_2_dic = new JLabel("");
		importo_2_dic.setBounds(340, 142, 172, 20);
		panel_dic.add(importo_2_dic);

		iva_dic = new JLabel("");
		iva_dic.setBounds(340, 172, 172, 20);
		panel_dic.add(iva_dic);

		tot_fattura_dic = new JLabel("");
		tot_fattura_dic.setBounds(340, 202, 172, 20);
		panel_dic.add(tot_fattura_dic);

		tot_dovuto_dic = new JLabel("");
		tot_dovuto_dic.setBounds(340, 232, 172, 20);
		panel_dic.add(tot_dovuto_dic);

		ritenuta_dic = new JLabel("");
		ritenuta_dic.setBounds(180, 232, 80, 20);
		panel_dic.add(ritenuta_dic);

		combo_ritenuta_dic = new JComboBox();
		combo_ritenuta_dic.setEnabled(false);
		combo_ritenuta_dic.addItem("No");
		combo_ritenuta_dic.addItem("Si");
		combo_ritenuta_dic.setBounds(88, 232, 80, 20);
		panel_dic.add(combo_ritenuta_dic);

		// TODO elenco paganti

		combo_mese_pag = new JComboBox();

		combo_mese_pag.setBounds(40, 37, 199, 25);
		combo_mese_pag.addItem("Gennaio");
		combo_mese_pag.addItem("Febbraio");
		combo_mese_pag.addItem("Marzo");
		combo_mese_pag.addItem("Aprile");
		combo_mese_pag.addItem("Maggio");
		combo_mese_pag.addItem("Giugno");
		combo_mese_pag.addItem("Luglio");
		combo_mese_pag.addItem("Agosto");
		combo_mese_pag.addItem("Settembre");
		combo_mese_pag.addItem("Ottobre");
		combo_mese_pag.addItem("Novembre");
		combo_mese_pag.addItem("Dicembre");

		panel_el_pag.add(combo_mese_pag);

		combo_anno_pag = new JComboBox();
		combo_anno_pag.setBounds(40, 73, 199, 25);
		combo_anno_pag.addItem("2014");
		combo_anno_pag.addItem("2015");
		combo_anno_pag.addItem("2016");
		combo_anno_pag.addItem("2017");
		combo_anno_pag.addItem("2018");
		combo_anno_pag.addItem("2019");
		combo_anno_pag.addItem("2020");
		combo_anno_pag.addItem("2021");
		combo_anno_pag.addItem("2022");
		combo_anno_pag.addItem("2023");
		combo_anno_pag.addItem("2024");
		combo_anno_pag.addItem("2025");
		combo_anno_pag.addItem("2026");
		combo_anno_pag.addItem("2027");
		combo_anno_pag.addItem("2028");
		combo_anno_pag.addItem("2029");
		combo_anno_pag.addItem("2030");
		combo_anno_pag.addItem("2031");
		combo_anno_pag.addItem("2032");
		combo_anno_pag.addItem("2033");
		combo_anno_pag.addItem("2034");
		combo_anno_pag.addItem("2035");
		combo_anno_pag.addItem("2036");
		combo_anno_pag.addItem("2037");
		combo_anno_pag.addItem("2038");
		combo_anno_pag.addItem("2039");
		combo_anno_pag.addItem("2040");

		panel_el_pag.add(combo_anno_pag);

		list_el_paganti = new JList();
		scrollPane_pag = new JScrollPane(list_el_paganti);
		scrollPane_pag.setBounds(342, 11, 401, 415);
		panel_el_pag.add(scrollPane_pag);

		btnRimuoviDallelenco = new JButton("Rimuovi dall'elenco");
		btnRimuoviDallelenco.setBounds(40, 365, 199, 25);
		btnRimuoviDallelenco.addActionListener(new ButtonListener());
		panel_el_pag.add(btnRimuoviDallelenco);

		btnRiepilogo_pag = new JButton("Riepilogo");
		btnRiepilogo_pag.setBounds(40, 401, 199, 25);
		btnRiepilogo_pag.addActionListener(new ButtonListener());
		panel_el_pag.add(btnRiepilogo_pag);

		btnSeleziona = new JButton("Seleziona");
		btnSeleziona.setForeground(Color.BLUE);
		btnSeleziona.setBounds(40, 109, 200, 25);
		panel_el_pag.add(btnSeleziona);
		btnSeleziona.addActionListener(new ButtonListener());

		tot_mese = new JLabel(database.elenco_paganti_mese(
				(String) combo_mese_pag.getSelectedItem(),
				(String) combo_anno_pag.getSelectedItem()));
		tot_mese.setBounds(770, 349, 95, 16);
		panel_el_pag.add(tot_mese);

		tot = new JLabel(database.elenco_paganti_anno((String) combo_anno_pag
				.getSelectedItem()));
		tot.setBounds(770, 379, 95, 16);
		panel_el_pag.add(tot);
		// TODO fatture

		btnStorico = new JButton("Storico");
		btnStorico.setBounds(768, 211, 100, 20);
		btnStorico.addActionListener(new ButtonListener());
		panel_fatt.add(btnStorico);

		list_clienti_fatt = new JList(database.seleziona_fatture());
		list_clienti_fatt.addListSelectionListener(new ListSelection());
		
		list_fatt = new JList();
		list_fatt.addListSelectionListener(new ListSelection());
		

		scrollPane_fatt = new JScrollPane(list_clienti_fatt);
		scrollPane_fatt.setBounds(10, 22, 251, 368);
		panel_fatt.add(scrollPane_fatt);

		scrollPane_fatture = new JScrollPane(list_fatt);
		scrollPane_fatture.setBorder(null);
		scrollPane_fatture.setBounds(340, 23, 313, 368);
		panel_fatt.add(scrollPane_fatture);

		// TODO Generale

		btnNuovo_cliente = new JButton("Nuovo Cliente");
		btnNuovo_cliente.setBounds(23, 39, 194, 113);
		panel_home.add(btnNuovo_cliente);
		btnNuovo_cliente
		.setToolTipText("clicca qui per aggiungere un nuovo cliente al tuo elenco dei clienti");
		btnNuovo_cliente.addActionListener(new ButtonListener());

		btnModifica_cliente = new JButton("Modifica Cliente");
		btnModifica_cliente.setBounds(227, 39, 194, 113);
		panel_home.add(btnModifica_cliente);
		btnModifica_cliente
		.setToolTipText("clicca qui per modificare un cliente del tuo elenco dei clienti");
		btnModifica_cliente.addActionListener(new ButtonListener());

		btnElimina_cliente = new JButton("Elimina Cliente");
		btnElimina_cliente.setBounds(431, 39, 194, 113);
		panel_home.add(btnElimina_cliente);
		btnElimina_cliente
		.setToolTipText("clicca qui per eliminare un cliente dal tuo elenco dei clienti");
		btnElimina_cliente.addActionListener(new ButtonListener());

		btnStampa = new JButton("Stampa");
		btnStampa.setBounds(635, 39, 194, 113);
		panel_home.add(btnStampa);
		btnStampa
		.setToolTipText("clicca qui per creare il file di fatture del mese");
		btnStampa.addActionListener(new ButtonListener());

		btnFattura_singola = new JButton("Crea Fattura singola");
		btnFattura_singola.setBounds(23, 251, 194, 113);
		panel_home.add(btnFattura_singola);
		btnFattura_singola
		.setToolTipText("clicca qui per creare una fattura singola (cioè una fattura che non hai fatto nel mese)");
		btnFattura_singola.addActionListener(new ButtonListener());

		btnModifica_fattura = new JButton("Modifica Fattura singola");
		btnModifica_fattura.setBounds(227, 251, 194, 113);
		panel_home.add(btnModifica_fattura);
		btnModifica_fattura
		.setToolTipText("clicca qui per modificare una fattura errata");
		btnModifica_fattura.addActionListener(new ButtonListener());

		btnNuovo_anno = new JButton("Nuovo Anno");
		btnNuovo_anno.setBounds(431, 251, 194, 113);
		panel_home.add(btnNuovo_anno);
		btnNuovo_anno
		.setToolTipText("clicca qui per iniziare un nuovo anno (numero fatture a 0 e modifiche mensili eliminate)");
		btnNuovo_anno.addActionListener(new ButtonListener());

		btnMail = new JButton("Mail");
		btnMail.setBounds(635, 251, 194, 113);
		panel_home.add(btnMail);
		btnMail.setToolTipText("clicca qui per mettere tutto su dropbox");
		btnMail.addActionListener(new ButtonListener());


	
	
		
		
		
		// TODO tabbed pane

		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(255, 255, 0));
		tabbedPane.setBounds(59, 83, 607, 358);
		tabbedPane.addChangeListener(new TabListener());


		tabbedPane.addTab("Generale", panel_home);

		tabbedPane.addTab("Lista Clienti", panel_list);

		tabbedPane.addTab("Gennaio", panel_gen);

		tabbedPane.addTab("Febbraio", panel_feb);

		tabbedPane.addTab("Marzo", panel_mar);

		tabbedPane.addTab("Aprile", panel_apr);

		tabbedPane.addTab("Maggio", panel_mag);

		tabbedPane.addTab("Giugno", panel_giu);

		tabbedPane.addTab("Luglio", panel_lug);

		tabbedPane.addTab("Agosto", panel_ago);

		tabbedPane.addTab("Settembre", panel_set);

		tabbedPane.addTab("Ottobre", panel_ott);

		tabbedPane.addTab("Novembre", panel_nov);

		tabbedPane.addTab("Dicembre", panel_dic);

		tabbedPane.addTab("Elenco Paganti", panel_el_pag);

		tabbedPane.addTab("Entrate/Uscite", panel_ent_usc);

		tabbedPane.addTab("Fatture", panel_fatt);

	
	
		getContentPane().add(tabbedPane);
		this.setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnAggiungiUscita) {

				Aggiungi_Uscita au = new Aggiungi_Uscita(database);

			}

			if (e.getSource() == btnStorico) {
				Storico st = new Storico(database);
			}
			
			if(e.getSource() == btnMail){
				Mail m = new Mail(database);
			}
			
			

			if (e.getSource() == btnRiepilogo_pag) {
				Dettagli_elenco_pag dt = new Dettagli_elenco_pag(database);
			}

			if (e.getSource() == btnRimuoviDallelenco) {

				try {
					String cliente = (String) list_el_paganti
							.getSelectedValue();
					StringTokenizer stk = new StringTokenizer(cliente, "**");
					String nome = stk.nextToken();
					String data = stk.nextToken();
					database.elimina_elenco_paganti(nome, data);

					StringTokenizer stk1 = new StringTokenizer(data, "/");
					String giorno = stk1.nextToken();
					String mese = stk1.nextToken();
					String anno = stk1.nextToken();

					LinkedList<String> lll = database
							.elenco_paganti(anno, mese);
					String[] lista = new String[lll.size()];
					for (int ia = 0; ia < lll.size(); ia++) {
						lista[ia] = lll.get(ia);
					}
					list_el_paganti.setListData(lista);
					tot_mese.setText(database.elenco_paganti_mese(
							(String) combo_mese_pag.getSelectedItem(),
							(String) combo_anno_pag.getSelectedItem()));
					tot.setText(database
							.elenco_paganti_anno((String) combo_anno_pag
									.getSelectedItem()));
				} catch (Exception r) {
					JOptionPane.showMessageDialog(null,
							"selezionare il cliente da rimuovere");
				}
			}

			if (e.getSource() == btnRiepilogo) {
				Riepilogo_Uscite anteprima = new Riepilogo_Uscite(database);
			}

			if (e.getSource() == btnNuovo_cliente) {
				Aggiungi_Cliente agg = new Aggiungi_Cliente(database);

			}

			if (e.getSource() == btnModifica_cliente) {
				Scegli_Modifica mod = new Scegli_Modifica(database);
			}

			if (e.getSource() == btnElimina_cliente) {
				Scegli_Elimina el = new Scegli_Elimina(database);
			}

			if (e.getSource() == btnStampa) {
				Stampa stamp = new Stampa(database);
			}

			if (e.getSource() == btnSeleziona) {

				String anno = (String) combo_anno_pag.getSelectedItem();
				String mese = (String) combo_mese_pag.getSelectedItem();

				LinkedList<String> lll = database.elenco_paganti(anno, mese);
				String[] lista = new String[lll.size()];
				for (int ia = 0; ia < lll.size(); ia++) {
					lista[ia] = lll.get(ia);
				}
				list_el_paganti.setListData(lista);
				tot_mese.setText(database.elenco_paganti_mese(
						(String) combo_mese_pag.getSelectedItem(),
						(String) combo_anno_pag.getSelectedItem()));
				tot.setText(database
						.elenco_paganti_anno((String) combo_anno_pag
								.getSelectedItem()));
			}

			if (e.getSource() == btnFattura_singola) {
				Fattura_Singola fats = new Fattura_Singola(database);
			}

			if (e.getSource() == btnModifica_fattura) {

				Modifica_Fattura_Singola mfs = new Modifica_Fattura_Singola(
						database);
			}

			if (e.getSource() == btnNuovo_anno) {

				int confirm = JOptionPane
						.showOptionDialog(
								null,
								"Iniziare un nuovo anno? Azzerare modifiche mensili e il numero delle fatture?",
								"Nuovo Anno", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, null, null, null);

				if (confirm == 0) {
					Attesa att = new Attesa();
					database.nuovo_anno();
					File a = new File(
							"C:\\Users\\massimiliano\\Documents\\conteggio.txt");
					if (a.exists())
						a.delete();
					att.dispose();
					JOptionPane.showMessageDialog(null,
							"è ora possibile iniziare con un nuovo anno!");

				}

			}
			
		}

	}
	
	public class ListSelection implements ListSelectionListener {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			int luogo = tabbedPane.getSelectedIndex();
			String nome_cliente, test, test1, test2, test3, test4, test5;
			Cliente client;
			switch (String.valueOf(luogo)) {

			case "1":
				nome_cliente = (String) list_clienti.getSelectedValue();
				client = database.seleziona(nome_cliente);

				text_Cliente.setText(client.getNome());
				test = client.getNome2();
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
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					text_descrizione_2.setText("");
				} else {
					text_descrizione_2.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					text_importo_2.setText("");
				} else {
					text_importo_2.setText(test3);
				}
				text_imponibile.setText(String.valueOf(client.getImponibile()));
				text_iva.setText(String.valueOf(client.getIva()));
				text_imposta.setText(String.valueOf(client.getImposta()));
				text_tot_fattura
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					text_ritenuta.setText("");
					combo_ritenuta.setSelectedItem("No");
				} else {
					text_ritenuta.setText(test4);
					combo_ritenuta.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					text_tot_dovuto.setText("");
				} else {
					text_tot_dovuto.setText(test5);
				}
				boolean a = client.isGennaio();
				boolean b = client.isFebbraio();
				boolean c = client.isMarzo();
				boolean d = client.isAprile();
				boolean e2 = client.isMaggio();
				boolean f = client.isGiugno();
				boolean g = client.isLuglio();
				boolean h = client.isAgosto();
				boolean i = client.isSettembre();
				boolean l = client.isOttobre();
				boolean m = client.isNovembre();
				boolean n = client.isDicembre();

				if (a)
					combo_gen.setSelectedItem("Si");
				else
					combo_gen.setSelectedItem("No");
				if (b)
					combo_feb.setSelectedItem("Si");
				else
					combo_feb.setSelectedItem("No");
				if (c)
					combo_mar.setSelectedItem("Si");
				else
					combo_mar.setSelectedItem("No");
				if (d)
					combo_apr.setSelectedItem("Si");
				else
					combo_apr.setSelectedItem("No");
				if (e2)
					combo_mag.setSelectedItem("Si");
				else
					combo_mag.setSelectedItem("No");
				if (f)
					combo_giu.setSelectedItem("Si");
				else
					combo_giu.setSelectedItem("No");
				if (g)
					combo_lug.setSelectedItem("Si");
				else
					combo_lug.setSelectedItem("No");
				if (h)
					combo_ago.setSelectedItem("Si");
				else
					combo_ago.setSelectedItem("No");
				if (i)
					combo_set.setSelectedItem("Si");
				else
					combo_set.setSelectedItem("No");
				if (l)
					combo_ott.setSelectedItem("Si");
				else
					combo_ott.setSelectedItem("No");
				if (m)
					combo_nov.setSelectedItem("Si");
				else
					combo_nov.setSelectedItem("No");
				if (n)
					combo_dic.setSelectedItem("Si");
				else
					combo_dic.setSelectedItem("No");

				break;

			case "2":
				nome_cliente = (String) list_clienti_gen.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "gennaio");

				Cliente_gen.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_gen.setText("");
				} else {
					cliente_2_gen.setText(test);
				}
				indirizzo_gen.setText(client.getIndirizzo());
				città_gen.setText(client.getCittà());
				cap_gen.setText(client.getCap());
				piva_gen.setText(client.getPiva());
				descrizione_gen.setText(client.getDescrizione());
				importo_gen.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_gen.setText("");
				} else {
					descrizione_2_gen.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_gen.setText("");
				} else {
					importo_2_gen.setText(test3);
				}
				imponibile_gen.setText(String.valueOf(client.getImponibile()));
				iva_gen.setText(String.valueOf(client.getIva()));
				imposta_gen.setText(String.valueOf(client.getImposta()));
				tot_fattura_gen
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_gen.setText("");
					combo_ritenuta_gen.setSelectedItem("No");
				} else {
					ritenuta_gen.setText(test4);
					combo_ritenuta_gen.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_gen.setText("");
				} else {
					tot_dovuto_gen.setText(test5);
				}

				break;

			case "3":
				nome_cliente = (String) list_clienti_feb.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "febbraio");

				Cliente_feb.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_feb.setText("");
				} else {
					cliente_2_feb.setText(test);
				}
				indirizzo_feb.setText(client.getIndirizzo());
				città_feb.setText(client.getCittà());
				cap_feb.setText(client.getCap());
				piva_feb.setText(client.getPiva());
				descrizione_feb.setText(client.getDescrizione());
				importo_feb.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_feb.setText("");
				} else {
					descrizione_2_feb.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_feb.setText("");
				} else {
					importo_2_feb.setText(test3);
				}
				imponibile_feb.setText(String.valueOf(client.getImponibile()));
				iva_feb.setText(String.valueOf(client.getIva()));
				imposta_feb.setText(String.valueOf(client.getImposta()));
				tot_fattura_feb
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_feb.setText("");
					combo_ritenuta_feb.setSelectedItem("No");
				} else {
					ritenuta_feb.setText(test4);
					combo_ritenuta_feb.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_feb.setText("");
				} else {
					tot_dovuto_feb.setText(test5);
				}

				break;

			case "4":
				nome_cliente = (String) list_clienti_mar.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "marzo");

				Cliente_mar.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_mar.setText("");
				} else {
					cliente_2_mar.setText(test);
				}
				indirizzo_mar.setText(client.getIndirizzo());
				città_mar.setText(client.getCittà());
				cap_mar.setText(client.getCap());
				piva_mar.setText(client.getPiva());
				descrizione_mar.setText(client.getDescrizione());
				importo_mar.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_mar.setText("");
				} else {
					descrizione_2_mar.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_mar.setText("");
				} else {
					importo_2_mar.setText(test3);
				}
				imponibile_mar.setText(String.valueOf(client.getImponibile()));
				iva_mar.setText(String.valueOf(client.getIva()));
				imposta_mar.setText(String.valueOf(client.getImposta()));
				tot_fattura_mar
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_mar.setText("");
					combo_ritenuta_mar.setSelectedItem("No");
				} else {
					ritenuta_mar.setText(test4);
					combo_ritenuta_mar.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_mar.setText("");
				} else {
					tot_dovuto_mar.setText(test5);
				}

				break;

			case "5":
				nome_cliente = (String) list_clienti_apr.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "aprile");

				Cliente_apr.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_apr.setText("");
				} else {
					cliente_2_apr.setText(test);
				}
				indirizzo_apr.setText(client.getIndirizzo());
				città_apr.setText(client.getCittà());
				cap_apr.setText(client.getCap());
				piva_apr.setText(client.getPiva());
				descrizione_apr.setText(client.getDescrizione());
				importo_apr.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_apr.setText("");
				} else {
					descrizione_2_apr.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_apr.setText("");
				} else {
					importo_2_apr.setText(test3);
				}
				imponibile_apr.setText(String.valueOf(client.getImponibile()));
				iva_apr.setText(String.valueOf(client.getIva()));
				imposta_apr.setText(String.valueOf(client.getImposta()));
				tot_fattura_apr
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_apr.setText("");
					combo_ritenuta_apr.setSelectedItem("No");
				} else {
					ritenuta_apr.setText(test4);
					combo_ritenuta_apr.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_apr.setText("");
				} else {
					tot_dovuto_apr.setText(test5);
				}

				break;

			case "6":
				nome_cliente = (String) list_clienti_mag.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "maggio");

				Cliente_mag.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_mag.setText("");
				} else {
					cliente_2_mag.setText(test);
				}
				indirizzo_mag.setText(client.getIndirizzo());
				città_mag.setText(client.getCittà());
				cap_mag.setText(client.getCap());
				piva_mag.setText(client.getPiva());
				descrizione_mag.setText(client.getDescrizione());
				importo_mag.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_mag.setText("");
				} else {
					descrizione_2_mag.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_mag.setText("");
				} else {
					importo_2_mag.setText(test3);
				}
				imponibile_mag.setText(String.valueOf(client.getImponibile()));
				iva_mag.setText(String.valueOf(client.getIva()));
				imposta_mag.setText(String.valueOf(client.getImposta()));
				tot_fattura_mag
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_mag.setText("");
					combo_ritenuta_mag.setSelectedItem("No");
				} else {
					ritenuta_mag.setText(test4);
					combo_ritenuta_mag.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_mag.setText("");
				} else {
					tot_dovuto_mag.setText(test5);
				}

				break;

			case "7":
				nome_cliente = (String) list_clienti_giu.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "giugno");

				Cliente_giu.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_giu.setText("");
				} else {
					cliente_2_giu.setText(test);
				}
				indirizzo_giu.setText(client.getIndirizzo());
				città_giu.setText(client.getCittà());
				cap_giu.setText(client.getCap());
				piva_giu.setText(client.getPiva());
				descrizione_giu.setText(client.getDescrizione());
				importo_giu.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_giu.setText("");
				} else {
					descrizione_2_giu.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_giu.setText("");
				} else {
					importo_2_giu.setText(test3);
				}
				imponibile_giu.setText(String.valueOf(client.getImponibile()));
				iva_giu.setText(String.valueOf(client.getIva()));
				imposta_giu.setText(String.valueOf(client.getImposta()));
				tot_fattura_giu
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_giu.setText("");
					combo_ritenuta_giu.setSelectedItem("No");
				} else {
					ritenuta_giu.setText(test4);
					combo_ritenuta_giu.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_giu.setText("");
				} else {
					tot_dovuto_giu.setText(test5);
				}

				break;

			case "8":
				nome_cliente = (String) list_clienti_lug.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "luglio");

				Cliente_lug.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_lug.setText("");
				} else {
					cliente_2_lug.setText(test);
				}
				indirizzo_lug.setText(client.getIndirizzo());
				città_lug.setText(client.getCittà());
				cap_lug.setText(client.getCap());
				piva_lug.setText(client.getPiva());
				descrizione_lug.setText(client.getDescrizione());
				importo_lug.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_lug.setText("");
				} else {
					descrizione_2_lug.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_lug.setText("");
				} else {
					importo_2_lug.setText(test3);
				}
				imponibile_lug.setText(String.valueOf(client.getImponibile()));
				iva_lug.setText(String.valueOf(client.getIva()));
				imposta_lug.setText(String.valueOf(client.getImposta()));
				tot_fattura_lug
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_lug.setText("");
					combo_ritenuta_lug.setSelectedItem("No");
				} else {
					ritenuta_lug.setText(test4);
					combo_ritenuta_lug.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_lug.setText("");
				} else {
					tot_dovuto_lug.setText(test5);
				}

				break;

			case "9":
				nome_cliente = (String) list_clienti_ago.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "agosto");

				Cliente_ago.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_ago.setText("");
				} else {
					cliente_2_ago.setText(test);
				}
				indirizzo_ago.setText(client.getIndirizzo());
				città_ago.setText(client.getCittà());
				cap_ago.setText(client.getCap());
				piva_ago.setText(client.getPiva());
				descrizione_ago.setText(client.getDescrizione());
				importo_ago.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_ago.setText("");
				} else {
					descrizione_2_ago.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_ago.setText("");
				} else {
					importo_2_ago.setText(test3);
				}
				imponibile_ago.setText(String.valueOf(client.getImponibile()));
				iva_ago.setText(String.valueOf(client.getIva()));
				imposta_ago.setText(String.valueOf(client.getImposta()));
				tot_fattura_ago
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_ago.setText("");
					combo_ritenuta_ago.setSelectedItem("No");
				} else {
					ritenuta_ago.setText(test4);
					combo_ritenuta_ago.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_ago.setText("");
				} else {
					tot_dovuto_ago.setText(test5);
				}

				break;

			case "10":
				nome_cliente = (String) list_clienti_set.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "settembre");

				Cliente_set.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_set.setText("");
				} else {
					cliente_2_set.setText(test);
				}
				indirizzo_set.setText(client.getIndirizzo());
				città_set.setText(client.getCittà());
				cap_set.setText(client.getCap());
				piva_set.setText(client.getPiva());
				descrizione_set.setText(client.getDescrizione());
				importo_set.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_set.setText("");
				} else {
					descrizione_2_set.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_set.setText("");
				} else {
					importo_2_set.setText(test3);
				}
				imponibile_set.setText(String.valueOf(client.getImponibile()));
				iva_set.setText(String.valueOf(client.getIva()));
				imposta_set.setText(String.valueOf(client.getImposta()));
				tot_fattura_set
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_set.setText("");
					combo_ritenuta_set.setSelectedItem("No");
				} else {
					ritenuta_set.setText(test4);
					combo_ritenuta_set.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_set.setText("");
				} else {
					tot_dovuto_set.setText(test5);
				}

				break;

			case "11":
				nome_cliente = (String) list_clienti_ott.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "ottobre");

				Cliente_ott.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_ott.setText("");
				} else {
					cliente_2_ott.setText(test);
				}
				indirizzo_ott.setText(client.getIndirizzo());
				città_ott.setText(client.getCittà());
				cap_ott.setText(client.getCap());
				piva_ott.setText(client.getPiva());
				descrizione_ott.setText(client.getDescrizione());
				importo_ott.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_ott.setText("");
				} else {
					descrizione_2_ott.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_ott.setText("");
				} else {
					importo_2_ott.setText(test3);
				}
				imponibile_ott.setText(String.valueOf(client.getImponibile()));
				iva_ott.setText(String.valueOf(client.getIva()));
				imposta_ott.setText(String.valueOf(client.getImposta()));
				tot_fattura_ott
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_ott.setText("");
					combo_ritenuta_ott.setSelectedItem("No");
				} else {
					ritenuta_ott.setText(test4);
					combo_ritenuta_ott.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_ott.setText("");
				} else {
					tot_dovuto_ott.setText(test5);
				}

				break;

			case "12":
				nome_cliente = (String) list_clienti_nov.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "novembre");

				Cliente_nov.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_nov.setText("");
				} else {
					cliente_2_nov.setText(test);
				}
				indirizzo_nov.setText(client.getIndirizzo());
				città_nov.setText(client.getCittà());
				cap_nov.setText(client.getCap());
				piva_nov.setText(client.getPiva());
				descrizione_nov.setText(client.getDescrizione());
				importo_nov.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_nov.setText("");
				} else {
					descrizione_2_nov.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_nov.setText("");
				} else {
					importo_2_nov.setText(test3);
				}
				imponibile_nov.setText(String.valueOf(client.getImponibile()));
				iva_nov.setText(String.valueOf(client.getIva()));
				imposta_nov.setText(String.valueOf(client.getImposta()));
				tot_fattura_nov
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_nov.setText("");
					combo_ritenuta_nov.setSelectedItem("No");
				} else {
					ritenuta_nov.setText(test4);
					combo_ritenuta_nov.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_nov.setText("");
				} else {
					tot_dovuto_nov.setText(test5);
				}

				break;

			case "13":
				nome_cliente = (String) list_clienti_dic.getSelectedValue();
				client = database.seleziona_mese(nome_cliente, "dicembre");

				Cliente_dic.setText(client.getNome());
				test = client.getNome2();
				if (test.equals("null")) {
					cliente_2_dic.setText("");
				} else {
					cliente_2_dic.setText(test);
				}
				indirizzo_dic.setText(client.getIndirizzo());
				città_dic.setText(client.getCittà());
				cap_dic.setText(client.getCap());
				piva_dic.setText(client.getPiva());
				descrizione_dic.setText(client.getDescrizione());
				importo_dic.setText(String.valueOf(client.getImporto()));
				test2 = client.getDescrizione2();
				if (test2.equals("null")) {
					descrizione_2_dic.setText("");
				} else {
					descrizione_2_dic.setText(test2);
				}
				test3 = String.valueOf(client.getImporto2());
				if (test3.equals("0.0")) {
					importo_2_dic.setText("");
				} else {
					importo_2_dic.setText(test3);
				}
				imponibile_dic.setText(String.valueOf(client.getImponibile()));
				iva_dic.setText(String.valueOf(client.getIva()));
				imposta_dic.setText(String.valueOf(client.getImposta()));
				tot_fattura_dic
				.setText(String.valueOf(client.getTot_fattura()));
				test4 = String.valueOf(client.getRitenuta());
				if (test4.equals("0.0")) {
					ritenuta_dic.setText("");
					combo_ritenuta_dic.setSelectedItem("No");
				} else {
					ritenuta_dic.setText(test4);
					combo_ritenuta_dic.setSelectedItem("Si");
				}
				test5 = String.valueOf(client.getTot_dovuto());
				if (test5.equals("0.0")) {
					tot_dovuto_dic.setText("");
				} else {
					tot_dovuto_dic.setText(test5);
				}

				break;

			case "15":

				int anno = gc.get(Calendar.YEAR);
				String causa = (String) list_cause_uscite.getSelectedValue();

				LinkedList<String> lll = database.uscite(causa, anno);

				String[] lista = new String[lll.size()];
				for (int ia = 0; ia < lll.size(); ia++) {
					lista[ia] = lll.get(ia);
				}
				list_dettagli_uscite.setListData(lista);

				break;

			case "16":
				nome_cliente = (String) list_clienti_fatt.getSelectedValue();

				int anno_f = gc.get(Calendar.YEAR);
				LinkedList<Fatture> ll = database.restituisci_fattura(
						nome_cliente, anno_f);
				String[] lis = new String[ll.size()];
				for (int ia = 0; ia < ll.size(); ia++) {
					lis[ia] = ll.get(ia).getNumero() + "**"
							+ ll.get(ia).getData() + "**"
							+ ll.get(ia).getTotale();
				}
				list_fatt.setListData(lis);
				break;
			
			}

		}

	}

	public class TabListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {

			int pos = tabbedPane.getSelectedIndex();

			if (pos == 0) {

			}
			if (pos == 1) {
				list_clienti.setListData(database.elenco_clienti());
			}
			if (pos == 2) {
				list_clienti_gen.setListData(database
						.elenco_clienti_mese("gennaio"));

			}
			if (pos == 3) {
				list_clienti_feb.setListData(database
						.elenco_clienti_mese("febbraio"));

			}
			if (pos == 4) {
				list_clienti_mar.setListData(database
						.elenco_clienti_mese("marzo"));

			}
			if (pos == 5) {
				list_clienti_apr.setListData(database
						.elenco_clienti_mese("aprile"));

			}
			if (pos == 6) {
				list_clienti_mag.setListData(database
						.elenco_clienti_mese("maggio"));

			}
			if (pos == 7) {
				list_clienti_giu.setListData(database
						.elenco_clienti_mese("giugno"));

			}
			if (pos == 8) {
				list_clienti_lug.setListData(database
						.elenco_clienti_mese("luglio"));

			}
			if (pos == 9) {
				list_clienti_ago.setListData(database
						.elenco_clienti_mese("agosto"));

			}
			if (pos == 10) {
				list_clienti_set.setListData(database
						.elenco_clienti_mese("settembre"));

			}
			if (pos == 11) {
				list_clienti_ott.setListData(database
						.elenco_clienti_mese("ottobre"));

			}
			if (pos == 12) {
				list_clienti_nov.setListData(database
						.elenco_clienti_mese("novembre"));

			}
			if (pos == 13) {
				list_clienti_dic.setListData(database
						.elenco_clienti_mese("dicembre"));

			}
			if (pos == 14) {

				tot_mese.setText(database.elenco_paganti_mese(
						(String) combo_mese_pag.getSelectedItem(),
						(String) combo_anno_pag.getSelectedItem()));
				tot.setText(database
						.elenco_paganti_anno((String) combo_anno_pag
								.getSelectedItem()));

			}
			if (pos == 15) {

				text_uscite
				.setText(database.uscite_anno(gc.get(Calendar.YEAR)));
				text_entrate.setText(database.entrate_anno(gc
						.get(Calendar.YEAR)));

			}

			if(pos == 16){
				list_clienti_fatt.setListData(database.seleziona_fatture());
			}
			

		}
	}
}
