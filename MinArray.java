import java.util.Scanner;
class MinArray{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int a[]=new int[size];
		int min=0;
		//int j=1;
		for(int i=0;i<size;i++){
			a[i]=s.nextInt();
		}
		min=a[0];
		for(int i=1;i<size;i++){
			if(a[i]<min)
				min=a[i];
			else
				continue;
		}
		System.out.println(min);
		
	}
}
