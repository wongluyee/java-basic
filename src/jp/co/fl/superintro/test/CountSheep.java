package jp.co.fl.superintro.test;

import java.util.Scanner;

public class CountSheep {

	public static void main(String[] args) {
		System.out.println("繰り返す回数を入力してください＞");
		Scanner sc = new Scanner(System.in);
		int countSheep = sc.nextInt();

		for (int i = 0; i < countSheep; i++) {
			System.out.println("羊が「" + (i + 1) + "」匹");
		}
		System.out.println("おやすみなさい");
	}

}
