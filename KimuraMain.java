import java.util.*;
public class KimuraMain{
	public static void main(String[] args){
		System.out.print("人数を入力>>");
		int num = new Scanner(System.in).nextInt();
		int[] scores = new int[num];
		int sum =0;
		int max =scores[0];
		int min =101;
		for(int i=0;i<scores.length;i++){
			System.out.print((i+1)+"人目の点数を入力>>");
			scores[i] = new Scanner(System.in).nextInt();
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
		double avg = (double)sum/num;
		System.out.printf("平均:%.1f%n",avg);
		System.out.printf("最高:%d%n",max);
		System.out.printf("最低:%d%n",min);
	}
}
