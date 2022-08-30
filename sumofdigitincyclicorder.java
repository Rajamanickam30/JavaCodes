import java.util.*;
public class sumofdigitincyclicorder {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     String s=String.valueOf(n);
     int l=s.length();
     int a[]=new int[l];
     int sum=0;
     for(int i=l-1;i>=0;i--) {
         a[i]=s.charAt(i)-'0';
     }
     int k=0;
     for(int i=0;i<l;i++) {
    	 for(int j=k;j<l;j++) {
    		 sum+=a[j];
    	 }
    	 k++;
     }
     System.out.print(sum);
	}
}
