import java.util.Scanner;
import java.lang.Math;
class Powerof{
public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=(int)Math.pow(a,b);
		System.out.println(c);
	}
}
