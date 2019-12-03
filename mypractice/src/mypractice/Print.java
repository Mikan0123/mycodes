package mypractice;

public class Print {
	public static void main(String[] args) {
		int a = 10;
		double b = 15.5;
		String c = "abcdefg";
		String c1 = "bcdefg";
		int d = c.length();
		String e = c.substring(1,c.length());
		int f = e.compareTo(c1);

		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("c1 = " + c1);
		System.out.println("d = " + d);
		System.out.println("b = " + e);
		System.out.println("b = " + f);
	}
}
