package workbook.section3_41p;

public class BookTest {

	public static void main(String[] args) {
		Book[] book = new Book[3];
		
		book[0]= new Book("SQL Plus",50000, 5);
		book[1]= new Book("Java 2.0",40000, 3);
		book[2]= new Book("JSP Servlet",60000, 6);

		int sum=0;
		double dcSum=0.0;
		for(int i=0;i<3;i++) {
			book[i].print();
			sum+=book[i].bookPrice;
			dcSum+=book[i].getDiscountBookPrice();
		}
		
		System.out.println("책 가격의 합: "+sum+"원");
		System.out.println("할인되 책 가격의 합: "+dcSum+"원");
		
	}

}
