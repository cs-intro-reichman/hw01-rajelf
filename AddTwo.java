/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//3 and  5 are user input and they can be other values and the program will still work
		int a = Integer.parseInt(args[0]);
		int b =  Integer.parseInt(args[1]);
		int c = a + b; 
		System.out.println (a+ " + "+b +"  =  "+ c);


	}
}
