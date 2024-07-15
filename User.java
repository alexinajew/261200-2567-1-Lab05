import java.time.LocalDate;

public class User {
    // void greet(){
    //     System.out.println("Hello!");
    // }

    // protected void bye(){
    //     System.out.println("Bye!");
    // }

    private String name;
    private LocalDate dob;

    public User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    public User(String name, int year, int month, int dayofMonth){
        this.name = name;
        this.dob = LocalDate.of(year, month, dayofMonth);
    }

    public void doSomething(){
        System.out.println(this.name + " " + this.dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

}


