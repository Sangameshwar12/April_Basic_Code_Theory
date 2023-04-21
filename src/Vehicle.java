public class Vehicle {
    int tyre;
    String color;
    int seater;
    String brand;
    int powerOfEngine;
    int price;
    String name;

    // compile time polymorphism

    double func(int price, int powerOfEngine){
        return 0.0;
    }
    int func(int price, int powerOfEngine, int tyre){
        return 0;
    }

    public Vehicle(int tyre, String color){
        this. tyre = tyre;
        this.color = color;
    }

    public Vehicle(int tyre, String color, int seater) {
        this.tyre = tyre;
        this.color = color;
        this.seater = seater;
    }
    public Vehicle(int tyre, String color, int seater, String brand, int powerOfEngine, int price, String name){


        // I can avoid reinitializing the attributes
        // as they are already defined above
        this(tyre, color, seater);

        this.brand = brand;
        this.powerOfEngine = powerOfEngine;
        this.price = price;
        this.name = name;
    }
}
