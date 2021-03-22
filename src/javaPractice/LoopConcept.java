package javaPractice;

public class LoopConcept {

	public static void main(String[] args) {
		
		//Loop concept - repeating an action over and over again without increasing the number of same scripts
		// 1. For loop (Create variable/condition/increment or decrement)
		// 2. While loop create variable; while (condition) {increment or decrement}
		// 3. infinite loop -> if loop doesnt stop
		
		
//		System.out.println("1");
//		System.out.println("2");
	
	// Requirements: print 1 to 100
//	for (int i=1; i<=100; i++) {
//		System.out.println(i);
//	}
	
	//Requirements: print 100 to 1
	// option 1 for loop
//	 for (int i=100; i>=1; i--) {
//		 System.out.println(i);
//	 }
//	 
//	 // option 2 while loop
//	  int i=1;
//	  while (i<=100) {
//		  System.out.println(i);
//		 i=i+1;
//	 	}
//  Requirement : print 1 to 20 but even numbers
	  for (int x =2; x<=20; x=x+2) {
		  System.out.print(x+" ");
	  }
		 System.out.print(" ");
	  
		 System.out.print("++++++++");
		  
		 int i =2;
		  while(i<=20) {
			  System.out.print(i+" ");
			  i=i+2;
		  }
		  
}

	
	}
