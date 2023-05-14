
public class Main {

    public static void main(String[] args) {
        Car car = new Car("Mercedes", "ML270", "Grey", 2004, 0, 5);
        Car car2 = new Car("Opel", "Corsa", "Blue", 2019, 0, 6);
        Car car3 = new Car("Ford", "Escord", "Red", 2013, 0, 6);

        car.setCurrentGear(0);
        car.shiftUp();
        car.shiftUp();
        car.shiftUp();
        System.out.println(car.getCurrentGear());

        car.shiftUp();
        car.printCarInfo();

        car.shiftUp();
        car.printCarInfo();

        car.shiftDown();
        car.printCarInfo();

        car.shiftDown();
        car.printCarInfo();

        Car[] cars = new Car[3];
        cars[0] = car;
        cars[1] = car2;
        cars[2] = car3;

        for (Car c: cars) {
            c.printCarInfo();
        }


    }
}