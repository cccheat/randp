package randp;

import java.util.Random;
import java.util.Arrays;

public class randp {
	public int[] array;
	public int numleft = 0;

	public randp(int n) {
		array = new int[n];
		int num = n;
		for (int i = 0; i < n; i++) {
			array[i] = num;
			num--;
		}
		shuffle(array);
	}

	public void shuffle(int[] ar){
		for(int i = 0; i < ar.length; i++){
			int random = i + (int) (Math.random() * (ar.length - i));
			int randomElement = ar[random];
			ar[random] = ar[i];
			ar[i] = randomElement;
		}
	}
	
	public int nextInt() {
		int value = 0;
		value = array[numleft];
		numleft++;
		return value;
	}
}
