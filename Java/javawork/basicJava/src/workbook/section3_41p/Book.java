package workbook.section3_41p;

public class Book {
	String bookName="";
	int bookPrice=0;
	double bookDiscountRate=0.0;
	public Book() {
		
	}
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public void print() {
		System.out.println(getBookName()+"\t"+getBookPrice()+"��"+"\t"+getBookDiscountRate()+"%"+"\t"+getDiscountBookPrice()+"��");
	}
	public double getDiscountBookPrice() {
		double dP=0.0;
		dP=(double)bookPrice*((100-bookDiscountRate)/100);
		return dP;
	}
	
	
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	
}
