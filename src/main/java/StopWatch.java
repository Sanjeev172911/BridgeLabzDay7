
import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Press Enter to start the stopwatch.");
        scanner.nextLine();

        long startTime = System.currentTimeMillis();

        System.out.println("Stopwatch started. Press Enter to stop.");
        scanner.nextLine();

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Stopwatch stopped.");
        System.out.println("Elapsed Time: " + formatElapsedTime(elapsedTime));

        scanner.close();
    }

    private static String formatElapsedTime(long elapsedTime) {
        long hours = elapsedTime / 3600000;
        long minutes = (elapsedTime % 3600000) / 60000;
        long seconds = (elapsedTime % 60000) / 1000;
        long milliseconds = elapsedTime % 1000;

        return String.format("%02d:%02d:%02d.%03d", hours, minutes, seconds, milliseconds);
    }
}


