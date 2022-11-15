
package Toko;

//DESERT
public class menu3 extends cafe implements interface1 {
    public menu3(String namabarang, int harga, int barang,int jumlah) {
        super(namabarang, harga, barang,jumlah);
    }

    @Override
    public int harga() {
        return getHarga();
    }

    @Override
    public void pilihbarang() {
        System.out.println("Berikut menu Desert : ");
        System.out.println("1. Puding");
        System.out.println("2. Es krim");
        System.out.println("3. Cake");
    }

    @Override
    public int getHarga() {
       if (super.getBarang() == 1) {
            return 8000;
        }
        else if (super.getBarang() == 2) {
            return 10000;
        }
        else if (super.getBarang() == 3) {
            return 14000;
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
            return "Puding";
        }
        else if (super.getBarang() == 2) {
            return "Es krim";
        }
        else if (super.getBarang() == 3) {
            return "Cake";
        }
        else {
            return "";
        }
    }
    
    public void cetak() {
     System.out.println("Nama Barang : " +getNamabarang());
    }
}
