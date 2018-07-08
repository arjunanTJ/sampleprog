import java.util.Scanner;
class Mult{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=1;
		for(int i=1;i<=5;i++){
			b=a*i;
			System.out.print(b+" ");
		}
	}
}
