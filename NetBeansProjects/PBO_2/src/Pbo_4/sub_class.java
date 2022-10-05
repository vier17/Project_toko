
package Pbo_4;

public class sub_class extends super_class {

    private int tinggi;
    
    public sub_class(String nama, String keterangan, int tinggi){
        
        super(nama, keterangan);
        this.tinggi = tinggi;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    public void datalengkap(){
        System.out.println(super.getNama() +" "+ super.getKeterangan() +" "+ getTinggi());
    }
    
    @Override
    public void halo() {
        super.halo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cetak() {
        super.cetak(); //To change body of generated methods, choose Tools | Templates.
    }
  
}
