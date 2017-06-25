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
	public static double Length(double a, double b,double c,double d){ // �� ������ �Ÿ��� ���ϴ� �Լ� 
	   double Length=Math.sqrt((a-c)*(a-c)+(b-d)*(b-d));
	   return Length;
	}
	public static double triangle(double a,double b,double c,double d,double e,double f){ // �ﰢ�� ���̸� �����ִ� �Լ�
		double Area=0.5*((a*d+c*f+e*b)-(c*b+e*b+a*f));
		if (Area<0)
			return -Area;// ������ ��� ����� ��ȯ
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
			System.out.println("Input: "+a+" "+b+" "+c+" "+d+" "+e+" "+f+"-> Output: "+'"'+"�ﰢ���� ������"+triangle(a,b,c,d,e,f)+"�Դϴ�"+'"');
		else 
			System.out.println("Input: "+a+" "+b+" "+c+" "+d+" "+e+" "+f+"-> Output: "+'"'+"�ﰢ���� ���� �� ����."+'"');
	}
}
 // �ﰢ���� �� �� �ִ����� �Ǻ� �Ϸ��� �ϴ� �� ���� ���̸� ���ؾ� �մϴ�. 
 //�׷��� 'Length' �Լ��� �̿��Ͽ� ���̸� ���Ѵ���, 'isEnableTriangle' �Լ��� �̿��Ͽ� ���� Ȯ�� �� �ﰢ���� ���̸� ���Ͽ����ϴ�.


