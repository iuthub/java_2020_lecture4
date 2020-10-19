package time;

public class Time1 {
//    private int hour;
//    private int minute;
//    private int second;

    private int secondsElapsedSinceMidnight;
    private Time1Helper helper = new Time1Helper();

    Time1(int hour){
        secondsElapsedSinceMidnight = hour * 60 * 60;
        helper.greet("sad");
    }

    public static Time1 create(int hour){
        return new Time1(hour);
    }

    // private int secondsElapsedSinceMidnight;
    // set a new time var using universal time;
    // throw an exception if the hour, minute or second is invalid
    public void setTime(int hour, int minute, int second){
        // validates hour, minute, second
        if((hour >= 0 && hour <24) && (minute >= 0 && minute < 60) && (second >= 0 && second < 60)){
            this.secondsElapsedSinceMidnight = hour * 60 * 60 + minute * 60 + second;
        }else{
            throw new IllegalArgumentException(
                    "hour, minute and/or second were out of range");
        }
    }

    private int getHour(){
        return this.secondsElapsedSinceMidnight / (60 * 60);
    }
    private int getMinute(){
        return (this.secondsElapsedSinceMidnight / 60) % 60;
    }

    private int getSecond(){
        return (this.secondsElapsedSinceMidnight) % 60;
    }

    // convert to String in utf (HH:MM:SS)
    public String toUniversalString(){

        return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
    }
    // convert to string in standard time format (H::MM:SS AM or PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((this.getHour() == 0 || this.getHour() == 12) ? 12 : this.getHour() % 12),
                this.getMinute(), this.getSecond(), (this.getHour() < 12) ? "AM" : "PM");
    }
}

class Time1Helper {
    public void greet(String msg){
        //write a greeting
    }

}