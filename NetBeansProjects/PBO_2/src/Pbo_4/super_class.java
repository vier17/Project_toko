/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pbo_4;

/**
 *
 * @author Acer
 */
public class super_class {
    
    private String nama,keterangan;

    public super_class(String nama, 
            String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
    public void cetak () {
            System.out.println(getNama()+" "+getKeterangan());
}
    public void halo(){
        System.out.println();
    }
}
