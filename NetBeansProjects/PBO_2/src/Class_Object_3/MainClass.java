package Class_Object_3;

import java.io.*;
public class MainClass {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader 
        (new InputStreamReader(System.in));
        //object
        Akun admin = new Akun();
        Akun akunBaru = new Akun("","");
        //variabel
        String username,pasword,paswordLama;
        
        do{
             System.out.println("--Menu--");
             System.out.println("1.Login admin");
             System.out.println("2.Buat akun");
             System.out.println("3.Lihat akun");
             System.out.println("4.Ubah pasword");
             System.out.println("5.Exit");
             System.out.print("Pilih menu : ");
             int menu =Integer.parseInt(br.readLine());
             switch (menu){
                 case 1:
                     System.out.println("--login admin--");
                     System.out.print("Masukan Username : ");
                     username = br.readLine();
                     System.out.print("Masukan Pasword : ");
                     pasword = br.readLine();
                     
                     //IF
                     if (username.equalsIgnoreCase(admin.getUsername())
                             && pasword.equals(admin.getPasword())){
                         System.out.println("Login sukses");
                     }else{
                         System.err.println("gagal");
                         System.out.println(" ");
                     }
                     
                         
                     break;
                 case 2:
                     System.out.println("--Buat akun--");
                     System.out.print("Masukan Username : ");
                     username = br.readLine();
                     System.out.print("Masukan Pasword : ");
                     pasword = br.readLine();
                     System.out.println("Akun berhasil di buat");
                     System.out.println(" ");
                     
                     // insert variabel
                     
                     akunBaru = new Akun(username,pasword);
                     
                     break;
                 case 3:
                     System.out.println("--Lihat akun--");
                     System.out.println("1.Admin");
                     System.out.println("Username : "+admin.getUsername());
                     System.out.println("Pasowrd : "+ admin.getPasword());
                     System.out.println(" ");
                     System.out.println("2.Akun baru");
                     System.out.println("Username : "+akunBaru.getUsername());
                     System.out.println("Pasowrd : "+akunBaru.getPasword()
                        +"\n");
                     
                     break;
                 case 4:
                     System.out.println("--Ubah pasword--");
                     System.out.print("Masukan pasword lama : ");
                     paswordLama = br.readLine();
                     if(paswordLama.equals(akunBaru.getPasword())){
                    
                     System.out.print("Masukan pasword baru : ");
                     akunBaru.setPasword(br.readLine());
                     System.out.println("");
                     System.out.println("Username: "+akunBaru.getUsername());
                     System.out.println("Password Baru: "+akunBaru.getPasword());
                     System.out.println(" ");
                     }else{
                            System.err.println("Password Salah");
                        }
                     break;
                 case 5:
                     System.exit(0);
             }
        }while(true);
       
        
        
    }
    
}
