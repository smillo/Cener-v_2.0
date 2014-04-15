package Interfaccia;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Partenza extends JFrame {

	private JTabbedPane tabbedPane;
	private JPanel panel_home,panel_gen, panel_feb, panel_mar, panel_apr, panel_mag,
	panel_giu, panel_lug, panel_ago, panel_set, panel_ott, panel_nov,
	panel_dic, panel_el_pag, panel_ent_usc;
	private JTextField text_entrate, text_uscite, text_entrate_prec,
	text_uscite_prec;
	private JScrollPane scrollPane, scrollPane_1;
	private JButton btnAggiungiUscita, btnEliminaUscita;
	private JButton btnRiepilogo;

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

		Partenza window = new Partenza();
	}

	public Partenza() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

		setBounds(100, 100, 904, 504);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		
		panel_home = new JPanel();
		panel_home.setLayout(null);
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
		
		//tasti entrate uscite
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 161, 339);
		panel_ent_usc.add(scrollPane);

		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(179, 11, 161, 339);
		panel_ent_usc.add(scrollPane_1);

		btnAggiungiUscita = new JButton("Aggiungi Uscita");
		btnAggiungiUscita.setBounds(395, 28, 174, 30);
		panel_ent_usc.add(btnAggiungiUscita);
		btnAggiungiUscita.addActionListener(new ButtonListener());

		btnEliminaUscita = new JButton("Elimina Uscita");
		btnEliminaUscita.setBounds(395, 68, 174, 30);
		panel_ent_usc.add(btnEliminaUscita);
		btnEliminaUscita.addActionListener(new ButtonListener());

		JLabel lblEntrate = new JLabel("Entrate");
		lblEntrate.setBounds(395, 201, 75, 14);
		panel_ent_usc.add(lblEntrate);

		JLabel lblUscite = new JLabel("Uscite");
		lblUscite.setBounds(539, 201, 75, 14);
		panel_ent_usc.add(lblUscite);

		JLabel lblAnnoPrecedente = new JLabel("Anno precedente");
		lblAnnoPrecedente.setBounds(439, 270, 117, 14);
		panel_ent_usc.add(lblAnnoPrecedente);

		text_entrate = new JTextField();
		text_entrate.setEditable(false);
		text_entrate.setBounds(350, 226, 122, 20);
		panel_ent_usc.add(text_entrate);
		text_entrate.setColumns(10);

		text_uscite = new JTextField();
		text_uscite.setEditable(false);
		text_uscite.setBounds(492, 226, 122, 20);
		panel_ent_usc.add(text_uscite);
		text_uscite.setColumns(10);

		text_entrate_prec = new JTextField();
		text_entrate_prec.setEditable(false);
		text_entrate_prec.setBounds(350, 302, 117, 20);
		panel_ent_usc.add(text_entrate_prec);
		text_entrate_prec.setColumns(10);

		text_uscite_prec = new JTextField();
		text_uscite_prec.setEditable(false);
		text_uscite_prec.setBounds(492, 302, 122, 20);
		panel_ent_usc.add(text_uscite_prec);
		text_uscite_prec.setColumns(10);
		
		btnRiepilogo = new JButton("Riepilogo");
		btnRiepilogo.setBounds(395, 108, 174, 30);
		panel_ent_usc.add(btnRiepilogo);
		btnRiepilogo.addActionListener(new ButtonListener());

//tabbed pane		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(new Color(255, 255, 0));
		tabbedPane.setBounds(59, 83, 607, 358);
		tabbedPane.addChangeListener(new TabListener());
		
		tabbedPane.addTab("Home", panel_home);
		
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
		
		
		
		getContentPane().add(tabbedPane);
		this.setVisible(true);
	}

	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnAggiungiUscita) {

			}

			if (e.getSource() == btnEliminaUscita) {

			}
			
			if (e.getSource() == btnRiepilogo) {
				Anteprima_Riepilogo anteprima = new Anteprima_Riepilogo();
			}
		}

	}
	
	public class TabListener implements ChangeListener {
		public void stateChanged(ChangeEvent e) {

			int pos = tabbedPane.getSelectedIndex();

			if (pos == 0) {

			}
			if (pos == 1) {

			}
			if (pos == 2) {

			}
			if (pos == 3) {

			}
			if (pos == 4) {

			}
			if (pos == 5) {

			}
			if (pos == 6) {

			}
			if (pos == 7) {

			}
			if (pos == 8) {

			}
			if (pos == 9) {

			}
			if (pos == 10) {

			}
			if (pos == 11) {

			}
			if (pos == 12) {

			}
			if (pos == 13) {

			}

		}
	}
}
