package javaFundamental;

public class VariablesAndDatatype {

	public static void main(String[] args) {
		/*
		char section = 'A';
		String name = "Elene";
		boolean isTall = true;
		int num = 5;
		float grade = 95.55f;
		double grade1 = 93.25f;
		
		System.out.println(name);
		name = "Ronel";
		isTall = false;
		num = 3;
		
		System.out.println(name);
		System.out.println(num);
		System.out.println("I am " + name);
		System.out.println("I am at section " + section);
		System.out.println("I'm " + name + " adarna");
		*/
		
		/* Sentence Builder Chanllenge
		 * Create a program that will only require the programmer to change the variables values in order
		 * to create a dynamic sentence using the sentence in the Sample Output.
		 * PS: BOLD words indicates a variable
		 * Sample Output
		 * 
		 * Hi my name is Ronel Panopio
		 * I'am 24 years old.
		 * My GPA is 2.25
		 * My blood type is b */
		
		String name = "Ronel Panopio";
		String bloodType = "B";
		float gpa = 2.25f;
		int age = 25;
		
		System.out.println("Hi my name is " + name);
		System.out.println("I'am " + age + " years old");
		System.out.println("My GPA is " + gpa);
		System.out.println("My blood type is " + bloodType);
	}

}
