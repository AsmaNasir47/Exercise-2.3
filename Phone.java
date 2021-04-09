package PhoneScanner;

import java.util.*;

public class Phone {

	Scanner s = new Scanner(System.in);
	
	void brand() {
		System.out.println("Enter your phone brand and colour : ");
		s.nextLine();
		String b = s.nextLine();
		String e = s.nextLine();
		System.out.println("Your phone brand is " + b);
		System.out.println("Your phone colour is " + e);
	}
	
	void price() {
		System.out.println("Enter the price : ");
		double p = s.nextDouble();
		System.out.println("Enter the quantity that you want to buy : ");
		int q = s.nextInt();
		double t = p*q;
		System.out.println("the price is " + p);
		System.out.println("total quantity is " + q);
		System.out.println("total price is " + t);
	}
	
	void avgPrice(){
		System.out.println("Enter the total price : ");
		double d = s.nextDouble();
		System.out.println("Enter the quantity : ");
		int c = s.nextInt();
		double a = d/c;
		System.out.println("the total price is ");
		System.out.println("the quantity is ");
		System.out.println("the average price is " + a);
	}
	
	void discount() {
		System.out.println("enter your current price and discount voucher: ");
		s.nextDouble();
		double m = s.nextDouble();
		double n = s.nextDouble();
		double o = m-n;
		System.out.println("price after discount is " + o);
	}
}
