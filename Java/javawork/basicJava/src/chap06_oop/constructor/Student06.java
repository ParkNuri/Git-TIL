package chap06_oop.constructor;

public class Student06 {
	private String name;
	private int age;
	private int korea;
	private int english;
	private int math;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int science;
//	private double avg;
	
	public Student06() {
		
	}

	public Student06(String name, int korea, int english, int math, int science) {
		this.name=name;
		this.korea=korea;
		this.english=english;
		this.math=math;
		this.science=science;
	}
	
	public Student06(String name, int age, int korea, int english, int math, int science) {
		super();
		this.name = name;
		this.age = age;
		this.korea = korea;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public double getAvg() {
		double avg=0;
		avg = (double)(korea+english+math+science)/4;

		return avg;
	}
	public String getGrade() {
		String grade="";
		
		double avg=getAvg();
		
		if(100>=avg && avg>=90) {
			grade = "A";
		}else if(avg>=70) {
			grade = "B";
		}else if(avg>=50) {
			grade = "C";
		}else if(avg>=30) {
			grade = "D";
		}else if(avg>0) {
			grade = "F";
		}
		
		return grade;
	}
	
	public void print() {
		System.out.println(getName()+" ���:" + getAvg()+"\t����:"+getGrade()+"����");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorea() {
		return korea;
	}

	public void setKorea(int korea) {
		this.korea = korea;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}
	
}
