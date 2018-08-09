import java.util.Scanner;
class AP{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int tn=0,sn=0;
		int n=s.nextInt();
		int a=s.nextInt();
		int d=s.nextInt();
		tn=(a+(n-1)*d);
		sn=n*(a+tn);
		System.out.println(sn/2);
	}
}
