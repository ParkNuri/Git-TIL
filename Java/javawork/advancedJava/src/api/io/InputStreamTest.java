package api.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

//InputStream�� �̿��ؼ� Ű����� �Է¹޴� ���ڿ� �б�
// - ScannerŬ������ next�޼ҵ��� ����� ����
public class InputStreamTest {
	public static void main(String[] args) {
		InputStream in = System.in; //System.in : ���
		PrintStream out = System.out;
		
		while (true) {
			//1. ��Ʈ���� �����͸� 1byte �б�
			try {
				int data = in.read();
//				if(data == -1) {	//��� �Է�
				if(data == 13) {	//�ѹ��� �Է� (���� ������ ����)
					break;
				}
				out.println((char)data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
// input :  14
// output : 49 52 13 10	
// 49 52 -> 1�� 4
// 13 => enter 
// 10 -> init cursor to first place
