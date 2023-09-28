import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int [] arr = { 20, 30, 20, 30, 40, 50, 20};
		
		int count_duplicates = 0;
		
		for (int i = 0; i < arr.length -1 ; i++) {
			for (int j = i+1 ; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count_duplicates++;
				}
			}
		}
		
		arr = Arrays.copyOf(arr, count_duplicates);
		
	}
}
