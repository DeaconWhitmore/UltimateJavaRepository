package Unit05;

public class Car {
    private static int carPopulation = 0;

    private String make;
    private String model;
    private int year;
    

    public Car(String ma, String mo, int ye) {
        make = ma;
        model = mo;
        year = ye;
        carPopulation++;
    }

    public Car(String ma, String mo) {
        make = ma;
        model = mo;
        year = 2024;
        carPopulation++;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getCarPopulation() {
        return carPopulation;
    }

    public String toString() {
        return "" + year + " " + make + " " + model;
    }
}