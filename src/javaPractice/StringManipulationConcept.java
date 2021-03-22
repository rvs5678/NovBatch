package javaPractice;

public class StringManipulationConcept {

	public static void main(String[] args) {
		
		String a = "Hello";
		int b = 100;
		int c = 200;
		
//		java execution is from left to right
//		System.out.println(a+b+c);
//		System.out.println(c+b+a);
//		System.out.println(b+c+a);
//		System.out.println(b+a+c);
		
		String d = "HELLO WORLD";
		
		// to access string methods
		
		String lowerCaseD = d.toLowerCase(); // lower case conversion
		System.out.println(lowerCaseD);
		
		String UpperCaseD = lowerCaseD.toUpperCase();
		System.out.println(UpperCaseD);
		
		System.out.println("Comparing d to UpperCaseD: "+d.equals(UpperCaseD));
		System.out.println("Comparing d to LowerCased: "+d.equals(lowerCaseD));
		
		System.out.println("Comparing upper and lowercase: "+d.equalsIgnoreCase(lowerCaseD));
		
		String e = "HELLO  JAVA";
		System.out.println("Comparing e with d with extra space: "+e.equalsIgnoreCase(lowerCaseD));
		
		// compareTo() -> comparing strings, the output will be 0 if its same and the output will not be 0 if its not same.
		System.out.println(d.compareTo(UpperCaseD));
		System.out.println(d.compareTo(lowerCaseD));
	}
	

}
