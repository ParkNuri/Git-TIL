package workbook.section2;

public class Test07 {

	public static void main(String[] args) {
		System.out.println("������ �Է��Ͻÿ�");
		
		int num = Integer.parseInt(args[0]);
		System.out.print(num);
		int i = 2;
		int sum= 0;
		while(true) {
			if(num*i>100)break;
			sum+=num*i;
			
			i++;
			System.out.print("+"+num*i);
		}
		System.out.println("="+sum);
	}

}
