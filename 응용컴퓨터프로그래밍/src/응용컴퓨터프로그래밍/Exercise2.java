package 응용컴퓨터프로그래밍;

import java.util.Scanner;

public class Exercise2 {
	public static void nineByNine(int x){
		for (int j = 1; j < 10; j++) {
			System.out.print(x + "*" + j + "=" + x * j);
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("단수를 입력하세요.");
		int num=0;
		while((num=input.nextInt())!=-1){
			nineByNine(num);
		}
	}
}
