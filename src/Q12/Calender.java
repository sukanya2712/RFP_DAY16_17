package Q12;

import java.util.Scanner;

class Calendar {

    public static void main(String[] args) {
//

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();
        // Get the number of days in the month
        int daysInMonth = getDaysInMonth(month, year);

        // Get the day of the week for the first day of the month
        int firstDayOfWeek = getFirstDayOfWeek(month, year);

        // Create the 2D array to store the calendar
        int[][] calendar = new int[6][7];

        // Initialize the calendar with 0's
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                calendar[i][j] = 0;
            }
        }

        // Fill in the calendar with the days of the month
        int dayOfMonth = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == 0 && j < firstDayOfWeek) {
                    // Leave the days before the first day of the month as 0's
                    continue;
                }
                if (dayOfMonth > daysInMonth) {
                    // All days of the month have been filled in
                    break;
                }
                calendar[i][j] = dayOfMonth++;
            }
        }

        // Print the calendar
        System.out.println("  Sun  Mon  Tue  Wed  Thu  Fri  Sat");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (calendar[i][j] == 0) {
                    System.out.print("     ");
                } else {
                    System.out.printf("%5d", calendar[i][j]);
                }
            }
            System.out.println();
        }
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    // Method to get the day of the week for the first day of a month
    public static int getFirstDayOfWeek(int month, int year) {
        // Zeller's congruence formula
        int q = 1;
        int m = month;
        int Y = year;
        if (month < 3) {
            m += 12;
            Y--;
        }

        return q;
    }

}