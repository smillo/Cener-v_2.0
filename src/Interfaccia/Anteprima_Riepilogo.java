package Interfaccia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Anteprima_Riepilogo extends JFrame{

	private JComboBox combo_anno;
	private JButton btnIndietro,btnOk;
	
	public Anteprima_Riepilogo(){
		
		getContentPane().setLayout(null);
		setBounds(10, 10, 360, 213);
		combo_anno = new JComboBox();
		combo_anno.addItem("2013");
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
		combo_anno.setBounds(60, 43, 213, 20);
		getContentPane().add(combo_anno);

		btnIndietro = new JButton("Indietro");
		btnIndietro.setBounds(60, 95, 89, 23);
		getContentPane().add(btnIndietro);
		btnIndietro.addActionListener(new ButtonListener());

		btnOk = new JButton("Ok");
		btnOk.setBounds(184, 95, 89, 23);
		getContentPane().add(btnOk);
		btnOk.addActionListener(new ButtonListener());

		this.setVisible(true);

	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnIndietro) {
				dispose();
			}

			if (e.getSource() == btnOk) {

			}
		}

	}

}
