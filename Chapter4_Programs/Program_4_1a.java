public class Program_4_1a   //ConsoleDemo
{
	public static void main(String[] args){
		System.out.println("What is your name? ");
		String name = System.console().readLine();
		System.out.println("Your name is: " + name);
	}
}