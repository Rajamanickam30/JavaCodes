import java.util.*;
public class prime {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        if(n==0 && n==1) {
        	System.out.print("number is not a prime");
        }
        for(int i=1;i<=n;i++) {
        	if(n%i==0) {
        		flag++;
        	}
        }
        if(flag==2) {
        	System.out.print("number is a prime");
        }
        else {
        	System.out.print("number is not a prime");
        }
	}
}
