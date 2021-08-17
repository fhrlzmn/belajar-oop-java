// Implementasi Variable Hiding
public class ParentApp {
    public static void main(String[] args) {
        Child child = new Child();
        child.name = "I am Child";
        child.sayIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.name = "I am Parent"; // Field yang akan dipanggil adalah field dari parent
        parent.sayIt();
        // Method yang akan dipanggil adalah dari child, karena object parent tetap bertipe child
        System.out.println(parent.name);
    }
}
