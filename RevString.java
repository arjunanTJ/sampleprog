import java.util.Scanner;
class RevString{
	public static void main (String args[]){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String str1="";
		for(int i=str.length()-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
	}
}
