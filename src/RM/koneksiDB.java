package RM;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CHERLY CHRYS
 */
public class koneksiDB {

    private static Connection con;
    public static Connection getkoneksi() {
        if (con == null) {
            try {
                String url;
                url = "jdbc:mysql://localhost:3306/db_mas_tegar";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException t) {
                JOptionPane.showMessageDialog(null, t);
            }
        }
        return con;

    }

    static Object getConnection() {
        throw new UnsupportedOperationException("Not yet Implemented");

    }

    public static class con {

        public con() {
        }
    }
}
