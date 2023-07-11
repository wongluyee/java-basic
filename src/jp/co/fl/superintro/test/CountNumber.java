package jp.co.fl.superintro.test;

public class CountNumber {

	public static void main(String[] args) {
		System.out.println("1 から 10 まで数えます");

		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println(i + "!");
			} else {
				System.out.println(i);
			}
		}

		System.out.println("数え終わりました！");

	}

}
