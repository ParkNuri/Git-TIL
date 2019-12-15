package chap05_array;
/*
 * 2���� �迭 ����
 * 1  2  3  4  5
 * 6  7  8  9  10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * 
 * 
 * *  2  3  4  5
 * 6  *  8  9  10
 * 11 12 *  14 15
 * 16 17 18 *  20
 * 21 22 23 24 *
 */
public class Array2DExam01 {

	public static void main(String[] args) {
		//1. 2���� �迭 ����
		//2. 2���� �迭�� ���� ����
		//3. 2���� �迭�� ����� �����͸� ������¿� ���� ����ϱ�
	
		int[][] myarr = new int[5][5];
		int cnt=1;
		for(int i = 0;i<myarr.length; i++) {
			for(int j =0; j<myarr[i].length;j++) {
				myarr[i][j]=cnt;
				cnt++;
			}
		}	
		for(int i = 0;i<myarr.length; i++) {
			for(int j =0; j<myarr[i].length;j++) {
				if(i==j) {System.out.print("*\t");}
				else{System.out.print(myarr[i][j]+"\t");}
			}
			System.out.println();
		}
		
	}
	

}
