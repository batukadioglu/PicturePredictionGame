/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Kelime;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/*
 *
 * @author Batu
 */

public class KelimeDAO { 
    static public Kelime rastgeleKelimeGetir()
    {
        Kelime kelime = null;
        try {
            Connection conn = DbConnection.getConnection();
            String query = "SELECT * FROM kelime ORDER BY RAND() LIMIT 1";
            PreparedStatement psmt = conn.prepareStatement(query);
            ResultSet rs = psmt.executeQuery();
            while(rs.next())
            {
                kelime = new Kelime(rs.getInt("Id"),rs.getString("Icerik"));
            }
        } catch (Exception ex) {
            System.out.print("Veri tabanı hatası ..."+ex);
        }
        return kelime;
    }
}
