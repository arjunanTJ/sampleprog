import java.util.Scanner;
import java.lang.Math;
class Palin{
  public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0,rem=0,temp=0;
		temp=a; 
		while(temp>0){
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		if(a==sum)
			System.out.println("palindrome");
		else
			System.out.println("not");
	}
}
