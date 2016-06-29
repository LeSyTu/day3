package buoi3;

import java.util.Scanner;

public class SosanhChuoi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao chuoi 1:");
		String st1 = input.nextLine();
		System.out.println("Nhap vao chuoi 2:");
		String st2 = input.nextLine();
		int t = st2.indexOf(st1);
		if (t ==-1) {
			System.out.println(st2 + " khong la cuoi con cua " + st1);

		} else {
			System.out.println(st2 + " la chuoi con cua " + st1);
		}

	}

}
