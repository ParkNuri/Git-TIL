package api.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String [] args) {
		FileInputStream fis = null;
		try {
			//1. ���� �����ϱ�
			fis = new FileInputStream("test.txt");
			//2. ���Ͽ�����
			while(true) {
				int data = fis.read();
				if(data==-1) {
					break;
				}
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. ���ϴݱ�
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
