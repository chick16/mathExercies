package mathematics;

public class test {
	public static void main(String[] args) {

		// �����Ȼ������n����1��100��
		// ���nΪ3�ı����������Fizz��
		// ���nΪ5�ı����������Buzz��
		// ����������������������FizzBuzz��
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

		// �����⣺
		// �����Ȼ������n����1��100��
		// ���nΪ3�ı�������3�������Fizz��
		// ���nΪ5�ı�������5�������Buzz��
		// ����������������������FizzBuzz��
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
