package day5;

public class Sample501 {

	public static void main(String[] args) {
		double [] d = new double[3];
		double sum,avg; //合計値、平均値を入れる変数
		//値を代入
		d[0] = 1.2;
		d[1] = 3.7;
		d[2] = 4.1;
		sum = 0.0;
		for(int i = 0; i <d.length; i++) {
			System.out.print(d[i] + " ");
				if(i == 2) {
				System.out.print("= ");	
				}
			sum += d[i];
		}
		System.out.println(sum);
		avg = sum / d.length;
		System.out.println("合計値:" + sum);
		System.out.println("平均値:" + avg); 
	}

}
