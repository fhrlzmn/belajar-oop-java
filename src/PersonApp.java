public class PersonApp {
    public static void main(String[] args) {
        var Person = new Person();

        Person.name = "Fahrul";
        Person.address = "Bandung";

        System.out.println(Person.name);
        System.out.println(Person.address);
        System.out.println(Person.country);
    }
}
