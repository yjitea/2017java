import java.util.Scanner;

public class HomeWork1 {
	public static int[] FindMax(int []point){
		for (int j = 1; j < point.length; j++) {
			int key = point[j];
			int i = j - 1;
			while (i >= 0 && point[i] > key) {
				point[i + 1] = point[i];
				i--;
			}
			point[i + 1] = key;
		  }
			return point;
	    }
		
	public static boolean isEnableTriangle(int a,int b,int c){
		if(a<b+c)
			return true;
		else
			return false;	
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int []line={a,b,c};
		FindMax(line); // 삽입정렬 활용하여 line 배열 정렬 (오름차순)
		if(isEnableTriangle(line[2],line[1],line[0])==true)// 큰 수부터 입력되어 삼각형 판별
			System.out.println("Input: "+a+" "+b+" "+c+"-> Output: "+'"'+"삼각형을 만들 수 있음."+'"');
		else
			System.out.println("Input: "+a+" "+b+" "+c+"-> Output: "+'"'+"삼각형을 만들 수 없음."+'"');
	}

}
//위 코드는 입력의 순서 상관없이 삼각형을 판별 해줍니다.
// 삼각형의 조건 : 두변의 합은 나머지 한변(가장 큰수) 보다 무조건 커야한다.
