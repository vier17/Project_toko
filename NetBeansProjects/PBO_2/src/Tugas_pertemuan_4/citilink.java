package Tugas_pertemuan_4;

public class citilink extends tiket {
    private int harga;
    private int jumlah;
    private String noKursi;
    private String nomorPesawat;
    private String tujuan;

    public citilink(String nomorPesawat2, String tujuan2, String noKursi2, int jumlah2, String nik, String nama, String jk, String bookingID, String tgl_berangkat, String tgl_kembali, String bandaraAsal) {
        super(nik, nama, jk, bookingID, tgl_berangkat, tgl_kembali, bandaraAsal);
        this.nomorPesawat = nomorPesawat2;
        this.tujuan = tujuan2;
        this.noKursi = noKursi2;
        this.jumlah = jumlah2;
    }

    public String getNomorPesawat() {
        return this.nomorPesawat;
    }

    public int getJumlah() {
        return this.jumlah;
    }

    public String getTujuan() {
        return this.tujuan;
    }

    public String getNoKursi() {
        return this.noKursi;
    }

    public int getHarga() {
        if (super.getBandaraAsal().equalsIgnoreCase("Surabaya")) {
            if (getTujuan().equalsIgnoreCase("Bali") || getTujuan().equalsIgnoreCase("Lombok")) {
                this.harga = 700000;
            } else if (getTujuan().equalsIgnoreCase("Jakarta") || getTujuan().equalsIgnoreCase("Yogyakarta")) {
                this.harga = 800000;
            } else if (getTujuan().equalsIgnoreCase("Balikpapan") || getTujuan().equalsIgnoreCase("Makassar")) {
                this.harga = 850000;
            } else {
                System.out.println("Rute tidak ada");
            }
        } else if (super.getBandaraAsal().equalsIgnoreCase("Jakarta")) {
            if (getTujuan().equalsIgnoreCase("Bali") || getTujuan().equalsIgnoreCase("Lombok")) {
                this.harga = 1000000;
            } else if (getTujuan().equalsIgnoreCase("Surabaya") || getTujuan().equalsIgnoreCase("Yogyakarta")) {
                this.harga = 750000;
            } else if (getTujuan().equalsIgnoreCase("Balikpapan") || getTujuan().equalsIgnoreCase("Makassar")) {
                this.harga = 900000;
            } else {
                System.out.println("Rute tidak ada");
            }
        }
        return this.harga;
    }

    public int getTotal() {
        return getHarga() * getJumlah();
    }
}
