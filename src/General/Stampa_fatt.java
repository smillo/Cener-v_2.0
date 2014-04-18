package General;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.border.LineBorder;
import javax.swing.event.*;

import java.io.*;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import javax.swing.*;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.*;

import java.awt.*;
import java.awt.event.ActionListener;

//2 PERCORSI

public class Stampa_fatt {

	private static Font sigla = new Font(Font.FontFamily.TIMES_ROMAN, 20,
			Font.BOLD);
	private static Font intestazione = new Font(Font.FontFamily.TIMES_ROMAN, 8);
	private static Font intestazione_nome = new Font(
			Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
	private static Font dati = new Font(Font.FontFamily.TIMES_ROMAN, 11,
			Font.BOLD);
	private static Font campi = new Font(Font.FontFamily.TIMES_ROMAN, 11);
	static DecimalFormatSymbols form = new DecimalFormatSymbols(Locale.ENGLISH);
	static DecimalFormat formatter = new DecimalFormat("#.##", form);
	static int indice, index;
	static String imp, imp2, imponib, iva, impos, tot_fat, rit, tot_dov;

	public Stampa_fatt() throws DocumentException, IOException {

	}

	public static void print_fatture(Paragraph pref, String data,String numero, String a,
			String b, String c, String d, String e, String f, String g,
			double h, String l, double m, double n, double o, double p,
			double q, double r, double s) throws DocumentException, IOException {

		Paragraph prefazione = pref;

		formatter.setMaximumFractionDigits(2);
		formatter.setMinimumFractionDigits(2);
		imp = formatter.format(h);
		imp2 = formatter.format(m);
		if (imp2.equals("0.00")) {
			imp2 = "";
		}
		imponib = formatter.format(n);
		iva = formatter.format(o);
		impos = formatter.format(p);
		tot_fat = formatter.format(q);
		rit = formatter.format(r);
		if (rit.equals("0.00")) {
			rit = "";
		}
		tot_dov = formatter.format(s);
		if (tot_dov.equals("0.00")) {
			tot_dov = "";
		}
		// Aggiungiamo il titolo
		Paragraph titolo1 = new Paragraph("SD", sigla);
		titolo1.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo1);

		Paragraph titolo2 = new Paragraph("IMPRESA DI PULIZIA ", intestazione);
		titolo2.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo2);

