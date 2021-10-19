import java.util.ArrayList;

public final class Maths {
	public static int[] intFactor(int input) {
		ArrayList<Integer> stores = new ArrayList<>();
		int[] array = new int[1];
		int[] primes = new int[]{2,3,5,7,11,13,17,19,23,29};
		
		if(input == 1) {
			array[0] = input;
		}
		else {
			for(int i=0;i<primes.length;i++) {
				if((input%primes[i])==0) {stores.add(primes[i]);}
				
			}
		}
		return array;
	}
	public static void toString(int[] input) {
		System.out.print("[ ");
		for(int i=0;i<input.length;i++){System.out.print(input[i]);if(i<(input.length-1)){System.out.print(", ");}}
		System.out.print(" ]");
	}
}