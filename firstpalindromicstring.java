import java.util.*;
public class firstpalindromicstring {
	static String res(String[] words) {
		StringBuffer s=null;
        for(int i=0;i<words.length;i++){
            s=new StringBuffer(words[i]);
            if(s.reverse().toString().equals(words[i])){
                return words[i];
            }
        }
        return "";
    }
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String words[]=new String[n];
	for(int i=0;i<n;i++) {
		words[i]=sc.next();
	}
	System.out.print(res(words));
	}
}
