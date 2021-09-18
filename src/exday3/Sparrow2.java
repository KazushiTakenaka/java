package exday3;

//スズメクラス
public class Sparrow2 extends Bird{
	//コンストラクタ（引数なし）
	public Sparrow2() {
		super("すずめ"); 		//Birdクラスの引数つきコンストラクトを呼び出す
	}
	//スズメがなく
	public void sing() {System.out.println("チュンチュン");}
}
