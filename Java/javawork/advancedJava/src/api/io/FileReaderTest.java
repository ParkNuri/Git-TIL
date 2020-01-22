package api.io;
//�ѱ� �б�
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String [] args) {
		FileReader fr = null;
		try {
			//1. ���� �����ϱ�
			fr = new FileReader("src/api/io/FileTest01.java");
			//2. ���Ͽ�����
			int count = 0;
			long start = System.nanoTime();
			while(true) {
				int data = fr.read();
				if(data==-1) {
					break;
				}
				count++;
				System.out.println((char)data);
			}
			long end = System.nanoTime();
			System.out.println("����Ƚ��=>"+ count);	//1535	//buffer���� ���� ������
			System.out.println("����ð�=>"+(end-start));	//17518500
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. ���ϴݱ�
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
