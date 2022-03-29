import java.util.*;
public class AkitaMain{
	public static void main(String[] args){
		System.out.print("人数を入力>>");
		int n = new Scanner(System.in).nextInt();
		int[] scores = new int[n];
		int sum =0;
		for(int i=0;i<n;i++){
			System.out.print(i+1+"人目の点数を入力>>");
			int score = new Scanner(System.in).nextInt();
			scores[i] = score;
			sum +=score;
		}
		System.out.println("--結果--");
		System.out.println(Arrays.toString(scores));
		System.out.printf("平均:%.1f%n",(double)sum/n);
		int max =scores[0];
		int min =scores[0];
		for(int i=1;i<n;i++){
			if(scores[i]>max){
				max = scores[i];
			}
			if(scores[i]<max){
				min = scores[i];
			}
		}
		System.out.println("最高:"+max);
		System.out.println("最低:"+min);
	}
}
