import java.util.Scanner;
class Leap{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int year=s.nextInt();
    if(year%4==0)
      System.out.println("yes");
    else
      System.out.println("no");
  }
}
