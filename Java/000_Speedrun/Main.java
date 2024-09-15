package main;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * This file was created by Sebastian Gruenwald, 04.09.2024 Neuhausen am Rheinfall
 * Email: sebiscodes@gmail.com
 * Github: https://github.com/sebiscodes
 * Instagram: https://www.instagram.com/sebisprojects/
 * Youtube: https://www.youtube.com/@sebisprojects
 * Linktree: https://linktr.ee/sebisprojects
 */

public class Main {
	
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    /* what it does in the background ist similar to:
     * 
    enum Day {
    	MONDAY = 0, TUESDAY = 1, WEDNESDAY = 2, THURSDAY = 3, FRIDAY = 4, SATURDAY = 5, SUNDAY = 6
    }       
     */

	public static void main(String[] args) {

		/***********************************************************
		 * Chapter 1.1) Primitive Data-Types
		 ***********************************************************/
		
		// Boolean (true / false)
		boolean myBool1 = true; //1-bit size Boolean with value true
		boolean myBool2 = false; //1-bit size Boolean with value false

		// Non-Floatingpoint Nummbers
		byte myByte = 0b1000001; //1-byte-size Very small integer no digits
		short myShort = 31508; //2-byte-size small integer with no digits
		int myInt = 6402306; //4-byte-size integer with no digits
		long myLong = 8546949345592303459L; //8-byte-size very long integer

		// Floatingpoint Numbers
		float myFloat = 4.2560492f; //4-byte-size floating point number with 6-7 digits (the last one is unexact!!!)
		double myDouble = 7.7593859402849353d; //8-byte-size floating point number with 15-16 digits (the last one is unexact!!!)
		
		// Character
		char myCharacter = 'B'; //2-byte-size character (see ASCII-table)
		
		

		/***********************************************************
		 * Chapter 1.2) Objects / Collections
		 ***********************************************************/
		
		// A string of character (chars)
		String myString = "Hello World!"; //A collection of chars
		
		// Dynamic collection of values
		ArrayList<String> myList = new ArrayList(); //A list of values
		myList.add("John");
		myList.add("Jane");
		myList.add("Pete");
		myList.add("Sam");
		
		// Dynamic collection of values which are stored at a unique key
		Dictionary<String, String> myDictionary = new Hashtable<>(); //A Dictionary with key / value pairs 
		myDictionary.put("Firstname","John");
		myDictionary.put("Lastname","Doe");
		myDictionary.put("Age","24");
		
		

		/***********************************************************
		 * Chapter 2.1) Output via Console
		 ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 2.1) Output via Console");
		System.out.println("***********************************************************");
		System.out.println();
		
		// Rewrite previous initialized variables and print them 
		String helloString = "Hello";
		String worldString = "World!";
		int myOutputInteger = 42;

		// Print 5 times "Hello" in a line

		System.out.println();
		System.out.println("Five-Times \"Hello\" with print():"); // Use \" instead of " if you  want to print out a " 
		System.out.print(helloString);
		System.out.print(helloString);
		System.out.print(helloString);
		System.out.print(helloString);
		System.out.print(helloString);
		System.out.println();
		
		// Print 5 times "Hello" with an own line for each 
		System.out.println();
		System.out.println("Five-Times \"Hello\" with println():");
		System.out.println(helloString);
		System.out.println(helloString);
		System.out.println(helloString);
		System.out.println(helloString);
		System.out.println(helloString);
		
		// Print 2 times "Hello" with own linebreaks
		System.out.println();
		System.out.println("Three-Times \"Hello\" with print() and own linebreaks:");
		System.out.print(helloString+"\n"); // \n stands for a linebreak
		System.out.print(helloString+((char)10)); // See ASCII-Table - Char 10 stands for a linebreak
		System.out.print(helloString);
		System.out.println();
		
		// Print "Hello World! 42" using print() with println() at the end
		System.out.println();
		System.out.println("In multiple print(): ");
		System.out.print(helloString);
		System.out.print(" ");
		System.out.print(worldString);
		System.out.print(" ");
		System.out.println(myOutputInteger);
		System.out.println();
		
		// Print "Hello World! 42" using only one println()
		System.out.println();
		System.out.println("In one println(): ");
		System.out.println(helloString + " " + worldString + ((char)32) + myOutputInteger); // use " " or char 32 for a space between variables
		System.out.println();
		
		
		
		/***********************************************************
		 * Chapter 3.A) Basic Operators - Arithmetic
		 ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 3.A) Basic Operators - Arithmetic");
		System.out.println("***********************************************************");
		System.out.println();
		
	    int int_A = 4;
	    float float_A = 1.567f;
	    double double_A = float_A + int_A;

	    System.out.println("Addition: " + (int_A + float_A));  // Adding int and float
	    System.out.println("Subtraction: " + (int_A - float_A));  // Subtracting int from float
	    System.out.println("Multiplication: " + (int_A * float_A));  // Multiplying int and float
	    System.out.println("Division: " + (int_A / float_A));  // Dividing int by float

	    // Special operations
	    System.out.println("Integer division: " + (int_A / 3));  // This results in an integer because both values are int
	    System.out.println("Float division: " + (int_A / 3f));  // This results in a float because one value is float
	    System.out.println("Integer division with int casted to a float: " + ((float)int_A / 3));  // This results in a float because one integer was casted to a float

	    // Modulo (Finding the remainder)
	    System.out.println("Modulo: " + (13 % 5));  // Remainder when 5 is divided by 3

		System.out.println("This should be a 3000000001 with no floating points, but floats are unexact: "+(3f*1000000000+1));
		System.out.println("This should be a 3000000001 with no floating points and it is because doubles are more exact, but the last decimal is still wrong even if you can't see it: "+(3d*1000000000+1));
	
		
		
		/***********************************************************
		 * Chapter 3.B) Basic Operators - In- and decrement
		 ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 3.B) Basic Operators - In- and decrement");
		System.out.println("***********************************************************");
		System.out.println();

		int iPreIncrement_B = 0;
		System.out.println("Let's see what's happening with pre-increment. Start value is: "+iPreIncrement_B);
		System.out.println(++iPreIncrement_B);
		System.out.println(++iPreIncrement_B);
		System.out.println(++iPreIncrement_B);
		System.out.println(--iPreIncrement_B);
		System.out.println(--iPreIncrement_B);
		System.out.println(--iPreIncrement_B);
		System.out.println("Finally it's: "+iPreIncrement_B);
		System.out.println("The value will be incremented before the function ended.");
		System.out.println();
		
		int iPostIncrement_B = 0;
		System.out.println("Let's see what's happening with post-increment. Start value is: "+iPostIncrement_B);
		System.out.println(iPostIncrement_B++);
		System.out.println(iPostIncrement_B++);
		System.out.println(iPostIncrement_B++);
		System.out.println(iPostIncrement_B--);
		System.out.println(iPostIncrement_B--);
		System.out.println(iPostIncrement_B--);
		System.out.println("Finally it's: "+iPostIncrement_B);
		System.out.println("The value will be incremented after the function ended.");

		int iShorthandAssignment = 0;
		System.out.println("Attention, the following are NOT post-operators. They are shorthand assignment operators performing a simple operation at first, storing it into the variable and continue the code:");
		System.out.println(iShorthandAssignment+=8);
		System.out.println((iShorthandAssignment-=4));
		System.out.println((iShorthandAssignment*=3));
		System.out.println((iShorthandAssignment/=2));
		System.out.println("Finally it's: "+iShorthandAssignment);
		

		/***********************************************************
		 * Chapter 3.C) Basic Operators - Conditions
		 ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 3.C) Basic Operators - Conditions");
		System.out.println("***********************************************************");
		System.out.println();
		
		
		int int_C = 4;
		float float_C = 3f;
		double double_C = 5d;

	    // == (equal to)
	    System.out.println("Is int_C equal to 4? " + (int_C == 4));   // true, because 4 is equal to 4.0
	    System.out.println("Is int_C equal to 5? " + (int_C == 5)); // false, because 4 is not equal to 5.0

	    // != (not equal to)
	    System.out.println("Is int_C not equal to float_C? " + (int_C != 4));   // false, because 4 is equal to 4.0
	    System.out.println("Is int_C not equal to double_C? " + (int_C != 5)); // true, because 4 is not equal to 5.0

	    // < (less than)
	    System.out.println("Is int_C less than float_C? " + (int_C < float_C));   // false, because 4 is not less than 3.0
	    System.out.println("Is int_C less than double_C? " + (int_C < double_C)); // true, because 4 is less than 5.0

	    // > (greater than)
	    System.out.println("Is int_C greater than float_C? " + (int_C > float_C));   // true, because 4 is greater than 3.0
	    System.out.println("Is double_C greater than int_C? " + (double_C > int_C)); // true, because 5.0 is greater than 4

	    // <= (less than or equal to)
	    System.out.println("Is int_C less than or equal to 4? " + (int_C <= 4));   // true, because 4 is equal to 4
	    System.out.println("Is int_C less than or equal to double_C? " + (int_C <= double_C)); // true, because 4 is less than 5.0

	    // >= (greater than or equal to)
	    System.out.println("Is int_C greater than or equal to float_C? " + (int_C >= float_C));   // true, because 4 is equal to 4
	    System.out.println("Is double_C greater than or equal to int_C? " + (double_C >= int_C)); // true, because 5.0 is greater than 4


	    // Example of using a conditional operator (ternary operator)
		System.out.println("Is elvis alive? Answer: "+(2024 < 1977 ? true : false)); // "Elvis-Operator" because if his haircut: ?:   Meaning: (Condition ? return if true : return if false)
		
		// If you compare object with eachother, it'll compare the type which will return a true even if the value is different.
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println("Are \"Hello\" and \"Hello\" equal? "+(s1==s2)); // Returns false because the reference was compared and it is different
		System.out.println("Are the values of \"Hello\" and \"Hello\" equal? "+s1.equals(s2)); // Returns true, because the values are equal

		
		
		/***********************************************************
		 * Chapter 3.D) Basic Operators - Logical Operators
		 ***********************************************************/
	    
		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 3.D) Basic Operators - Logical Operators");
		System.out.println("***********************************************************");
		System.out.println();
	    
