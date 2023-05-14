public class Vehicle {
    private String color;
    private int year;
    private int currentGear;
    private int numberGears;

    public Vehicle(String color, int year, int currentGear, int numberGears) {
        this.color = color;
        this.year = year;
        this.currentGear = currentGear;
        this.numberGears = numberGears;
    }

    public int getNumberGears() {
        return numberGears;
    }

    public void setNumberGears(int numberGears) {
        this.numberGears = numberGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int newGear) {
        currentGear = newGear;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 2023 && year > 1950) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    void shiftUp() {
        if (currentGear < numberGears) {
            currentGear++;
        }
    }

    void shiftDown() {
        if (currentGear > 0) {
            currentGear--;
        }
    }

}
