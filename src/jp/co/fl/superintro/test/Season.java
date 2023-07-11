package jp.co.fl.superintro.test;
import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		System.out.println("1 から 12 のうち、好きな月を 1 つ入力しなさい-->");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();

		if (month == 3) {
			System.out.println("春です。");
		} else if (month == 6) {
			System.out.println("夏です。");
		} else if (month == 9) {
			System.out.println("秋です。");
		} else if (month == 12) {
			System.out.println("冬です。");
		} else {
			System.out.println("季節未設定です。");
		}
	}

}
