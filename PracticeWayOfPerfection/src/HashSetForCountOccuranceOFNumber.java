import java.util.HashSet;
import java.util.Set;

public class HashSetForCountOccuranceOFNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 3, 4, 5, 6, 6, 5, 7, 7, 3 };

		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}

		for (Integer n : set) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {

				if (n == a[j]) {
					count++;
				}
			}
			System.out.println(n + " occurance is:" + count);
		}
	}

}
