package time;

public class Time2 {
    private int hour;
    private int minute;
    private int second;

    //DRY - Don't Repeat Yourself!

    // time.Time2 no argument constructor:
    // Initialises each instance variable to zero
    public Time2(){
        this(0, 0, 0);
        // invoke time.Time2 constructor with three arguments
    }
    // time.Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int h){
        this(h, 0, 0);
    }
    // time.Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int h, int m){
        this(h, m, 0);
    }
    // time.Time2 constructor: hour, minute and second supplied
    public Time2(int h, int m, int s){
        setTime(h, m, s);
    }
    // time.Time2 constructor: another time.Time2 object supplied
    public Time2(Time2 time){
        // invoke time.Time2 three-argument constructor
        this(time.hour, time.getMinute(), time.getSecond());
    }

    public void copyFrom(Time2 time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }

    // SETTERS
    // set a new time value using universal time
    // validate the data
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    // validate and set the hour
    public void setHour(int h){
        if(h >= 0 && h < 24)
            hour = h;
        else
            throw new IllegalArgumentException("hour must be 0-23");
    }
    // validate and set minute
    public void setMinute(int m){
        if(m >= 0 && m < 60)
            minute = m;
        else
            throw new IllegalArgumentException("minute must be 0-59");
    }
    // validate and set second
    public void setSecond(int s){
        if(s >= 0 && s < 60)
            second = ((s >= 0 && s < 60) ? s : 0);
        else
            throw new IllegalArgumentException("second must be 0-59");
    }
    // GETTERS
    // get hour
    public int getHour(){
        return hour;
    }
    // get minute
    public int getMinute(){
        return minute;
    }
    // get second
    public int getSecond(){
        return second;
    }

    // convert to String in universal time format (HH:MM:SS)
    public String toUniversalString(){
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    // convert to String in standard time format (H:MM:MM AM/PM)
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

}
