import java.util.*;

public class bubble_sort {
	public static void main (String args[]) {
		int v[] = new int[5];
		int n, i, aux;
		Scanner input = new Scanner(System.in);

		// feeding vector
		for (i = 0; i <= 4; i++) {
			System.out.println("Enter v[" + i + "]: ");
			v[i] = input.nextInt();
		}

		// actual ascending sort
		// loop with the n elements
		for (n = 1; n <= 5; n++) {
			for (i = 0; i <= 3; i++) {
				if (v[i] > v[i + 1]) {
					aux = v[i];
					v[i] = v[i + 1];
					v[i + 1] = aux;
				}
			}
		}

		for (i = 0; i <= 4; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}
	}
}