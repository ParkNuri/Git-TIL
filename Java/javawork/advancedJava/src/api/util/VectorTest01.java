package api.util;

import java.util.Vector;

//Vector�� ����� ����ϴ� ���
public class VectorTest01 {
	public static void main(String args[]) {
//		Vector<element_type> var = new Vector<element_type>();		<>: ���׸�. Collection �� Ŭ������ ����Ҷ� ������ Ÿ�� ����ϴ� ���
		Vector<Integer> v = new Vector<Integer>();
//		v.add("java");
		v.add(10);
		System.out.println("Vector�� �뷮:"+v.capacity());	//�� ������
		System.out.println("Vector�� ����� ����� ����:"+v.size());	//���ִ� �������� ����

		System.out.println("==================================================");
		for (int i = 1; i <= 10; i++) {
			v.add(i);
		}

		
		System.out.println("Vector�� �뷮:"+v.capacity());	//�� ������
		System.out.println("Vector�� ����� ����� ����:"+v.size());	//���ִ� �������� ����
				
	}
}
