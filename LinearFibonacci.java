/**
 * @author Younes Bouhaba
 */
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class LinearFibonacci {
    /**
     Algorithm LinearFibonacci(n):
     Input: A nonnegative integer n
     Output: Pair of Fibonacci numbers Fn-1,Fn-2
     if n = 1 then
     return (n, 0)
     else then
     (i, j) = LinearFibonacci(n − 1)
     return (i +j, i)
     */

    public static long[] LinearFibonacci(long n)
    {
        if (n == 1) {
            return new long [] {n, 0};
        }
        else {
            long [] FibNumber = LinearFibonacci(n - 1);
            return new long [] {FibNumber[0] + FibNumber[1], FibNumber[0]};
        }
    }

    public static void main(String[] args) {

        try {
            PrintStream text = new PrintStream(new FileOutputStream("LinearFibonacci.txt"));
            System.setOut(text);
        } catch (FileNotFoundException e) {
            System.out.println("There is a problem and LinearFibonacci.txt was not created");
        }

        for (int i = 5; i <= 100; i += 5) {
            long startTime = System.nanoTime();
            long [] FibNumbers = LinearFibonacci(i);
            long endTime = System.nanoTime();
            long totalTime = endTime - startTime;

            System.out.println("The " + i + "th Fibonacci number is: " +  FibNumbers[0] + "\n The total time is : " + totalTime + " nanoseconds");
            System.out.println();
        }

    }

}
