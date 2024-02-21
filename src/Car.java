public class Car {
    // Nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit = 180;

    //hız artıma metodu
    void increaseSpeed(int increment) {
        // hızımız 180'den fazla olmasını engelliyor yukarıda hız limitini 180 olarak tanımladfık
        if ((speed + increment) <= 180) {
            speed += increment;
        }

    }

    // hız azaltma metedu
    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
    }

    void printSpeed() {
        System.out.println(model + " Hızınız :" + speed);
    }


}
