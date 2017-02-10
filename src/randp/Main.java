package randp;

import java.lang.reflect.Array;

public class Main {

	public static void main(String[] args){
		randp r = new randp(15);
		for (int  value : r.array){
			System.out.println(value);
			}
	}
}
