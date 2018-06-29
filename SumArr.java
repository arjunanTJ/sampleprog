import java.util.Scanner;
class SumArr{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
	int a=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=i;
	}
	System.out.println((a*(a+1))/2);
  }
}
