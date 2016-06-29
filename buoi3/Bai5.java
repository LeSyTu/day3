package buoi3;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("So hang 1:");
		int number1 = input.nextInt();
		input.nextLine();
		System.out.println("So hang 2:");
		int number2 = input.nextInt();
		input.nextLine();
		System.out.println("Phep tinh:");
		String calculation = input.nextLine();
		input.close();
		double result = 0;

		switch (calculation) {
		case "+": {
			result = number1 + number2;
			break;
		}
		case "-": {
			result = number1 - number2;
			break;
		}
		case ":": {
			if (number1 != 0) {
				result = (double) number1 / number2;
			} else {
				System.out.println("Khong the thuc hien phep chia");
			}
			break;
		}
		case "x": {
			result = number1 * number2;
			break;
		}
		default: {
			System.out.println("Ban da nhap sai toan tu ");
			break;
		}

		}
		System.out.println("Ket qua: " + result);

	}

}
