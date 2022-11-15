
package Toko;
//SUPER CLASS
public class cafe implements interface1 {
    public String namabarang; 
    public int harga;
    public int barang;
    public int jumlah;

    public cafe(String namabarang,int harga, int barang,int jumlah) {
        this.namabarang = namabarang;
        this.harga = harga;
        this.barang = barang;
        this.jumlah = jumlah;
    }

    public String getNamabarang() {
        return namabarang;
    }

    public int getHarga() {
        return harga;
    }

    public int getBarang() {
        return barang;
    }

    public int getJumlah() {
        return jumlah;
    }
    

    @Override
    public void pilihbarang() {
        
    }

    @Override
    public int harga() {
        return 0;
    }

    @Override
    public void cetak() {
        
    }
    @Override
    public int jumlah() {
     return 0;
    }
    
    
}
