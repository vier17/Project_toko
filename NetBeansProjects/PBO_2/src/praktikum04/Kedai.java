
package praktikum04;
import java.io.*;
public class Kedai {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (
          new InputStreamReader (System.in));
        
        String nik,nama,alamat,jabatan,gaji;
        try{
            System.out.print("Masukan Jumlah Pegawai : ");
            int a = Integer.parseInt(br.readLine());
            pegawai p []=new pegawai [a];
            for (int i = 0; i <p.length; i++){
                System.out.println("Karyawan ke : "+(i+1));
                System.out.print("NIK : ");
                nik = br.readLine();
                System.out.print("Nama : ");
                nama = br.readLine();
                System.out.print("Alamat : ");
                alamat = br.readLine();
                System.out.print("Jabatan : ");
                jabatan = br.readLine();
                System.out.print("Gaji : ");
                gaji = br.readLine();
                System.out.println("----------");
                p[i] = new pegawai (nik,nama,alamat,jabatan,gaji);
               
                
            }
            System.out.println("Berikut Data pegawai : ");
            System.out.println("----------");

            for (int i = 0; i <p.length; i++){
                System.out.println("Karyawan ke - "+(i+1));
                p[i].getData();
                System.out.println("----------");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}
