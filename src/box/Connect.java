package box;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Connect {
	public Connection getConnectDB() {
		Connection cn = null;
	       try {
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	            cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLDienThoai", "sa", "123456");
	        } catch (ClassNotFoundException | SQLException ex) {
	            JOptionPane.showMessageDialog(null, ex);
	        }
		return cn;
		
	}
}
