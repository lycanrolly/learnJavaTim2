package Main.Advanced.Inheritance;


import org.junit.jupiter.api.Test;

public class Tester {

    @Test
    public void test1() {
        Vehicle car1 = new Vehicle(
                "BMW M5",
                5,
                "black",
                250);
        System.out.println(car1);
        car1.info(" luxury ");

        Car car2 = new Car(
                "AUDI RS6",
                5,
                "Dark Silver",
                280);
        System.out.println(car2);
        car2.info(" sport ");

        car2.color = "black";
        car2.seatCapacity = 4;
        car2.maxSpeed = 300;
        car2.setName("Mercedes C63 AMG");

        System.out.println(car2);
        car2.info(" luxury ");

        System.out.println(car2.getMessage());

        Vehicle Porsche = new Car("Porsche Cayenne",
                7,
                "Royal Blue",
                240);


        System.out.println(((Car) Porsche).getMessage());
        System.out.println(Porsche);
        ((Car) Porsche).info(" SUV ");

    }

    @Test
    public void interface_test ()
    {
        Car car2 = new Car(
                "AUDI RS6",
                5,
                "Dark Silver",
                280);

        Drivable.start();
        car2.drive(450.5f);
        car2.stop();
        car2.clean("Premium");

    }
}
