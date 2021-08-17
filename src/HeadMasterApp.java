// Implementasi Polymorphism (Perubahan Bentuk Object)
public class HeadMasterApp {
    public static void main(String[] args) {
        // New Headmaster Object
        HeadMaster headMaster = new HeadMaster("Fahrul");
        headMaster.sayHello("Kawan");

        // Mengubah menjadi Operator Object
        headMaster = new Operator("Fahrul", "SMK ITB");
        headMaster.sayHello("Kawan");
        // headMaster.saySchool(); // tidak bisa dipanggil karena tipenya HeadMaster

        // Mengubah menjadi Teacher
        headMaster = new Teacher("Fahrul");
        headMaster.sayHello("Kawan");

        // Perubahan object di Parameter method sayHello
        sayHello(new HeadMaster("HeadMaster"));
        sayHello(new Operator("Operator"));
        sayHello(new Teacher("Teacher"));
    }

    // Method Polymorphism
    static void sayHello(HeadMaster headMaster) {
        // Pengecekan Tipe Data (Check) menggunakan instanceof
        if (headMaster instanceof Teacher) {
            Teacher teacher = (Teacher) headMaster; // Konversi tipe data (casts)
            System.out.println("Hello " + teacher.name);
        } else if (headMaster instanceof Operator) {
            Operator operator = (Operator) headMaster; // Konversi tipe data (casts)
            System.out.println("Hello " + operator.name);
        } else {
            System.out.println("Hello " + headMaster.name);
        }
    }
}
