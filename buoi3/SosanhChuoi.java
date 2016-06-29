package buoi3;

import java.util.Scanner;

public class SosanhChuoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao chuoi 1:");
		String st1 = input.nextLine();
		System.out.println("Nhap vao chuoi 2:");
		String st2 = input.nextLine();
		int check = st1.indexOf(st2);
		if (t >= 0) {
			System.out.println(" chuoi 2 la substring cua chuoi 1");

		} else {
			System.out.println("chuoi 2 khong phai la substring cua chuoi 1");
		}

	}

}
