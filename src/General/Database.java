package General;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Database {
	private static Connection connection;
	private Statement stmt;

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
}