package ������ǻ�����α׷���;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		System.out.println("��� 5���� �Է��ϼ���.");
		Scanner input=new Scanner(System.in);
		int intArray[]=new int[5];
		int max=0;
		
		for(int i=0;i<intArray.length;i++){
			intArray[i]=input.nextInt();
			if(intArray[i]>max){
				max=intArray[i];
			}
		}
		System.out.println("�Էµ� ������ ���� ū ����"+max+"�Դϴ�.");
		
	}

}
