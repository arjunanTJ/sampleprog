import java.util.Scanner;
import java.lang.Math;
class Primebet{
	public static boolean isPrime(int x){
		for(int j=3;j<=Math.sqrt(x);j++){
			if(x%j==0)
				return false;
			
		}
		return true;
	}
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a+1;i<b;i++){
			if(isPrime(i)==false){
				//System.out.println(i+" ");
				continue;
			}
			else
				System.out.print(i+ " ");
		}
	}
}
