package vehicles;

public class Minibus extends Vehicle{

    public Minibus(int OGSNumber, String holder, double balance) {
        super(OGSNumber, holder, balance);
        vehicleClass =2;
        cost =20;
    }

    @Override
    public String toString() {
        return "Vehicles.Minibus" + super.toString();
    }
}