		Paragraph titolo3 = new Paragraph("SMILLOVICH DAVID", intestazione_nome);
		titolo3.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo3);

		Paragraph titolo4 = new Paragraph("PULIZIA CIVILE E INDUSTRIALE",
				intestazione);
		titolo4.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo4);

		Paragraph titolo5 = new Paragraph("CONDOMINI-UFFICI-NEGOZI",
				intestazione);
		titolo5.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo5);

		Paragraph titolo6 = new Paragraph("LAVAGGIO MOQUETTES E VETRINE",
				intestazione);
		titolo6.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo6);

		Paragraph titolo7 = new Paragraph(
				"21100 VARESE.VIA GOZZI 46 TEL. 03321693664", intestazione);
		titolo7.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo7);

		Paragraph titolo8 = new Paragraph(
				"C.F.SMLDVD61S29Z700I-R.I.VARESE 114108", intestazione);
		titolo8.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo8);

		Paragraph titolo9 = new Paragraph("PARTITA IVA 01963900129",
				intestazione);
		titolo9.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo9);

		Paragraph titolo10 = new Paragraph(
				"SITO: www.impresasmillovich.altervista.org", intestazione);
		titolo10.setAlignment(Element.ALIGN_LEFT);
		prefazione.add(titolo10);

		aggiungiLineaVuota(prefazione, 2);

		float[] columnWidths = { 3f, 3f };

		PdfPTable table = new PdfPTable(2);
		table.setWidths(columnWidths);

		PdfPCell cell3 = new PdfPCell(new Paragraph(
				"Numero Fattura           "+numero, dati));
		cell3.setBorderWidth(0);

		PdfPCell cell4 = new PdfPCell(new Paragraph(
				"       Dati identificativi del cliente", dati));
		cell4.setBorderWidth(0);

		PdfPCell cell5 = new PdfPCell(new Paragraph(
				"Data                          " + data, dati));
		cell5.setBorderWidth(0);

		PdfPCell cell6 = new PdfPCell(new Paragraph("       " + a, campi));
		cell6.setBorderWidth(0);

		PdfPCell cell7 = new PdfPCell(new Paragraph(""));
		cell7.setBorderWidth(0);

		PdfPCell cell8 = new PdfPCell(new Paragraph("       " + b, campi));
		cell8.setBorderWidth(0);

		PdfPCell cell9 = new PdfPCell(new Paragraph(""));
		cell9.setBorderWidth(0);

		PdfPCell cell10 = new PdfPCell(new Paragraph("       " + c, campi));
		cell10.setBorderWidth(0);

		PdfPCell cell11 = new PdfPCell(new Paragraph(""));
		cell11.setBorderWidth(0);

		PdfPCell cell12 = new PdfPCell(new Paragraph("       " + d + "      "
				+ e, campi));
		cell12.setBorderWidth(0);

		table.addCell(cell3);
		table.addCell(cell4);
		table.addCell(cell5);
		table.addCell(cell6);
		table.addCell(cell7);
		table.addCell(cell8);
		table.addCell(cell9);
		table.addCell(cell10);
		table.addCell(cell11);
		table.addCell(cell12);
		prefazione.add(table);

		aggiungiLineaVuota(prefazione, 2);

		PdfPTable table2 = new PdfPTable(2);
		table2.setWidths(columnWidths);

		PdfPCell cell13 = new PdfPCell(new Paragraph("Metodi di pagamento",
				dati));
		cell13.setBorderWidth(0);

		PdfPCell cell14 = new PdfPCell(new Paragraph(
				"       C.F. / Partita IVA", dati));
		cell14.setBorderWidth(0);

		table2.addCell(cell13);
		table2.addCell(cell14);
		prefazione.add(table2);

		aggiungiLineaVuota(prefazione, 1);

		PdfPTable table3 = new PdfPTable(2);
		table3.setWidths(columnWidths);

		PdfPCell cell19 = new PdfPCell(new Paragraph(
				"BONIFICO BANCARIO RIC FATTURA", campi));
		cell19.setBorderWidth(0);

		PdfPCell cell20 = new PdfPCell(new Paragraph("       " + f, campi));
		cell20.setBorderWidth(0);

		PdfPCell cell21 = new PdfPCell(new Paragraph(
				"BANCA INTESA(P.zza S.Vittore VA)", campi));
		cell21.setBorderWidth(0);

		PdfPCell cell22 = new PdfPCell(new Paragraph(""));
		cell22.setBorderWidth(0);

		PdfPCell cell23 = new PdfPCell(new Paragraph(
				"IBAN IT42O0306910810000037029124", campi));
		cell23.setBorderWidth(0);

		PdfPCell cell24 = new PdfPCell(new Paragraph(""));
		cell24.setBorderWidth(0);

		table3.addCell(cell19);
		table3.addCell(cell20);
		table3.addCell(cell21);
		table3.addCell(cell22);
		table3.addCell(cell23);
		table3.addCell(cell24);

		prefazione.add(table3);

		aggiungiLineaVuota(prefazione, 3);

		PdfPTable table4 = new PdfPTable(2);
		table4.setWidths(columnWidths);

		PdfPCell cell27 = new PdfPCell(
				new Paragraph("DESCRIZIONE       ", dati));
		cell27.setBorderWidth(0);

		PdfPCell cell28 = new PdfPCell(new Paragraph(
				"                      IMPORTO", dati));
		cell28.setBorderWidth(0);

		table4.addCell(cell27);
		table4.addCell(cell28);
		prefazione.add(table4);

		aggiungiLineaVuota(prefazione, 1);

		PdfPTable table5 = new PdfPTable(2);
		table5.setWidths(columnWidths);

		PdfPCell cell29 = new PdfPCell(new Paragraph(g, campi));
		cell29.setBorderWidth(0);

		PdfPCell cell30 = new PdfPCell(new Paragraph("                      "
				+ imp, campi));
		cell30.setBorderWidth(0);

		PdfPCell cell31 = new PdfPCell(new Paragraph(l, campi));
		cell31.setBorderWidth(0);

		PdfPCell cell32 = new PdfPCell(new Paragraph("                      "
				+ imp2, campi));
		cell32.setBorderWidth(0);

		table5.addCell(cell29);
		table5.addCell(cell30);
		table5.addCell(cell31);
		table5.addCell(cell32);
		prefazione.add(table5);

		aggiungiLineaVuota(prefazione, 8);

		PdfPTable table6 = new PdfPTable(2);
		table6.setWidths(columnWidths);

		PdfPCell cell33 = new PdfPCell(new Paragraph(
				"IMPONIBILE        ALIQUOTA IVA", dati));
		cell33.setBorderWidth(0);

		PdfPCell cell34 = new PdfPCell(new Paragraph(
				"IMPOSTA        TOTALE FATTURA", dati));
		cell34.setBorderWidth(0);

		PdfPCell cell35 = new PdfPCell(new Paragraph("    " + imponib
				+ "                      " + iva, campi));
		cell35.setBorderWidth(0);

		PdfPCell cell36 = new PdfPCell(new Paragraph("     " + impos
				+ "                        " + tot_fat, campi));
		cell36.setBorderWidth(0);

		table6.addCell(cell33);
		table6.addCell(cell34);
		table6.addCell(cell35);
		table6.addCell(cell36);
		prefazione.add(table6);

		aggiungiLineaVuota(prefazione, 2);

		PdfPTable table7 = new PdfPTable(2);
		table7.setWidths(columnWidths);

		PdfPCell cell37 = new PdfPCell(new Paragraph("RITENUTA D'ACCONTO 4% ",
				dati));
		cell37.setBorderWidth(0);

		PdfPCell cell38 = new PdfPCell(new Paragraph("      TOTALE DOVUTO",
				dati));
		cell38.setBorderWidth(0);

		PdfPCell cell39 = new PdfPCell(new Paragraph("                   "
				+ rit, campi));
		cell39.setBorderWidth(0);

		PdfPCell cell40 = new PdfPCell(new Paragraph("                  "
				+ tot_dov, campi));
		cell40.setBorderWidth(0);

		table7.addCell(cell37);
		table7.addCell(cell38);
		table7.addCell(cell39);
		table7.addCell(cell40);
		prefazione.add(table7);

		// Aggiunta al documento

	}

	private static void aggiungiLineaVuota(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}

	}

}