	    // AND-Operator means booth must be true to return true
		System.out.println("AND: false && false returns "+(false && false)); // Returns false
		System.out.println("AND: false && true returns "+(false && true)); // Returns false
		System.out.println("AND: true && false returns "+(true && false)); // Returns false
		System.out.println("AND: true && true returns "+(true && true)); // Returns true
		
		// OR-Operator means one of booth must be true to return true
		System.out.println("OR: false || false returns "+(false || false)); // Returns false
		System.out.println("OR: false || true returns "+(false || true)); // Returns true
		System.out.println("OR: true || false returns "+(true || false)); // Returns true
		System.out.println("OR: true || true returns "+(true || true)); // Returns true
		
		// NOT-Operator means the value will be inverted (true will be false and false will be true)
		System.out.println("NOT: !false returns "+(!false)); // Returns true
		System.out.println("NOT: !true returns "+(!true)); // Returns false
		
		

		
		/***********************************************************
		 * Chapter 3.E) Basic Operators - Binary Operators
		 ***********************************************************/
	    
		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 3.E) Basic Operators - Binary Operators");
		System.out.println("***********************************************************");
		System.out.println();

	    byte b1 = 0b1101010; // In decimal: 106
	    byte b2 = 0b0100110; // In decimal: 38

	    byte bResult = 0; // Assign a default value (very important to accustom if you want to learn C or C++!)
	    
	    // Bitwise and
	    System.out.println("Bitwise and (the output on each bit is one if booth are 1):");
	    System.out.println("  1101010 (106)");
	    System.out.println("& 0100110  (38)");
	    System.out.println("---------");
	    System.out.println("= 0100010  (34) -> The operation returns: "+(b1&b2)); // Should return 34
		System.out.println();
	    
	    // Bitwise or
	    System.out.println("Bitwise or (the output on each bit is one if one of booth is one):");
	    System.out.println("  1101010 (106)");
	    System.out.println("| 0100110  (38)");
	    System.out.println("---------");
	    System.out.println("= 1101110  (110) -> The operation returns: "+(b1|b2)); // Should return 110
		System.out.println();
	    
	    // Bitwise xor
	    System.out.println("Bitwise xor (the output on each bit is one if only one of them is one):");
	    System.out.println("  1101010 (106)");
	    System.out.println("^ 0100110  (38)");
	    System.out.println("---------");
	    System.out.println("= 1001100  (76) -> The operation returns: "+(b1^b2)); // Should return 76
		System.out.println();
	    
	    // Bitwise not
	    System.out.println("Bitwise not (the output on each bit is one if it was before zero):");
	    System.out.println("~ 1101010 (106)");
	    System.out.println("---------");
	    System.out.println("= 0010101  (21) -> The operation returns: "+(~b1)); // Should return 76
		System.out.println();
	    
	    // Bitwise nand (combination of "not" and "and")
	    System.out.println("Nand of b1 and b2 is: "+(~(b1&b2))); 
	    // Funfact: NAND is the most used logic hardware component because you can do all other operations out of nand, even end and or
	    // Correct me if I'm wrong :)
		System.out.println();
	    
	    // Shorthand assignment:
	    System.out.println("Shorthand assignment:");
	    b1 &= b2;
	    System.out.println("B1 is now not 106, it is: "+b1);
		System.out.println();
	    
	    // Shifting binaries right keeping the signing bit
	    System.out.println("Shifting binaries right means same as dividing by 2 (as an integer): 38 / 2 = "+(b2 >> 1));
	    
	    // Shifting binaries left
	    System.out.println("Shifting binaries left means same as multiplying by 2 (as an integer): 38 * 2 = "+(b2 << 1));
		System.out.println();
	    
	    // Shifting binaries right as unsigned (means MSB (most significant bit (left bit)) will be 0).
	    System.out.println("Same as the normal right-shift, but the MSB will be set to 0 to ignore the sign...");
	    byte b3 = 38; // Negative value has an MSB = 1
	    
	    System.out.println("If we shift 38 by >>>: "+(b3 >>> 1));
	    System.out.println("If we shift -38 by >>>: "+(-b3 >>> 1));
	    System.out.println("If we shift 38 by >>: "+(b3 >> 1));
	    System.out.println("If we shift -38 by >>: "+(-b3 >> 1));
		
		

		
		/***********************************************************
		 * Chapter 4) Statements (and Enum)
		 ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 4) Statements (and Enum)");
		System.out.println("***********************************************************");
		System.out.println();
	    
	    // We've defined our enum outside the method "main", but inside the class "Main"
	    // New let's choose a day... Choose another day to try it out!
	    Day mySelectedDay = Day.SUNDAY; // ToDo: Try also WEDNESDAY, FRIDAY and SATURDAY
	    
	    System.out.println("The selected day is: "+mySelectedDay); // This will print the enum-name
	    System.out.println("It's id is: "+mySelectedDay.ordinal()); // This will print the index behind the enum, the ordinal
		System.out.println();
	    
	    
	    // Let's check which day today is and print it to the console...
	    if (mySelectedDay == Day.MONDAY) {
	    	System.out.println("4.A) If-Statement: It's monday!");
	    } else if (mySelectedDay == Day.TUESDAY) {
	    	System.out.println("4.A) If-Statement: It's tuesday!");
	    } else if (mySelectedDay == Day.TUESDAY) {
	    	System.out.println("4.A) If-Statement: This is a second tuesday which never will be called because tuesday was already found :(");
	    } else if (mySelectedDay == Day.WEDNESDAY) {
	    	System.out.println("4.A) If-Statement: It's wednesday!");
	    } else if (mySelectedDay == Day.THURSDAY) {
	    	System.out.println("4.A) If-Statement: It's thursday!");
	    } else if (mySelectedDay == Day.FRIDAY) {
	    	System.out.println("4.A) If-Statement: It's friday!");
	    } else { // If it's anything else...
	    	System.out.println("4.A) If-Statement: It's weekend because it's none of the checked days!");
	    	if (mySelectedDay == Day.SATURDAY) {
		    	System.out.println("4.A) If-Statement: It's saturday!");
	    	} else {
		    	System.out.println("4.A) If-Statement: It's sunday!");
	    	}
	    }
		System.out.println();
	    
	    // Another way to check if it's weekend:
	    if (mySelectedDay.ordinal() > Day.FRIDAY.ordinal()) {
	    	System.out.println("4.B) If-Statement: It's weekend because the days ordinal is greater than friday!");
			System.out.println();
	    }
	    
	    // or another way...
	    if (mySelectedDay == Day.SATURDAY || mySelectedDay == Day.SUNDAY) {
	    	System.out.println("4.C.1) If-Statement: It's weekend because it's saturday or sunday!");
			System.out.println();
	    }
	    
	    // or another way...
	    boolean isItWeekend = (mySelectedDay == Day.SATURDAY || mySelectedDay == Day.SUNDAY);
	    if (isItWeekend) {
	    	System.out.println("4.C.2) If-Statement: It's weekend because it's saturday or sunday!");
			System.out.println();
	    }
		System.out.println();
	    

	    
		// Let's make it easier using a switch statement:
	    switch (mySelectedDay) {
	    case MONDAY:
	    	System.out.println("4.D) Switch-Statement: It's monday!");
	    	break;
	    case FRIDAY:
	    	break;
	    case SATURDAY:
	    	System.out.println("4.D) Switch-Statement: It's Saturday!");
	    	// If we don't insert here a break; this will jump into Sunday if you choose saturday!
	    case SUNDAY:
	    	System.out.println("4.D) Switch-Statement: It's Saturday or Sunday, could be booth because there is no \"break\" at the end of Saturday!");
	    	System.out.println("4.D) Switch-Statement: But anyways, it's weekend!");
	    	break;
	    default:
	    	System.out.println("4.D) Switch-Statement: Probably you selected TUESDAY, WEDNESDAY or THURSDAY which are not inside the switch-statement.");
	    	System.out.println("4.D) Switch-Statement: So the default case will be called!");
	    }
		System.out.println();
	    
	    String mySwitchString = "Hello";
		// Let's make it easier using a switch statement:
	    switch (mySwitchString) {
	    case "Hello":
	    	System.out.println("4.D) The value of \"mySelectedString\" was \"Hello\"!");
	    	break;
	    case "World":
	    	System.out.println("4.D) The value of \"mySelectedString\" was \"World\"!");
	    	break;
	    default:
	    	System.out.println("4.D) The value of \"mySelectedString\" was something different then \"Hello\" or \"World\"!");
	    }
		System.out.println();
	    
        /***********************************************************
         * Chapter 5) Arrays vs Collections
         ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 5) Arrays vs Collections");
		System.out.println("***********************************************************");
		System.out.println();

        // Example 1: Array (Fixed Size)
        int[] numberArray = new int[3]; // F.e. we can store {x,y,z} to use it as a point
        //int[] numberArray = {42, 13, 17}; // Alternative initialization - try it out!
        numberArray[0] = 42;
        numberArray[1] = 13;
        numberArray[2] = 17;
        
        System.out.println("5.A) Array element at index 0: " + numberArray[0]); // As a point this might represent x
        System.out.println("5.A) Array element at index 1: " + numberArray[1]); // As a point this might represent y
        System.out.println("5.A) Array element at index 2: " + numberArray[2]); // As a point this might represent z
		System.out.println();
		

        // Example 2: ArrayList (Dynamic Size)
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("John");
        namesList.add("Jane");
        namesList.add("Joe");
        System.out.println("5.B) Amount of Entries in ArrayList: " + namesList.size());
        System.out.println("5.B) ArrayList element at index 0: " + namesList.get(0));
        System.out.println("5.B) ArrayList element at index 1: " + namesList.get(1));
        System.out.println("5.B) ArrayList element at index 2: " + namesList.get(2));
		System.out.println();
		
		namesList.remove(1);
        System.out.println("5.B) New Amount of Entries in ArrayList: " + namesList.size());
        System.out.println("5.B) ArrayList element at index 0: " + namesList.get(0));
        System.out.println("5.B) ArrayList element at index 1: " + namesList.get(1));
		System.out.println();

        // Example 3: Dictionary (Hashtable in Java, Dynamic Size)
        Dictionary<String, String> dictionary = new Hashtable<>();
        dictionary.put("Name", "John");
        dictionary.put("Age", "24");
        System.out.println("5.C) Amount of Entries in Dictionary: " + dictionary.size()); // dictionary is now empty
        System.out.println("5.C) Dictionary Name: " + dictionary.get("Name"));
        System.out.println("5.C) Amount of Entries: " + dictionary.size());
		System.out.println();

		dictionary.remove("Age"); // Remove the age
		dictionary.remove("Name"); // Remove the name
        System.out.println("5.C) New Amount of Entries in Dictionary: " + dictionary.size()); // dictionary is now empty
		System.out.println();

        /***********************************************************
         * Chapter 6) Loops
         ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 6) Loops");
		System.out.println("***********************************************************");
		System.out.println();
		
        // For loop
        System.out.println("6.A) For Loop:");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.println("6.A) Array element: " + numberArray[i]);
        }
		System.out.println();

        // For-each loop using ArrayList
        System.out.println("6.B) For-each Loop:");
        for (String name : namesList) {
            System.out.println("6.B) ArrayList element: " + name);
        }
		System.out.println();

        // For-each loop using Dictionary
        System.out.println("6.C) For-each Loop:");
        dictionary.keys().asIterator().forEachRemaining((key -> {
            String value = dictionary.get(key);
            System.out.println("6.C) Dictionary element at \""+key+"\": " + value);
        }));
		System.out.println();

        // While loop
        System.out.println("6.D) While Loop:");
        int count = 0;
        while (count < numberArray.length) {
            System.out.println("6.D)Array element: " + numberArray[count]);
            count++;
        }
		System.out.println();

        // Do While loop
        System.out.println("6.E) Do While Loop:");
        count = 0;
        do {
            System.out.println("6.E) Array element: " + numberArray[count]);
            count++;
        } while (count < numberArray.length);
		System.out.println();

        /***********************************************************
         * Chapter 7) Error Handling with Try-Catch
         ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 7) Error Handling with Try-Catch");
		System.out.println("***********************************************************");
		System.out.println();
		
        try {
            int divideByZero = 10 / 0; // This will throw an exception
        } catch (Exception e) { // Or in this special case "ArithmeticException e", but "Exception" contains all exceptions
            System.out.println("Caught an Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block always runs.");
        }
        
        /***********************************************************
         * Chapter 8) Methods
         ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 8) Methods");
		System.out.println("***********************************************************");
		System.out.println();
		
        // Calling a void method
        printHelloWorld();

        // Calling a method that returns a value
        int result = addTwoNumbers(3, 4);
        System.out.println("8.B) Addition result: " + result);
        
        /***********************************************************
         * Chapter 9) Classes
         ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Chapter 9) Classes");
		System.out.println("***********************************************************");
		System.out.println();
		
        // Example of using a simple class with getters and setters
        Person person = new Person("Alice", 22);
        // After a while she gets older
        person.setAge(23);
        System.out.println("9) Person's name: " + person.getName());
        System.out.println("9) Person's age: " + person.getAge());

        // Inheritance and abstract class
        BoredStudent myStudent1 = new BoredStudent();
        myStudent1.study();
        myStudent1.procrastinate();
        myStudent1.attendClasses();
        myStudent1.submitAssignments();
        myStudent1.takeExam();

        // Inheritance and abstract class
        MotivatedStudent myStudent2 = new MotivatedStudent();
        myStudent2.study();
        myStudent2.doExtraWork();
        myStudent2.attendClasses();
        myStudent2.submitAssignments();
        myStudent2.takeExam();
        
        /***********************************************************
         * Extra Chapter: GUI
         ***********************************************************/

		// Print the title to find it better in console
		System.out.println();
		System.out.println("***********************************************************");
		System.out.println("* Extra Chapter: GUI");
		System.out.println("***********************************************************");
		System.out.println();
		
        // Simple JFrame with a button
        createJFrame();
    }

    /*********** Methods (Chapter 8) ***********/

    // Method with no return type (void)
	static void printHelloWorld() {
        System.out.println("8.A) Hello, World!");
    }

    // Method with a return type (int)
    static int addTwoNumbers(int a, int b) {
        return a + b;
    }
    
    /*********** JFrame Example (Extra Chapter) ***********/
    
    // A simple GUI example using JFrame with a button that prints "Hello, World!"
    public static void createJFrame() {
        JFrame frame = new JFrame("Hello World Example");
        JButton button = new JButton("Click Me");

        button.addActionListener(e -> System.out.println("Extra Chapter) Hello, World!"));

        frame.setSize(400, 200);
        frame.add(button); // Add button to the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); // Display the frame
    }
}

