package chap06_oop.constructor;

public class StudentTest06 {

	public static void main(String[] args) {
		
		//������ ���
		Student06[] s = new Student06[3];
		
		
		s[0] = new Student06("Kim", 100, 90, 95, 89);
		s[1] = new Student06("Lee", 60, 70, 99, 98);
		s[2] = new Student06("Park", 68, 86, 60, 40);
		
		for(int i=0;i<3;i++) {
			s[i].print();
		}
		
		
		
		System.out.println("-----------------------");
		
			
		
		
		Student06 s1 = new Student06();
		Student06 s2 = new Student06();
		Student06 s3 = new Student06();
		
		s1.setName("Kim");
		s1.setKorea(100);
		s1.setEnglish(90);
		s1.setMath(95);
		s1.setScience(89);

		s2.setName("Lee");
		s2.setKorea(60);
		s2.setEnglish(70);
		s2.setMath(99);
		s2.setScience(98);

		s3.setName("Park");
		s3.setKorea(68);
		s3.setEnglish(86);
		s3.setMath(60);
		s3.setScience(40);
		
		
		System.out.println("Kim ���:" + s1.getAvg()+"\t����:"+s1.getGrade()+"����");
		System.out.println("Lee ���:" + s2.getAvg()+"\t����:"+s2.getGrade()+"����");
		System.out.println("Park ���:" + s3.getAvg()+"\t����:"+s3.getGrade()+"����");
	
	}

}
