//using the BufferedReader class
//import the classes from java.io package
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Program_4_1c//BufferedReaderDemo
{
	public static void main(String[] args) {
        //create BufferedReader class object
        InputStreamReader isr = new InputStreamReader(System.in);
        try (BufferedReader br = new BufferedReader(isr)) {
            String input = br.readLine();//read the line of text as a String
            int n = Integer.parseInt(input);//convert the String to integer.
            System.out.println("Square is = " + n * n);
        } catch (IOException ioe)//Handle the IOException if thrown by readLine()
        {
            System.out.println("Input Error " + ioe);
        }
    }
}
//Run the program and enter a number.