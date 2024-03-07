package Unit05;

public class Showroom {
    public static void main(String[] args) {
        Car c1 = new Car("Ford", "F150", 2019);
        Car c2 = new Car("Toyota", "Corolla");

        for (int i = 0; i < 49; i++) {
            new Car("lksdf", "o832fjhe");
        }

        System.out.println("Car 1 information: ");
        // System.out.println(c1.getMake() + " " + c1.getModel() + " (" + c1.getYear() + ")");
        System.out.println(c1);

        System.out.println("Car 2 information: ");
        // System.out.println(c2.getMake() + " " + c2.getModel() + " (" + c2.getYear() + ")");
        System.out.println(c2);

        System.out.println("car popluation according to c1 is: " + c1.getCarPopulation());
        System.out.println("car popluation according to c2 is: " + c2.getCarPopulation());

    }
}
