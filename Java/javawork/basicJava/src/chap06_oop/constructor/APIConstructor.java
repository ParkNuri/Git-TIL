package chap06_oop.constructor;

import java.io.File;
import java.io.FileInputStream;

// API의 클래스에 정의된 생성자 메소드 확인하기
public class APIConstructor {

	public static void main(String[] args) throws Exception {
		byte[] data1 = {65, 66, 67, 68, 69};
		char[] data2 = {'a','b','c','d','e'};
		String str = new String();//String str = "";
		String str1 = new String("java");
		String str2 = new String(data1);
		String str3 = new String(data1,2,2);
		String str4 = new String(data2);
		File file = new File("test.txt");
		FileInputStream fs = new FileInputStream(file);
		System.out.println(str1+":"+str1.length());
		System.out.println(str2+":"+str2.length());
		System.out.println(str3+":"+str3.length());
		System.out.println(str4+":"+str4.length());
		System.out.println((char)fs.read());
	}
	
	

}
