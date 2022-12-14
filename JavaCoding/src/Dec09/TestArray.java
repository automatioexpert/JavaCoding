package Dec09;

public class TestArray {

	public static void main(String[] args) {
		// Object Array
		Object[] arr = { "steve", 100, 29392.238, 23238.282239f, 33723888993L };

		System.out.println("Array Length is : " + arr.length);

		// Print all the Array elements

		for (Object ar : arr) {
			System.out.println(ar);
		}
		
		/*
		Array Length is : 5
		steve
		100
		29392.238
		23238.283
		33723888993
		 			*/
		

	}

}
