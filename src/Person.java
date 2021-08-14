public class Person {
    String name;
    String address;
    final String country = "Indonesia";

    public void sayHello(String paramName) {
        System.out.printf("Halo %s, Nama Saya %s\n", paramName, name);
    }
}
