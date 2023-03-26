package Q13;

public class Week {
    private WeekDayNode head;
    private WeekDayNode tail;

    public void addDay(WeekDay day) {
        WeekDayNode node = new WeekDayNode(day);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void printWeek() {
        WeekDayNode current = head;
        while (current != null) {
            System.out.println(current.day);
            current = current.next;
        }
    }

    private class WeekDayNode {
        WeekDay day;
        WeekDayNode next;

        WeekDayNode(WeekDay day) {
            this.day = day;
            this.next = null;
        }
    }
}
