/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wiwin.model;

/**
 *
 * @author ASUS
 */
public class Peminjaman {
    private String nobp;
    private String kodebuku;
    private String tglpinjam;
    private String tglkembali;

    public Peminjaman() {
    }

    public Peminjaman(String nobp, String kodebukiu, String tglpinjam, String tglkembali) {
        this.nobp = nobp;
        this.kodebuku = kodebukiu;
        this.tglpinjam = tglpinjam;
        this.tglkembali = tglkembali;
    }
    

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodebuku() {
        return kodebuku;
    }

    public void setKodebuku(String kodebukiu) {
        this.kodebuku = kodebukiu;
    }

    public String getTglpinjam() {
        return tglpinjam;
    }

    public void setTglpinjam(String tglpinjam) {
        this.tglpinjam = tglpinjam;
    }

    public String getTglkembali() {
        return tglkembali;
    }

    public void setTglkembali(String tglkembali) {
        this.tglkembali = tglkembali;
    }
    
}
