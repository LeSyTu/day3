package buoi3;

import java.util.Scanner;

public class InSoNgayCuaThangTrongNam {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Nhap vao nam:");
		int year = input.nextInt();
		System.out.println("Nhap vao thang:");
		int mounth = input.nextInt();

		switch (mounth) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: {
			System.out.println("thang " + mounth + " nam " + year + " co 31 ngay");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11: {
			System.out.println("thang " + mounth + " nam " + year + " co 30 ngay");
			break;
		}
		case 2: {
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("thang " + mounth + " nam " + year + " co 29 ngay");
			} else {
				System.out.println("thang " + mounth + " nam " + year + " co 28 ngay");
			}
			break;
		}
		default:
			System.out.println("Nhap thang khong hop le, Xin vui long nhap lai!");
			break;

		}

	}
}