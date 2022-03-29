import java.util.*;
public class Matsuoka{
	public static void main(String[] args){
		int sum=0,min,max;
		System.out.print("人数を入力>>");
		int student=new Scanner(System.in).nextInt();
		int[] scores=new int[student];
		min=101;
		max=-1;
		for(int i=0;i<scores.length;i++){
			System.out.printf("%d人目の点数を入力>>",i+1);
			scores[i]=new Scanner(System.in).nextInt();
			if(min>scores[i]){
				min=scores[i];
			}
			if(max<scores[i]){
				max=scores[i];
			}
			sum+=scores[i];
		}
		System.out.printf("--結果--\n%s\n平均:%.1f\n最高:%d\n最低:%d\n",Arrays.toString(scores),(double)sum/student,max,min);
	}
}
