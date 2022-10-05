
package Pbo_4_latihan;


public class Sub_class extends super_class {
    private String department,tittle;
    
    public Sub_class(String id, String name, String addres,String department,String tittle){
        super(id,name,addres);
                this.department = "IT";
                this.tittle = tittle;
    }

    public String getDepartment() {
        return department;
    }

    public String getTittle() {
        return tittle;
    }

    public void getData(){
        System.out.println(super.getId() +"|"+ super.getName() +" "+ getAddres()+" "+getDepartment()+" "+getTittle());
    }
    
    
}
