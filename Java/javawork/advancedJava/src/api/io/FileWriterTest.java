package api.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		//File����� �Ű������� ���޵� ������ ������ �ش� ������ ���� �۾������� ���� ��� ���� ������ �����Ͽ� �۾��Ѵ�.
		
		
		//1. ���� open
		//������ �����
		//FileWriter fw = new FileWriter("src/data/output.txt");
		//write �޼ҵ尡 ȣ��ɶ����� ���Ͽ� ������ �߰� - appen mode = true
		FileWriter fw = new FileWriter("src/data/output2.txt",true);
		
		//2. ���� ������
		fw.write(97);	//97�� ���� ASCII�ڵ� ���ڰ� ���
		fw.write("���ڿ�1 ����");
		fw.write("\ntest");
		
		//3. ���� close
		fw.close();
	}

}
