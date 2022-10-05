
package praktikum04;


public class Orang {
    private String nik,nama,alamat;

    public Orang(String nik, String nama, String alamat) {
        this.nik = nik;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNik() {
        return nik;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }
    
}
