
package Toko;
//MAKANAN
public class menu2 extends cafe implements interface1 {
     public menu2(String namabarang, int harga, int barang,int jumlah) {
        super(namabarang, harga, barang,jumlah);
    }
     @Override
    public int harga() {
       return getHarga();
    }


    @Override
    public void pilihbarang() {
        System.out.println("Berikut menu Makanan : ");
        System.out.println("1. Nasi pecel");
        System.out.println("2. Soto");
        System.out.println("3. Rawon");
    }


    @Override
    public int getHarga() {
       if (super.getBarang() == 1) {
            return 12000;
        }
        else if (super.getBarang() == 2) {
            return 10000;
        }
        else if (super.getBarang() == 3) {
            return 15000;
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
            return "Nasi Pecel";
        }
        else if (super.getBarang() == 2) {
            return "Soto";
        }
        else if (super.getBarang() == 3) {
            return "Rawon";
        }
        else {
            return "";
        }
    }
      
    public void cetak() {
     System.out.println("Nama Barang : " +getNamabarang());
    }

}
