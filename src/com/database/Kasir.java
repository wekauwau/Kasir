package com.database;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Kasir extends Petugas {
    public void addPembelian() {
        try {
            PreparedStatement stmt = Koneksi.conn.prepareStatement("INSERT INTO pembelian VALUES (NULL, ?, CURRENT_TIMESTAMP)");
            stmt.setInt(1, Session.getId_petugas());
            
            stmt.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal menambah data pembelian: " + ex);
        }
    }
}
