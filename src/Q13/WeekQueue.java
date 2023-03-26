package Q13;

public class WeekQueue {
    private WeekNode head;
    private WeekNode tail;

    public void addWeek(Week week) {
        WeekNode node = new WeekNode(week);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void printCalendar() {
        WeekNode current = head;
        while (current != null) {
            current.week.printWeek();
            System.out.println();
            current = current.next;
        }
    }

    private class WeekNode {
        Week week;
        WeekNode next;

        WeekNode(Week week) {
            this.week = week;
            this.next = null;
        }
    }
}
