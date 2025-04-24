import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello to PaceConvert!");

        Scanner scRaceTime = new Scanner(System.in);
        Scanner scRaceDistance = new Scanner(System.in);

        System.out.println("Enter your race distance:");
        System.out.println("You can only choose from 800m, 1600m, or 3200m");

        String raceDistance = scRaceDistance.nextLine();

        System.out.println("Enter your race time:");

        String raceTime = scRaceTime.nextLine();

        switch(raceDistance){
            case "800m", "1600m", "3200m":
                System.out.println("Current Race");
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                break;
        }
    }
}