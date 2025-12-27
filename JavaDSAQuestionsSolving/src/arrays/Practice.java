package arrays;

public class Practice {
//	✔ JDK, JRE, JVM
//	✔ IDE
//	✔ Keywords, Comments
//	✔ Access Specifiers
//	✔ Wrapper Classes
//	✔ Primitive & Non-Primitive Datatypes
//	✔ Variables
//	✔ Packages
//	✔ Operators (all types including Bitwise)
//	✔ Flow Control
//	✔ if–else, switch, break, continue
//	✔ Class, Object
//	✔ Methods (all 4 types)
//	✔ Encapsulation
//	✔ Jump Statements
//	✔ Execution Engine
//	✔ JVM Architecture
//
//	These questions are perfect for interviews, exams, and improving coding logic.
//
//	🧠 TOPIC-WISE LOGIC BUILDING QUESTIONS (Best for Revision + Practice)
//	✅ 1. JDK, JRE, JVM – Concept Building Questions
//
//	Explain the lifecycle of a Java program from writing code → execution (include compiler, class loader, JVM, execution engine).
//
//	What will happen internally when you run this command?
//
//	java HelloWorld
//
//
//	Why JVM is platform independent but JDK is platform dependent?
//
//	What happens inside the Execution Engine? Explain with steps.
//
//	Why is JRE not enough to develop Java applications?
//
//	✅ 2. IDE, Keywords, Comments – Logic Questions
//
//	Write a program with single-line, multi-line, and documentation comments.
//
//	Why static, final, abstract, super, this cannot be used like variables?
//
//	Is main a keyword? Why or why not?
//
//	What happens if we remove public from the main method?
//
//	✅ 3. Access Specifiers – Conceptual Questions
//
//	Create a class in another package and try accessing private, default, protected, and public fields. Which work?
//
//	Why are access specifiers important for encapsulation?
//
//	Write a small program to show difference between default and protected.
//
//	✅ 4. Wrapper Classes – Logic Questions
//
//	Convert primitive → wrapper → primitive again.
//
//	Take a string input "123" and convert it into int, double, boolean
//	int a = 10;
//	double b =30.00;
//	boolean c =true;
//	
//	String s = Integer.ToString(a);
	
	int rollNo;
	String name;
	int age;
	
	
	public static void main(String[] args) {
////		Take a string input "123" and convert it into int, double, boolean
//		int a = 10;
//		double b =30.00;
//		boolean c =true;
//		
//		String s = Integer.ToString(a);
		
		String s = "123";
		int a = Integer.parseInt(s);
		double b =Double.parseDouble(s);
		boolean c = Boolean.parseBoolean(s);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
//		What happens if you try to convert "abc" into an integer?
		String s1 = "abc";
		int a1 = Integer.parseInt(s1);
		System.out.println(a1);
		
//		Write a program to show difference between local, instance, and static variables.
		
	}
	
	
//


//
//	✅ 5. Primitive & Non-Primitive Datatypes – Logic Questions
//
//	Find the memory size of all primitive data types using wrapper class constants.
//
//	Why are Strings immutable? Show with an example.
//
//	Create an array of 10 integers and store only even numbers.
//
//	✅ 6. Variable Declaration – Logic Questions
//
//	Write a program to show difference between local, instance, and static variables.
	int d =10;//local varible
//
//	Why must local variables be initialized before use?
//
//	What is variable shadowing? Give example.
//
//	✅ 7. Packages – Logic Question
//
//	Create two packages:
//
//	college.student
//
//	college.teacher
//	Access a class from another package using import.
//
//	✅ 8. Operators (Arithmetic, Logical, Bitwise, Ternary)
//	⭐ Try to solve these without writing code first.
//
//	Predict the output:
//
//	int a = 5, b = 3;
//	System.out.println(a & b);
//	System.out.println(a | b);
//	System.out.println(a ^ b);
//
//
//	Write a program using ternary operator to find maximum of 3 numbers.
//
//	Without using %, check if a number is even or odd (use bitwise).
//
//	Swap two numbers using XOR (no third variable).
//
//	✅ 9. Flow Control – if–else, switch, break, continue
//
//	Print all numbers from 1 to 50 except multiples of 5 (use continue).
//
//	Build a menu-driven program using switch.
//
//	Use nested if-else to check:
//
//	Eligible for vote
//
//	Eligible for job
//
//	Eligible for license
//
//	Count digits of a number without converting to string.
//
//	✅ 10. Class, Object – Logic Questions
//
//	Create a Student class with properties name, roll, marks. Take input of 5 students and print the topper.
//
//	Create a BankAccount class with deposit and withdraw methods. Check for insufficient balance.
//
//	Create multiple objects and show how each object has separate memory.
//
//	✅ 11. Methods (All 4 types) – Logic Questions
//	Non-Parameterized, No Return
//
//	Method to print Fibonacci series up to 10 terms.
//
//	Non-Parameterized, With Return
//
//	Method that returns the count of vowels in a string.
//
//	Parameterized, No Return
//
//	Method that takes array input and prints only unique values.
//
//	Parameterized, With Return
//
//	Method that takes two numbers and returns LCM or HCF.
//
//	✅ 12. Encapsulation – Logic Questions
//
//	Create an Employee class with private salary.
//
//	Provide getter
//
//	Provide setter with condition: salary cannot be negative
//
//	Why is encapsulation used in banking applications?
//
//	How does encapsulation help with data security?
//
//	✅ 13. Jumping Statements – Logic Questions
//
//	Break out of nested loops when i * j == 15.
//
//	Write a loop that skips printing odd numbers using continue.
//
//	When is return used inside loops? Give example.
//
//	✅ 14. BONUS — Combined Logic Questions (Strong for Interviews)
//
//	Write a Java program to count how many vowels, consonants, digits, and special characters are present in a string.
//
//	Reverse a number without using String.
//
//	Check if a number is Armstrong or not.
//
//	Write a program to find second largest element in an array.
//
//	Find frequency of each element in array.
//
//	Implement a calculator using switch.
//
//	Check if an input character is uppercase letter, lowercase letter, digit, or special character.
}
