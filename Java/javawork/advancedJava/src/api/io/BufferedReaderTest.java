package api.io;
import java.io.BufferedReader;
//�ѱ� �б�
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//BufferedReader�� �� ���徿 �б�
public class BufferedReaderTest {
	public static void main(String [] args) {
		//FileReader fr = null;
		BufferedReader br = null;
		try {
			//fr = new FileReader("test.txt");
			//br = new BufferedReader(fr);
			br = new BufferedReader(new FileReader("src/api/io/FileTest01.java"));
			int count = 0;
			long start = System.nanoTime();
			while(true) {
				String data = br.readLine();
				if(data==null) {
					break;
				}
				count++;
				System.out.println(data);
			}
			long end = System.nanoTime();
			System.out.println("����Ƚ��=>"+ count);		//39	//FileReader���� �ξ� ���� ����
			System.out.println("����ð�=>"+(end-start));	//1609700	//FileReader���� 10�� ����
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//3. ���ϴݱ�
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
