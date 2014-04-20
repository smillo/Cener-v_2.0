package Interfaccia;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import General.Database;

public class Riepilogo extends JFrame {

	private JButton dett_13, dett_14, dett_15, dett_16, dett_17, dett_18,
			dett_19, dett_20, dett_21, dett_22, dett_23, dett_24, dett_25,
			dett_26, dett_27, dett_28, dett_29, dett_30, dett_31, dett_32,
			dett_33, dett_34, dett_35, dett_36, dett_37, dett_38, dett_39,
			dett_40;
	private JLabel label_28,label_36,label_37,label_38,label_39,label_40,label_41,label_42,label_43,label_44;
	private JLabel label_29,label_45,label_46,label_47,label_48,label_49,label_50,label_51,label_52;
	private JLabel label_30,label_53,label_54,label_55,label_56,label_57,label_58,label_59,label_60;
	private JLabel label_31,label_61,label_62,label_63,label_64,label_65,label_66,label_67,label_68;
	private JLabel label_32,label_69,label_70,label_71,label_72,label_73,label_74,label_75,label_76;
	private JLabel label_33,label_77,label_78,label_79,label_80,label_81,label_82,label_83;
	private JLabel label_34,label_35;
	private Database database;

	public Riepilogo(Database database) {

		this.database = database;
		setBounds(10, 10, 487, 658);
		getContentPane().setLayout(null);

		JLabel lblAnno = new JLabel("Anno");
		lblAnno.setBounds(31, 11, 46, 14);
		getContentPane().add(lblAnno);

		JLabel lblTotEntrate = new JLabel("Tot. Entrate");
		lblTotEntrate.setBounds(142, 11, 105, 14);
		getContentPane().add(lblTotEntrate);

		JLabel lblTotUscite = new JLabel("Tot. Uscite");
		lblTotUscite.setBounds(282, 11, 130, 14);
		getContentPane().add(lblTotUscite);

		JLabel label = new JLabel("2013");
		label.setBounds(31, 45, 46, 14);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("2014");
		label_1.setBounds(31, 65, 46, 14);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("2015");
		label_2.setBounds(31, 85, 46, 14);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("2016");
		label_3.setBounds(31, 105, 46, 14);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("2017");
		label_4.setBounds(31, 125, 46, 14);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("2018");
		label_5.setBounds(31, 145, 46, 14);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("2019");
		label_6.setBounds(31, 165, 46, 14);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("2020");
		label_7.setBounds(31, 185, 46, 14);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("2021");
		label_8.setBounds(31, 205, 46, 14);
		getContentPane().add(label_8);

		JLabel label_9 = new JLabel("2022");
		label_9.setBounds(31, 225, 46, 14);
		getContentPane().add(label_9);

		JLabel label_10 = new JLabel("2023");
		label_10.setBounds(31, 245, 46, 14);
		getContentPane().add(label_10);

		JLabel label_11 = new JLabel("2024");
		label_11.setBounds(31, 265, 46, 14);
		getContentPane().add(label_11);

		JLabel label_12 = new JLabel("2025");
		label_12.setBounds(31, 285, 46, 14);
		getContentPane().add(label_12);

		JLabel label_13 = new JLabel("2026");
		label_13.setBounds(31, 305, 46, 14);
		getContentPane().add(label_13);

		JLabel label_14 = new JLabel("2027");
		label_14.setBounds(31, 325, 46, 14);
		getContentPane().add(label_14);

		JLabel label_15 = new JLabel("2028");
		label_15.setBounds(31, 345, 46, 14);
		getContentPane().add(label_15);

		JLabel label_16 = new JLabel("2029");
		label_16.setBounds(31, 365, 46, 14);
		getContentPane().add(label_16);

		JLabel label_17 = new JLabel("2030");
		label_17.setBounds(31, 385, 46, 14);
		getContentPane().add(label_17);

		JLabel label_18 = new JLabel("2031");
		label_18.setBounds(31, 405, 46, 14);
		getContentPane().add(label_18);

		JLabel label_19 = new JLabel("2032");
		label_19.setBounds(31, 425, 46, 14);
		getContentPane().add(label_19);

		JLabel label_20 = new JLabel("2033");
		label_20.setBounds(31, 445, 46, 14);
		getContentPane().add(label_20);

		JLabel label_21 = new JLabel("2034");
		label_21.setBounds(31, 465, 46, 14);
		getContentPane().add(label_21);

		JLabel label_22 = new JLabel("2035");
		label_22.setBounds(31, 485, 46, 14);
		getContentPane().add(label_22);

		JLabel label_23 = new JLabel("2036");
		label_23.setBounds(31, 505, 46, 14);
		getContentPane().add(label_23);

		JLabel label_24 = new JLabel("2037");
		label_24.setBounds(31, 525, 46, 14);
		getContentPane().add(label_24);

		JLabel label_25 = new JLabel("2038");
		label_25.setBounds(31, 545, 46, 14);
		getContentPane().add(label_25);

		JLabel label_26 = new JLabel("2039");
		label_26.setBounds(31, 565, 46, 14);
		getContentPane().add(label_26);

		JLabel label_27 = new JLabel("2040");
		label_27.setBounds(31, 585, 46, 14);
		getContentPane().add(label_27);

		label_28 = new JLabel(database.entrate_anno(2013));
		label_28.setBounds(126, 45, 105, 14);
		getContentPane().add(label_28);

		dett_13 = new JButton("Dettagli");
		dett_13.setBounds(369, 43, 80, 16);
		getContentPane().add(dett_13);
		dett_13.addActionListener(new ButtonListener());

		 label_29 = new JLabel(database.uscite_anno(2013));
		label_29.setBounds(261, 45, 105, 14);
		getContentPane().add(label_29);
		setBounds(10, 10, 551, 658);

		 label_30 = new JLabel(database.entrate_anno(2014));
		label_30.setBounds(126, 65, 105, 14);
		getContentPane().add(label_30);

		 label_31 = new JLabel(database.uscite_anno(2014));
		label_31.setBounds(261, 65, 105, 14);
		getContentPane().add(label_31);
		setBounds(10, 10, 475, 658);

		 label_32 = new JLabel(database.entrate_anno(2015));
		label_32.setBounds(126, 85, 105, 14);
		getContentPane().add(label_32);
		
		label_33 = new JLabel(database.uscite_anno(2015));
		label_33.setBounds(261, 85, 105, 14);
		getContentPane().add(label_33);
		setBounds(10, 10, 475, 658);

		 label_34 = new JLabel(database.entrate_anno(2016));
		label_34.setBounds(126, 105, 105, 14);
		getContentPane().add(label_34);

		 label_35 = new JLabel(database.uscite_anno(2016));
		label_35.setBounds(261, 105, 105, 14);
		getContentPane().add(label_35);
		setBounds(10, 10, 475, 658);

		 label_36 = new JLabel(database.entrate_anno(2017));
		label_36.setBounds(126, 125, 105, 14);
		getContentPane().add(label_36);

		 label_37 = new JLabel(database.uscite_anno(2017));
		label_37.setBounds(261, 125, 105, 14);
		getContentPane().add(label_37);
		setBounds(10, 10, 475, 658);

	 label_38 = new JLabel(database.entrate_anno(2018));
		label_38.setBounds(126, 145, 105, 14);
		getContentPane().add(label_38);

		 label_39 = new JLabel(database.uscite_anno(2018));
		label_39.setBounds(261, 145, 105, 14);
		getContentPane().add(label_39);
		setBounds(10, 10, 475, 658);

		 label_40 = new JLabel(database.entrate_anno(2019));
		label_40.setBounds(126, 165, 105, 14);
		getContentPane().add(label_40);

		 label_41 = new JLabel(database.uscite_anno(2019));
		label_41.setBounds(261, 165, 105, 14);
		getContentPane().add(label_41);
		setBounds(10, 10, 475, 658);

		 label_42 = new JLabel(database.entrate_anno(2020));
		label_42.setBounds(126, 185, 105, 14);
		getContentPane().add(label_42);

		 label_43 = new JLabel(database.uscite_anno(2020));
		label_43.setBounds(261, 185, 105, 14);
		getContentPane().add(label_43);
		setBounds(10, 10, 475, 658);

		 label_44 = new JLabel(database.entrate_anno(2021));
		label_44.setBounds(126, 205, 105, 14);
		getContentPane().add(label_44);

		 label_45 = new JLabel(database.uscite_anno(2021));
		label_45.setBounds(261, 205, 105, 14);
		getContentPane().add(label_45);
		setBounds(10, 10, 475, 658);

		 label_46 = new JLabel(database.entrate_anno(2022));
		label_46.setBounds(126, 225, 105, 14);
		getContentPane().add(label_46);

		 label_47 = new JLabel(database.uscite_anno(2022));
		label_47.setBounds(261, 225, 105, 14);
		getContentPane().add(label_47);
		setBounds(10, 10, 475, 658);

		 label_48 = new JLabel(database.entrate_anno(2023));
		label_48.setBounds(126, 245, 105, 14);
		getContentPane().add(label_48);

		label_49 = new JLabel(database.uscite_anno(2023));
		label_49.setBounds(261, 245, 105, 14);
		getContentPane().add(label_49);
		setBounds(10, 10, 475, 658);

		label_50 = new JLabel(database.entrate_anno(2024));
		label_50.setBounds(126, 265, 105, 14);
		getContentPane().add(label_50);

		label_51 = new JLabel(database.uscite_anno(2024));
		label_51.setBounds(261, 265, 105, 14);
		getContentPane().add(label_51);
		setBounds(10, 10, 475, 658);

		label_52 = new JLabel(database.entrate_anno(2025));
		label_52.setBounds(126, 285, 105, 14);
		getContentPane().add(label_52);

		label_53 = new JLabel(database.uscite_anno(2025));
		label_53.setBounds(261, 285, 105, 14);
		getContentPane().add(label_53);
		setBounds(10, 10, 475, 658);

		label_54 = new JLabel(database.entrate_anno(2026));
		label_54.setBounds(126, 305, 105, 14);
		getContentPane().add(label_54);

		label_55 = new JLabel(database.uscite_anno(2026));
		label_55.setBounds(261, 305, 105, 14);
		getContentPane().add(label_55);
		setBounds(10, 10, 475, 658);

		label_56 = new JLabel(database.entrate_anno(2027));
		label_56.setBounds(126, 325, 105, 14);
		getContentPane().add(label_56);

		label_57 = new JLabel(database.uscite_anno(2027));
		label_57.setBounds(261, 325, 105, 14);
		getContentPane().add(label_57);
		setBounds(10, 10, 475, 658);

		label_58 = new JLabel(database.entrate_anno(2028));
		label_58.setBounds(126, 345, 105, 14);
		getContentPane().add(label_58);

		label_59 = new JLabel(database.uscite_anno(2028));
		label_59.setBounds(261, 345, 105, 14);
		getContentPane().add(label_59);
		setBounds(10, 10, 475, 658);

		label_60 = new JLabel(database.entrate_anno(2029));
		label_60.setBounds(126, 365, 105, 14);
		getContentPane().add(label_60);

		label_61 = new JLabel(database.uscite_anno(2029));
		label_61.setBounds(261, 365, 105, 14);
		getContentPane().add(label_61);
		setBounds(10, 10, 475, 658);

		label_62 = new JLabel(database.entrate_anno(2030));
		label_62.setBounds(126, 385, 105, 14);
		getContentPane().add(label_62);

		label_63 = new JLabel(database.uscite_anno(2030));
		label_63.setBounds(261, 385, 105, 14);
		getContentPane().add(label_63);
		setBounds(10, 10, 475, 658);

		label_64 = new JLabel(database.entrate_anno(2031));
		label_64.setBounds(126, 405, 105, 14);
		getContentPane().add(label_64);

		label_65 = new JLabel(database.uscite_anno(2031));
		label_65.setBounds(261, 405, 105, 14);
		getContentPane().add(label_65);
		setBounds(10, 10, 475, 658);

		label_66 = new JLabel(database.entrate_anno(2032));
		label_66.setBounds(126, 425, 105, 14);
		getContentPane().add(label_66);

		label_67 = new JLabel(database.uscite_anno(2032));
		label_67.setBounds(261, 425, 105, 14);
		getContentPane().add(label_67);
		setBounds(10, 10, 475, 658);

		label_68 = new JLabel(database.entrate_anno(2033));
		label_68.setBounds(126, 445, 105, 14);
		getContentPane().add(label_68);

		label_69 = new JLabel(database.uscite_anno(2033));
		label_69.setBounds(261, 445, 105, 14);
		getContentPane().add(label_69);
		setBounds(10, 10, 475, 658);

		label_70 = new JLabel(database.entrate_anno(2034));
		label_70.setBounds(126, 465, 105, 14);
		getContentPane().add(label_70);

		label_71 = new JLabel(database.uscite_anno(2034));
		label_71.setBounds(261, 465, 105, 14);
		getContentPane().add(label_71);
		setBounds(10, 10, 475, 658);

		label_72 = new JLabel(database.entrate_anno(2035));
		label_72.setBounds(126, 485, 105, 14);
		getContentPane().add(label_72);

		label_73 = new JLabel(database.uscite_anno(2035));
		label_73.setBounds(261, 485, 105, 14);
		getContentPane().add(label_73);
		setBounds(10, 10, 475, 658);

		label_74 = new JLabel(database.entrate_anno(2036));
		label_74.setBounds(126, 505, 105, 14);
		getContentPane().add(label_74);

		label_75 = new JLabel(database.uscite_anno(2036));
		label_75.setBounds(261, 505, 105, 14);
		getContentPane().add(label_75);
		setBounds(10, 10, 475, 658);

		label_76 = new JLabel(database.entrate_anno(2037));
		label_76.setBounds(126, 525, 105, 14);
		getContentPane().add(label_76);

		label_77 = new JLabel(database.uscite_anno(2037));
		label_77.setBounds(261, 525, 105, 14);
		getContentPane().add(label_77);
		setBounds(10, 10, 475, 658);

		label_78 = new JLabel(database.entrate_anno(2038));
		label_78.setBounds(126, 545, 105, 14);
		getContentPane().add(label_78);

		label_79 = new JLabel(database.uscite_anno(2038));
		label_79.setBounds(261, 545, 105, 14);
		getContentPane().add(label_79);
		setBounds(10, 10, 475, 658);

		label_80 = new JLabel(database.entrate_anno(2039));
		label_80.setBounds(126, 565, 105, 14);
		getContentPane().add(label_80);

		label_81 = new JLabel(database.uscite_anno(2039));
		label_81.setBounds(261, 565, 105, 14);
		getContentPane().add(label_81);
		setBounds(10, 10, 475, 658);

		label_82 = new JLabel(database.entrate_anno(2040));
		label_82.setBounds(126, 585, 105, 14);
		getContentPane().add(label_82);

		label_83 = new JLabel(database.uscite_anno(2040));
		label_83.setBounds(261, 585, 105, 14);
		getContentPane().add(label_83);

		dett_14 = new JButton("Dettagli");
		dett_14.setBounds(369, 61, 80, 16);
		getContentPane().add(dett_14);
		dett_14.addActionListener(new ButtonListener());

		dett_15 = new JButton("Dettagli");
		dett_15.setBounds(369, 81, 80, 16);
		getContentPane().add(dett_15);
		dett_15.addActionListener(new ButtonListener());

		dett_16 = new JButton("Dettagli");
		dett_16.setBounds(369, 101, 80, 16);
		getContentPane().add(dett_16);
		dett_16.addActionListener(new ButtonListener());

		dett_17 = new JButton("Dettagli");
		dett_17.setBounds(369, 121, 80, 16);
		getContentPane().add(dett_17);
		dett_17.addActionListener(new ButtonListener());

		dett_18 = new JButton("Dettagli");
		dett_18.setBounds(369, 141, 80, 16);
		getContentPane().add(dett_18);
		dett_18.addActionListener(new ButtonListener());

		dett_19 = new JButton("Dettagli");
		dett_19.setBounds(369, 161, 80, 16);
		getContentPane().add(dett_19);
		dett_19.addActionListener(new ButtonListener());

		dett_20 = new JButton("Dettagli");
		dett_20.setBounds(369, 181, 80, 16);
		getContentPane().add(dett_20);
		dett_20.addActionListener(new ButtonListener());

		dett_21 = new JButton("Dettagli");
		dett_21.setBounds(369, 201, 80, 16);
		getContentPane().add(dett_21);
		dett_21.addActionListener(new ButtonListener());

		dett_22 = new JButton("Dettagli");
		dett_22.setBounds(369, 221, 80, 16);
		getContentPane().add(dett_22);
		dett_22.addActionListener(new ButtonListener());

		dett_23 = new JButton("Dettagli");
		dett_23.setBounds(369, 241, 80, 16);
		getContentPane().add(dett_23);
		dett_23.addActionListener(new ButtonListener());

		dett_24 = new JButton("Dettagli");
		dett_24.setBounds(369, 261, 80, 16);
		getContentPane().add(dett_24);
		dett_24.addActionListener(new ButtonListener());

		dett_25 = new JButton("Dettagli");
		dett_25.setBounds(369, 281, 80, 16);
		getContentPane().add(dett_25);
		dett_25.addActionListener(new ButtonListener());

		dett_26 = new JButton("Dettagli");
		dett_26.setBounds(369, 301, 80, 16);
		getContentPane().add(dett_26);
		dett_26.addActionListener(new ButtonListener());

		dett_27 = new JButton("Dettagli");
		dett_27.setBounds(369, 321, 80, 16);
		getContentPane().add(dett_27);
		dett_27.addActionListener(new ButtonListener());

		dett_28 = new JButton("Dettagli");
		dett_28.setBounds(369, 341, 80, 16);
		getContentPane().add(dett_28);
		dett_28.addActionListener(new ButtonListener());

		dett_29 = new JButton("Dettagli");
		dett_29.setBounds(369, 361, 80, 16);
		getContentPane().add(dett_29);
		dett_29.addActionListener(new ButtonListener());

		dett_30 = new JButton("Dettagli");
		dett_30.setBounds(369, 381, 80, 16);
		getContentPane().add(dett_30);
		dett_30.addActionListener(new ButtonListener());

		dett_31 = new JButton("Dettagli");
		dett_31.setBounds(369, 401, 80, 16);
		getContentPane().add(dett_31);
		dett_31.addActionListener(new ButtonListener());

		dett_32 = new JButton("Dettagli");
		dett_32.setBounds(369, 421, 80, 16);
		getContentPane().add(dett_32);
		dett_32.addActionListener(new ButtonListener());

		dett_33 = new JButton("Dettagli");
		dett_33.setBounds(369, 441, 80, 16);
		getContentPane().add(dett_33);
		dett_33.addActionListener(new ButtonListener());

		dett_34 = new JButton("Dettagli");
		dett_34.setBounds(369, 461, 80, 16);
		getContentPane().add(dett_34);
		dett_34.addActionListener(new ButtonListener());

		dett_35 = new JButton("Dettagli");
		dett_35.setBounds(369, 481, 80, 16);
		getContentPane().add(dett_35);
		dett_35.addActionListener(new ButtonListener());

		dett_36 = new JButton("Dettagli");
		dett_36.setBounds(369, 501, 80, 16);
		getContentPane().add(dett_36);
		dett_36.addActionListener(new ButtonListener());

		dett_37 = new JButton("Dettagli");
		dett_37.setBounds(369, 521, 80, 16);
		getContentPane().add(dett_37);
		dett_37.addActionListener(new ButtonListener());

		dett_38 = new JButton("Dettagli");
		dett_38.setBounds(369, 541, 80, 16);
		getContentPane().add(dett_38);
		dett_38.addActionListener(new ButtonListener());

		dett_39 = new JButton("Dettagli");
		dett_39.setBounds(369, 561, 80, 16);
		getContentPane().add(dett_39);
		dett_39.addActionListener(new ButtonListener());

		dett_40 = new JButton("Dettagli");
		dett_40.setBounds(369, 581, 80, 16);
		getContentPane().add(dett_40);
		dett_40.addActionListener(new ButtonListener());

		this.setVisible(true);
	}

