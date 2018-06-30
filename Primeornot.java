import java.util.Scanner;
import java.lang.Math;
class Primeornot{
  public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		int b=a/2;
		int count=0;
		for(int i=2;i<=b;i++){
			if(a%i==0)
				count =count+1;
			else
				continue;
		}
		if(count>=1)
			System.out.println("no");
		else
			System.out.println("yes");
	}
}
