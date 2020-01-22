package api.util;
//���� : �ߺ� ��� x
//HashSet ����ϱ� - ������ �����ϰ� ����� ������ ������
import java.util.HashSet;
import java.util.Iterator;


public class HashSetTest {
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
		// �ߺ��� �����ʹ� �ϳ��� �ļ� ������ ī��Ʈ���� �ʴ´�
		
		//set �ȿ� ����� ��Ҹ� ����
		//1. HashSet�����͸� ǥ�� �������̽�(��� �ڷᱸ���� ��� �����͸� 
		//	 ��ȯ�ؼ� ���� �� �ֵ��� �����Ǵ� ��������)�� Iterator�� ��ȯ
		Iterator<String> it =set.iterator();

		//2. ��ȯ �� ����
		while(it.hasNext())
		{	// Iterator �ȿ� ����� ��Ұ� �ִ��� Ȯ�� - boolean ����
			String data = it.next();	//Iterator�� ����� ��Ҹ� �ϳ� ������ ��ȯ
			System.out.println("���� ���:"+data);
		}
		
		//=
		for (String data : set) {
			System.out.println("set�� ����� ���:"+data);
		}
	
	}
}
