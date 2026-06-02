import java.util.Scanner;

public class DayChecker{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String day  = sc.next().toUpperCase();
        switch (day){
            case "MONDAY", "TUESDAY", "WEDNESDAY",
                 "THURSDAY", "FRIDAY"
                -> System.out.println("Week days study hard");
            case "SATURDAY", "SUNDAY"
                -> System.out.println("Weekend still study ");
            default -> System.out.println("Invalid Day");
        }
        sc.close();
    }
}