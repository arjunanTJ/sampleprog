import java.util.Scanner;
class Alpha{
  public static void main(String args[]){
    //char a[]={'a','b','c','d','e','f','g','h','j','i','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    Scanner s=new Scanner(System.in);
    char a=s.next().charAt(0);
    if((a>='a' && a<='z') || (a>='A' && a<='Z'))
		System.out.println("Alphabet");
	else
		System.out.println("No");
  }
}
