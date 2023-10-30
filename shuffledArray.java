package CreatingAndShufflingArray;

import java.util.Random;

//A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
public class shuffledArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7};
		
		Random random = new Random();
		
		for(int i=0; i<=arr.length-1; i++) {
			int j = random.nextInt(i+1);
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
