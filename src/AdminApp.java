public class AdminApp {
    public static void main(String[] args) {
        var admin = new Admin();
        admin.name = "Fahrul";
        admin.sayHello("Kawan");

        var userOne = new UserOne();
        userOne.name = "User 1";
        userOne.sayHello("Fahrul");
    }
}
