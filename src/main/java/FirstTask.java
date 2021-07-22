import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTask {
    static void findSumOfOddAndEvenNumbers() {
        int startInterval=0, endInterval=0;
        //reading the start and end of interval from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("enter the start of interval");
            startInterval = Integer.parseInt(reader.readLine());
            System.out.println("enter the end of interval");
            endInterval = Integer.parseInt(reader.readLine());
        }catch (IOException e){
            System.err.println("Error: "+e);
        }catch (NumberFormatException e) {
            System.err.println("Invalid number");
        }

        //finding the sum of odd and even numbers
        int sumOfOdd=0, sumOfEven=0;
        for (int i = startInterval; i <= endInterval; i++) {
            if (i % 2 == 0) sumOfEven+=i;
            else sumOfOdd+=i;
        }
        System.out.println("Sum of odd numbers is "+sumOfOdd);
        System.out.println("Sum of even numbers is "+sumOfEven);
    }

}
