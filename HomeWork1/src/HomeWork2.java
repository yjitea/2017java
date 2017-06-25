import java.util.Scanner;

public class HomeWork2 {
	public static double[] FindMax(double []point){
		for (int j = 1; j < point.length; j++) {
			double key = point[j];
			int i = j - 1;
			while (i >= 0 && point[i] > key) {
				point[i + 1] = point[i];
				i--;
			}
			point[i + 1] = key;
		  }
			return point;
	    }
		
	public static boolean isEnableTriangle(double a,double b,double c){
		if(a<b+c)
			return true;
		else
			return false;	
	}
	public static double Length(double a, double b,double c,double d){ // 점 사이의 거리를 구하는 함수 
	   double Length=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
	   return Length;
	}
	public static double triangle(double a,double b,double c,double d,double e,double f){ // 삼각형 넓이를 구해주는 함수
		double Area=0.5*((a*d+c*f+e*b)-(c*b+e*b+a*f));
		if (Area<0)
			return -Area;// 음수일 경우 양수로 전환
		return Area;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		int e=input.nextInt();
		int f=input.nextInt();
		double []line={Length(a,b,c,d),Length(c,d,e,f),Length(e,f,a,b)};
		FindMax(line);
		if(isEnableTriangle(line[2],line[1],line[0])==true)
			System.out.println("Input: "+a+" "+b+" "+c+" "+d+" "+e+" "+f+"-> Output: "+'"'+"삼각형의 면적은"+triangle(a,b,c,d,e,f)+"입니다"+'"');
		else 
			System.out.println("Input: "+a+" "+b+" "+c+" "+d+" "+e+" "+f+"-> Output: "+'"'+"삼각형을 만들 수 없음."+'"');
	}
}
 // 삼각형이 될 수 있는지를 판별 하려면 일단 각 변의 길이를 구해야 합니다. 
 //그래서 'Length' 함수를 이용하여 길이를 구한다음, 'isEnableTriangle' 함수를 이용하여 조건 확인 후 삼각형의 넓이를 구하였습니다.


