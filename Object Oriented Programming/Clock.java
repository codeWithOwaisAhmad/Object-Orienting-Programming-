import java.util.*;

public class Clock {
    private int hr;
    private int min;
    private int sec;

    public Clock() {
        setTime(0, 0, 0);
    }

    public Clock(int hours, int minutes, int seconds) {
        setTime(hours, minutes, seconds);
    }

    public void setTime(int hours, int minutes, int seconds) {
        if (0 <= hours && hours < 24)
            hr = hours;
        else
            hr = 0;
        if (0 <= minutes && minutes < 60)
            min = minutes;
        else
            min = 0;
        if (0 <= seconds && seconds < 60)
            sec = seconds;
        else
            sec = 0;
    }

    public int getHours() {
        return hr;
    }

    public int getMinutes() {
        return min;
    }

    public int getSeconds() {
        return sec;
    }

    public void printTime() {
        if (hr < 10)
            System.out.print("0");
        System.out.print(hr + ":");
        if (min < 10)
            System.out.print("0");
        System.out.print(min + ":");
        if (sec < 10)
            System.out.print("0");
        System.out.print(sec);
    }

    public void incrementSeconds() {
        sec++;
        if (sec > 59) {
            sec = 0;
            incrementMinutes();
        }
    }

    public void incrementMinutes() {
        min++;
        if (min > 59) {
            min = 0;
            incrementHours();
        }
    }

    public void incrementHours() {
        hr++;
        if (hr > 23)
            hr = 0;
    }

    public boolean equals(Clock otherClock) {
        return (hr == otherClock.hr && min == otherClock.min && sec == otherClock.sec);
    }

    public void makeCopy(Clock otherClock) {
        hr = otherClock.hr;
        min = otherClock.min;
        sec = otherClock.sec;
    }

    public Clock getCopy() {
        Clock temp = new Clock();
        temp.hr = hr;
        temp.min = min;
        temp.sec = sec;
        return temp;
    }

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        Clock myClock = new Clock(5, 5, 5);
        Clock yourClock = new Clock();
        int hours;
        int minutes;
        int seconds;

        System.out.print("Line 6: myClock: ");
        myClock.printTime();
        System.out.println();
        System.out.print("Line 9: yourClock: ");
        yourClock.printTime();
        System.out.println();
        yourClock.setTime(5, 45, 16);
        System.out.print("Line 13: After setting the time, yourClock: ");
        yourClock.printTime();
        System.out.println();
        if (myClock.equals(yourClock))
            System.out.println("Line 17: Both the times are equal.");
        else
            System.out.println("Line 19: The two times are not equal.");
        System.out.print("Line 20: Enter hours, minutes, and seconds: ");
        hours = console.nextInt();
        minutes = console.nextInt();
        seconds = console.nextInt();
        System.out.println();
        myClock.setTime(hours, minutes, seconds);
        System.out.print("Line 26: New time of myClock: ");
        myClock.printTime();
        System.out.println();
        myClock.incrementSeconds();
        System.out.print("Line 30: After incrementing the time by one second, myClock: ");
        myClock.printTime();
        System.out.println();
        yourClock.makeCopy(myClock);
        System.out.print("Line 34: After copying myClock into yourClock, yourClock: ");
        yourClock.printTime();
        System.out.println();
    }
}