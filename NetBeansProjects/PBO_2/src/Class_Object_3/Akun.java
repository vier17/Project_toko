
package Class_Object_3;

public class Akun {
    
    //username,pasword
    private String username,pasword;
    
    //constructor non parameter (admin)
    public Akun(){
        username ="admin";
        pasword = "admin";
        
    }
    //constructor parameter (akun baru)
    public Akun(String u,String p){
        username = u;
        pasword = p;
        
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getUsername() {
        return username;
    }

    public String getPasword() {
        return pasword;
    }
    
    
}
