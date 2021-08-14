public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object Person dari Class Person (Sekarang menggunakan Constructor)
        var Person = new Person("Fahrul", "Bandung");

        System.out.println(Person.name);
        System.out.println(Person.address);
        System.out.println(Person.country);

        // Pemanggilan Method
        Person.sayHello("Kawan");
        Person.setAddress();

        // Object Person2 (Sekarang menggunakan Constructor)
        var Person2 = new Person("Fajar", "Surabaya");

        //Pemanggilan Method
        Person2.sayHello("Fahrul");
        Person2.setAddress();
    }
}
