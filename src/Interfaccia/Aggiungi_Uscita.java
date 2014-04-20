package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import General.Database;

public class Aggiungi_Uscita extends JFrame {
	private JButton btnAdd;
	private Database database;
	private JComboBox combo_causa;
	private JTextField textField;
	static DecimalFormatSymbols form = new DecimalFormatSymbols(Locale.ENGLISH);
	static DecimalFormat formatter = new DecimalFormat("#.##", form);
	private JLabel lblData;
	private JTextField text_mese,text_giorno;
	private JTextField text_anno;
	private JLabel label;
	private JLabel label_1;

	public Aggiungi_Uscita(Database database) {
		this.database = database;
		getContentPane().setLayout(null);
		setBounds(10, 10, 360, 290);

		
		combo_causa = new JComboBox();
		combo_causa.addItem("costo operai");
		combo_causa.addItem("stipendio nostro");
		combo_causa.addItem("tornado");
		combo_causa.addItem("inps");
		combo_causa.addItem("automezzi");
		combo_causa.addItem("carburante");
		combo_causa.addItem("varie");
		combo_causa.addItem("artser");
		combo_causa.addItem("tasse");
		
		combo_causa.setBounds(121, 28, 213, 20);
		getContentPane().add(combo_causa);

		btnAdd = new JButton("Aggiungi");
		btnAdd.setBounds(131, 199, 89, 23);
		getContentPane().add(btnAdd);
		
		JLabel lblImporto = new JLabel("Importo");
		lblImporto.setBounds(10, 130, 60, 14);
		getContentPane().add(lblImporto);
		
		JLabel lblCausa = new JLabel("Causa");
		lblCausa.setBounds(10, 31, 46, 14);
		getContentPane().add(lblCausa);
		
		textField = new JTextField();
		textField.setBounds(121, 127, 213, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		lblData = new JLabel("Data");
		lblData.setBounds(10, 80, 46, 14);
		getContentPane().add(lblData);
		
		text_giorno = new JTextField();
		text_giorno.setBounds(121, 77, 46, 20);
		getContentPane().add(text_giorno);
		text_giorno.setColumns(10);
		
		text_mese = new JTextField();
		text_mese.setBounds(188, 77, 46, 20);
		getContentPane().add(text_mese);
		text_mese.setColumns(10);
		
		text_anno = new JTextField();
		text_anno.setBounds(256, 77, 78, 20);
		getContentPane().add(text_anno);
		text_anno.setColumns(10);
		
		label = new JLabel("/");
		label.setBounds(174, 80, 15, 14);
		getContentPane().add(label);
		
		label_1 = new JLabel("/");
		label_1.setBounds(241, 80, 15, 14);
		getContentPane().add(label_1);
		btnAdd.addActionListener(new ButtonListener());

		

		this.setVisible(true);

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {


			if (e.getSource() == btnAdd) {
try{
				String causa = (String) combo_causa.getSelectedItem();
				double im = Double.parseDouble(textField.getText());
				
				formatter.setMaximumFractionDigits(2);
				formatter.setMinimumFractionDigits(2);
				String importo = formatter.format(im);
				
				if (text_giorno.getText().length() == 2
						&& text_mese.getText().length() == 2
						&& text_anno.getText().length() == 4) {
					String data = text_giorno.getText() + "/"
							+ text_mese.getText() + "/" + text_anno.getText();
					
				database.aggiungi_uscita(causa,data,importo);
				
				dispose();

				} else
					JOptionPane.showMessageDialog(null,
							"ERRORE: inserire la data nel formato gg/mm/aaaa");
			

			} catch(NumberFormatException ex){
				JOptionPane.showMessageDialog(null, "inserire il punto prima dei decimali");
			}
		}}

	}
}
