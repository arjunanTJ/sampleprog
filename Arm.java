import java.util.Scanner;
import java.lang.Math;
class Arm{
	public static void main(String args[]){
		Scanner s =  new Scanner(System.in);
		int a=s.nextInt();
		int count=0,num=1,b=1,temp=0;
		temp=a;
		while(temp!=0){
			b=temp%10;
			num=b*b*b;
			count=count+num;
			temp=temp/10;
		}
		if(a==count)
			System.out.println("armstrong");
		else
			System.out.println("not");
	}
}
