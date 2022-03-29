import java.util.*;
public class SugawaraMain{
	public static void main(String[] args){
		System.out.print("人数を入力>>");
		int n = new Scanner(System.in).nextInt();
		int[] scores = new int [n];

		int max=scores[0];
		int min=101;
		int sum =0;

		for(int i=0 ; i<scores.length ; i++){
			System.out.print((i+1)+"人目の点数を入力>>");
			scores[i] = new Scanner(System.in).nextInt();
			sum += scores[i];
			if(scores[i]>max){
				max = scores[i];
			}
			if(scores[i]<min){
				min = scores[i];
			}
		}
		System.out.println(" -- 結果 -- ");
		System.out.println( Arrays.toString(scores) );
		System.out.printf("平均：%.1f%n最高：%d%n最低：%d%n",(double)sum/scores.length,max,min);
		//(double)キャスト:以降の計算式をdouble型で表示してね
	}
}
