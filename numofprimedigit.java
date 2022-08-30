import java.util.*;
public class numofprimedigit {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit=0;
        int cnt=0;
        while(n>0) {
        	digit=n%10;
        	int count=0;
        	for(int i=1;i<=digit;i++) {
        		if(digit%i==0) {
        		count++;
        		}
        	}
        	if(count==2) {
        		cnt++;
        	}
        	n=n/10;
        }
        System.out.print(cnt);
	}
}
