import java.util.*;
public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        int flag=0;
        char c[]=a.toCharArray();
        char d[]=b.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i=0;i<a.length();i++) {
        	if(c[i]!=d[i]) {
        	flag=1;
        	}
        }
        if(flag==1) {
        	System.out.print("Not a Anagram");
        }
        else {
        	System.out.print("Anagram");
        }
	}

}
