public class Car {
    String name;
    private int model;
    int maxSpeed;
    float price;
    String color;

    void setName(String n) {
        name = n;
    }

    String getName() {
        return name;
    }

    void setModel(int n) {
        if (n > 2014) {
            model = n;
        }
    }

    int getModel() {
        return model;
    }

}
