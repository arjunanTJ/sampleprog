import java.util.Scanner;
class SumofN{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int sum=(N*(N+1))/2;
    System.out.println(sum);
  }
}
