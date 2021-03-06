package General;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;
import javax.swing.ListModel;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Database {
	private static Connection connection;
	DecimalFormatSymbols symbols = new DecimalFormatSymbols();
	String format = "#.##";
	

	public Database() {
		try {
			symbols.setDecimalSeparator('.');
			Class.forName("com.mysql.jdbc.Driver"); // connessione con db
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/fatturazione", "root", "root");
			
			
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Database non connesso!");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Database inesistente");
		}
	}

	public void Inserisci_Cliente(Cliente cliente) {

		PreparedStatement pst = null;

		try {

			pst = connection
					.prepareStatement("INSERT INTO cliente VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pst.setString(1, cliente.getNome());
			pst.setString(2, cliente.getNome2());
			pst.setString(3, cliente.getIndirizzo());
			pst.setString(4, cliente.getCitt�());
			pst.setString(5, cliente.getCap());
			pst.setString(6, cliente.getPiva());
			pst.setString(7, cliente.getDescrizione());
			pst.setDouble(8, cliente.getImporto());
			pst.setString(9, cliente.getDescrizione2());
			pst.setDouble(10, cliente.getImporto2());
			pst.setDouble(11, cliente.getImponibile());
			pst.setDouble(12, cliente.getIva());
			pst.setDouble(13, cliente.getImposta());
			pst.setDouble(14, cliente.getTot_fattura());
			pst.setDouble(15, cliente.getRitenuta());
			pst.setDouble(16, cliente.getTot_dovuto());
			pst.setBoolean(17, cliente.isGennaio());
			pst.setBoolean(18, cliente.isFebbraio());
			pst.setBoolean(19, cliente.isMarzo());
			pst.setBoolean(20, cliente.isAprile());
			pst.setBoolean(21, cliente.isMaggio());
			pst.setBoolean(22, cliente.isGiugno());
			pst.setBoolean(23, cliente.isLuglio());
			pst.setBoolean(24, cliente.isAgosto());
			pst.setBoolean(25, cliente.isSettembre());
			pst.setBoolean(26, cliente.isOttobre());
			pst.setBoolean(27, cliente.isNovembre());
			pst.setBoolean(28, cliente.isDicembre());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

		if (cliente.isGennaio()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO gennaio VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}
		if (cliente.isFebbraio()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO febbraio VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isMarzo()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO marzo VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isAprile()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO aprile VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isMaggio()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO maggio VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isGiugno()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO giugno VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isLuglio()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO luglio VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isAgosto()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO agosto VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isSettembre()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO settembre VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isOttobre()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO ottobre VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isNovembre()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO novembre VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (cliente.isDicembre()) {
			try {
				pst = connection
						.prepareStatement("INSERT INTO dicembre VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				pst.setString(1, cliente.getNome());
				pst.setString(2, cliente.getNome2());
				pst.setString(3, cliente.getIndirizzo());
				pst.setString(4, cliente.getCitt�());
				pst.setString(5, cliente.getCap());
				pst.setString(6, cliente.getPiva());
				pst.setString(7, cliente.getDescrizione());
				pst.setDouble(8, cliente.getImporto());
				pst.setString(9, cliente.getDescrizione2());
				pst.setDouble(10, cliente.getImporto2());
				pst.setDouble(11, cliente.getImponibile());
				pst.setDouble(12, cliente.getIva());
				pst.setDouble(13, cliente.getImposta());
				pst.setDouble(14, cliente.getTot_fattura());
				pst.setDouble(15, cliente.getRitenuta());
				pst.setDouble(16, cliente.getTot_dovuto());
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}
	}

	public String[] elenco_clienti() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM cliente");

			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(rs.getString("cliente"));
			}
			String[] result = new String[list.size()];
			result = list.toArray(result);
			return result;
		} catch (Exception e) {

			return null;
		}

	}

	public String[] elenco_clienti_mese(String mese) {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM " + mese);

			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(rs.getString("cliente"));
			}
			String[] result = new String[list.size()];
			result = list.toArray(result);
			return result;
		} catch (Exception e) {

			return null;
		}

	}

	public void Modifica_Cliente(Cliente cliente, LinkedList mesi_vecchi,
			LinkedList mesi_nuovi) {
		String mese = null;
		int i;

		PreparedStatement prep = null;
		try {

			prep = connection
					.prepareStatement("UPDATE cliente SET cliente = ?, cliente2 = ?, indirizzo = ?, citt� = ?, cap = ?, partitaIva = ?, descrizione = ?, importo = ?, descrizione2 = ?, importo2 = ?, imponibile = ?, iva = ?, imposta = ?, totale_fattura = ?, ritenuta = ?, totale_dovuto = ? ,gennaio = ?,febbraio = ?,marzo = ?,aprile = ?,maggio = ?,giugno = ?,luglio = ?,agosto = ?,settembre = ?,ottobre = ?,novembre = ?,dicembre = ? where cliente = ?");
			prep.setString(1, cliente.getNome());
			prep.setString(2, cliente.getNome2());
			prep.setString(3, cliente.getIndirizzo());
			prep.setString(4, cliente.getCitt�());
			prep.setString(5, cliente.getCap());
			prep.setString(6, cliente.getPiva());
			prep.setString(7, cliente.getDescrizione());
			prep.setDouble(8, cliente.getImporto());
			prep.setString(9, cliente.getDescrizione2());
			prep.setDouble(10, cliente.getImporto2());
			prep.setDouble(11, cliente.getImponibile());
			prep.setDouble(12, cliente.getIva());
			prep.setDouble(13, cliente.getImposta());
			prep.setDouble(14, cliente.getTot_fattura());
			prep.setDouble(15, cliente.getRitenuta());
			prep.setDouble(16, cliente.getTot_dovuto());
			prep.setBoolean(17, cliente.isGennaio());
			prep.setBoolean(18, cliente.isFebbraio());
			prep.setBoolean(19, cliente.isMarzo());
			prep.setBoolean(20, cliente.isAprile());
			prep.setBoolean(21, cliente.isMaggio());
			prep.setBoolean(22, cliente.isGiugno());
			prep.setBoolean(23, cliente.isLuglio());
			prep.setBoolean(24, cliente.isAgosto());
			prep.setBoolean(25, cliente.isSettembre());
			prep.setBoolean(26, cliente.isOttobre());
			prep.setBoolean(27, cliente.isNovembre());
			prep.setBoolean(28, cliente.isDicembre());
			prep.setString(29, String.valueOf(mesi_vecchi.get(0)));
			prep.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

		for (i = 0; i < 12; i++) {

			switch (String.valueOf(i)) {
			case "0":
				mese = "gennaio";

				break;

			case "1":
				mese = "febbraio";

				break;

			case "2":
				mese = "marzo";

				break;

			case "3":
				mese = "aprile";

				break;

			case "4":
				mese = "maggio";

				break;

			case "5":
				mese = "giugno";

				break;

			case "6":
				mese = "luglio";

				break;

			case "7":
				mese = "agosto";

				break;

			case "8":
				mese = "settembre";

				break;

			case "9":
				mese = "ottobre";

				break;

			case "10":
				mese = "novembre";

				break;

			case "11":
				mese = "dicembre";

				break;

			}

			if (String.valueOf(mesi_vecchi.get(i + 1)) == "true"
					&& String.valueOf(mesi_nuovi.get(i)) == "true") {
				PreparedStatement pst = null;

				try {

					pst = connection
							.prepareStatement("UPDATE "
									+ mese
									+ " SET cliente = ?, cliente2 = ?, indirizzo = ?, citt� = ?, cap = ?, partitaIva = ?, descrizione = ?, importo = ?, descrizione2 = ?, importo2 = ?, imponibile = ?, iva = ?, imposta = ?, totale_fattura = ?, ritenuta = ?, totale_dovuto = ? where cliente = ?");
					pst.setString(1, cliente.getNome());
					pst.setString(2, cliente.getNome2());
					pst.setString(3, cliente.getIndirizzo());
					pst.setString(4, cliente.getCitt�());
					pst.setString(5, cliente.getCap());
					pst.setString(6, cliente.getPiva());
					pst.setString(7, cliente.getDescrizione());
					pst.setDouble(8, cliente.getImporto());
					pst.setString(9, cliente.getDescrizione2());
					pst.setDouble(10, cliente.getImporto2());
					pst.setDouble(11, cliente.getImponibile());
					pst.setDouble(12, cliente.getIva());
					pst.setDouble(13, cliente.getImposta());
					pst.setDouble(14, cliente.getTot_fattura());
					pst.setDouble(15, cliente.getRitenuta());
					pst.setDouble(16, cliente.getTot_dovuto());
					pst.setString(17, String.valueOf(mesi_vecchi.get(0)));
					pst.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();

				}

			} else if (String.valueOf(mesi_vecchi.get(i + 1)) == "true"
					&& String.valueOf(mesi_nuovi.get(i)) == "false") {
				PreparedStatement pst = null;

				try {

					pst = connection.prepareStatement("DELETE FROM " + mese
							+ " where cliente = ?");
					pst.setString(1, String.valueOf(mesi_vecchi.get(0)));
					pst.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();

				}

			}

			else if (String.valueOf(mesi_vecchi.get(i + 1)) == "false"
					&& String.valueOf(mesi_nuovi.get(i)) == "true") {
				PreparedStatement pst = null;

				try {

					pst = connection.prepareStatement("INSERT INTO " + mese
							+ " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
					pst.setString(1, cliente.getNome());
					pst.setString(2, cliente.getNome2());
					pst.setString(3, cliente.getIndirizzo());
					pst.setString(4, cliente.getCitt�());
					pst.setString(5, cliente.getCap());
					pst.setString(6, cliente.getPiva());
					pst.setString(7, cliente.getDescrizione());
					pst.setDouble(8, cliente.getImporto());
					pst.setString(9, cliente.getDescrizione2());
					pst.setDouble(10, cliente.getImporto2());
					pst.setDouble(11, cliente.getImponibile());
					pst.setDouble(12, cliente.getIva());
					pst.setDouble(13, cliente.getImposta());
					pst.setDouble(14, cliente.getTot_fattura());
					pst.setDouble(15, cliente.getRitenuta());
					pst.setDouble(16, cliente.getTot_dovuto());

					pst.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();

				}

			}

			else if (String.valueOf(mesi_vecchi.get(i + 1)) == "false"
					&& String.valueOf(mesi_nuovi.get(i)) == "false") {
				// niente

			}
		}

	}

	public void elimina_Cliente(String nome_cliente) {

		PreparedStatement prep = null;
		try {

			prep = connection
					.prepareStatement("DELETE from cliente where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from gennaio where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from febbraio where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from marzo where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from aprile where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from maggio where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from giugno where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from luglio where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from agosto where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from settembre where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from ottobre where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from novembre where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			prep = connection
					.prepareStatement("DELETE from dicembre where cliente = ?;");
			prep.setString(1, nome_cliente);
			prep.executeUpdate();
			JOptionPane.showMessageDialog(null, "cliente eliminato per sempre");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void elimina_Cliente_mese(String nome_cliente, String mese) {

		PreparedStatement prep = null;
		try {

			prep = connection.prepareStatement("DELETE from " + mese
					+ " where cliente = ?");

			prep.setString(1, nome_cliente);

			JOptionPane.showMessageDialog(null, "cliente eliminato da " + mese);
			prep.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void Modifica_Cliente_mese(String nome, String nome2,
			String indirizzo, String citt�, String cap, String piva,
			String descrizione, double importo, String descrizione2,
			double importo2, double imponibile, double iva, double imposta,
			double tot_fattura, double ritenuta, double tot_dovuto,
			String mese, String nome_cliente) {

		PreparedStatement pst = null;

		try {

			pst = connection
					.prepareStatement("UPDATE "
							+ mese
							+ " SET cliente = ?, cliente2 = ?, indirizzo = ?, citt� = ?, cap = ?, partitaIva = ?, descrizione = ?, importo = ?, descrizione2 = ?, importo2 = ?, imponibile = ?, iva = ?, imposta = ?, totale_fattura = ?, ritenuta = ?, totale_dovuto = ? where cliente = ?");
			pst.setString(1, nome);
			pst.setString(2, nome2);
			pst.setString(3, indirizzo);
			pst.setString(4, citt�);
			pst.setString(5, cap);
			pst.setString(6, piva);
			pst.setString(7, descrizione);
			pst.setDouble(8, importo);
			pst.setString(9, descrizione2);
			pst.setDouble(10, importo2);
			pst.setDouble(11, imponibile);
			pst.setDouble(12, iva);
			pst.setDouble(13, imposta);
			pst.setDouble(14, tot_fattura);
			pst.setDouble(15, ritenuta);
			pst.setDouble(16, tot_dovuto);
			pst.setString(17, nome_cliente);
			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void nuovo_anno() {

		PreparedStatement prep = null;
		try {

			prep = connection.prepareStatement("DROP TABLE gennaio;");
			prep.executeUpdate();

			prep = connection.prepareStatement("DROP TABLE febbraio;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE marzo;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE aprile;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE maggio;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE giugno;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE luglio;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE agosto;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE settembre;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE ottobre;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE novembre;");

			prep.executeUpdate();
			prep = connection.prepareStatement("DROP TABLE dicembre;");

			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE gennaio(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE febbraio(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE marzo(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE aprile(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE maggio(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE giugno(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE luglio(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE agosto(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE settembre(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE ottobre(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE novembre(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE dicembre(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,citt� varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();
			ResultSet rs;
			for (int i = 0; i < 12; i++) {

				switch (String.valueOf(i)) {

				case "0":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where gennaio = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO gennaio VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "1":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where febbraio = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO febbraio VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "2":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where marzo = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO marzo VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "3":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where aprile = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO aprile VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "4":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where maggio = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO maggio VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "5":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where giugno = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO giugno VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "6":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where luglio = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO luglio VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "7":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where agosto = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO agosto VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "8":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where settembre = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO settembre VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "9":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where ottobre = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO ottobre VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "10":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where novembre = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO novembre VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;

				case "11":

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,citt�,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where dicembre = true");

						rs = prep.executeQuery();

						while (rs.next()) {
							String a = rs.getString(1);
							String b = rs.getString(2);
							String c = rs.getString(3);
							String d = rs.getString(4);
							String e = rs.getString(5);
							String f = rs.getString(6);
							String g = rs.getString(7);
							double h = rs.getDouble(8);
							String l = rs.getString(9);
							double m = rs.getDouble(10);
							double n = rs.getDouble(11);
							double o = rs.getDouble(12);
							double p = rs.getDouble(13);
							double q = rs.getDouble(14);
							double r = rs.getDouble(15);
							double s = rs.getDouble(16);

							prep = connection
									.prepareStatement("INSERT INTO dicembre VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

							prep.setString(1, a);
							prep.setString(2, b);
							prep.setString(3, c);
							prep.setString(4, d);
							prep.setString(5, e);
							prep.setString(6, f);
							prep.setString(7, g);
							prep.setDouble(8, h);
							prep.setString(9, l);
							prep.setDouble(10, m);
							prep.setDouble(11, n);
							prep.setDouble(12, o);
							prep.setDouble(13, p);
							prep.setDouble(14, q);
							prep.setDouble(15, r);
							prep.setDouble(16, s);
							prep.executeUpdate();
						}

					} catch (Exception e) {

						e.printStackTrace();
					}

					break;
				}

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public Cliente seleziona(String nome_cliente) {
		try {
			Cliente client = null;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT * FROM cliente where cliente = ?");
			prep.setString(1, nome_cliente);
			rs = prep.executeQuery();

			while (rs.next()) {
				String a = rs.getString(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				String d = rs.getString(4);
				String e = rs.getString(5);
				String f = rs.getString(6);
				String g = rs.getString(7);
				double h = rs.getDouble(8);
				String l = rs.getString(9);
				double m = rs.getDouble(10);
				double n = rs.getDouble(11);
				double o = rs.getDouble(12);
				double p = rs.getDouble(13);
				double q = rs.getDouble(14);
				double r = rs.getDouble(15);
				double s = rs.getDouble(16);
				boolean gen = rs.getBoolean(17);
				boolean feb = rs.getBoolean(18);
				boolean mar = rs.getBoolean(19);
				boolean apr = rs.getBoolean(20);
				boolean mag = rs.getBoolean(21);
				boolean giu = rs.getBoolean(22);
				boolean lug = rs.getBoolean(23);
				boolean ago = rs.getBoolean(24);
				boolean set = rs.getBoolean(25);
				boolean ott = rs.getBoolean(26);
				boolean nov = rs.getBoolean(27);
				boolean dic = rs.getBoolean(28);

				client = new Cliente(a, b, c, d, e, f, g, h, l, m, n, o, p, q,
						r, s, gen, feb, mar, apr, mag, giu, lug, ago, set, ott,
						nov, dic);
			}
			return client;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public Cliente seleziona_mese(String nome_cliente, String mese) {
		try {
			Cliente client = null;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT * FROM " + mese
							+ " where cliente = ?");
			prep.setString(1, nome_cliente);
			rs = prep.executeQuery();

			while (rs.next()) {
				String a = rs.getString(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				String d = rs.getString(4);
				String e = rs.getString(5);
				String f = rs.getString(6);
				String g = rs.getString(7);
				double h = rs.getDouble(8);
				String l = rs.getString(9);
				double m = rs.getDouble(10);
				double n = rs.getDouble(11);
				double o = rs.getDouble(12);
				double p = rs.getDouble(13);
				double q = rs.getDouble(14);
				double r = rs.getDouble(15);
				double s = rs.getDouble(16);

				client = new Cliente(a, b, c, d, e, f, g, h, l, m, n, o, p, q,
						r, s, false, false, false, false, false, false, false,
						false, false, false, false, false);
			}
			return client;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void stampafattura(String mese, String data, String anno) {
		try {

			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT * FROM " + mese);

			String FILE = "C:\\Users\\massimiliano\\Documents\\fatture\\" + mese + "_"
					+ anno + ".pdf";

			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();

			rs = prep.executeQuery();

			while (rs.next()) {
				String a = rs.getString(1);
				String b = rs.getString(2);
				String c = rs.getString(3);
				String d = rs.getString(4);
				String e = rs.getString(5);
				String f = rs.getString(6);
				String g = rs.getString(7);
				double h = rs.getDouble(8);
				String l = rs.getString(9);
				double m = rs.getDouble(10);
				double n = rs.getDouble(11);
				double o = rs.getDouble(12);
				double p = rs.getDouble(13);
				double q = rs.getDouble(14);
				double r = rs.getDouble(15);
				double s = rs.getDouble(16);

				String numero = Numero_fattura.contaFattura();
				Paragraph prefazione = new Paragraph();
				Stampa_fatt.print_fatture(prefazione, data, numero, a, b, c, d,
						e, f, g, h, l, m, n, o, p, q, r, s);
				document.add(prefazione);
				document.newPage();

				if (r == 0.0) {
					inserisci_fattura(numero, data, a, q);
					inserisci_el_paganti(data, a, q);
				} else {
					inserisci_fattura(numero, data, a, s);
					inserisci_el_paganti(data, a, s);
				}
			}
			document.close();

			File f = new File("C:\\Users\\massimiliano\\Documents\\fatture\\" + mese
					+ "_" + anno + ".pdf");
			java.awt.Desktop.getDesktop().open(f);

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	public void print_mail(String nome, String data) {
		try {
			
			if(nome!=null&&data!=null){
				
StringTokenizer stk = new StringTokenizer(data,"/");
String gg = stk.nextToken();
String mese = stk.nextToken();

if (mese.equals("01")) {
	mese = "gennaio";
} else if (mese.equals("02")) {
	mese = "febbraio";
} else if (mese.equals("03")) {
	mese = "marzo";
} else if (mese.equals("04")) {
	mese = "aprile";
} else if (mese.equals("05")) {
	mese = "maggio";
} else if (mese.equals("06")) {
	mese = "giugno";
} else if (mese.equals("07")) {
	mese = "luglio";
} else if (mese.equals("08")) {
	mese = "agosto";
} else if (mese.equals("09")) {
	mese = "settembre";
} else if (mese.equals("10")) {
	mese = "ottobre";
} else if (mese.equals("11")) {
	mese = "novembre";
} else if (mese.equals("12")) {
	mese = "dicembre";
}


String data_fatt = null;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT * from "+mese+" natural join fatture where data_fattura = ? and cliente = ?");
			prep.setString(1, data);
			prep.setString(2, nome);
			
			String FILE = "C:\\Users\\massimiliano\\Documents\\mail\\" + nome + "_"
					+ mese + ".pdf";

			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();

			rs = prep.executeQuery();

			while (rs.next()) {
				String cliente = rs.getString(1);
				String cliente2 = rs.getString(2);
				String ind = rs.getString(3);
				String cit = rs.getString(4);
				String cap = rs.getString(5);
				String piva = rs.getString(6);
				String desc = rs.getString(7);
				double importo = rs.getDouble(8);
				String desc2 = rs.getString(9);
				double importo2 = rs.getDouble(10);
				double imponibile = rs.getDouble(11);
				double iva = rs.getDouble(12);
				double imposta = rs.getDouble(13);
				double tot_fat = rs.getDouble(14);
				double rit = rs.getDouble(15);
				double tot_dov = rs.getDouble(16);
				String numero_fat = rs.getString(17);
				data_fatt = rs.getString(18);
				
				
				Paragraph prefazione = new Paragraph();
				Stampa_fatt.print_fatture(prefazione, data_fatt, numero_fat, cliente, cliente2, ind, cit,
						cap, piva, desc, importo, desc2, importo2, imponibile, iva, imposta, tot_fat, rit, tot_dov);
				document.add(prefazione);
			
			}
			document.close();

			File f = new File("C:\\Users\\massimiliano\\Documents\\mail\\" + nome + "_"
					+ mese + ".pdf");
			
			
				JOptionPane.showMessageDialog(null, "creato file da inviare");
					
		}
			else{
				JOptionPane.showMessageDialog(null, "selezionare cliente e data della fattura");
			}
				
		}catch (Exception e) {
				
			e.printStackTrace();

		}
		
	}
	private void inserisci_el_paganti(String data, String cliente, double totale) {

		PreparedStatement pst = null;

		try {

			pst = connection
					.prepareStatement("INSERT INTO elenco_paganti VALUES(?,?,?)");
			pst.setString(1, cliente);
			pst.setString(2, data);
			pst.setDouble(3, totale);

			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	private void inserisci_fattura(String numero, String data, String cliente,
			double totale) {

		PreparedStatement pst = null;

		try {

			pst = connection
					.prepareStatement("INSERT INTO fatture VALUES(?,?,?,?)");
			pst.setString(1, numero);
			pst.setString(2, data);
			pst.setString(3, cliente);
			pst.setDouble(4, totale);

			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public LinkedList<Fatture> restituisci_fattura(String nome_c, int anno_f) {
		try {
			LinkedList<Fatture> list_fat = new LinkedList<Fatture>();
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT numero_fattura,data_fattura,totale FROM fatture where cliente = ? and data_fattura like '%"
							+ anno_f + "'");
			prep.setString(1, nome_c);

			rs = prep.executeQuery();

			while (rs.next()) {
				String num = rs.getString(1);
				String dat = rs.getString(2);
				double tot = rs.getDouble(3);
				Fatture f = new Fatture(num, dat, tot);
				list_fat.add(f);
			}
			return list_fat;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public LinkedList<Fatture> restituisci_fattura(String nome_c) {
		try {
			LinkedList<Fatture> list_fat = new LinkedList<Fatture>();
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT numero_fattura,data_fattura,totale FROM fatture where cliente = ? ");
			prep.setString(1, nome_c);

			rs = prep.executeQuery();

			while (rs.next()) {
				String num = rs.getString(1);
				String dat = rs.getString(2);
				double tot = rs.getDouble(3);
				Fatture f = new Fatture(num, dat, tot);
				list_fat.add(f);
			}
			return list_fat;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public LinkedList<String> elenco_paganti(String anno, String mese) {

		try {

			if (mese.equals("Gennaio")) {
				mese = "01";
			} else if (mese.equals("Febbraio")) {
				mese = "02";
			} else if (mese.equals("Marzo")) {
				mese = "03";
			} else if (mese.equals("Aprile")) {
				mese = "04";
			} else if (mese.equals("Maggio")) {
				mese = "05";
			} else if (mese.equals("Giugno")) {
				mese = "06";
			} else if (mese.equals("Luglio")) {
				mese = "07";
			} else if (mese.equals("Agosto")) {
				mese = "08";
			} else if (mese.equals("Settembre")) {
				mese = "09";
			} else if (mese.equals("Ottobre")) {
				mese = "10";
			} else if (mese.equals("Novembre")) {
				mese = "11";
			} else if (mese.equals("Dicembre")) {
				mese = "12";
			}
			LinkedList<String> lin = new LinkedList<String>();
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT * FROM elenco_paganti where data_pag like '%"
							+ mese + "/" + anno + "'");

			rs = prep.executeQuery();

			while (rs.next()) {
				String cliente = rs.getString(1);
				String dat = rs.getString(2);
				double tot = rs.getDouble(3);

				String s = cliente + "**" + dat + "**" + tot;
				lin.add(s);
			}
			return lin;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public void elimina_elenco_paganti(String nome, String data) {

		try {

			PreparedStatement prep = null;

			prep = connection
					.prepareStatement("DELETE from elenco_paganti where cliente = ? and data_pag = ?");

			prep.setString(1, nome);
			prep.setString(2, data);

			prep.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void aggiungi_uscita(String causa,String dettagli, String data, String importo) {

		PreparedStatement pst = null;

		try {

			pst = connection
					.prepareStatement("INSERT INTO entrate_uscite VALUES(?,?,?,?)");
			pst.setString(1, causa);
			pst.setString(2, dettagli);
			pst.setString(3, data);
			pst.setString(4, importo);

			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public LinkedList<String> uscite(String causa, int anno) {
		try {
			LinkedList<String> lin = new LinkedList<String>();
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT dettagli,data_uscita,importo FROM entrate_uscite where data_uscita like '%"
							+ anno + "' and causa = ?");
			prep.setString(1, causa);
			rs = prep.executeQuery();

			while (rs.next()) {
				String dett =  rs.getString(1);
				String dat = rs.getString(2);
				double tot = rs.getDouble(3);

				String s = dett + "  "+dat + "   � " + tot;
				lin.add(s);
			}
			return lin;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public String uscite_anno(int anno) {
		try {
			double tot = 0;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT sum(importo) FROM entrate_uscite where data_uscita like '%"
							+ anno + "'");

			rs = prep.executeQuery();
			while (rs.next()) {
				tot = rs.getDouble(1);
			}
			DecimalFormat formatter = new DecimalFormat(format, symbols);
			formatter.setGroupingSize(2);
			String numberString = formatter.format(tot);
			return numberString;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public String entrate_anno(int anno) {

		try {
			double tot = 0;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT sum(totale) FROM fatture where data_fattura like '%"
							+ anno + "'");

			rs = prep.executeQuery();
			while (rs.next()) {
				tot = rs.getDouble(1);
			}
			DecimalFormat formatter = new DecimalFormat(format, symbols);
			formatter.setGroupingSize(2);
			String numberString = formatter.format(tot);
			return numberString;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public String[] dettagli(int anno) {
		try {
			String tot = null;
			LinkedList<String> a = new LinkedList<String>();
			String causa = null, data = null,dett=null;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT * FROM entrate_uscite where data_uscita like '%"
							+ anno + "' order by causa");

			rs = prep.executeQuery();
			while (rs.next()) {
				causa = rs.getString(1);
				dett = rs.getString(2);
				data = rs.getString(3);
				tot = rs.getString(4);
				String sss = causa + " ** " +dett+" ** "+ data + " ** " + tot;
				a.add(sss);
			}

			String[] lista = new String[a.size()];
			for (int ia = 0; ia < a.size(); ia++) {
				lista[ia] = a.get(ia);
			}
			return lista;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public String elenco_paganti_mese(String mese, String anno) {
		try {

			if (mese.equals("Gennaio")) {
				mese = "01";
			} else if (mese.equals("Febbraio")) {
				mese = "02";
			} else if (mese.equals("Marzo")) {
				mese = "03";
			} else if (mese.equals("Aprile")) {
				mese = "04";
			} else if (mese.equals("Maggio")) {
				mese = "05";
			} else if (mese.equals("Giugno")) {
				mese = "06";
			} else if (mese.equals("Luglio")) {
				mese = "07";
			} else if (mese.equals("Agosto")) {
				mese = "08";
			} else if (mese.equals("Settembre")) {
				mese = "09";
			} else if (mese.equals("Ottobre")) {
				mese = "10";
			} else if (mese.equals("Novembre")) {
				mese = "11";
			} else if (mese.equals("Dicembre")) {
				mese = "12";
			}
			double tot = 0;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT sum(importo) FROM elenco_paganti where data_pag like '%/"
							+ mese + "/" + anno + "'");

			rs = prep.executeQuery();
			while (rs.next()) {
				tot = rs.getDouble(1);
			}
			DecimalFormat formatter = new DecimalFormat(format, symbols);
			formatter.setGroupingSize(2);
			String numberString = formatter.format(tot);
			return numberString;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public String elenco_paganti_anno(String anno) {
		try {
			double tot = 0;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT sum(importo) FROM elenco_paganti where data_pag like '%"
							+ anno + "'");

			rs = prep.executeQuery();
			while (rs.next()) {
				tot = rs.getDouble(1);
			}
			DecimalFormat formatter = new DecimalFormat(format, symbols);
			formatter.setGroupingSize(2);
			String numberString = formatter.format(tot);
			return numberString;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public String[] dettagli_elenco() {
		try {
			String tot = null;
			LinkedList<String> a = new LinkedList<String>();
			String cliente = null, data = null;
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT * FROM elenco_paganti order by cliente");

			rs = prep.executeQuery();
			while (rs.next()) {
				cliente = rs.getString(1);
				data = rs.getString(2);
				tot = rs.getString(3);
				String sss = cliente + " ** " + data + " ** " + tot;
				a.add(sss);
			}

			String[] lista = new String[a.size()];
			for (int ia = 0; ia < a.size(); ia++) {
				lista[ia] = a.get(ia);
			}
			return lista;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public void modifica_fattura(String nome, double totale, String numero_fat,
			String data) {

		PreparedStatement pst = null;

		try {

			pst = connection
					.prepareStatement("UPDATE fatture SET numero_fattura = ?, totale = ? where cliente = ? and data_fattura = ?");
			pst.setString(1, numero_fat);
			pst.setDouble(2, totale);
			pst.setString(3, nome);
			pst.setString(4, data);

			pst.executeUpdate();

			aggiorna_mese(nome, data, totale);
			aggiorna_elenco_paganti(nome, data, totale);
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private void aggiorna_elenco_paganti(String nome, String data, double totale) {

		try {
			PreparedStatement pst;
			pst = connection
					.prepareStatement("UPDATE elenco_paganti SET importo = ? where cliente = ? and data_pag = ?");

			pst.setDouble(1, totale);
			pst.setString(2, nome);
			pst.setString(3, data);

			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	private void aggiorna_mese(String nome, String data, double totale) {

		StringTokenizer stk = new StringTokenizer(data, "/");
		String gg = stk.nextToken();
		String mese = stk.nextToken();

		if (mese.equals("01")) {
			mese = "gennaio";
		} else if (mese.equals("02")) {
			mese = "febbraio";
		} else if (mese.equals("03")) {
			mese = "marzo";
		} else if (mese.equals("04")) {
			mese = "aprile";
		} else if (mese.equals("05")) {
			mese = "maggio";
		} else if (mese.equals("06")) {
			mese = "giugno";
		} else if (mese.equals("07")) {
			mese = "luglio";
		} else if (mese.equals("08")) {
			mese = "agosto";
		} else if (mese.equals("09")) {
			mese = "settembre";
		} else if (mese.equals("10")) {
			mese = "ottobre";
		} else if (mese.equals("11")) {
			mese = "novembre";
		} else if (mese.equals("12")) {
			mese = "dicembre";
		}

		try {
			PreparedStatement pst;
			pst = connection.prepareStatement("UPDATE " + mese
					+ " SET totale_dovuto = ? where cliente = ? ");

			pst.setDouble(1, totale);
			pst.setString(2, nome);

			pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void print(String cliente, String cliente2, String ind, String cit,
			String cap, String piva, String desc, double imp1, String desc2,
			double imp2, double imponib, double iva, double imposta,
			double t_fat, double rit, double t_dov, String giorno, String mese,
			String anno) {

		try {
			String mesef = null;
			if (mese.equals("Gennaio")) {
				mesef = "01";
			} else if (mese.equals("Febbraio")) {
				mesef = "02";
			} else if (mese.equals("Marzo")) {
				mesef = "03";
			} else if (mese.equals("Aprile")) {
				mesef = "04";
			} else if (mese.equals("Maggio")) {
				mesef = "05";
			} else if (mese.equals("Giugno")) {
				mesef = "06";
			} else if (mese.equals("Luglio")) {
				mesef = "07";
			} else if (mese.equals("Agosto")) {
				mesef = "08";
			} else if (mese.equals("Settembre")) {
				mesef = "09";
			} else if (mese.equals("Ottobre")) {
				mesef = "10";
			} else if (mese.equals("Novembre")) {
				mesef = "11";
			} else if (mese.equals("Dicembre")) {
				mesef = "12";
			}

			String FILE = "C:\\Users\\massimiliano\\Documents\\fatture\\" + cliente
					+ "_" + mese + ".pdf";

			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();
			String data = giorno + "/" + mesef + "/" + anno;
			String numero = Numero_fattura.contaFattura();
			Paragraph prefazione = new Paragraph();
			Stampa_fatt.print_fatture(prefazione, data, numero, cliente,
					cliente2, ind, cit, cap, piva, desc, imp1, desc2, imp2,
					imponib, iva, imposta, t_fat, rit, t_dov);

			document.add(prefazione);

			if (rit == 0.0) {
				inserisci_fattura(numero, data, cliente, t_fat);
				inserisci_el_paganti(data, cliente, t_fat);
			} else {
				inserisci_fattura(numero, data, cliente, t_dov);
				inserisci_el_paganti(data, cliente, t_dov);
			}

			document.close();

			File f = new File("C:\\Users\\massimiliano\\Documents\\fatture\\" + cliente
					+ "_" + mese + ".pdf");
			java.awt.Desktop.getDesktop().open(f);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void print_correttivo(String cliente, String cliente2, String ind,
			String cit, String cap, String piva, String desc, double imp1,
			String desc2, double imp2, double imponib, double iva,
			double imposta, double t_fat, double rit, double t_dov,
			String data, String numero) {

		StringTokenizer sth = new StringTokenizer(data, "/");
		String giorno = sth.nextToken();
		String mesef = sth.nextToken();
		try {
			String mese = null;

			if (mesef.equals("01")) {
				mese = "Gennaio";
			} else if (mesef.equals("02")) {
				mese = "Febbraio";
			} else if (mesef.equals("03")) {
				mese = "Marzo";
			} else if (mesef.equals("04")) {
				mese = "Aprile";
			} else if (mesef.equals("05")) {
				mese = "Maggio";
			} else if (mesef.equals("06")) {
				mese = "Giugno";
			} else if (mesef.equals("07")) {
				mese = "Luglio";
			} else if (mesef.equals("08")) {
				mese = "Agosto";
			} else if (mesef.equals("09")) {
				mese = "Settembre";
			} else if (mesef.equals("10")) {
				mese = "Ottobre";
			} else if (mesef.equals("11")) {
				mese = "Novembre";
			} else if (mesef.equals("12")) {
				mese = "Dicembre";
			}

			String FILE = "C:\\Users\\massimiliano\\Documents\\correzioni\\"
					+ cliente + "_" + mese + ".pdf";

			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream(FILE));
			document.open();

			Paragraph prefazione = new Paragraph();
			Stampa_fatt.print_fatture(prefazione, data, numero, cliente,
					cliente2, ind, cit, cap, piva, desc, imp1, desc2, imp2,
					imponib, iva, imposta, t_fat, rit, t_dov);

			document.add(prefazione);
			document.close();

			File f = new File("C:\\Users\\massimiliano\\Documents\\correzioni\\"
					+ cliente + "_" + mese + ".pdf");
			java.awt.Desktop.getDesktop().open(f);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public String[] seleziona_fatture() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection
					.prepareStatement("select distinct(cliente) from fatture order by cliente");

			rs = pst.executeQuery();

			while (rs.next()) {
				list.add(rs.getString("cliente"));
			}
			String[] result = new String[list.size()];
			result = list.toArray(result);
			return result;
		} catch (Exception e) {

			return null;
		}

	}

	public String[] restituisci_mail(String nome) {

		try {
			ArrayList<String> list = new ArrayList<String>();
			ResultSet rs;
			PreparedStatement prep = connection
					.prepareStatement("SELECT data_fattura FROM fatture where cliente = ?");
			
			prep.setString(1, nome);
			rs = prep.executeQuery();
			
			while (rs.next()) {
				list.add(rs.getString("data_fattura"));
			}
			
			String[] result = new String[list.size()];
			result = list.toArray(result);
			return result;
		} catch (Exception e) {

			return null;
		
		}
		
	}
}

	
	
	
	