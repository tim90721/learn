package first;

import java.util.Scanner;

public class HelloWorld {
	String g = "�P��";

	public static void main(String[] args) {
		HelloWorld man = new HelloWorld();
		// man.speak();
		Scanner scanner = new Scanner(System.in);

		// while(true) {
		// int input = scanner.nextInt();
		// if(input > 0 && input < 5) {
		// System.out.println("i'm bigger than 0 and smaller than 5");
		// }
		// else if(input >5 && input<10 ) {
		// System.out .println("�����ʬO�³J~�̯䪺�³J~");
		// }
		// else {
		// System.out.println("otherwise. exit while");
		// break;
		// }
		// }
		while (true) {
			int input = scanner.nextInt();
			int output = 0;
			for (int a = 1; a <= input; a++) {
				output = output + a;
			}
			System.out.println(output);
		}
	}

	public void speak() {

		for (int a = 1; a < 4; a++) {
			System.out.println("hello" + a);
			for (int b = 1; b < a + 1; b++)
				System.out.println("I'm" + b);
		}
		int a = 1;
		while (a < 4) {
			System.out.println("hello" + a);
			int b = 1;
			while (b <= a) {
				System.out.println("I'm" + b);
				b++;
			}
			a++;
		}
	}
}
