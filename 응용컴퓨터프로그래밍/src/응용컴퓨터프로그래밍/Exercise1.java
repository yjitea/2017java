package ������ǻ�����α׷���;

import java.util.Scanner;

public class Exercise1 {
	public static void sumPrint(int start,int end){
		for(int x=start;x<=end; x++){
			System.out.print(x);
			if(x==end){
				System.out.print("=");
				System.out.println((end*(end+1)/2)-(start*(start-1)/2));
			}
			else
				System.out.print("+");
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������ ����(���۰� ����)�� �Է��ϼ���.");
		sumPrint(input.nextInt(),input.nextInt());
	}
}
