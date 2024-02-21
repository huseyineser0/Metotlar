
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------------------------");

        Car audi = new Car();
        audi.model = "Audi";
        audi.speed = 10;
        audi.increaseSpeed(20);
        audi.decreaseSpeed(10);
        audi.printSpeed(); //arabanın hızını yazdıran metot

        System.out.println("----------------------------------");

        Car bmw = new Car();
        bmw.model = "BMW";
        bmw.speed = 20;
        bmw.increaseSpeed(30);
        bmw.decreaseSpeed(10);
        bmw.printSpeed();

        System.out.println("----------------------------------");

        Car mercedes = new Car();
        mercedes.model = "Mercedes";
        mercedes.speed = 50;
        mercedes.increaseSpeed(110);
        mercedes.decreaseSpeed(15);
        mercedes.printSpeed();


    }
}