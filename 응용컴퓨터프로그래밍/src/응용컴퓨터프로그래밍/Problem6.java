package ������ǻ�����α׷���;

import java.util.Scanner;

public class Problem6 {
	
	public static void main(String[] args) {
		Scanner rd= new Scanner(System.in);
		int divisor=0;
		int dividend=0;
		System.out.println("�������� �Է��ϼ���.");
		dividend=rd.nextInt();
		System.out.println("�������� �Է��ϼ���");
		divisor=rd.nextInt();
		try{
			System.out.println(dividend + "��"+ divisor+"�� ������ ����"+ dividend/divisor);
		}
		catch(ArithmeticException e){
			System.out.println("0�� �Է��ϼ̽��ϴ�.");
		}
		finally{   // ������ ���� �ȳ��� try�� ������ ����Ǵ� ����
			System.out.println("��");
		}
	}
}
