package api.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileTest02 {

	public static void main(String[] args) {
		
		//c:/iot/iotest ������ �������� �� ������ ���

		File file1 = new File("c:/iot/iotest");
		
		File[] fileList = file1.listFiles();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy��mm��dd��");
		System.out.println("======print file list======");
		for (File data : fileList) {
			System.out.print(data.getName()+" -------------[");
			if(data.isFile()==true) {System.out.print("����:"+data.length());}
			else {
				System.out.print("����");
				sdf.format(data.lastModified());
			}
			System.out.println("]");
		}
		
		
		//[�������]
		//a -----------------[����]
		//b -----------------[����]
		//ArrayTest01.java ----------------[����:(������ ������ ���)]
		//.
		//.
		//.
		//������ ������ ��¥�� �� �� �� �������� ���
		
	}

}
