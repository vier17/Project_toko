
package Pbo_4;

import java.io.*;
public class MainClass {

    public static void main(String[] args) {
       BufferedReader br = new BufferedReader (
        new InputStreamReader (System.in));
       
       
        // object : sub class
        sub_class sub = new sub_class(null,null,0);
        
        try {
                    //input data 
        System.out.print("Nama : ");
        String n = br.readLine();
        System.out.print("Keterangan : ");
        String k = br.readLine();
        System.out.print("Tinggi : ");
        int t = Integer.parseInt(br.readLine());
        
        //input variable ke parameter 
        sub = new sub_class(n,k,t);
        
        sub.datalengkap();
        //panggil dan cetak super dan halo
        sub.cetak();
        sub.halo();
        
            System.out.println();
        }catch (Exception e){
            System.out.println(e);
        }

    }
    
}
