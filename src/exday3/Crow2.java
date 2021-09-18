package exday3;

//カラスクラス
public class Crow2 extends Bird{
	//コンストラクタ（引数なし）
	public Crow2() {
		super("カラス");		//Birdクラス引数つきコンストラクタを呼び出す
	}
	//カラスがなく
	public void sing() {System.out.println("カーカー");}
}
