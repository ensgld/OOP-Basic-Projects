import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 1;
        int month = 1;

        System.out.print("Enter the year between 1700-2200: ");
        int userYear = input.nextInt();
        System.out.print("Enter the day between 0-365:");
        int userDay = input.nextInt();
        String months[] = new String[12];

        if (userYear % 4 == 0) {
            int dayofMonths[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            while (userDay >= dayofMonths[month]) {
                userDay -= dayofMonths[month];
                month++;
            }
            day = userDay;
            System.out.println(userDay + "." + month + "." + userYear);
        } else {
            int dayofMonths[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            while (userDay >= dayofMonths[month]) {
                userDay -= dayofMonths[month];
                month++;
            }
            day = userDay;
            System.out.println(userDay + "." + month + "." + userYear);

        }


    }
}