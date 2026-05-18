class Car {

    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class Cls {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "Toyota";
        c1.speed = 120;

        c1.drive();
    }
}