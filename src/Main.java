import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double resultScore = 0;
        double dblTimeHr = 0.0;
        double dblTimeMin = 0.0;
        double dblTimeSec = 0.0;
        double dblConvMin;
        double dblConvSec;
        int intConvMin;
        Scanner scanMain;
        String strInputRaceDistance;
        String strInputRaceTime;
        String[] totalTime;
        String timeMin;
        String timeSec;
        String convertRace;
        String comp_m_s_s;

        DecimalFormat df_obj = new DecimalFormat("#.##");
        System.out.println("========================================");
        System.out.println("\t\t\t\t******");
        System.out.println("\t\t\t   PaceConv");
        System.out.println("\t\tWritten by: Austin Rippee");
        System.out.println("\t\t\t\t******");
        System.out.println("========================================");

        scanMain = new Scanner(System.in);

        System.out.println("Enter your race distance:");
        strInputRaceDistance = scanMain.nextLine();

        System.out.println("Enter your race time:");
        strInputRaceTime = scanMain.nextLine();

        System.out.println("Enter the race you want to convert to:");
        convertRace = scanMain.nextLine();

        if (strInputRaceTime.contains(":")) {
            totalTime = strInputRaceTime.split(":");
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
            timeSec = strInputRaceTime;
            dblTimeSec = Double.parseDouble(timeSec);
        }

        switch (strInputRaceDistance) {
            case "100m","100":
                resultScore = 290.52712*(100/dblTimeSec) - 1953.2266;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "150m","150":
                resultScore = 265.3031224*(150/dblTimeSec) -1720.7734;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "200m","200":
                resultScore = 267.75893*(200/dblTimeSec) - 1703.6447;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "300m","300":
                resultScore = 251.7769577*(300/dblTimeSec) -1414.90071;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "400m","400":
                if (dblTimeMin > 0) {
                    System.out.println("Please enter 400m in seconds ONLY.");
                    break;
                } else {
                    resultScore = 262.37121 * (400 / dblTimeSec) - 1402.7708;
                    System.out.println("Time: " + strInputRaceTime);
                    System.out.println("Distance: " + strInputRaceDistance);
                    System.out.println("Score: " + resultScore);
                    break;
                }
            case "600m","600":
                resultScore = 285.7637*(600/((60*dblTimeMin)+dblTimeSec)) -1371.563558;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "800m","800":
                resultScore = 302.9089*(800/((60*dblTimeMin)+dblTimeSec)) - 1377.5673;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "1000m","1000","1,000","1,000m":
                resultScore = 313.6503268*(1000/((60*dblTimeMin)+dblTimeSec)) -1374.25166;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "1500m","1500","1,500","1,500m":
                resultScore = 320.6038*(1500/((60*dblTimeMin)+dblTimeSec)) - 1314.0045;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "1600m","1600","1,600","1,600m":
                resultScore = 321.7731201*(1600/((60*dblTimeMin)+dblTimeSec)) -1306.285127;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "1 Mile","1Mile","Mile","One Mile","1609","1609m":
                resultScore = 321.7731201*(1609.34/((60*dblTimeMin)+dblTimeSec)) -1306.285127;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "2000m","2000","2,000","2,000m":
                resultScore = 328.2988442*(2000/((60*dblTimeMin)+dblTimeSec)) -1303.430804;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "3000m","3000","3,000","3,000m":
                resultScore = 331.264214*(3000/((60*dblTimeMin)+dblTimeSec)) -1240.294895;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "3200m","3200","3,200","3,200m":
                resultScore = 333.4505158*(2*1600/((60*dblTimeMin)+dblTimeSec)) -1241.705275;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "2 Mile","2 Miles","2Mile","2Miles","Two Miles","Two Mile","3218","3218m":
                resultScore = 333.4505158*(2*1609.34/((60*dblTimeMin)+dblTimeSec)) -1241.705275;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "5000m","5,000m","5000","5,000","5k","5km":
                resultScore = 342.8535*(5000/((60*dblTimeMin)+dblTimeSec)) - 1234.1959;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "6000m":
                resultScore = 344.0777994*(6000/((60*dblTimeMin)+dblTimeSec)) -1217.284313;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "8000m":
                resultScore = 348.6258257*(8000/((60*dblTimeMin)+dblTimeSec)) -1192.426848;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            case "10000m":
                resultScore = 349.8535*(10000/((60*dblTimeMin)+dblTimeSec)) - 1171.2847;
                System.out.println("Time: " + strInputRaceTime);
                System.out.println("Distance: " + strInputRaceDistance);
                System.out.println("Score: " + resultScore);
                break;
            default:
                System.out.println("That is not a valid race type.");
                break;
        }

        switch (convertRace) {
            case "5000m","5,000m","5000","5,000","5k","5km":

                dblConvMin = Math.round(Math.floor(5000/(0.0029129*resultScore+3.602496)/60));
                intConvMin = (int) dblConvMin;
                dblConvSec = ((5000/(0.0029129*resultScore+3.602496)/60)- dblConvMin)*60;
                if (Math.floor(dblConvSec /10) > 0) {
                comp_m_s_s = String.valueOf(df_obj.format(dblConvSec));
                }
                else {
                    comp_m_s_s = "0" + String.valueOf(df_obj.format(dblConvSec));
                }
                raceOutput(strInputRaceDistance,strInputRaceTime,convertRace, intConvMin,comp_m_s_s);
                break;
        }
    }

    static void raceOutput(String inputRaceDistance, String strInputRaceTime, String convertRace, int comp_m_int, String comp_m_s_s) {
        System.out.println("=======================================================================");
        System.out.println();
        System.out.println("Converted Time from " + inputRaceDistance + " (" + strInputRaceTime + ") to " + convertRace + ": " + comp_m_int + ":" + comp_m_s_s);
        System.out.println();
        System.out.println("=======================================================================");
    }
}