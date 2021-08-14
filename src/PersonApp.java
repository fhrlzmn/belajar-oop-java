public class PersonApp {
    public static void main(String[] args) {
        // Membuat Object Person dari Class Person (Sekarang menggunakan Constructor)
        var person = new Person("Fahrul", "Bandung");

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        // Pemanggilan Method
        person.sayHello("Kawan");
        person.setAddress();

        // Object Person2 (Sekarang menggunakan Constructor)
        var person2 = new Person("Fajar", "Surabaya");

        // Pemanggilan Method
        person2.sayHello("Fahrul");
        person2.setAddress();

        // Implementasi Constructor Overloading
        var personA = new Person("Andi", "Jakarta");
        personA.sayHello("Kawan");
        personA.setAddress();

        var personB = new Person("Joko");
        personB.address = "Bekasi";
        personB.sayHello("Kawan");
        personB.setAddress();

        var personC = new Person();
        personC.name = "Yusril";
        personC.address = "Yogyakarta";
        personC.sayHello("Kawan");
        personC.setAddress();
    }
}
