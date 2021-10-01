//Scanner class
import java.util.Scanner;//import the class Scanner from util package.
class Program_4_1b//ScannerDemo
{
	public static void main(String args[])
	{
		// Create the object of Scanner class using System.in
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("Entered String is: "+s);
	}
}