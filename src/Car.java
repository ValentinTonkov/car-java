
public class Car extends Vehicle{
    private String carBrand;
    private String model;

    public Car(String carBrand, String model, String color, int year, int currentGear, int numberGears) {
        super(color, year, currentGear, numberGears);
        this.carBrand = carBrand;
        this.model = model;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    void printCarInfo(){
        System.out.println(carBrand + " color: " + getColor() + " year:" + getYear() + " gear: " + getCurrentGear());
    }






}
