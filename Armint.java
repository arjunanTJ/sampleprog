import java.util.Scanner;
import java.lang.Math;
class Armint{
	public static boolean Armcheck(int x){
		
		int count=0,num=1,b=1,temp=0;
		temp=x;
		while(temp!=0){
			b=temp%10;
			num=b*b*b;
			count=count+num;
			temp=temp/10;
		}
		if(x==count)
			return true;
		else
			return false;
	}
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		for (int i=n1;i<=n2;i++){
			if(Armcheck(i)==true){
				System.out.print(i+" ");
			}
		}
	}
}
