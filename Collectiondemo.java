package collection;

import java.util.Collections;

public class Collectiondemo {

	public static void main(String[] args) {
		System.out.println("ar="+ar);
		System.out.println("v="+v);
		boolean dis=Collections.disjoint(ar, v);
		System.out.println("Ar and v is disjunct: "+dis);
		Collections.addAll(v, ar.toArray());
		System.out.println("After adding, v="+v);
		int minVal=(int)Collections.min(v);
		int maxVal=(int)Collections.max(v);
	}
	
}

