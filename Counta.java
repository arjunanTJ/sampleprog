import java.util.Scanner;
class Counta{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int count=0;
		while(a!=0){
			a=a/10;
			++count;
		}
		System.out.println(count);
	}
}
