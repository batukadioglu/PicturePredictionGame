/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Kelime;
import entity.Resim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Batu
 */
public class ResimDAO {

    static public ArrayList<Resim> kelimeResimleriniGetir(Kelime kelime) {
        ArrayList<Resim> resimler = new ArrayList<Resim>();
        Resim resim = null;
        try {
            Connection conn = DbConnection.getConnection();
            String query = "SELECT * FROM resim WHERE Kelime_Id = ?";
            PreparedStatement psmt = conn.prepareStatement(query);
            psmt.setInt(1,kelime.getId());
            ResultSet rs = psmt.executeQuery();
            while (rs.next()) {
                resim = new Resim(rs.getInt("Id"),rs.getBlob("Resim"),kelime);
                resimler.add(resim);
            }
        } catch (Exception ex) {
            System.out.print("Veri tabanı hatası resim..." + ex);
        }
        return resimler;
    }
}
