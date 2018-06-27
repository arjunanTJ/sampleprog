import java.util.Scanner;
class V{
	void checkv(char a){
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
      System.out.println("vowel");
    else
      System.out.println("consonant");
  }
}
class Vowel extends V{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Vowel x=new Vowel();
    char N=s.next().charAt(0);
    x.checkv(N);
	
  }
}
