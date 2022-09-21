package loopDemo;

public class Main {

	public static void main(String[] args) {
		// for
		for (int i = 0; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		//While
		int i =1;
		while (i<10) {
			System.out.println(i);
			i+=2;
			
		}
		
		System.out.println("While döngüsü bitti.");
		
		//Do-While
		int j=100;
		do {
			System.out.println(j);
			j+=2;
		} while (j<110);
		System.out.println("Do-While Döngüsü bitti");
	}

}
