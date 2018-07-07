import java.util.Scanner;
class Oddnos{
	public static void main(String args[]){
		Scanner s= new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		if(n1<n2){
			for(int i= n1+1;i<n2;i++){
				if(i%2!=0){
					System.out.print(" "+i);
				}
				else
					continue;
			}
		}
		else 
			System.out.println("range insufficient");
	}
}
