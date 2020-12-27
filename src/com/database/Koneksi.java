package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    public static Connection conn;
    
    public static void setConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Koneksi.conn = DriverManager.getConnection("jdbc:mysql://localhost/kasir", "root", "");
        } catch(ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi ke database: " + ex);
        }
    }
    
    public static boolean login(String nama, String password) {
        try {
            PreparedStatement stmt = Koneksi.conn.prepareStatement("SELECT * FROM petugas WHERE nama = ? AND password = ?");
            stmt.setString(1, nama);
            stmt.setString(2, password);
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Session.setId_petugas(rs.getInt("id_petugas"));
                Session.setNama(rs.getString("nama"));
                Session.setLevel(rs.getString("level"));
                
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Username/password salah");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex);
        }
        
        return false;
    }
}
