package workbook.section4;

public class Test4 {

	public static void main(String[] args) {

		int cal = Integer.parseInt(args[0]);
		int row = Integer.parseInt(args[1]);
		int sum = 0;
		double avg;
		if(args.length<2 && 2<args.length) {
			System.out.println("�ٽ� �Է� �ϼ���");
		}
		else {
			if(cal<1||5<cal||row<0||5<row) {
				System.out.println("���ڸ� Ȯ�� �ϼ���");
			} 
			else 
			{
				int[][] arr = new int[row][cal];
				
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						arr[i][j]=(int)(Math.random()*10);
					}
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = 0; j < arr[i].length; j++) {
						//��º�
						System.out.print(arr[i][j]);
						System.out.print(" ");
					
						//sum ����
						sum += arr[i][j];
					}
					System.out.println();
				}
				avg = sum/(arr.length*arr[0].length);
				
				System.out.println("sum="+sum+"\navg="+avg);
			}
			
		}
		
		

	}

}
