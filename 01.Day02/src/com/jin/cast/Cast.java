package com.jin.cast;

public class Cast {
	// �⺻�� �����鿡 ���ؼ� �����ϰ� �����ϰ�, ��������ȯ(Cast)�� ���ؼ� �������.

	public static void main(String[] args) {
		boolean bool = true;
		// boolean Ÿ���� �� ���� �� �� �ϳ����� ���� �� �ִ� Ÿ������, 1����Ʈ�� ũ�⸦ ������.

		char charText = 'a';
		// char Ÿ���� '�ϳ�'�� ���ڸ��� ���� �� �ִ� Ÿ������ 2����Ʈ�� ũ�⸦ ������.
		// ���߿� ��� "���ڿ�"�� ��� ������ ���� String�� ����غ������� ���� ���̸� ������.

		byte byteNum = 127;
		// byte Ÿ���� ������ ���� �߿��� ���� ���� Ÿ������, -128 ~ 127�� ���� ���� �� �ִ�.
		// boolean Ÿ�԰� ���������� 1����Ʈ�� ũ�⸦ ������.

		short shortNum = 10000;
		// short Ÿ���� -32,768 ~ 32,767�� ���� ���� �� ������, 2����Ʈ�� ũ�⸦ ������.

		int intNum = 941219;
		// int Ÿ���� ������ Ÿ�� �� �ַ� ���Ǵ� Ÿ������, �� +/-10���� ���� ���� �� ������
		// 4����Ʈ�� ũ�⸦ ������.

		long longNum = 1500000000000000L;
		// long Ÿ���� ������ Ÿ�� �� ���� ū Ÿ������, �� +/-2�� 63���� ���� ���� �� ������,
		// 8����Ʈ�� ũ�⸦ ������. õ�������� �Ÿ��� ���� �� �ִ� ũ���̴�.
		// Ư�� long Ÿ���� ������ ���ͷ�(���ԵǴ� ��)�� �� �ڿ� L�� �ݵ�� �ٿ���� �Ѵ�.
		// �ڿ� �ٿ��ִ� L�� ��ҹ��� ������ ���� ������ ��� 1���� ȥ���� ���̱� ���Ͽ� �빮�ڸ� ����Ѵ�.

		float floatNum = 2.718281828F;
		// float Ÿ���� �Ǽ��� Ÿ������, ���� ���� ���̴� double�� ����(���е�)�� ������ �� ������ �ʴ´�.
		// long Ÿ�԰� �����ϰ� ���ͷ��� �� �ڿ� F�� �ݵ�� �ٿ���� �Ѵ�.
		// �ڿ� �ٿ��ִ� F�� ��ҹ��� ������ ���� ������, ���� �� �� ��� �ϱ� ���Ͽ� ��� �빮�ڸ� ����Ѵ�.
		// 4����Ʈ�� ũ�⸦ ������.

		double doubleNum = 3.141592;
		// double Ÿ���� ���� �Ǽ��� Ÿ���� float���� ���������� �� �۰�, �ַ� ���ȴ�.
		// 8����Ʈ�� ũ�⸦ ������.
		// ��� double������ D��� ���̻簡 ������, double���� long������ float���� �ٸ��� ������ �����ϴ�.

		System.out.println("�Ҹ� Ÿ�� : " + bool);
		System.out.println("char Ÿ�� : " + charText);
		System.out.println("byte Ÿ�� : " + byteNum);
		System.out.println("short Ÿ�� : " + shortNum);
		System.out.println("int Ÿ�� : " + intNum);
		System.out.println("long Ÿ�� : " + longNum);
		System.out.println("float Ÿ�� : " + floatNum);
		System.out.println("double Ÿ�� : " + doubleNum);

		// ���⼭ ��� �����غ���.

		// �ռ��� ���� �ٸ� ���� ��� �� �ſ��� ���빰�� �ٲٴ� ������ �����غ��Ҵ�.
		// �׷� �̹����� ���� �ٸ� �ڷ����� �� ������ ���� �ٲٴ� ������ �����غ���.

		// �Ʊ�� ���Ű� ��� ������ ���� 2���� �ִٰ� �غ���.
		// �Ʊ�� ���� �ϳ����� ������ ����ְ�,
		// ��� ���� �ϳ����� ������ �ֽ��� ����ִ�.

		// �Ʊ�� ���ſ� ���� ������ ����ִ� ��� ���ſ� ������ ���� �ƹ� ������ ���� ���� �� ����.
		// �׷��� ��� ���ſ� ���� ������ �ֽ���, �Ʊ�� ���ſ� �����ٸ� � ���� ��������?
		// ��Ź�� ���� �������ֽ��� ���� �帣�� �� ���̴�.

		// ���⼭ �Ʊ�� ������ ũ�Ⱑ ���� ������ �ǹ��ϰ�,
		// ��� ������ ũ�Ⱑ ū ������ �ǹ��Ѵ�.

		// ���� ����.

		// double�� ������ ����ִ� 3.141592�� int�� ������ �ִ´ٸ� ���� ���� ��������?

		// ������ �Ʒ� �ڵ带 �����غ���
		System.out.println((int) doubleNum);
		// ������� 3�� ���´�. 0.141519��� ���� ��Ź�� ����ϰ� �ִ�. �̴� �ֿ���� ���� �� ����.
		// ��ǻ�͵� ���������� �ѹ� ����� ���� �ǻ츱 �� ����.

		// ���� ������ ������ �̷� ������ �߻��Ѵ�.
		// ������� longŸ�Կ� ����ִ� ���� ū ���� int������ �ٲ۴ٸ�
		System.out.println((int) longNum);
		// int���� ������ �Ѿ�� ������ ������ ���� ������ �ȴ�.

		// ���⼭ ��� ������ ���̶� �������� �˾ƺ���,
		byte num1 = 127;
		//127��, byte�� ������ ���� �� �ִ� �ִ밪�̴�.
		
		// �׷��� �� ���� 1�� �߰��ϸ� � ���� �ɱ�?
		byte num2 = (byte)(num1 + 1);
		System.out.println(num2);
		// 128�� �ƴ϶� -128�� �� ����� �� �� �ִ�.
		// �̷��� ����� �ǵ����� ���� �̻��� ���� ������ �� ���� ������ ���� ���ٰ� �Ѵ�.
		// �� �̷� ������ �Ͼ������ �� �ڷ������� ���ڸ� �����ϴ� ��Ŀ� ���ؼ� �˸� ���� ������ �� �ִ�.
		
		// ������ ������ Ȯ���ϴ� �����̴�.
		long longVal = 100L;
		int intVal = (int)longVal;
		
		System.out.println(intVal);
		//long���̶� �ϴ���, int������ ��ȭ�� �� �ִ� ��(100)�̱� ������ ������µ�.
		
		double dValue = 123.5;
		int iValue = (int)dValue;
		
		System.out.println(iValue);
		//double���̾��� 123.5�� ���������� ĳ���� �߱� ������ �Ҽ��� �Ʒ� ���� Ż����.
		
	}



}