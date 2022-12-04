package vehicles;

public class Car extends Vehicle{

    public Car(int OGSNumber, String holder, double balance) {
        super(OGSNumber, holder, balance);
        vehicleClass =1;
        cost =10;
    }

    @Override
    public String toString() {
        return "Vehicles.Car"+ super.toString();
    }
}
