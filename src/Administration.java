import vehicles.Vehicle;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Administration {
    public Administration() {

    }
    public double getBalance(){
        return Counter.getBalance();
    }
    public double dailyBalanceCalculator(){
        double balance = 0;
        for (Vehicle vehicle: Counter.getVehicles()){
            for (Date date : vehicle.getCrossedDate()){
                SimpleDateFormat format = new SimpleDateFormat("yyyymmdd");
                Date today = new Date();
                String todayFormatted = format.format(today);
                if (todayFormatted.equals(format.format(date))){
                    balance += vehicle.getBalance();
                }
            }
        }
        return balance;
    }
}
