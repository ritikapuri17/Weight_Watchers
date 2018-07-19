import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SmallestfromRandomNumbers {

	public static void main(String[] args) {

		int pickednumber = 0;

		ArrayList<Integer> arr = new ArrayList<>();

		Random random = new Random();

		for (int i = 0; i < 500; i++) {
			pickednumber = random.nextInt(500) + 1;

			arr.add(pickednumber);

		}

		System.out.print("Array List is:");
		System.out.println(arr);

		Object obj = Collections.min(arr);

		System.out.println("Smallest number from randaom list is:" + obj);
	}

}
