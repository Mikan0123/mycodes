package main;

public class fizzbuzz_adv {
	public static void main(String[] args) {
		for (int i = 0; i <= 150; i++) {
			if (i % 3 == 0 || i % 10 == 3 ) {
				System.out.println(i + "!");
			}else {
				System.out.println(i);
			}
		}
	}
}
