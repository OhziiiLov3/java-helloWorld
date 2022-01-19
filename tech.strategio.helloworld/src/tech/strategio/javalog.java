package tech.strategio.helloworld;

// ENCAPSULATION
class Technologist {
        String firstName;
        String lastName;
//constructor
    Technologist() {
       firstName = "";
}
        void setFirstName (String n) {
        name = n;
    }
        void getFirstName (String n) {
        return firstName;
    }
}

public class Test {
    public static void main(String[]args){}
//    Creating object DevOps of Tehcnologist
//    Print name of DevOps
    Technologist devOps = new Technologist();
    System.out.println("DevOps Technologlist First Name:" + devOps.getFirstName());

}
