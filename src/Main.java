import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double score;
        double dblTimeMin = 0.0;
        double dblTimeSec = 0.0;
        String[] totalTime = {};
        String timeMin = "";
        String timeSec = "";

        System.out.println("Hello to PaceConvert!");
        System.out.println("====================================");

        Scanner scanMain = new Scanner(System.in);

        System.out.println("Enter your race distance:");
        System.out.println("You can only choose from 800m, 1600m, or 3200m");
        String raceDistance = scanMain.nextLine();

        System.out.println("Enter your race time:");
        String raceTime = scanMain.nextLine();

        if (raceTime.contains(":")) {
            totalTime = raceTime.split(":");
            timeMin = totalTime[0];
            timeSec = totalTime[1];
            try {
                dblTimeMin = Double.parseDouble(timeMin);
                dblTimeSec = Double.parseDouble(timeSec);

            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
            }
        }
        else {
            timeSec = raceTime;
            dblTimeSec = Double.parseDouble(timeSec);
        }

        System.out.println(timeMin);
        System.out.println(timeSec);


        switch (raceDistance) {
            case "400m":
                if (dblTimeMin > 0) {
                    System.out.println("Please enter 400m in seconds ONLY.");
                    break;
                } else {
                    score = 262.37121 * (400 / dblTimeSec) - 1402.7708;
                    System.out.println("Time: " + raceTime);
                    System.out.println("Distance: " + raceDistance);
                    System.out.println("Score: " + score);
                    break;
                }
            case "800m":
                score = 302.9089*(800/((60*dblTimeMin)+dblTimeSec)) - 1377.5673;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "1 Mile":
                score = 321.7731201*(1609.34/((60*dblTimeMin)+dblTimeSec)) -1306.285127;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "2 Mile":
                break;
            case "5000m":
                score = 342.8535*(5000/((60*dblTimeMin)+dblTimeSec)) - 1234.1959;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "10000m":
                System.out.println("What");
                break;
            default:
                System.out.println("That is not a valid race type.");
                System.out.println("Choose from the list of available race types:");
                System.out.println("110m, 200, 300m, 400m, 800m, 1500, 1 Mile, 3000m, 2 Mile, 5000m, 10000m");
                break;
        }
    }
}