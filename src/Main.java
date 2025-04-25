import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double score = 0;
        double dblTimeMin = 0.0;
        double dblTimeSec = 0.0;
        String[] totalTime;
        String timeMin = "";
        String timeSec;
        Scanner scanMain;
        String raceDistance;
        String raceTime;
        String convertRace;
        double comp_m = 0.0;
        double comp_m_s = 0.0;
        double comp_m_s1 = 0.0;
        String comp_m_s_s = "";
        DecimalFormat df_obj = new DecimalFormat("#.##");

        System.out.println("Hello to PaceConvert!");
        System.out.println("====================================");

        scanMain = new Scanner(System.in);

        System.out.println("Enter your race distance:");
        System.out.println("You can only choose from 800m, 1600m, or 3200m");
        raceDistance = scanMain.nextLine();

        System.out.println("Enter your race time:");
        raceTime = scanMain.nextLine();

        System.out.println("Enter the race you want to convert to:");
        convertRace = scanMain.nextLine();

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

        //System.out.println(timeMin);
        //System.out.println(timeSec);


        switch (raceDistance) {
            case "100m":
                score = 290.52712*(100/dblTimeSec) - 1953.2266;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "150m":
                score = 265.3031224*(150/dblTimeSec) -1720.7734;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "200m":
                score = 267.75893*(200/dblTimeSec) - 1703.6447;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "300m":
                score = 251.7769577*(300/dblTimeSec) -1414.90071;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
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
            case "600m":
                score = 285.7637*(600/((60*dblTimeMin)+dblTimeSec)) -1371.563558;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "800m":
                score = 302.9089*(800/((60*dblTimeMin)+dblTimeSec)) - 1377.5673;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "1000m":
                score = 313.6503268*(1000/((60*dblTimeMin)+dblTimeSec)) -1374.25166;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "1500m":
                score = 320.6038*(1500/((60*dblTimeMin)+dblTimeSec)) - 1314.0045;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "1600m":
                score = 321.7731201*(1600/((60*dblTimeMin)+dblTimeSec)) -1306.285127;
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
            case "2000m":
                score = 328.2988442*(2000/((60*dblTimeMin)+dblTimeSec)) -1303.430804;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "3000m":
                score = 331.264214*(3000/((60*dblTimeMin)+dblTimeSec)) -1240.294895;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "3200m":
                score = 333.4505158*(2*1600/((60*dblTimeMin)+dblTimeSec)) -1241.705275;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "2 Mile":
                score = 333.4505158*(2*1609.34/((60*dblTimeMin)+dblTimeSec)) -1241.705275;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "5000m":
                score = 342.8535*(5000/((60*dblTimeMin)+dblTimeSec)) - 1234.1959;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "6000m":
                score = 344.0777994*(6000/((60*dblTimeMin)+dblTimeSec)) -1217.284313;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "8000m":
                score = 348.6258257*(8000/((60*dblTimeMin)+dblTimeSec)) -1192.426848;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            case "10000m":
                score = 349.8535*(10000/((60*dblTimeMin)+dblTimeSec)) - 1171.2847;
                System.out.println("Time: " + raceTime);
                System.out.println("Distance: " + raceDistance);
                System.out.println("Score: " + score);
                break;
            default:
                System.out.println("That is not a valid race type.");
                System.out.println("Choose from the list of available race types:");
                System.out.println("110m, 200, 300m, 400m, 800m, 1500, 1 Mile, 3000m, 2 Mile, 5000m, 10000m");
                break;
        }

        switch (convertRace) {
            case "5000m":

                comp_m = Math.round(Math.floor(5000/(0.0029129*score+3.602496)/60));
                int comp_m_int = (int) comp_m;
                comp_m_s1 = ((5000/(0.0029129*score+3.602496)/60)-comp_m)*60;
                if (Math.floor(comp_m_s1/10) > 0) {
                comp_m_s_s = String.valueOf(df_obj.format(comp_m_s1));
                }
                else {
                    comp_m_s_s = "0" + String.valueOf(df_obj.format(comp_m_s1));
                }
                System.out.println("=======================================================================");
                System.out.println();
                System.out.println("Converted Time from " + raceDistance + " (" + raceTime + ") to " + convertRace + ": " + comp_m_int + ":" + comp_m_s_s);
                System.out.println();
                System.out.println("=======================================================================");
                break;
        }

    }
}