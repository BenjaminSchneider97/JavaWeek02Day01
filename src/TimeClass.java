import java.text.SimpleDateFormat;

// A04
public class TimeClass {

        int hour;
        int minute;
        int second;

    public TimeClass(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /*public void trycatch (int count){
        int count = 0;
        for
    }*/

    /* String time = "";
    SimpleDateFormat df = new SimpleDateFormat("HH:mm"); */


    public void addSecond(int addSecond){
        this.second += addSecond;
    }

    public void printTime(){
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }


}
