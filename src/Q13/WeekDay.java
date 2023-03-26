package Q13;

public class WeekDay {
    String day;
    String date;

    public WeekDay(String day, String date) {
        this.day = day;
        this.date = date;
    }

    public String toString() {
        return day + " " + date;
    }
}
