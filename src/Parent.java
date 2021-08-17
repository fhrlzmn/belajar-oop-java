// Implementasi Variable Hiding
class Parent {
    String name;
    void sayIt() {
        System.out.println("Say it from parent");
    }
}

class Child extends Parent {
    String name; // Variable Hiding, karena sudah ada di Parent
    // dan tidak direkomendasikan.
    void sayIt() { // Method overriding
        System.out.println("Say it from child");
    }
}
