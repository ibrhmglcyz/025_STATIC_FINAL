package com.vektorel;

public class Runner {

	public static void main(String[] args) {
		
		StaticValues st = new StaticValues();
		StaticValues st1 = new StaticValues();
		
		StaticValues.topla =15; //static olan degiskene direk erisim yapabiliyoruz

		st.topla = 56;
		st.sayi = 100;
		
		st1.topla=554;
		st1.sayi=101;
		
		System.out.println(st.topla);
		System.out.println(st.sayi);
		System.out.println(st1.topla);
		System.out.println(st1.sayi);
		
		
	}

}
