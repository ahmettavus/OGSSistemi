package vehicles;

public class Otobus extends Vehicle{

    public Otobus(int OGSNumber, String holder, double balance) {
        super(OGSNumber, holder, balance);
        vehicleClass =3;
        cost =30;
    }

    @Override
    public String toString() {
        return "Bus" +  super.toString();
    }
}
