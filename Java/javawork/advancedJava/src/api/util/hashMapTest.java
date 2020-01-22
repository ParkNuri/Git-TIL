package api.util;

import java.util.HashMap;
import java.util.Set;

public class hashMapTest {

	public static void main(String[] args) {
		// 1. key�� value�� �� ������ ����
		// 	  -Generic���� ������ Ÿ���� ����Ҷ��� key�� ���� Ÿ��,
		//	   value�� ���� Ÿ���� ���� �����ؾ� �Ѵ�.
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
	
		//map������ key�� ��Ҹ� �����ϱ⶧���� key�� ������ �����.
		//map���� ���� key������ �����ϸ� ������ ���� ����ȴ�
		map1.put(1,"servlet");
		map1.put(1,"jsp");
		map1.put(1,"j");
		
		System.out.println("map�� ����� ����� ����: "+map1.size());
		
		System.out.println("key�� 1�� ����� value->"+map1.get(1));
	
		//map�� ����� �����͸� ��� ����ϱ�
		//map�� key�� �̿��ؼ� ����� ��ġ�� ����ϱ⶧���� ������ ������� ��µ��� �ʴ´�.
		
		HashMap<String, String> map2 = new HashMap<String,String>();
		map2.put("abc1", "servlet");
		map2.put("dfg2", "jsp");
		map2.put("ddd3", "spring");
		map2.put("fa4", "tiles");
		map2.put("sss5", "mybatis");
		
		//1. key ����� �����Ѵ�.
		Set<String> keylist = map2.keySet();
		
		//2. �ݺ����ȿ��� key�� �̿��ؼ� value�� �����Ѵ�
		//	 �Է��� ������� ��µ��� �ʴ´�.
		for(String key : keylist) {
			String value = map2.get(key);
			System.out.println(key+":"+value);
		}
		
	}

}
