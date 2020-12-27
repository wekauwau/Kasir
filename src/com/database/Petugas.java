package com.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import com.database.Koneksi;

public class Petugas {
    public ResultSet getProduk() {
        try {
            return Koneksi.conn.prepareStatement("SELECT * FROM produk").executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal mengambil data produk: " + ex);
            return null;
        }
    }
    
    public ResultSet getPembelian() {
        try {
            return Koneksi.conn.prepareStatement("SELECT * FROM pembelian").executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal mengambil data pembelian: " + ex);
            return null;
        }
    }
}