package com.jin.scan;

import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Ű����� �Է��� �ޱ� ���ؼ� Scanner Ŭ������ �ҷ����� ��.

		System.out.print("������ �̸��� ������� �Է��Ͻÿ� > ");
		// �Է¹��� ������ ���ؼ� ���� ���������� ������, ������ ���� ��ٸ��� �ȴ�.
		String myName = sc.next();
		// Ű����� �Է¹��� (�������)���� String �ڷ����� myName ������ �ִ´�.

		System.out.print("���̸� ���ڷ� �Է��Ͻÿ� > ");
		int myAge = sc.nextInt();
		// Ű����� �Է¹��� �������� int �ڷ����� myAge ������ �ִ´�.
		
		sc.nextLine();
		// �ڿ��� ���Ǵ� nextLine �޼ҵ尡 �ռ��� �Էµ� Enter���� �Է¹޾ƹ����� ������,
		// �̸� ������ ��ȭ��Ű�� ������ �Ѵ�.

		System.out.print("�ּҸ� ������ �Է��Ͻÿ� > ");
		String myAddr = sc.nextLine();
		// Ű����� �Է¹��� (������ ���Ե�)���� String �ڷ����� myAddr ������ �ִ´�.

		System.out.print("Ű�� �Ǽ��� �Է��Ͻÿ� > ");
		double myHeight = sc.nextDouble();
		// Ű����� �Է¹��� �Ǽ����� double �ڷ����� myHeight ������ �ִ´�.

		System.out.print("�����Ը� �Ǽ��� �Է��Ͻÿ� > ");
		double myWeight = sc.nextDouble();

		System.out.print("������ [F/M]���� �Է��Ͻÿ� > ");
		char myGender = sc.next().charAt(0);
		// Ű����� �Է¹��� (�������)���� 0��° ����(ù��° ����)�� char �ڷ����� myGender ������ �ִ´�.
		// ��ǻ�Ϳ����� 1�� ù ��°�� �ƴ϶�, 0�� ù ��°�̴�.

		System.out.println("�Էµ� ������ �Ż������� �Ʒ��� �����ϴ�.");
		System.out.println("�̸� : " + myName);
		System.out.println("���� : " + myGender);
		System.out.println("���� : " + myAge);
		System.out.println("�ּ� : " + myAddr);
		System.out.println(" Ű  : " + (int) myHeight);
		System.out.printf("������ : %.1f\n", myWeight);
	}


}