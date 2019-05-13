import java.util.GregorianCalendar;
import java.time.LocalTime;


public class movies {

    double price;
    String date;
    String time;
    String movie;
    int hall;

    public movies(double price, String date, String time, String movie, int hall){
        this.price = price;
        this.date = date;
        this.time = time;
        this.movie = movie;
        this.hall = hall;

    }
    public double getTotalPrice(){
        double totalPrice = 0;
        return totalPrice += this.price;
        System.out.println("Total Price: " + totalPrice);

    }


}
