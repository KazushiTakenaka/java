package exday3;

public class SampleEx302 {

	public static void main(String[] args) {
		Crow2 c = new Crow2();			//カラスクラス
		Sparrow2 s = new Sparrow2();	//スズメクラス
		//カラスがなく
		System.out.print(c.getName() + ":");
		c.sing();
		//スズメがなく
		System.out.print(s.getName() + ":");
		s.sing();
	}

}
