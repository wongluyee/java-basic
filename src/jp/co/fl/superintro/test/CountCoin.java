package jp.co.fl.superintro.test;

public class CountCoin {

	public static void main(String[] args) {
		System.out.println("ゲーム開始！");

		int count = 0;

		while (true) {
			int coin = (int) (Math.random() * 2);

			if (coin == 1) {
				count++;
				System.out.println("コイントスの結果「裏」が出ました。");
			} else {
				count++;
				System.out.println("コイントスの結果「表」が出ました。");
				break;
			}
		}

		System.out.println(count + "回目のコイントスで終わりました。");

	}

}