	public class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == dett_13) {

				Dettagli fe = new Dettagli(database,2013);
			}
			if (e.getSource() == dett_14) {
				Dettagli fe = new Dettagli(database,2014);
			}
			if (e.getSource() == dett_15) {
				Dettagli fe = new Dettagli(database,2015);
			}
			if (e.getSource() == dett_16) {
				Dettagli fe = new Dettagli(database,2016);
			}
			if (e.getSource() == dett_17) {
				Dettagli fe = new Dettagli(database,2017);
			}
			if (e.getSource() == dett_18) {
				Dettagli fe = new Dettagli(database,2018);
			}
			if (e.getSource() == dett_19) {
				Dettagli fe = new Dettagli(database,2019);
			}
			if (e.getSource() == dett_20) {
				Dettagli fe = new Dettagli(database,2020);
			}
			if (e.getSource() == dett_21) {
				Dettagli fe = new Dettagli(database,2021);
			}
			if (e.getSource() == dett_22) {
				Dettagli fe = new Dettagli(database,2022);
			}
			if (e.getSource() == dett_23) {
				Dettagli fe = new Dettagli(database,2023);
			}
			if (e.getSource() == dett_24) {
				Dettagli fe = new Dettagli(database,2024);
			}
			if (e.getSource() == dett_25) {
				Dettagli fe = new Dettagli(database,2025);
			}
			if (e.getSource() == dett_26) {
				Dettagli fe = new Dettagli(database,2026);
			}
			if (e.getSource() == dett_27) {
				Dettagli fe = new Dettagli(database,2027);
			}
			if (e.getSource() == dett_28) {
				Dettagli fe = new Dettagli(database,2028);
			}
			if (e.getSource() == dett_29) {
				Dettagli fe = new Dettagli(database,2029);
			}
			if (e.getSource() == dett_30) {
				Dettagli fe = new Dettagli(database,2030);
			}
			if (e.getSource() == dett_31) {
				Dettagli fe = new Dettagli(database,2031);
			}
			if (e.getSource() == dett_32) {
				Dettagli fe = new Dettagli(database,2032);
			}
			if (e.getSource() == dett_33) {
				Dettagli fe = new Dettagli(database,2033);
			}
			if (e.getSource() == dett_34) {
				Dettagli fe = new Dettagli(database,2034);
			}
			if (e.getSource() == dett_35) {
				Dettagli fe = new Dettagli(database,2035);
			}
			if (e.getSource() == dett_36) {
				Dettagli fe = new Dettagli(database,2036);
			}
			if (e.getSource() == dett_37) {
				Dettagli fe = new Dettagli(database,2037);
			}
			if (e.getSource() == dett_38) {
				Dettagli fe = new Dettagli(database,2038);
			}
			if (e.getSource() == dett_39) {
				Dettagli fe = new Dettagli(database,2039);
			}
			if (e.getSource() == dett_40) {
				Dettagli fe = new Dettagli(database,2040);
			}

		}

	}
}
