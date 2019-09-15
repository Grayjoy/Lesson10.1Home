import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class Lesson10Two {

    private static ArrayList<Integer> solarSystem;
    static boolean cycle = true;

    public static void readData() {
        try {

            solarSystem = new ArrayList<>();
            while (cycle) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String inputNumber = reader.readLine();
                int conversion = Integer.decode(inputNumber);
                solarSystem.add(conversion);
            }
        } catch (IOException e) {
            System.out.println("Err");
        } catch (NumberFormatException e) {
            System.out.println(solarSystem);
        }
    }
}

