package General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where gennaio = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where febbraio = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where marzo = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where aprile = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where maggio = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where giugno = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where luglio = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where agosto = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where settembre = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where ottobre = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where novembre = true");

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
			pst = connection.prepareStatement("SELECT cliente FROM cliente where dicembre = true");

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
}