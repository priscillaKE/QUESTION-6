import java.util.Scanner;

public class leapmonth {
    public static void main(String[] args) {
        int year;
        int month;
        boolean isLeapMonth;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        year = input.nextInt();

        System.out.print("Enter month (1-12): ");
        month = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Enter a value between 1 and 12.");
            input.close();
            return;
        }

        isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0);
        isLeapMonth = isLeapMonth || (year % 400 == 0);

        if (month == 2 && isLeapMonth) {
            System.out.println("Month " + month + " in year " + year + " is a leap month.");
        } else {
            System.out.println("Month " + month + " in year " + year + " is NOT a leap month.");
        }

        input.close();
    }
}
