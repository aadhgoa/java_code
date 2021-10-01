//Demo on Data Types
//import java.io.*;
class Program_4_0 //declares a class, OO construct
{ //main is the starting point for the interpreter to begin execution
  //public is an access specifier. Public makes it accessible to other classes
  //static - belongs to the entire class
  //void is the return type
	public static void main(String args[])//args provided in the command line
	{
		char c = 'a';
		byte b = 50;
		short s = 190;
		int o = 07, h = 0xF, bin = 0b01, n = 1_000; //octal, hexadecimal, binary, numeric
		double r = 0.83;//real
		float e=1.2e-5f; //exponential
		String t = "OOPJ";
		System.out.println(" The \"Variables\" are:");
		System.out.println(" char = " +c);
		System.out.println(" byte = " +b);
		System.out.println(" short = " +s);
		System.out.println(" octal = " +o);
		System.out.println(" hexadecimal = " +h);
		System.out.println(" binary = " +bin);
		System.out.println(" numeric = " +n);
		System.out.println(" real = " +r);
		System.out.println(" exponential = " +e);
		System.out.println(" string = " +t);
	}
}