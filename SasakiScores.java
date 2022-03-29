import java.util.*;
public class SasakiScores{
	public static void main(String[] args){
		System.out.print("人数を入力>>");
		int num = new Scanner(System.in).nextInt();
		int[] scores  = new int[num];
		int sum=0;
		for(int i=0;i<scores.length;i++){
			System.out.print(i+1 + "人目の点数を入力>>");
			scores[i] = new Scanner(System.in).nextInt();
			sum += scores[i];
		}

		System.out.println("--結果--");
		System.out.print("[");
		for(int i=0;i<scores.length;i++){
			System.out.print(scores[i]);
			if(i != scores.length -1){
				System.out.print(",");
			}
		}
		System.out.println("]");

		System.out.printf("平均:%.1f%n",(double)sum/scores.length);
		int max = scores[0];
		int min = scores[0];
		for(int i=1;i<scores.length;i++){
			if(scores[i]>max){
				max = scores[i];
			}
			if(scores[i]<min){
				min = scores[i];
			}
		}
		System.out.println("最高点:"+max);
		System.out.println("最低点:"+min);
	}
}
