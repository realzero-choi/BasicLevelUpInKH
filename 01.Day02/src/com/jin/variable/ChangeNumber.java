package com.jin.variable;

public class ChangeNumber {
	// ���Ǽ��迡�� ���� ���� ���ǰ� ������ ���� ������ ������ȯ�ϴ� ���� �����ϴ�.
	// �� ������ �� ������ �ǳ��鼭 �ٸ� �� ������ ������ �ǳ��� ������ ������ �׸��̴�.
	// ������ ������ ��(Water)��(Water)��ȯ�� ���?
	// ���� �ſ� ��� ���� ���� Ǭ ���� �Ķ��ſ� ��� �Ķ� ���� Ǭ ���� ���� ��,
	// ���� �� ������ �ٲ㼭 ��������?
	// �ű����� �ƴϾ �ּ��� �ӽ÷� �� ������ ���� ���� '�׸������� �ʿ�'�ϴٰ� �����ȴ�.
	// ��� �󿡼��� �� ��ȯ�ϱⰡ �׷���. �Ʒ� �ڵ�� ����.

	public static void main(String[] args) {
		int myAge = 26;
		int myYear = 1994;
		// �� ������ ���� �ٲ㼭 �����Ϸ���?

		// �ӽ� �׸��� �ʿ��ϴ�!
		int temp = 0;
		// �ӽ� �׸� ���� temp�� �����ϰ� 0���� �ʱ�ȭ.
		
		System.out.println("Before");
		System.out.println("myAge : " + myAge);
		System.out.println("myYear : " + myYear);
		// ���� �ٲ� �����ϱ� ��.

		temp = myAge;
		// �ӽ� �׸��� �� ���̸� ���,

		myAge = myYear;
		// �� ���̿� �� ������ ���,

		myYear = temp;
		// ��� �־�״� �� ���̸� �� ������ ������ ��!
		
		System.out.println("\nAfter");
		System.out.println("myAge : " + myAge);
		System.out.println("myYear : " + myYear);
		// ���� �ٲ� ������ ��.

	}
}