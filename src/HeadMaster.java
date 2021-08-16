// Implementasi Polymorphism (Perubahan Bentuk Object)
// Class Parent
class HeadMaster {
    String name;

    HeadMaster(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.printf("Halo %s, Nama Saya HeadMaster %s\n", name, this.name);
    }
}

// Class child dari Headmaster
class Operator extends HeadMaster {
    String school;

    Operator(String name) {
        super(name);
    }

    Operator(String name, String school) {
        super(name);
        this.school = school;
    }

    void sayHello(String name) {
        System.out.printf("Halo %s, Nama Saya Operator %s\n", name, this.name);
    }

    void saySchool() {
        System.out.printf("Saya Sekolah di %s\n", this.school);
    }
}

// Class Child dari Operator
class Teacher extends Operator {
    Teacher(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.printf("Halo %s, Nama Saya Teacher %s\n", name, this.name);
    }
}