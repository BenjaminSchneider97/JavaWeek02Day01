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

        int minute = addSecond/60;
        int newsecond = addSecond%60;

        this.second += newsecond;
        this.minute += minute;
    }

    public void calcseconds(){
        int seconds = this.hour * 3600 + this.minute * 60 + this.second;
        System.out.println("The day is " + seconds + " seconds old!");
    }

    public void printTime(){
        System.out.println(this.hour + ":" + this.minute + ":" + this.second);
    }



}
