package Pbo_4_latihan;

import java.io.*;
public class MainClassEmployee {

    
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (
          new InputStreamReader (System.in));
        
        //object 
        Sub_class emp[]= new Sub_class[2];
        String id,name,addres,tittle;
        try{
            //input 
            for (int i = 0; i <emp.length; i++){
                System.out.print("ID : ");
                id = br.readLine();
                System.out.print("Name : ");
                name = br.readLine();
                System.out.print("Addres : ");
                addres = br.readLine();
                System.out.print("tittle : ");
                tittle = br.readLine();
                
                //masukan ke object
                emp[i]=new Sub_class(id,name,addres,null,tittle);
            }
            for (int i = 0; i <emp.length; i++){
                // cetak 
                emp[i].getData();
            }
            
        }catch (Exception e){
            
        }
                
    }
    
}
