package main;

public class Main {
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) {
			boolean fizz = false, buzz = false;
			if(i % 3 == 0) {
				fizz = true;
			}
			if(i % 5 == 0) {
				buzz = true;
			}
			if(fizz) {
				System.out.print("Fizz");
			}
			if(buzz) {
				System.out.print("Buzz");
			}
			if(!fizz && !buzz) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
