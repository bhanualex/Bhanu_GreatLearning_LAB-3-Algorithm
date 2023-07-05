package currencyDenominations.main;

import java.util.Arrays;
import java.util.Scanner;

public class CurrentDenomination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations ");
		int size = sc.nextInt();

		int[] value = new int[size];

		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {

			value[i] = sc.nextInt();
		}

		Arrays.sort(value);

		Integer[] reversedArray = new Integer[size];
		for (int i = 0; i < size; i++) {
			reversedArray[i] = value[size - 1 - i];
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		System.out.println("Your payment approach in order to give " + "min no of notes will be");
		for (int i = 0; i < reversedArray.length; i++) {
			int x = 0;
			if (amount > 0) {
				x = amount / reversedArray[i];
				if(x!=0)
				System.out.println(reversedArray[i] + ":" + x);
				amount %= reversedArray[i];

			}

			sc.close();
		}
	}
}
