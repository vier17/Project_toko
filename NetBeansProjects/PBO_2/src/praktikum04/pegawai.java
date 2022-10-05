
package praktikum04;

public class pegawai extends Orang {
     private String jabatan,gaji;

    public pegawai(String nik, String nama, String alamat,String jabatan, String gaji) {
        super(nik,nama,alamat);
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public String getJabatan() {
        return jabatan;
    }

    public String getGaji() {
        return gaji;
    }
    public void getData(){
        System.out.println("Nik : "+getNik());
        System.out.println("Nama: "+getNama());
        System.out.println("Alamat : "+getAlamat());
        System.out.println("Jabatan : "+getJabatan());
        System.out.println("Gaji : "+getGaji());
    }
}
