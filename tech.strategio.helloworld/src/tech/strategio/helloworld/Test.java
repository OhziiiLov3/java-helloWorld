package tech.strategio.helloworld;

// ENCAPSULATION
    class Technologist {
        String firstName;
        String lastName;
//constructor
    Technologist() {
       firstName = "Ohz";
}
    void setFirstName(String n) {
         String name = n;
    }
    String getFirstName(String n) {
        return firstName;
    }
}

public class Test {
	public static void main(String[] args) {
//    Creating object DevOps of Technologist
//    Print name of DevOps
    Technologist devOps = new Technologist();
    System.out.println("DevOps Technologist First Name: " +  devOps.getFirstName(""));

	}
}
