package com.epam.tests;

import com.epam.java.domain.Cat;

public class ScopeTest {

	private static int counter = 10;
	private String name = "Scott";
	
	public ScopeTest(){
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		System.out.println(counter);
		// Assignation operators
		int num = 10;
		String myString = "Hello";
		num = num + 2;
		num += 2;
		num -= 5;
		System.out.println(num);
		
		//Relational Operators
		boolean res = 3==5;
		boolean res2 = 4==4;
		System.out.println(res!=res2);
		
		
		String s1 = new String("Name 1");
		String s2 = new String("Name 2");
		
		System.out.println(s1.equals(s2));
		Cat cat1 = new Cat();
		cat1.setName("Memo");
		Cat cat2 = new Cat();
		cat2.setName("Memo");
		System.out.println(cat1==cat2);
		System.out.println(cat1.equals(cat2));
		System.out.println(cat1.getName().equals(cat2.getName()));
		
		int n1 = 10;
		int n2 = 20;
		
		double n3 = 5.7;
		double n4 = 8.3;
		
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);
		System.out.println(n1%n2);
		
		System.out.println(n3/n4);
		
		if(res2){
			if(res)
				System.out.println("Hello");
			else
				System.out.println("Bye");
		}else{
			System.out.println("This statement is false");
		}
		
		String message = res2 ? (res ? "Hello" : "Bye") : "This statement is false"; 
		System.out.println(message);
		
		System.out.println(1==1 && res);
		
		int i = 10;
		System.out.println(i++); // 11
		System.out.println(++i); // 10
	}
	
	public void print(){
		final String name = "Charles";
		System.out.println(counter+", "+name);
		for(int i=1; i<=10; i++){
			System.out.println(i);
		}
		{
			
		}
		
	}
	
	public void sayHi(){
		System.out.println(counter+", "+name);
	}

}
