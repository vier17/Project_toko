
package Toko;

import java.io.*;
import java.time.*;
public class main {

   
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
     LocalDate tanggal = LocalDate.now(); 
     LocalTime waktu = LocalTime.now();
     int kode = 0;
     int pilihrange = 0;
     interface1 sp = new cafe(null,0,0,0);
     interface1 m1 = new menu(null,0,0,0);
     interface1 m2 = new menu2(null,0,0,0);
     interface1 m3 = new menu3(null,0,0,0);
        System.out.println("Selamat datang di Terra Cafe ");
        System.out.println("Pilih menu : ");
        System.out.println("1. Minuman");
        System.out.println("2. Makanan ");
        System.out.println("3. Desert");
        System.out.print("Piihan : ");
        pilihrange = Integer.parseInt(r.readLine());
        System.out.println("");
        switch(pilihrange){
            case 1 :
           m1.pilihbarang();
           break;
            case 2:
           m2.pilihbarang();
           break;
            case 3 : 
           m3.pilihbarang();
           break;
        }
       System.out.print("Pilih Menu yang ingin di pesan : ");
       kode = Integer.parseInt(r.readLine());
       System.out.print("Masukan jumlah pesanan : ");
       int jumlah = Integer.parseInt(r.readLine());
       
        interface1 end1 = new menu(null, 0, kode,jumlah);
        interface1 end2 = new menu2(null, 0, kode,jumlah);
        interface1 end3 = new menu3(null, 0, kode,jumlah);
     
        
        System.out.println("============= Nota Pembelian =============");
        System.out.println("Tanggal Pembelian: " + tanggal);
        System.out.println("Waktu Pembelian : " + waktu);
        System.out.println("===========================================");
        if (pilihrange == 1 ) {
        end1.cetak();
        System.out.println("Harga Barang: " + end1.harga());
        System.out.println("Total pesanan : "+jumlah);
        System.out.println("Total: " + (end1.jumlah()));
        }
        else if (pilihrange == 2 ) {
        end2.cetak();
        System.out.println("Harga Barang: " + end2.harga());
        System.out.println("Total pesanan : "+jumlah);
        System.out.println("Total: " + (end2.jumlah()));
        }
        else if (pilihrange == 3 ) {
        end3.cetak();
        System.out.println("Harga Barang: " + end3.harga());
        System.out.println("Total pesanan : "+jumlah);
        System.out.println("Total: " + (end3.jumlah()));
        }
    }
    
}
