package mesfinproject.weektwofirststproj;

public class MainController {

    public static void main(String [] args) {

        System.out.println("Hello everybody");

        Person a = new Person();
        a.setFirstName("Fi");
        a.setLastName("Ankomah");
        a.setPhoneNumber("2345678909");
        a.setEmail("sirahbizu");

        System.out.println(a.whatIsMyName());
        System.out.println(a.getPhoneNumber());
        System.out.println(a.getEmail());


    }
}
