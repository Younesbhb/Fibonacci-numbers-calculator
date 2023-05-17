/**
 * @author Younes Bouhaba
 */
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class BinaryFibonacci {
    /**
     Algorithm BinaryFibonacci(n)
     Input: Nonnegative integer n
     Output: The nth Fibonacci number
     if n = 0 then
     return 0
     if n = 1 then
     return 1
     else then
     return BinaryFibonacci(n - 1) + BinaryFibonacci(n - 2)
     */

    public static long BinaryFibonacci (long n)
    {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        else {
            return BinaryFibonacci(n - 1) + BinaryFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {


        try {
            PrintStream text = new PrintStream(new FileOutputStream("BinaryFibonacci.txt"));
            System.setOut(text);
        } catch (FileNotFoundException e) {
            System.out.println("There is a problem and BinaryFibonacci.txt was not created");
        }

        for (int i = 0; i <= 45; i = i + 5) {
            long startTime = System.nanoTime();
            long FibNumber = BinaryFibonacci(i);
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;
            System.out.println("The " + i + "th Fibonacci number is: " +  FibNumber + "\nThe total time is : " + totalTime + " nanoseconds");
            System.out.println();
        }

    }

}
