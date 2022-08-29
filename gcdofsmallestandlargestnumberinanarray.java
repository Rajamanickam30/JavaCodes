import java.util.*;
public class gcdofarray {
	static int res(int a,int b) {
		int ans=0;
		for(int i=1;i<=b;i++) {
			if(a%i==0 && b%i==0) {
				ans=Math.max(ans, i);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int n1=a[0];
        int n2=a[n-1];
        System.out.print(res(n1,n2));
        
	}

}
