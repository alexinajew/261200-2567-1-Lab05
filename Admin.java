import java.time.LocalDate;

public class Admin extends User{
    public Admin(){
        super(); // User();
    }

    public Admin(String name, int year, int month, int dayofMonth){
        super(name, year, month, dayofMonth);
    }

    public void doSomething(String name, int year, int month, int dayofMonth){
        System.out.println("Admin " + this.getName() + " " + this.getDob());
    }

    public void doSomething(){
        if(getDob().equals(LocalDate.now())){
            System.out.println("Happpy Birthday");
        }
        else{
            System.out.println("Admin " + this.getName() + " " + this.getDob());
        }
    }

    public void doSomething(int n){
        for(int i=0; i<n; i++){
            super.doSomething();
        }
    }

}
