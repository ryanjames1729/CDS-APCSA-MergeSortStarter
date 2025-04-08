// Merge Sort Starter      A+CR
class Main {
  
	static int[] arr;

	// Creates temporary array and calls sortHelper
	public static void mergeSort(int[] elements){
		
	}

	// Recursively calls itself to split the array before merging the array in order
	public static void sortHelper(int[] elements, int from, int to, int[] temp){
		
	}

	// Merges the elements into the temp array. Lastly a copy is made to the static array, arr.
	public static void merge(int[] elements, int from, int middle, int to, int[] temp){
		
		
	}

	public static void printArray(int[] arr){
		System.out.print("[ ");
		for(int n : arr){
			System.out.print(n + " ");
		}
		System.out.println("]");
		System.out.println();
	}

	public static void main(String[] args) {
    
	arr = new int[4];
	// for(int i = 0; i < arr.length; i++){
	// 	arr[i] = (int)(Math.random() * 100);
	// }
	arr[0] = 99;
	arr[1] = 38;
	arr[2] = 46;
	arr[3] = 87;

	System.out.println("Unsorted:");
	printArray(arr);

	mergeSort(arr);

	System.out.println("Sorted:");
	printArray(arr);
  }
}