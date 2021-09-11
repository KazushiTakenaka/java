package day3;

public class Sample304 {

	public static void main(String[] args) {
		int dice = (int)(Math.random()*7) + 1;		//1~7までの乱数を発生させる
		//Math.random0~1未満の乱数を発生、*７で0~7の乱数+1で1~7になる（よくわからん）
		//dice = 7;
		System.out.println("サイコロの目:" + dice);
		if(1 <= dice && dice <= 6) {		//値がサイコロも目の範囲内かを調べる（＆演算）
			if(dice == 2 || dice == 4 || dice == 6){	//サイコロの目が奇数か偶数か調べ処理を分ける
				//or演算
				System.out.println("丁（チョウ）です。");
			}
			else {
				System.out.println("半（ハン）です。");
			}
		}
		else {
			System.out.println("範囲外の数値です。");
		}
	}

}
