import java.util.*;
public class productofdigit {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int digit,pro=1;
        while(n>0) {
        digit=n%10;
        pro*=digit;
        n/=10;
        }
        System.out.print(pro);
	}
}
