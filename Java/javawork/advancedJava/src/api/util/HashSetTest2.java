package api.util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetTest2 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("javascript");
		set.add("oracle");
		set.add("html");
		set.add("css");
		set.add("jquery");
		set.add("java");
		set.add("json");
		//8�� ������
	
		System.out.println("������->"+set.size()); 	//������->7

		print(set, "set");
		
		//�������� �����ϴ� �����-> Set��ü�� �����Ҷ� ���������� ǥ���� Set�� �������� �Ű������� ����
		HashSet<String> set2 = new HashSet<String>(set);
		
		set2.add("servlet");
		set2.add("jsp");
		set2.add("hadoop");
		System.out.println("������->"+set2.size()); 	//������->7
		
		print(set2, "set2");
	
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("hive");
		set3.add("java");		
		set3.add("oracle");
		set3.add("jdbc");
		
		System.out.println("������->"+set3.size()); 	//������->7
		
		print(set3, "set3");
		
		//set�� set3�� ������ ���ϱ�
		set.retainAll(set3);	//set�� set3�� ����� ��� �� �ߺ��Ǵ� ��Ҹ�
								//������ ���ο� set������ ���������.
								//set�� set3�� ���ؼ� ��ġ�ϴ� �͸� �����
								//�������� ���ŵȴ�.
		print(set, "������set");
		
	}//set�� ����� �����͸� ������ ����ϱ�
//	public static void print(HashSet<String> set) {
	public static void print(Set<String> set, String setName) {	//�������� �����ϱ� ���� hashset�� �ƴ� set ���
		for (String data : set) {
			System.out.println(setName+"�� ����� ���->"+data);
		}
		
		System.out.println("=================================");
	}
	
}
