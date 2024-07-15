
public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        user1.doSomething();
        User user2 = new User("Jude", 2003, 3, 29);
        user2.doSomething();

        Admin admin1 = new Admin("Gravy", 2003, 3, 29);
        admin1.doSomething();

        Admin admin2 = new Admin();
        admin2.setName("Peter");
        admin2.doSomething();

        // User user1 = new User();
        // user1.greet();
        // user1.bye();
        
        // Admin admin1 = new Admin();
        // admin1.greet();
        // admin1.bye();
    }
}