
package Toko;

//MINUMAN
public class menu extends cafe implements interface1 {
    public menu(String namabarang, int harga, int barang,int jumlah) {
        super(namabarang, harga, barang,jumlah);
    }
    @Override
    public int harga() {
        return getHarga();
    }
    
    @Override
    public void pilihbarang() {
        System.out.println("Berikut menu Minuman : ");
        System.out.println("1. Teh");
        System.out.println("2. Kopi");
        System.out.println("3. Susu");
    }
    @Override
    public int getHarga() {
       if (super.getBarang() == 1) {
            return 2000;
        }
        else if (super.getBarang() == 2) {
            return 3000;
        }
        else if (super.getBarang() == 3) {
            return 3000;
        }
        else {
            return 0;
        }
    }
    @Override
    public int jumlah() {
       if (super.getBarang() == 1) {
            return jumlah*getHarga();
        }else if (super.getBarang() == 2) {
            return jumlah*getHarga();
        }
        else if (super.getBarang() == 3) {
            return jumlah*getHarga();
        }
        else {
            return 0;
        }
    }

    @Override
    public String getNamabarang() {
        if (super.getBarang() == 1) {
            return "Teh";
        }
        else if (super.getBarang() == 2) {
            return "Kopi";
        }
        else if (super.getBarang() == 3) {
            return "Susu";
        }
        else {
            return "";
        }
    }

    
    @Override
    public void cetak() {
     System.out.println("Nama Barang : " +getNamabarang());
    }
}
