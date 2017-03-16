
//*********************************************************************
//  Kennel.java
//
//*********************************************************************

import java.util.Scanner;

public class Kennel
{
    //-------------------------------------------------------
    // Creates a dog object and then calls the ageInPersonyears method.
    //-------------------------------------------------------
    public static void main (String[] args)
    {
		String dogName;
		String dogBreed;
		int dogAge;
      
		Scanner scan = new Scanner(System.in);

	
		System.out.print ("Enter the name of the dog: ");
		dogName = scan.nextLine();
		
		System.out.print ("Enter the breed of the dog: ");
		dogBreed = scan.nextLine();

		System.out.print ("Enter the age of the dog: ");
		dogAge = scan.nextInt();



	// Create a dog object 
		Dog dog1 = new Dog(dogName, dogBreed, dogAge);
		
		
	   System.out.println("Its age in person years is " + dog1.ageInPersonYears() );
	
	// Print summary for the dog 
     System.out.println(dog1);
							
  }
}




