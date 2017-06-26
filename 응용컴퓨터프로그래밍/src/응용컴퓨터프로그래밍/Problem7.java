package 응용컴퓨터프로그래밍;

public class Problem7 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		intArray[0] = 0;

		for (int i = 0; i <= 5; i++) {
			try{
				intArray[i] = i + intArray[i];
				System.out.println("intArray[" + i + "]=" + intArray[i]);
			}
			catch(ArrayIndexOutOfBoundsException e)//(Exception e)
			{
				System.out.println("인덱스 범위를 벗어납니다.");
			}
			
		}
	
	}

}
