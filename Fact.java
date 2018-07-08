import java.util.Scanner;
class Fact{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=1;
		for(int i=1;i<=a;i++){
			temp=temp*i;
		}
		System.out.println(temp);
	}
}
