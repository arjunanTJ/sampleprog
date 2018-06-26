import java.util.Scanner;
class Oddeven{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    if(N>=1&&N<=100000){
      if(N%2==0)
        System.out.println("even");
      else
        System.out.println("odd");
    }
    else 
      System.out.println("invalid");
  }
}
