package General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Database {
	private static Connection connection;

	public Database() {
		try {
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
			pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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
				pst.setString(4, cliente.getCittà());
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

	public String[] elenco_clienti_gennaio() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM gennaio");

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

	public String[] elenco_clienti_febbraio() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM febbraio");

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

	public String[] elenco_clienti_marzo() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM marzo");

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

	public String[] elenco_clienti_aprile() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM aprile");

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

	public String[] elenco_clienti_maggio() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM maggio");

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

	public String[] elenco_clienti_giugno() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM giugno");

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

	public String[] elenco_clienti_luglio() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM luglio");

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

	public String[] elenco_clienti_agosto() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM agosto ");

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

	public String[] elenco_clienti_settembre() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM settembre");

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

	public String[] elenco_clienti_ottobre() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM ottobre");

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

	public String[] elenco_clienti_novembre() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM novembre");

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

	public String[] elenco_clienti_dicembre() {

		ResultSet rs;
		PreparedStatement pst = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			pst = connection.prepareStatement("SELECT cliente FROM dicembre ");

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

	public String seleziona_modifica_cliente(String nome_cliente) {
		ResultSet rs;
		PreparedStatement pst = null;
		try {

			pst = connection
					.prepareStatement("SELECT * FROM cliente where cliente = ?");
			pst.setString(1, nome_cliente);
			rs = pst.executeQuery();
			String temp = "";
			while (rs.next()) {

				for (int i = 0; i < 28; i++) {

					if (String.valueOf(rs.getObject(i + 1)).equals(""))
						temp = temp.concat("null ");
					else
						temp = temp.concat(String.valueOf(rs.getObject(i + 1))
								+ " ");
				}

			}

			return temp;
		} catch (Exception e) {

			e.printStackTrace();
			;
		}
		return null;
	}

	public void Modifica_Cliente(Cliente cliente, LinkedList mesi_vecchi,
			LinkedList mesi_nuovi) {
		String mese = null;
		int i;

		PreparedStatement prep = null;
		try {

			prep = connection
					.prepareStatement("UPDATE cliente SET cliente = ?, cliente2 = ?, indirizzo = ?, città = ?, cap = ?, partitaIva = ?, descrizione = ?, importo = ?, descrizione2 = ?, importo2 = ?, imponibile = ?, iva = ?, imposta = ?, totale_fattura = ?, ritenuta = ?, totale_dovuto = ? ,gennaio = ?,febbraio = ?,marzo = ?,aprile = ?,maggio = ?,giugno = ?,luglio = ?,agosto = ?,settembre = ?,ottobre = ?,novembre = ?,dicembre = ? where cliente = ?");
			prep.setString(1, cliente.getNome());
			prep.setString(2, cliente.getNome2());
			prep.setString(3, cliente.getIndirizzo());
			prep.setString(4, cliente.getCittà());
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
									+ " SET cliente = ?, cliente2 = ?, indirizzo = ?, città = ?, cap = ?, partitaIva = ?, descrizione = ?, importo = ?, descrizione2 = ?, importo2 = ?, imponibile = ?, iva = ?, imposta = ?, totale_fattura = ?, ritenuta = ?, totale_dovuto = ? where cliente = ?");
					pst.setString(1, cliente.getNome());
					pst.setString(2, cliente.getNome2());
					pst.setString(3, cliente.getIndirizzo());
					pst.setString(4, cliente.getCittà());
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
					pst.setString(4, cliente.getCittà());
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
			String indirizzo, String città, String cap, String piva,
			String descrizione, double importo, String descrizione2,
			double importo2, double imponibile, double iva, double imposta,
			double tot_fattura, double ritenuta, double tot_dovuto,
			String mese, String nome_cliente) {

		PreparedStatement pst = null;

		try {

			pst = connection
					.prepareStatement("UPDATE "
							+ mese
							+ " SET cliente = ?, cliente2 = ?, indirizzo = ?, città = ?, cap = ?, partitaIva = ?, descrizione = ?, importo = ?, descrizione2 = ?, importo2 = ?, imponibile = ?, iva = ?, imposta = ?, totale_fattura = ?, ritenuta = ?, totale_dovuto = ? where cliente = ?");
			pst.setString(1, nome);
			pst.setString(2, nome2);
			pst.setString(3, indirizzo);
			pst.setString(4, città);
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
					.prepareStatement("CREATE TABLE gennaio(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE febbraio(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE marzo(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE aprile(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE maggio(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE giugno(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE luglio(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE agosto(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE settembre(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE ottobre(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE novembre(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();

			prep = connection
					.prepareStatement("CREATE TABLE dicembre(cliente varchar(40) NOT NULL,cliente2 varchar(40) DEFAULT NULL,indirizzo varchar(40) DEFAULT NULL,città varchar(20) DEFAULT NULL,cap varchar(10) DEFAULT NULL,partitaIva varchar(20) DEFAULT NULL,descrizione varchar(300) DEFAULT NULL,importo varchar(8) DEFAULT NULL,descrizione2 varchar(200) DEFAULT NULL,importo2 varchar(8) DEFAULT NULL,imponibile varchar(8) DEFAULT NULL,iva int(11) DEFAULT NULL,imposta varchar(8) DEFAULT NULL,totale_fattura varchar(8) DEFAULT NULL,ritenuta varchar(8) DEFAULT NULL,totale_dovuto varchar(8) DEFAULT NULL,PRIMARY KEY (cliente));");
			prep.executeUpdate();
			ResultSet rs;
			for (int i = 0; i < 12; i++) {

				switch (String.valueOf(i)) {

				case "0":

					

					try {

						prep = connection
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where gennaio = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where febbraio = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where marzo = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where aprile = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where maggio = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where giugno = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where luglio = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where agosto = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where settembre = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where ottobre = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where novembre = true");

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
								.prepareStatement("SELECT cliente,cliente2,indirizzo,città,cap,partitaIva,descrizione,importo,descrizione2,importo2,imponibile,iva,imposta,totale_fattura,ritenuta,totale_dovuto FROM cliente where dicembre = true");

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
		JOptionPane.showMessageDialog(null, "è ora possibile iniziare con un nuovo anno!");
	}
}