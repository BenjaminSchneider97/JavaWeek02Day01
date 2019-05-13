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

    public void addSecond(int addSecond){

        int newminute = (addSecond + this.second)/60;
        int newsecond = (addSecond + this.second)%60;

        this.second = 0;

        this.second += newsecond;
        this.minute += newminute;

        int newhour = this.minute/60;
        this.minute = this.minute%60;
        this.hour += newhour;

        int timeshours = this.hour/24;

        if(this.hour == 24){
            this.hour = 0;
        }
        else if(this.hour>24){
            this.hour -= 24*timeshours;
        }
    }

    public void calcseconds(){
        int seconds = this.hour * 3600 + this.minute * 60 + this.second;
        System.out.println("The day is " + seconds + " seconds old!");
    }

    public void printTime(){
        String displayseconds = String.valueOf(this.second);
        String displayminutes = String.valueOf(this.minute);
        String displayhours = String.valueOf(this.hour);

        if(this.second < 10){
            displayseconds = "0"+this.second;
        }
        if(this.minute < 10){
            displayminutes = "0"+this.minute;
        }
        if(this.hour < 10){
            displayhours = "0"+this.hour;
        }
        System.out.println(displayhours + ":" + displayminutes + ":" + displayseconds);
    }



}
