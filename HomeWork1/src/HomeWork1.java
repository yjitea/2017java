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
		FindMax(line); // �������� Ȱ���Ͽ� line �迭 ���� (��������)
		if(isEnableTriangle(line[2],line[1],line[0])==true)// ū ������ �ԷµǾ� �ﰢ�� �Ǻ�
			System.out.println("Input: "+a+" "+b+" "+c+"-> Output: "+'"'+"�ﰢ���� ���� �� ����."+'"');
		else
			System.out.println("Input: "+a+" "+b+" "+c+"-> Output: "+'"'+"�ﰢ���� ���� �� ����."+'"');
	}

}
//�� �ڵ�� �Է��� ���� ������� �ﰢ���� �Ǻ� ���ݴϴ�.
// �ﰢ���� ���� : �κ��� ���� ������ �Ѻ�(���� ū��) ���� ������ Ŀ���Ѵ�.
