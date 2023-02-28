import java.util.Scanner;
import java.io.IOException;

public class Start {

    public static void main (String[] args) throws IOException {

        try (Scanner num = new Scanner(System.in)) {
            System.out.print("Input n: ");
            int n =  num.nextInt();
            long[] f = new long[n];
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i < n; i++) {
                f[i] = f[i-1] + f[i-2];    
            } 
            System.out.print("First " + n + " Fibonacci numbers: ");
            for (int i = 0; i < n; ++i) {  
                System.out.print(f[i] + " ");
            }
        }
        
        try {
            String s = null;
            s.toString();
            throw new IOException();
        }
        
        catch(NullPointerException e) {
            System.out.println("It's ok ");

        } catch(IOException e) {
            System.out.println("what's new?");
            throw e;
        }
        catch(Exception e) {
            System.out.println("Hi again");
        }
          finally{
            System.out.print("Hi!");
        } 
 
    }
}