/*********** Classes (Chapter 9) ***********/

// A simple Person class with private, public, and getter/setter methods
class Person {
    private String name; // Private variable - Can only be accessed inside this "Person"-class
    private int age; // Private variable - Can only be accessed inside this "Person"-class
    public float size; // Public variable - Can be accessed from everywhere
    protected String gender; // Protected variable - Can be accessed from inside the "Main"-Package

    // Constructor
    public Person(String name,int age) {
    	this.name = name;
    	this.age = age;
    }

    // Getter
    public String getName() {
        return this.name;
    }
    // Getter
    public int getAge() {
        return this.age;
    }

    // Setter
    public void setAge(int age) {
        this.age = age;
    }
}

// Abstract class example
abstract class Student {
	
	 // Abstract method, must be implemented by subclasses
    public abstract void study(); // Some students take it more or less serious
    
    // Abstract method that will NOT be overridden by subclasses
    public void takeExam() { // All students must take an exam
        System.out.println("9.B) All students must take an exam.");
    }
}

// Interface defining additional behaviors
interface StudentBehavior {
    void attendClasses(); // Method signature, no body
    void submitAssignments(); // Method signature, no body
}

// BoredStudent class inherits from Student and implements StudentBehavior
class BoredStudent extends Student implements StudentBehavior {
    @Override
    public void study() {
        System.out.println("9.B) Per default all students must study! "
        		+ "But this one takes it not that serious as he should!");
    }

    public void procrastinate() {
        System.out.println("9.B) The BoredStudent procrastinates which is not a possible method of a motivated student!");
    }

    @Override
    public void attendClasses() {
        System.out.println("9.B) BoredStudent attends classes but doesn't pay attention.");
    }

    @Override
    public void submitAssignments() {
        System.out.println("9.B) BoredStudent submits assignments late.");
    }

    // the takeExam() void is already implemented due to "extends Student"
}

// MotivatedStudent class inherits from Student and implements StudentBehavior
class MotivatedStudent extends Student implements StudentBehavior {
    @Override
    public void study() {
        System.out.println("9.B) Per default all students must study! "
        		+ "And this one gives his best!");
    }

    public void doExtraWork() {
        System.out.println("9.B) The MotivatedStudent does extra work which is not a possible method for the bored student!");
    }

    @Override
    public void attendClasses() {
        System.out.println("9.B) MotivatedStudent attends all classes attentively.");
    }

    @Override
    public void submitAssignments() {
        System.out.println("9.B) MotivatedStudent submits assignments on time with extra details.");
    }

    // the takeExam() void is already implemented due to "extends Student"
}

	 
