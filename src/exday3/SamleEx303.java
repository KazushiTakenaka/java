package exday3;

public class SamleEx303 {

	public static void main(String[] args) {
		Bird b[] =  new Bird[2];		//Birdクラスの変数の配列を生成
		b[0] = new Crow2();				//b[0]にCrowクラスのインスタンスを生成
		b[1] = new Sparrow2();			//b[1]にSparrowクラスのインスタンスを生成
		for(int i = 0; i < b.length; i++) {
			System.out.print(b[i].getName() + ":");
			b[i].sing();
		}
	}

}
