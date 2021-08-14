// Class Person
public class Person {
    // Field
    String name;
    String address;
    final String country = "Indonesia";

    // Constructor
    Person(String paramName, String paramAdress) {
        name = paramName;
        address = paramAdress;
    }

    // Method
    public void sayHello(String paramName) {
        System.out.printf("Halo %s, Nama Saya %s\n", paramName, name);
    }
    public void setAddress() {
        System.out.printf("Saya tinggal di %s, %s\n", address, country);
    }
}
