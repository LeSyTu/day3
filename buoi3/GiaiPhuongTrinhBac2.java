package buoi3;

import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

	public static void main(String[] args) {
		double a, b, c, x1, x2;
		double delta;
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap a = ");
		a = input.nextFloat();
		System.out.println("Nhap b = ");
		b = input.nextFloat();
		System.out.println("Nhap c = ");
		c = input.nextFloat();

		if (a == 0) {
			if (b == 0) {
				if (c == 0) {
					System.out.println("Phuong trinh vo so nghiem");
				} else {
					System.out.println("phuong trinh vo nghiem");
				}
			} else {
				x1 = (-c) / b;
				System.out.println("phuong trinh co nghiem duy nhat X1 = X2 = " + x1);
			}
		} else {
			delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem");

			} else if (delta == 0) {
				x1 = (-b) / (2 * a);
				System.out.println("phuong trinh co nghiem duy nhat X1 = X2 = " + x1);
			} else {
				x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
				x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
				System.out.println("phuong trinh co 2 nghiem:");
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);
			}

		}

	}

}
