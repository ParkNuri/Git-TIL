package chap05_array;

public class Array2DTest01 {

	public static void main(String[] args) {
		//2�����迭�� ����� ����
		int[][] myarr = new int[2][3];
		//2�����迭�� �ʱ�ȭ
		myarr[0][0] = 100;
		myarr[1][1] = 200;
		//myarr[2][2] = 300; -> Exception�߻�
		
		System.out.println("myarr�� 2��° ��Ұ� �����ϴ� �迭�� 0�� ����� ��"+myarr[1][0]);		
		System.out.println("myarr�� 1��° ��Ұ� �����ϴ� �迭�� 0�� ����� ��"+myarr[0][0]);
		
		//������ �迭�� ����� ����
		System.out.println("�迭 ����� ����=>"+myarr.length);
		System.out.println("myarr�� 0�� ��Ұ� �����ϴ� �迭 ����� ����=>"+myarr[0].length);
		//��ü �迭�� ��Ҹ� �������ϱ� - length�� ���� �Ἥ �����ϱ�
		for(int row =0; row<2;row++) {
			for(int i =0;i<3;i++) {
				System.out.print(myarr[row][i]+"\t");
			}
			System.out.println();
		}
		//��ü �迭�� ��Ҹ� �������ϱ� - �迭�� length ������ ���� �Ἥ �����ϱ�
		for(int row =0; row<myarr.length;row++) {
			for(int i =0;i<myarr[row].length;i++) {
				System.out.print(myarr[row][i]+"\t");
			}
			System.out.println();
		}
	}

}
