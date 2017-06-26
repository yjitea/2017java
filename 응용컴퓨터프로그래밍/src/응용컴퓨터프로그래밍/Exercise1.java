package 응용컴퓨터프로그래밍;

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
		System.out.println("덧셈할 범위(시작과 끝을)을 입력하세요.");
		sumPrint(input.nextInt(),input.nextInt());
	}
}
