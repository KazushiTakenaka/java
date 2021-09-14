package day7;

public class SampleClass02 {
	
	//コンストラクタ
	public SampleClass02() {
	System.out.println("コンストラクタ");
	}
	//privateメソッド
	private void method1() {
		System.out.println("method1(private)");
	}
	//publicメッソド1
	public void method2() {
		System.out.println("method2(public)");
	}
	//publicメッソド2
	public void method3() {
		//privateメソッドの呼び出し
		method1();
		System.out.println("method3(public) : num=" + this.num);
	}
	private int num = 1;
}
