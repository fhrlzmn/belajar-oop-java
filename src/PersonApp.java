public class PersonApp {
    public static void main(String[] args) {
        var Person = new Person();

        Person.name = "Fahrul";
        Person.address = "Bandung";

        System.out.println(Person.name);
        System.out.println(Person.address);
        System.out.println(Person.country);

        Person.sayHello("Kawan");
        Person.setAddress();

        var Person2 = new Person();

        Person2.name = "Fajar";
        Person2.address = "Surabaya";

        Person2.sayHello("Fahrul");
        Person2.setAddress();
    }
}
