package workbook.section6_82p;


public class Test3 {

	public static void main(String[] args) {
		System.out.print("�μ� �̸��� 5���� ������ �Է��ϼ���. : ");
		if(args.length==6) {
			
			for (int i = 1; i < args.length; i++) {
				if(Double.parseDouble(args[i])>100|Double.parseDouble(args[i])<10) {
					System.out.println("�ٽ��Է��ϼ���");
					return ;
				}
			}
			
			String name = args[0];
			
			double e1 = Double.parseDouble(args[1]);
			double e2 = Double.parseDouble(args[2]);
			double e3 = Double.parseDouble(args[3]);
			double e4 = Double.parseDouble(args[4]);
			double e5 = Double.parseDouble(args[5]);
			System.out.println(name+" "+e1+" "+e2+" "+e3+" "+e4+" "+e5);
			
			Department dep = new Department(name, e1, e2, e3, e4, e5);
			System.out.println(dep.evaluationNumber());
		}
		else {
			System.out.println("�ٽ� �Է��ϼ���");
			//return ;
		}
//		
	}

}
