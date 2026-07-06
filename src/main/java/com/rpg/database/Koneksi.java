package com.rpg.database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {

    private static Connection koneksi;

    public static Connection getKoneksi() {

        if (koneksi == null) {

            try {

                String url = "jdbc:mysql://localhost:3306/db_rpg";
                String user = "root";
                String password = "";

                koneksi = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi Berhasil");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,
                        "Koneksi Gagal\n" + e.getMessage());

            }

        }

        return koneksi;

    }

}