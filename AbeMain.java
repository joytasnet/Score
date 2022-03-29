import java.util.*;
public class AbeMain{
	public static void main(String[] args){
		System.out.print("人数を入力>>");
		int n = new Scanner(System.in).nextInt();
		int[] scores = new int[n];
		int sum = 0;
		int max = scores[0];
		int min = 100;
		for(int i=0;i<scores.length;i++){
			System.out.print(i +1 + "人目の点数を入力>>");
			scores[i]=new Scanner(System.in).nextInt();
			sum += scores[i];
			if(scores[i] > max){
				max = scores[i];
			}
			if(scores[i] < min){
				min = scores[i];
			}
		}
		System.out.println("--結果--");
		System.out.println(Arrays.toString(scores));
		System.out.printf("平均:%.1f%n" , (double)sum/scores.length);
		System.out.println("最高:"+max);
		System.out.println("最低:"+min);
	}
}
