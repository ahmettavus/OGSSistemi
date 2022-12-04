package vehicles;

import java.util.ArrayList;
import java.util.Date;
public abstract class Vehicle {
    private int OGSNumber;
    private String holder;
    protected int vehicleClass;
    private ArrayList<Date> crossedDate =new ArrayList<Date>();
    private double balance;
    protected double cost;

    public Vehicle(int OGSNumber, String holder, int vehicleClass, double balance) {
        this.OGSNumber = OGSNumber;
        this.holder = holder;
        this.vehicleClass = vehicleClass;
        this.balance = balance;
    }

    public Vehicle(int OGSNumber, String holder, double balance) {
        this.OGSNumber = OGSNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public double enter() {
        if(balance >= cost) {
            crossedDate.add(new Date());
            balance -= cost;
            return cost;
        } else {
            return -1;
        }
    }

    public int getOGSNumber() {
        return OGSNumber;
    }

    public ArrayList<Date> getCrossedDate() {
        return crossedDate;
    }

    public double getBalance() {
        return balance;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "[OGSNumber=" + OGSNumber + ", Holder=" + holder + ", Class=" + vehicleClass + ", Date=" + crossedDate;
    }




}