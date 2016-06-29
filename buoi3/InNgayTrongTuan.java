package buoi3;

import java.util.Scanner;

public class InNgayTrongTuan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int m, q, year;
		int h = 0;

		System.out.println("Nhap vao nam cua thang:");
		year = input.nextInt();
		int j = year / 100;
		int k = year % 100;
		System.out.println("Nhap vao thang (Tu 1 den 12):");
		m = input.nextInt();
		System.out.println("Nhap vao ngay cua thang (tu 1 den 31):");
		q = input.nextInt();

		if (m >= 3 && m <= 12) {
			h = ((q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j)) % 7;
		} else if (m == 1) {
			h = (((q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j)) % 7) + 1;
		} else if (m == 2) {
			h = (((q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j)) % 7) + 2;
		}

		if (h == 0) {
			System.out.println("ngay cua tuan la thu 7");
		} else if (h == 1) {
			System.out.println("ngay cua tuan la thu CN");
		} else {
			System.out.println("ngay cua tuan la thu " + h);
		}

	}

}
