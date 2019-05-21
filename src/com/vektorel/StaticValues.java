package com.vektorel;

	// Sınıfın miras alınmasını engeller
public final class StaticValues {

	public static int topla= 45;
	
	public int sayi=2; 
	
	
	//Değişkenin değişkenliğini engeller
	public final double pi = 3.14;
	
	// Methodun Overriding özelliğini engeller
	public final int toplam(int a) {
		return  a;
	}
}
