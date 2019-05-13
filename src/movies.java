import java.util.GregorianCalendar;
import java.time.LocalTime;


// A01
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
    public void getAllMovies(){
      //  System.out.println("Movie Name: \"" + this.movie + "\"" + ", Price: " + this.price + ", Date and Time: " + this.date + " " + this.time + ", in Hall " + this.hall);
        System.out.println(" Price: " + this.price );
    }
}
