
import java.util.Scanner;

public class As3Task13 {

    public static void main(String[] args) {

    }
}

class Clock {

    int hours;
    int minutes;
    int seconds;

    public Clock() {
        hours = 12;
        minutes = 0;
        seconds = 0;
    }

    public Clock(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public Clock(int seconds) {
        this.hours = seconds / 3600;

        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;

    }

    public void setClock(int seconds) {
        this.hours = seconds / 3600;

        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;

    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void tick() {
        seconds++;
        if (seconds > 59) {
            seconds = 0;
            minutes++;
            if (minutes > 59) {
                minutes = 0;
                hours++;
                if (hours > 23) {
                    hours = 0;
                }
            }
        }
    }

    public Clock addClock(Clock c) {
        Clock f = new Clock();

        int hou = c.hours + hours;
        int mins = c.minutes + minutes;
        int secs = c.seconds + seconds;

        mins += (secs / 60);
        secs = secs % 60;
        hou += (mins / 60);
        mins = mins % 60;
        hou = hou % 24;

        f.hours = hou;
        f.minutes = mins;
        f.seconds = secs;

        return f;

    }

    public String toString() {
        if (hours < 10) {
            System.out.print("0");
        }
        System.out.print(hours + ":");
        if (minutes < 10) {
            System.out.print("0");
        }
        System.out.print(minutes + ":");
        if (seconds < 10) {
            System.out.print("0");
        }
        System.out.print(seconds);
        System.out.println();
        return null;
    }

    public void tickDown() {
        seconds--;
        if (seconds < 0) {
            seconds = 59;
            minutes--;
            if (minutes < 0) {
                minutes = 59;
                hours--;
                if (hours < 0) {
                    hours = 23;
                    minutes = 59;
                    seconds = 59;
                }
            }
        }
    }

    public Clock subtractClock(Clock c) {
        Clock f = new Clock();

        f.hours = Math.abs(hours - c.hours);
        f.minutes = Math.abs(minutes - c.minutes);
        f.seconds = Math.abs(seconds - c.seconds);

        return f;

    }
}
