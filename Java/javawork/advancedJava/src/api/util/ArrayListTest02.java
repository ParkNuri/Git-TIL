package api.util;

import java.util.ArrayList;
//Collection�� ������ Ÿ���� Generic���·� �����Ѵ�.
//Collection<data_type>;
//	|_ArrayList<String>;
public class ArrayListTest02 {

	public static void main(String[] args) {
		//String[] arr = new String[]();
		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("oracle");
		list.add("JDBC");
		list.add("�ڹ�");
		list.add("����");
		list.add("�ϳ�");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)+"  ");
		}
		
	}

}
