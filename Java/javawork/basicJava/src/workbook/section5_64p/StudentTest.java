package workbook.section5_64p;

public class StudentTest {

	public static void main(String[] args) {
		
		Student[] s = new Student[3];

		s[0]= new Student("ȫ�浿", 15, 171, 81);
		s[1]= new Student("�ѻ��", 13, 183, 72);
		s[2]= new Student("�Ӱ���", 16, 175, 65);
		
		System.out.println("�̸�\t����\t����\t������");
		
		int ageSum = 0, hSum = 0, wSum = 0;
		
		//�迭�� ��ü ���� ��� + �� ��
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].getName()+"\t"+s[i].getAge()+"\t"+s[i].getHeight()+"\t"+s[i].getWeight());
			ageSum+=s[i].getAge();
			hSum+=s[i].getHeight();
			wSum+=s[i].getWeight();
			
		}
		
		
		
		//���� ��� ���
		System.out.println("������ ���: "+Math.round(((double)ageSum/s.length)*100)/100.0);
		System.out.println("������ ���: "+Math.round(((double)hSum/s.length)*100)/100.0);
		System.out.println("�������� ���: "+Math.round(((double)wSum/s.length)*100)/100.0);
		
	}

}
