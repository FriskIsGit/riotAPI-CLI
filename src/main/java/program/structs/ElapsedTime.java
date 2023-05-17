package program.structs;

public class ElapsedTime{
    //-+1 second precision
    public int minutes;
    public int seconds;

    public ElapsedTime(long unixMillis){
        seconds = (int) (unixMillis / 1000);
        minutes = seconds / 60;
        seconds = seconds % 60;
    }

    @Override
    public String toString(){
        String sec = seconds < 10 ? "0" + seconds : String.valueOf(seconds);
        return "[" + minutes + ':' + sec + ']';
    }
}
