import java.util.*;

class func{

	public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();sc.nextLine();
		int n2=sc.nextInt();sc.nextLine();

		System.out.println(addition(n1,n2));
		System.out.println(substraction(n1,n2));


		System.out.println(multiply(n1, n2);
		System.out.println(divide(n1, n2);	
		
		// Scientific 1
		System.out.println(power(2, 3));
		System.out.println(remainder(5, 2));
	}	

	public static int  addition(int n1,int n2){
		int add=n1+n2;
		return add;
	}

	public static int  substraction(int n1,int n2){
		int sub=(n1-n2)*(-1);
		return sub;
	}

	private long multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	private double divide(int num1, int num2) {
		return num1 / num2;
	}
	
	private static int remainder(int large, int small) {
		return large % small;
	}
	
	private static double power(int num, int pow) {
		double ans = 1.0;
		for(int i=0; i<pow; i++) {
			ans *= num;
		}
		return ans;
	}

}
