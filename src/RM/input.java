package RM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author CHERLY CHRYS
 */
public class input {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    private String sql;

    public String pesanan;
    public String harga;
    public String jumlah;
    public String nomeja;
    public String pemesan;
    public String jumlah_orang;
    public String jenis;
    public String total;
    public String bayar;
    public String kembalian;

    public void simpan() throws SQLException {
        conn = koneksiDB.getkoneksi();
        String sql = "INSERT INTO form_pemesanan(pesanan, harga, jumlah, nomeja, pemesan, jumlah_orang,"
                + " jenis, total, bayar, kembalian)VALUES (?,?,?,?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);

        pst.setString(1, pesanan);
        pst.setString(2, harga);
        pst.setString(3, jumlah);
        pst.setString(4, nomeja);
        pst.setString(5, pemesan);
        pst.setString(6, jumlah_orang);
        pst.setString(7, jenis);
        pst.setString(8, total);
        pst.setString(9, bayar);
        pst.setString(10, kembalian);
        pst.execute();
        pst.close();
    }

    public ResultSet UpdateJTable() throws SQLException {
        conn = koneksiDB.getkoneksi();
        sql = "select*from form_pemesanan";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();
        return rs;
    }

    public void hapus() throws SQLException {
        conn = koneksiDB.getkoneksi();
        String sql = "delete form_pemesanan where pemesan=?";
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, pesanan);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void edit() throws SQLException {
        conn = koneksiDB.getkoneksi();
        String sql = "Update form_pemesanan set harga=?, jumlah=?, nomeja=?, pesanan=?,"
                + " jumlah_orang=?, jenis=?, total=?, bayar=?, kembalian=?  where pemesan=?";
        pst = conn.prepareStatement(sql);

        pst.setString(1, harga);
        pst.setString(2, jumlah);
        pst.setString(3, nomeja);
        pst.setString(10, pemesan);
        pst.setString(5, jumlah_orang);
        pst.setString(6, jenis);
        pst.setString(7, total);
        pst.setString(8, bayar);
        pst.setString(9, kembalian);
        pst.setString(4, pesanan);
        pst.executeUpdate();
        pst.close();

    }
}
