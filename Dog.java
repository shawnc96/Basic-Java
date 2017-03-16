
//*********************************************************************
//  Dog.java
//
//  Represents a dog.
//*********************************************************************

public class Dog
{
   // Instance variables
    private int age;
    private String name;
    private String breed;
              
    //----------------------------------------------------------------
    // Constructor - sets up a dog object by initializing the name, the
	 // breed, and the age.
    //----------------------------------------------------------------
	  public Dog(String dName, String dBreed, int dAge)
     { 
         name = dName;
         breed = dBreed;
         age =dAge;
        // System.out.println(pAge);
     }      		
   //----------------------------------------------------------------  
	// Method ageInPersonYears that takes no parameter. The method 	
	// should compute and return the age of the dog in person years
	//(seven times the dog's age).
   //----------------------------------------------------------------
    public int ageInPersonYears()
    {
      int pAge;
      pAge = age * 7;
      return pAge;
    }   
    //----------------------------------------------------------------
    // Returns a string representation of a dog.
    //----------------------------------------------------------------
      public String toString()
      {
         return name + "\t"+  breed + "\t" + age +
            " age in person years:" + ageInPersonYears();
      }
}




