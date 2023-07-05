package PayMoney.Main;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();
		int value[] = new int[size];
		System.out.println("Enter the values of array:");
		for (int i = 0; i < value.length; i++) {

			value[i] = sc.nextInt();

		}
		System.out.println("Enter the total no of targets that needs to be achieved	");
		int noofTargets = sc.nextInt();
		for (int i = 0; i < noofTargets; i++) {
			int sum = 0;
			int flag = 0;
			System.out.println("Enter the values of target");
			int target = sc.nextInt();

			for (int j = 0; j < value.length; j++) {
				sum += value[j];

				if (sum >= target) {
					flag = 1;
					System.out.println("Target achieved after " + (j + 1) + " transactions ");
					System.out.println();
					break;
				}
			}
			if (flag == 0) {
				System.out.println("Given target is not achieved ");
				System.out.println();
			}

		}
		sc.close();

	}

}
