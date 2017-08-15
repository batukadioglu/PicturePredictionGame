/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

public class Kelime {

    private int id;
    private String icerik;

    public Kelime() {

    }

    public Kelime(int id, String icerik) {
        this.id = id;
        this.icerik = icerik;
    }
    public Kelime(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }

    @Override
    public String toString() {
        return "Kelime{" + "id=" + id + ", icerik=" + icerik + '}';
    }
    
}
