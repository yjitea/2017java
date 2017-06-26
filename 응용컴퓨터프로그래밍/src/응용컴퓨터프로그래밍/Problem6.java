package 응용컴퓨터프로그래밍;

import java.util.Scanner;

public class Problem6 {
	
	public static void main(String[] args) {
		Scanner rd= new Scanner(System.in);
		int divisor=0;
		int dividend=0;
		System.out.println("나뉨수를 입력하세요.");
		dividend=rd.nextInt();
		System.out.println("나눔수를 입력하세요");
		divisor=rd.nextInt();
		try{
			System.out.println(dividend + "를"+ divisor+"로 나누면 몫은"+ dividend/divisor);
		}
		catch(ArithmeticException e){
			System.out.println("0을 입력하셨습니다.");
		}
		finally{   // 오류가 나든 안나든 try후 무조건 실행되는 문장
			System.out.println("끝");
		}
	}
}
