enum FuelType {GASOLINE, DIESEL, ELECTRIC}

public class Car {
    String brand;
    String model;
    String color;
    Car(){

    }
    Car(String brand, String model, String color) {

    }

    public void displayInfo(String brand, String model, String color) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);

    }

}
