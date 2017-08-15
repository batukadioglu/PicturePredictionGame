/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import entity.Kelime;
import entity.Resim;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Batu
 */
public class Kontrol {

    public boolean kelimeKontrol(String kelime, Kelime kelimeObject) {
        kelime = kelime.toLowerCase();
        String kelimeObjectString = kelimeObject.getIcerik().toLowerCase();
        if (kelime.equals(kelimeObjectString)) {
            return true;
        } else {
            return false;
        }
    }

    public char getHarf(Kelime kelimeObject) {
        ArrayList<Character> harfler = new ArrayList<Character>();
        for (int i = 0; i < kelimeObject.getIcerik().length(); i++) {
            harfler.add(kelimeObject.getIcerik().charAt(i));
        }
        Random rnd = new Random();
        String kelime = kelimeObject.getIcerik();
        return kelime.charAt(rnd.nextInt(kelime.length()));
    }

    public ArrayList<ImageIcon> blobToImageList(ArrayList<Resim> resimler) {
        ImageIcon image;
        ArrayList<ImageIcon> imageList = new ArrayList<ImageIcon>();

        try {
            for (int i = 0; i < resimler.size(); i++) {
                Blob blob = resimler.get(i).getResim();
                int blobLength = (int) blob.length();
                byte[] bytes = blob.getBytes(1, blobLength);
                BufferedImage img = ImageIO.read(new ByteArrayInputStream(bytes));
                image = new ImageIcon(img);
                imageList.add(image);
            }

        } catch (Exception ex) {
            Logger.getLogger(Kontrol.class.getName()).log(Level.SEVERE, null, ex);
        }

        return imageList;

    }

}
