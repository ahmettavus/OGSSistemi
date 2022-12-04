import vehicles.Car;
import vehicles.Minibus;
import vehicles.Otobus;
import vehicles.Vehicle;

public class Main {
    public static void main(String[] args) {
    Administration administration = new Administration();
    Counter counter = new Counter();
        Car car = new Car(1, "Ahmet Tavus", 100);
        Otobus otobus = new Otobus(2, "MehmetCan", 15);
        Minibus minibus = new Minibus(3, "AGC", 80);

        System.out.println("Car Balance : --- " + car.getBalance() + "Cost : " + car.getBalance());
        counter.enter(car);
        System.out.println("Car Balance : " + car.getBalance());
        System.out.println("Counter Balance : " + administration.getBalance());

        System.out.println("---------------------------------------");

        System.out.println("Otobus Balance : --- " + otobus.getBalance() + "Cost : " + otobus.getBalance());
        counter.enter(otobus);
        System.out.println("Otobus Balance : " + otobus.getBalance());
        System.out.println("Counter Balance : " + administration.getBalance());

        System.out.println("---------------------------------------");

        System.out.println("Minibus Balance : --- " + minibus.getBalance() + "Cost : " + minibus.getBalance());
        counter.enter(minibus);
        System.out.println("Minibus Balance : " + minibus.getBalance());
        System.out.println("Counter Balance : " + administration.getBalance());

        System.out.println("---------------------------------------");


        System.out.println("Crossed Vehicles!:");
        for (Vehicle vehicle : counter.getVehicles()){
            System.out.println(vehicle);
        }


        System.out.println("Obtained total counter ballance : " + administration.dailyBalanceCalculator());


    }
}