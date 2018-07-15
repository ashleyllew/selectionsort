
public class MySelectionSort2 {

	public static void main(String[] args) {
		int [] array = new int [10];
		for (int i = 0, j = array.length-1; i < array.length && j>=0; i++, j--) {
			array[i] = j;
		}
		MyOwnSelectionSort(array);
	}
	
	public static <AnyType extends Comparable <AnyType>> void MyOwnSelectionSort (int [] array) {
		int currentSmallest;
		int currentSmallestIndex = 0;
		
		for (int i = 0; i < array.length; i++) {
			int current = array[i];
			currentSmallest = array[i];
			currentSmallestIndex = i;
			for (int j = currentSmallestIndex + 1; j < array.length; j++) {
				Comparable<Integer> track = array[currentSmallestIndex];
				if (track.compareTo(array[j]) > 0) {
					currentSmallest = array[j];
					currentSmallestIndex = j;
				}
			}
			array[i] = currentSmallest;
			array[currentSmallestIndex] = current;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("element: " + array[i]);			
		}
	}

}
