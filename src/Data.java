// Inheritance pt. 2
// Parent Class
class Data {
    int getValue() {
        return 10;
    }
}

// Child Class
class SecondData extends Data {
    // Method Overriding
    int getValue() {
        return 20;
    }

    // Get Parent Value with Super Keyword
    int getParentValue() {
        return super.getValue();
    }
}

// Child dari SecondData
class ThirdData extends SecondData {
    int getValue() {
        return 30;
    }
    // Get SecondData Value (Parent) with Super Keyword
    int getParentValue() {
        return super.getValue();
    }
}