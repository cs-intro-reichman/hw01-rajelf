/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		System.out.println("enter  range");

		int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);


		int randomValue1 = (int) (a+ Math.random() * (b - a));
		int randomValue2 = (int) (a+ Math.random() * (b - a) );
		int randomValue3 = (int) (a+ Math.random() * (b - a) );

		System.out.println(randomValue1);
		System.out.println(randomValue2);
		System.out.println(randomValue3);

		if (randomValue1 < randomValue2 && randomValue1 < randomValue3 ){
			System.out.println("the minimal number was " + randomValue1 );


		}
		else if (randomValue2<randomValue1 && randomValue2<randomValue3){
			System.out.println("the minimal number was "+ randomValue2);
		}
		else{
			System.out.println("the minimal  number was " + randomValue3);
		}


	
	}
}
