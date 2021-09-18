package exday3;

public class SampleEx301 {

	public static void main(String[] args) {
		Crow1 c = new Crow1();			//カラスクラス
		Sparrow1 s = new Sparrow1();	//スズメクラス
		//カラスがなく
		System.out.print(c.getName() + ":");
		c.sing();
		//スズメがなく
		System.out.print(s.getName() + ":");
		s.sing();
	}

}
