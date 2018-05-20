import java.util.*;

public class insertion_sort {
	public static void main (String args[]) {
		int v[] = new int[5];
		int i, j, choosen;
		Scanner input = new Scanner(System.in);

		for(i = 0; i <= 4; i++) {
			System.out.println("Enter v[" + i + "]: ");
			v[i] = input.nextInt();
		}

		for(i = 1; i <= 4; i++) {
			choosen = v[i];
			j = i - 1;

			while(j >= 0 && v[j] > choosen) {
				v[j+1] = v[j];
				j = j - 1;
			}

			v[j+1] = choosen;
		}

		for (i = 0; i <= 4; i++) {
			System.out.println("v[" + i + "] = " + v[i]);
		}

	}
}