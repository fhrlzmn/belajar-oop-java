// Implementasi Inheritance
// Class parent dari UserOne
class Admin {
    String name;

    // Implementasi Super Constructor
    // Menambah Constructor di Parent
    Admin(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.printf("Hello %s, Nama Saya Admin %s\n", name, this.name);
    }
}

// Class turunan dari Admin
// Class child punya field dan method yang dimiliki parent
class UserOne extends Admin {

    // Harus ditambah Constructor juga di Child (jika constructor parent ada parameter)
    UserOne(String name) {
        // dan Harus memanggil setidaknya 1 constructor yang ada di Parent
        super(name);
    }

    // Method Overriding
    void sayHello(String name) {
        System.out.printf("Hello %s, Nama Saya User %s\n", name, this.name);
    }
}
