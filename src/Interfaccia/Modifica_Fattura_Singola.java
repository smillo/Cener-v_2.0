package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Modifica_Fattura_Singola extends JFrame {

	private JTextField text_Cliente, text_indirizzo, text_cap,
	text_descrizione, text_descrizione_2, text_imponibile,
	text_imposta;
	private JTextField text_cliente_2, text_città, text_piva, text_importo,
	text_importo_2, text_iva, text_tot_fattura, text_tot_dovuto,
	text_ritenuta;
	private JComboBox combo_ritenuta;
	private JButton btnIndietro, btnSalva;
	private JScrollPane scrollPane,scrollPane_fatt;
	private JList list,list_fatt;
	private JLabel lblNumeroFattura;
	private JTextField text_num_fat;
	private JTextField textField;

	public Modifica_Fattura_Singola() {
		getContentPane().setLayout(null);
		setBounds(10, 10, 872, 460);

		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(326, 25, 70, 14);
		getContentPane().add(lblCliente);

		JLabel lblCliente_1 = new JLabel("Cliente(2)");
		lblCliente_1.setBounds(588, 25, 70, 14);
		getContentPane().add(lblCliente_1);

		JLabel lblIndirizzo = new JLabel("Indirizzo");
		lblIndirizzo.setBounds(326, 55, 70, 14);
		getContentPane().add(lblIndirizzo);

		JLabel lblCitt = new JLabel("Citt\u00E0");
		lblCitt.setBounds(588, 55, 70, 14);
		getContentPane().add(lblCitt);

		JLabel lblCap = new JLabel("Cap");
		lblCap.setBounds(326, 85, 46, 14);
		getContentPane().add(lblCap);

		JLabel lblPiva = new JLabel("P.IVA");
		lblPiva.setBounds(588, 85, 70, 14);
		getContentPane().add(lblPiva);

		JLabel lblDescrizione = new JLabel("Descrizione");
		lblDescrizione.setBounds(326, 115, 70, 14);
		getContentPane().add(lblDescrizione);

		JLabel lblImporto = new JLabel("Importo");
		lblImporto.setBounds(588, 115, 70, 14);
		getContentPane().add(lblImporto);

		JLabel lblDescrizione_1 = new JLabel("Descrizione (2)");
		lblDescrizione_1.setBounds(326, 145, 84, 14);
		getContentPane().add(lblDescrizione_1);

		JLabel lblImporto_1 = new JLabel("Importo (2)");
		lblImporto_1.setBounds(588, 145, 78, 14);
		getContentPane().add(lblImporto_1);

		JLabel lblImponibile = new JLabel("Imponibile");
		lblImponibile.setBounds(326, 175, 84, 14);
		getContentPane().add(lblImponibile);

		JLabel lblIva = new JLabel("Iva");
		lblIva.setBounds(588, 175, 84, 14);
		getContentPane().add(lblIva);

		JLabel lblImposta = new JLabel("Imposta");
		lblImposta.setBounds(326, 205, 92, 14);
		getContentPane().add(lblImposta);

		JLabel lblTotFattura = new JLabel("Tot. Fattura");
		lblTotFattura.setBounds(588, 205, 128, 14);
		getContentPane().add(lblTotFattura);

		JLabel lblRitenuta = new JLabel("Ritenuta");
		lblRitenuta.setBounds(326, 235, 78, 14);
		getContentPane().add(lblRitenuta);

		JLabel lblTotDovuto = new JLabel("Tot. Dovuto");
		lblTotDovuto.setBounds(588, 235, 84, 14);
		getContentPane().add(lblTotDovuto);

		text_Cliente = new JTextField();
		text_Cliente.setBounds(406, 22, 172, 20);
		getContentPane().add(text_Cliente);
		text_Cliente.setColumns(10);

		text_indirizzo = new JTextField();
		text_indirizzo.setBounds(406, 52, 172, 20);
		getContentPane().add(text_indirizzo);
		text_indirizzo.setColumns(10);

		text_cap = new JTextField();
		text_cap.setBounds(406, 82, 172, 20);
		getContentPane().add(text_cap);
		text_cap.setColumns(10);

		text_descrizione = new JTextField();
		text_descrizione.setBounds(406, 112, 172, 20);
		getContentPane().add(text_descrizione);
		text_descrizione.setColumns(10);

		text_descrizione_2 = new JTextField();
		text_descrizione_2.setBounds(406, 142, 172, 20);
		getContentPane().add(text_descrizione_2);
		text_descrizione_2.setColumns(10);

		text_imponibile = new JTextField();
		text_imponibile.setBounds(406, 172, 172, 20);
		getContentPane().add(text_imponibile);
		text_imponibile.setColumns(10);

		text_imposta = new JTextField();
		text_imposta.setEditable(false);
		text_imposta.setBounds(406, 202, 172, 20);
		getContentPane().add(text_imposta);
		text_imposta.setColumns(10);

		text_cliente_2 = new JTextField();
		text_cliente_2.setBounds(674, 22, 172, 20);
		getContentPane().add(text_cliente_2);
		text_cliente_2.setColumns(10);

		text_città = new JTextField();
		text_città.setBounds(674, 52, 172, 20);
		getContentPane().add(text_città);
		text_città.setColumns(10);

		text_piva = new JTextField();
		text_piva.setBounds(674, 82, 172, 20);
		getContentPane().add(text_piva);
		text_piva.setColumns(10);

		text_importo = new JTextField();
		text_importo.setBounds(674, 112, 172, 20);
		getContentPane().add(text_importo);
		text_importo.setColumns(10);

		text_importo_2 = new JTextField();
		text_importo_2.setBounds(674, 142, 172, 20);
		getContentPane().add(text_importo_2);
		text_importo_2.setColumns(10);

		text_iva = new JTextField();
		text_iva.setBounds(674, 172, 172, 20);
		getContentPane().add(text_iva);
		text_iva.setColumns(10);

		text_tot_fattura = new JTextField();
		text_tot_fattura.setEditable(false);
		text_tot_fattura.setBounds(674, 202, 172, 20);
		getContentPane().add(text_tot_fattura);
		text_tot_fattura.setColumns(10);

		text_tot_dovuto = new JTextField();
		text_tot_dovuto.setEditable(false);
		text_tot_dovuto.setBounds(674, 232, 172, 20);
		getContentPane().add(text_tot_dovuto);
		text_tot_dovuto.setColumns(10);

		text_ritenuta = new JTextField();
		text_ritenuta.setEditable(false);
		text_ritenuta.setBounds(498, 232, 80, 20);
		getContentPane().add(text_ritenuta);
		text_ritenuta.setColumns(10);

		combo_ritenuta = new JComboBox();
		combo_ritenuta.addItem("No");
		combo_ritenuta.addItem("Si");
		combo_ritenuta.setBounds(406, 232, 80, 20);
		getContentPane().add(combo_ritenuta);

		

		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(498, 368, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnSalva = new JButton("Salva");
		btnSalva.setBounds(708, 368, 89, 23);
		getContentPane().add(btnSalva);
		btnSalva.addActionListener(new ButtonListener());

		list = new JList();
		list_fatt = new JList();

		scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 22, 150, 368);
		getContentPane().add(scrollPane);
		
		scrollPane_fatt = new JScrollPane(list_fatt);
		scrollPane_fatt.setBounds(170, 22, 130, 368);
		getContentPane().add(scrollPane_fatt);
		
		lblNumeroFattura = new JLabel("Numero Fattura");
		lblNumeroFattura.setBounds(326, 265, 109, 14);
		getContentPane().add(lblNumeroFattura);
		
		text_num_fat = new JTextField();
		text_num_fat.setBounds(428, 263, 150, 20);
		getContentPane().add(text_num_fat);
		text_num_fat.setColumns(10);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(588, 265, 70, 14);
		getContentPane().add(lblData);
		
		textField = new JTextField();
		textField.setBounds(674, 262, 172, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
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