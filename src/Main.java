import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double score;
        double dblTimeMin = 0.0;
        double dblTimeSec = 0.0;

        System.out.println("Hello to PaceConvert!");

        Scanner scRaceTime = new Scanner(System.in);
        Scanner scRaceDistance = new Scanner(System.in);

        System.out.println("Enter your race distance:");
        System.out.println("You can only choose from 800m, 1600m, or 3200m");

        String raceDistance = scRaceDistance.nextLine();

        System.out.println("Enter your race time:");

        String raceTime = scRaceTime.nextLine();
        String[] totalTime = raceTime.split("[:]");

        String timeMin = totalTime[0];
        String timeSec = totalTime[1];
        System.out.println("Minutes: " + timeMin);
        System.out.println("Seconds: " + timeSec);

        try {
            dblTimeMin = Double.parseDouble(timeMin);
            dblTimeSec = Double.parseDouble(timeSec);

        } catch (NumberFormatException e) {
            System.out.println("Invalid format");
        }

        switch(raceDistance){
            case "800m":
                score = 302.9089*(800/((60*dblTimeMin)+dblTimeSec)) - 1377.5673;
                System.out.println("Current Race");
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "1 Mile":
                score = 321.7731201*(1609.34/((60*dblTimeMin)+dblTimeSec)) -1306.285127;
                System.out.println("Current Race");
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "2 Mile":
                break;
            case "5000m":
                System.out.println("Hello");
                break;
            case "10000m":
                System.out.println("What");
                break;
        }
    }
}