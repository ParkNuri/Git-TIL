package api.util;

import java.util.HashSet;

public class HashSetExam {

	public static void main(String[] args) {
		//������ ���� ���������� HashSet ��ü 2�� �����ϱ�
		// set1 -> 1~10������ ����
		// set2 -> 5~15������ ����
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		
		for (int i = 1; i <= 10; i++) {
			set1.add(i);
			set2.add(i+4);
		}				
		set2.add(15);
		// set1�� set2 ������ ����ϱ�
		HashSet<Integer> setR = new HashSet<Integer>(set1);
		setR.addAll(set2);
		System.out.println("----������ ���----");
		for (Integer data : setR) {
			System.out.println("������ ���: "+data);
		}
		
		// set1�� set2 ������ ����ϱ�
		set1.retainAll(set2);
		
		System.out.println("----������ ���----");
		
		for (Integer data : set1) {
			System.out.println("������ ���: "+data);
		}
		
	}
		
		

}
