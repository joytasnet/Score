import java.util.*;
public class NaganoMain{
	public static void main(String[] args){
		System.out.print("人数を入力>>");
		int n = new Scanner(System.in).nextInt();
		int[] scores=new int[n];
		for(int i = 0;i<scores.length;i++){
			System.out.printf("%d人目の点数を入力>>",i+1);
			int s = new Scanner(System.in).nextInt();
			scores[i]=s;
		}
		System.out.println("--結果--");
		System.out.println(Arrays.toString(scores));
		int sum=0;
		for(int i=0;i<scores.length;i++){
			sum += scores[i];
		}
		System.out.printf("平均:%.1f%n" ,(double)sum/scores.length);
		System.out.println("合計:" + sum);
		int max=scores[0];
		int min=scores[0];
		for(int i=1;i<scores.length;i++){
			if(scores[i] >max){
				max = scores[i];
			}
			if(scores[i] <min){
				min = scores[i];
			}

		}
		System.out.println("最高:" + max);
		System.out.println("最低:" + min);
	}
}