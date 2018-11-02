package mathematics;

public class test {
	public static void main(String[] args) {

		// 输出自然数序列n，从1到100，
		// 如果n为3的倍数，则输出Fizz，
		// 如果n为5的倍数，则输出Buzz，
		// 如果上两条都成立，则输出FizzBuzz。
		for (int i = 0; i < 100; i++) {
			if (i != 0) {
				if (i % 3 == 0) {
					System.out.println(i);
					System.out.println("Fizz");
				}
				if (i % 5 == 0) {
					System.out.println(i);
					System.out.println("Buzz");
				}
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i);
					System.out.println("FizzBuzz");
				}
			}

		}

		// 进阶题：
		// 输出自然数序列n，从1到100，
		// 如果n为3的倍数或含有3，则输出Fizz，
		// 如果n为5的倍数或含有5，则输出Buzz，
		// 如果上两条都成立，则输出FizzBuzz。
		for (int i = 0; i < 100; i++) {
			if (i != 0) {
				if (i % 3 == 0 || i == 3) {
					System.out.println(i);
					System.out.println("Fizz");
				}
				if (i % 5 == 0 || i == 5) {
					System.out.println(i);
					System.out.println("Buzz");
				}
				if ((i % 3 == 0 || i == 3) && (i % 5 == 0 || i == 5)) {
					System.out.println(i);
					System.out.println("FizzBuzz");
				}
			}

		}

	}

}
