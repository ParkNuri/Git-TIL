package api.util;

import java.util.ArrayList;

public class ArrayListTest01 {

	public static void main(String[] args) {
		//E�� element�� ����. ArrayList�� ����ϴ� ������ �����ϴ� ������ Ÿ��
		//ArrayList�� ����Ǵ� ����� Ÿ��
		//Object�� ���ٰ� �����ϸ� ��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		System.out.println("������:"+list.size());
		
		System.out.print("ArrayList�� ����� ��ҵ�:  ");
		for (int i = 0; i <= list.size()-1; i++) {
			System.out.print(list.get(i)+" ");
		}
		
	}

}
