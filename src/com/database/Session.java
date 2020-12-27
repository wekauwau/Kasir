package com.database;

public class Session {
    private static int id_petugas;
    private static String level;
    private static String nama;

    public static int getId_petugas() {
        return id_petugas;
    }

    public static void setId_petugas(int id_petugas) {
        Session.id_petugas = id_petugas;
    }

    public static String getLevel() {
        return level;
    }

    public static void setLevel(String level) {
        Session.level = level;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Session.nama = nama;
    }
}
