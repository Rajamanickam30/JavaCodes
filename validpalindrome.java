import java.util.*;
public class validpalindrome {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String s=sc.nextLine();
	  boolean result;
	  String res="";
	  for(int i=0;i<=s.length()-1;i++) {
		  if(s.charAt(i)>= 'a' && s.charAt(i)<= 'z' || s.charAt(i)>= '0' && s.charAt(i)<= '9' || s.charAt(i)>= 'A' && s.charAt(i)<= 'Z') {
				  res+=s.charAt(i);
		  }
	  }
	  String fin=res.toLowerCase();
	  StringBuffer s1=new StringBuffer(fin);
	  s1.reverse();
	  result=s1.toString().equals(fin);
	  System.out.print(result);
	}
}
