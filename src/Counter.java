import vehicles.Vehicle;

import java.util.ArrayList;

public class Counter {
    private static ArrayList<Vehicle> vehicles;
    private static double balance;
    public Counter(){
        vehicles = new ArrayList<Vehicle>();
        balance = 0;
    }
    public void enter(Vehicle vehicle){
        double cost = vehicle.enter();
        if (cost != -1){
            System.out.println(vehicle.getOGSNumber() + "OGS Holder vehiche has been passed throught!");
            if (!vehicles.contains(vehicle))
                vehicles.add(vehicle);
            balance+=cost;
        }else {
            System.out.println(vehicle.getOGSNumber() + " unsufficient balance!");
        }
    }
    public static double getBalance(){
        return balance;
        
    } public static ArrayList<Vehicle> getVehicles(){
        return vehicles;
    }
}
