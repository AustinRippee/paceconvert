import java.text.DecimalFormat;
import java.util.Scanner;

public class PaceConvert {
    public static void main(String[] args) {

        DecimalFormat df_obj = new DecimalFormat("#.##");
        double dblTotalTime = 0.0, resultScore = 0.0, dblTimeMin, dblTimeHr, dblTimeSec, dblConvMin, dblConvSec;
        int intConvMin;
        Scanner scanMain;
        String strInputRaceDistance, strInputRaceTime, timeHr, timeMin, timeSec, convertRace, strConvSec;
        String[] totalTime;

        introPrompt();

        scanMain = new Scanner(System.in);

        System.out.println("Enter your race distance:");
        strInputRaceDistance = scanMain.nextLine();

        System.out.println("Enter your race time:");
        strInputRaceTime = scanMain.nextLine();

        System.out.println("Enter the race you want to convert to:");
        convertRace = scanMain.nextLine();

        if (strInputRaceTime.contains(":")) {
            totalTime = strInputRaceTime.split(":");

            try {

                if (totalTime.length == 3) {
                    timeHr = totalTime[0];
                    timeMin = totalTime[1];
                    timeSec = totalTime[2];

                    dblTimeHr = Double.parseDouble(timeHr);
                    dblTimeMin = Double.parseDouble(timeMin);
                    dblTimeSec = Double.parseDouble(timeSec);

                    dblTotalTime = (dblTimeHr * 3600) + (dblTimeMin * 60) + dblTimeSec;
                } else if (totalTime.length == 2) {
                    timeMin = totalTime[0];
                    timeSec = totalTime[1];

                    dblTimeMin = Double.parseDouble(timeMin);
                    dblTimeSec = Double.parseDouble(timeSec);

                    dblTotalTime = (dblTimeMin * 60) + dblTimeSec;
                } else {
                    System.out.println("Invalid time format. Try HH:MM:SS");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid time format. Try HH:MM:SS");
            }
        } else {
            try {
                dblTotalTime = Double.parseDouble(strInputRaceTime);
            } catch (NumberFormatException e) {
                System.out.println("Invalid time format. Try HH:MM:SS");
            }
        }

        // Score = A * (D / T) - B
        // A = Scaling factor that adjusts for the distance
        // D = Distance in meters
        // T = time in seconds
        // B = baseline value to align the scale appropriately
        switch (strInputRaceDistance) {
            case "100m", "100":
                resultScore = 290.52712 * (100 / dblTotalTime) - 1953.2266;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "150m", "150":
                resultScore = 265.3031224 * (150 / dblTotalTime) - 1720.7734;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "200m", "200":
                resultScore = 267.75893 * (200 / dblTotalTime) - 1703.6447;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "300m", "300":
                resultScore = 251.7769577 * (300 / dblTotalTime) - 1414.90071;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "400m", "400":
                if (dblTotalTime > 59.99) {
                    System.out.println("Please enter 400m in seconds ONLY.");
                } else {
                    resultScore = 262.37121 * (400 / dblTotalTime) - 1402.7708;
                    printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                    break;
                }
            case "600m", "600":
                resultScore = 285.7637 * (600 / dblTotalTime) - 1371.563558;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "800m", "800":
                resultScore = 302.9089 * (800 / dblTotalTime) - 1377.5673;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "1000m", "1000", "1,000", "1,000m", "1k", "1km":
                resultScore = 313.6503268 * (1000 / dblTotalTime) - 1374.25166;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "1500m", "1500", "1,500", "1,500m", "1.5k", "1.5km":
                resultScore = 320.6038 * (1500 / dblTotalTime) - 1314.0045;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "1600m", "1600", "1,600", "1,600m":
                resultScore = 321.7731201 * (1600 / dblTotalTime) - 1306.285127;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "1 Mile", "1Mile", "Mile", "One Mile", "1609", "1609m":
                resultScore = 321.7731201 * (1609.34 / dblTotalTime) - 1306.285127;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "2000m", "2000", "2,000", "2,000m":
                resultScore = 328.2988442 * (2000 / dblTotalTime) - 1303.430804;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "3000m", "3000", "3,000", "3,000m":
                resultScore = 331.264214 * (3000 / dblTotalTime) - 1240.294895;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "3200m", "3200", "3,200", "3,200m":
                resultScore = 333.4505158 * (2 * 1600 / dblTotalTime) - 1241.705275;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "2 Mile", "2 Miles", "2Mile", "2Miles", "Two Miles", "Two Mile", "3218", "3218m":
                resultScore = 333.4505158 * (2 * 1609.34 / dblTotalTime) - 1241.705275;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "5000m", "5,000m", "5000", "5,000", "5k", "5km":
                resultScore = 342.8535 * (5000 / dblTotalTime) - 1234.1959;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "6000m", "6,000m", "6000", "6,000", "6k", "6km":
                resultScore = 344.0777994 * (6000 / dblTotalTime) - 1217.284313;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "8000m", "8,000m", "8000", "8,000", "8k", "8km":
                resultScore = 348.6258257 * (8000 / dblTotalTime) - 1192.426848;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "10000m", "10,000m", "10000", "10,000", "10k", "10km":
                resultScore = 349.8535 * (10000 / dblTotalTime) - 1171.2847;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "10 Miles", "10mi":
                resultScore = 360.6890152 * (10 * 1609.34 / dblTotalTime) - 1164.451907;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "Half Marathon", "HM", "Half", "13.1", "13.1mi", "13.1 Miles":
                resultScore = 366.3739581 * (42194.99 / 2 / dblTotalTime) - 1168.783894;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            case "Marathon", "M", "Full Marathon", "Full", "Mara", "26.2", "26.2mi", "26.2 Miles":
                resultScore = 384.5408 * (42194.99 / dblTotalTime) - 1161.8021;
                printInfo(strInputRaceTime, strInputRaceDistance, resultScore);
                break;
            default:
                if (dblTotalTime == 0.0) {
                    System.out.println("Invalid time format. Please try again.");
                } else {
                    System.out.println("That is not a valid race distance.");
                    return;
                }
        }

        switch (convertRace) {
            case "1 Mile", "1Mile", "Mile", "One Mile", "1609", "1609m":
                break;
            case "5000m", "5,000m", "5000", "5,000", "5k", "5km":

                dblConvMin = Math.round(Math.floor(5000 / (0.0029129 * resultScore + 3.602496) / 60));
                intConvMin = (int) dblConvMin;
                dblConvSec = ((5000 / (0.0029129 * resultScore + 3.602496) / 60) - dblConvMin) * 60;
                if (Math.floor(dblConvSec / 10) > 0) {
                    strConvSec = String.valueOf(df_obj.format(dblConvSec));
                } else {
                    strConvSec = "0" + df_obj.format(dblConvSec);
                }
                raceOutput(strInputRaceDistance, strInputRaceTime, convertRace, intConvMin, strConvSec);
                break;
        }


        scanMain.close();
    }

    static void printInfo(String strInputRaceTime, String strInputRaceDistance, double resultScore) {
        System.out.println("Time: " + strInputRaceTime);
        System.out.println("Distance: " + strInputRaceDistance);
        System.out.println("Score: " + resultScore);
    }

    static void raceOutput(String inputRaceDistance, String strInputRaceTime, String convertRace, int comp_m_int, String comp_m_s_s) {
        System.out.println("=======================================================================");
        System.out.println();
        System.out.println("Converted Time from " + inputRaceDistance + " (" + strInputRaceTime + ") to " + convertRace + ": " + comp_m_int + ":" + comp_m_s_s);
        System.out.println();
        System.out.println("=======================================================================");
    }

    static void introPrompt() {
        System.out.println("========================================");
        System.out.println("\t\t\t\t******");
        System.out.println("\t\t\t   PaceConv");
        System.out.println("\t\tWritten by: Austin Rippee");
        System.out.println("\t\t\t\t******");
        System.out.println("========================================");
    }
}