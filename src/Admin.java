// Implementasi Inheritance
// Class parent dari UserOne
class Admin {
    String name;

    void sayHello(String name) {
        System.out.printf("Hello %s, Nama Saya Admin %s\n", name, this.name);
    }
}

// Class turunan dari Admin
// Class child punya field dan method yang dimiliki parent
class UserOne extends Admin {
    // Method Overriding
    void sayHello(String name) {
        System.out.printf("Hello %s, Nama Saya User %s\n", name, this.name);
    }
}
