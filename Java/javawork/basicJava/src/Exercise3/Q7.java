package Exercise3;

//[3-7]
public class Q7 {

	public static void main(String[] args) {
		int f = 100;
		float c = (5/9f*(f-32))*1000%10>=0.5?((int)((5/9f*(f-32))*1000+1))/1000f:((int)((5/9f*(f-32))*1000))/1000f;
		System.out.println("fahrenheit : "+f);
		System.out.println("celcius : "+c);
	}

}
