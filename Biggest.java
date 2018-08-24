import java.util.Scanner;
class Biggest{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the elements of array");
		int a[]=new int[n];
		for (int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
			else
				continue;
		}
		System.out.print(max);
	}
}
