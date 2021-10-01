//Reading data from keyboard
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Program_4_1  //Reading
{
	public static void main(String args[])
	{	
		//DataInputStream in = new DataInputStream(System.in); //object of DataInputStream
        	//Deprecated. This method does not properly convert bytes to characters.
       		int intNumber = 0;
	        float floatNumber = 0.0f;
       		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
	            //exception handling mechanism -encloses code that might generate run time error
        	    //The try-with-resources statement is a try statement that declares one or more resources. A resource is an object that must be closed after the program is finished with it. 
	            //The try-with-resources statement ensures that each resource is closed at the end of the statement. 
        	    System.out.println("Enter an Integer: ");  //Chapter 9 - Wrapper classes
	            intNumber = Integer.parseInt(in.readLine()); //reads input from the keyboard as a String
	            //Integer.parseInt() converts String to a primitive integer -> Wrapper Class

	            System.out.println("Enter a float number: ");
        	    //reads input from the keyboard as a String converts it to another data type using Wrapper classes
	            //Float.valueOf() -Returns a Float instance representing the specified float value. -> Wrapper Class
        	    //floatValue() - Returns the float value of this Float object.
	            String s = in.readLine();
        	    //System.out.println("Entered Float Number is : " + s);
	            Float f = Float.valueOf(s);//convert String object to Float object
        	    floatNumber = f.floatValue();//Returns the float value of this Float object.   -4000.456128  ->-4000.456
	            //floatNumber = Float.parseFloat(s); //alternative
        	} catch (IOException | NumberFormatException e)//if an error occurs then control is transferred here
        	{
	            System.out.println("Input error" + e);
        	} //if there is no error then control goes to the statement below catch.
	        System.out.println("intNumber = " + intNumber);
	        System.out.println("floatNumber = " + floatNumber);
	}
}