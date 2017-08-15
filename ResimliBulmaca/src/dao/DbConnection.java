/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Batu
 */
public class DbConnection {

    static final String db_name = "resimlibulmaca";
    static final String db_url = "jdbc:mysql://db4free.net:3306/" + db_name;
    static final String user = "batu";
    static final String pass = "5503610";
   // static final String db_url = "jdbc:mysql://localhost:3306/" + db_name; 
    static public Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(db_url, user, pass);
        } catch (Exception ex) {
            System.out.print("Veri tabanı hatası ..." + ex);
        }
        return conn;
    }
}
