package Q13;

public class Main {
    public static void main(String[] args) {
        WeekQueue calendar = new WeekQueue();

        // Create a Week object for the first week of the month
        Week week1 = new Week();
        week1.addDay(new WeekDay("Sun", ""));
        week1.addDay(new WeekDay("Mon", "1"));
        week1.addDay(new WeekDay("Tue", "2"));
        week1.addDay(new WeekDay("Wed", "3"));
        week1.addDay(new WeekDay("Thu", "4"));
        week1.addDay(new WeekDay("Fri", "5"));
        week1.addDay(new WeekDay("Sat", "6"));
        calendar.addWeek(week1);

        // Create a Week object for the second week of the month
        Week week2 = new Week();
        week2.addDay(new WeekDay("Sun", "7"));
        week2.addDay(new WeekDay("Mon", "8"));
        week2.addDay(new WeekDay("Tue", "9"));
        week2.addDay(new WeekDay("Wed", "10"));
        week2.addDay(new WeekDay("Thu", "11"));
        week2.addDay(new WeekDay("Fri", "12"));
        week2.addDay(new WeekDay("Sat", "13"));
        calendar.addWeek(week2);

        // Create a Week object for the third week of the month
        Week week3 = new Week();
        week3.addDay(new WeekDay("Sun", "14"));
        week3.addDay(new WeekDay("Mon", "15"));
        week3.addDay(new WeekDay("Tue", "16"));
        week3.addDay(new WeekDay("Wed", "17"));
        week3.addDay(new WeekDay("Thu", "18"));
        week3.addDay(new WeekDay("Fri", "19"));
        week3.addDay(new WeekDay("Sat", "20"));
        calendar.addWeek(week3);

        // Print the calendar
        calendar.printCalendar();
    }
}
