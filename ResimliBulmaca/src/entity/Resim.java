/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Blob;

/**
 *
 * @author Batu
 */
public class Resim {

    private int id;
    private Blob resim;
    private Kelime kelime;

    public Resim() {

    }

    public Resim(int id, Blob resim, Kelime kelime) {
        this.id = id;
        this.resim = resim;
        this.kelime = kelime;
    }

    public int getId() {
        return id;
    }

    public Blob getResim() {
        return resim;
    }

    public Kelime getKelime() {
        return kelime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setResim(Blob resim) {
        this.resim = resim;
    }

    public void setKelime(Kelime kelime) {
        this.kelime = kelime;
    }

    @Override
    public String toString() {
        return "Resim{" + "id=" + id + ", resim=" + resim + ", kelime=" + kelime + '}';
    }


    
}
