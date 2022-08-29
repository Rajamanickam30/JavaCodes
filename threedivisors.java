import java.util.*;
public class threedivisors {
	static boolean res(int a) {
		int cnt=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			cnt++;
		}
	}
	if(cnt==3) {
		return true;
	}
	else {
		return false;
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        System.out.print(res(n));
	}
}
