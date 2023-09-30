package week04CodingProject;

public class week04CodingProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Question 1 & 1a");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; 	//Declared an array with the values
		int firstAges = ages[0]; //created a variable to hold the first element of the array
		int	lastAges = ages[ages.length-1]; //created a variable to hold the last element of the array
		int agesDiff = lastAges - firstAges; //created a variable to hold the difference, in hindsight could have put this in the sysout line
		System.out.println(agesDiff); //Takes the last age and first age to print out difference, need to fix to only print once

System.out.println("Question 1b");		
		int[] newAges = {3, 9, 23, 64, 2, 8, 28, 93, 5}; //new array with a length of 9 and index of 8
		int indexFirst = newAges[0]; //variable for 0 index, 1st item in the array
		int indexLast = newAges[newAges.length-1]; //variable for last item in the int array
		int firstLastDiff = indexLast - indexFirst; //created variable to hold the difference
		System.out.println(firstLastDiff); //printed out the difference, need to fix to only print once
		
System.out.println("Question 1c");
		double newAgesSum = 0;
		for (int i = 0; i < newAges.length; i++) {	//length of 9, sum of 235, average = 26.11
		newAgesSum += newAges[i];
		}
		double averageNewAges = newAgesSum / newAges.length;
		System.out.println(averageNewAges);

System.out.println("Question 2");
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //created string array
		double namesSum = 0; //gave sum 0 and made a double for average
		for (int i = 0; i < names.length; i++) { //looped over the names to calculate the sum
		namesSum += names[i].length(); //defined namesSum to add the names in the array lengths together, answers question 5 to create a loop to add the length of each name
		}
		double averageNames = namesSum / names.length; //created a double, summed names (23) and divided by length (6) of names array for average
		System.out.println(averageNames); //printed out the average

System.out.println("Question 2b");
		for (String name : names) {
		System.out.print(name + " ");
		}
		System.out.println(); //character that is a new line

//Question 3 - How do you access the last element in a Array? 
		//It is variable[variable.Length -1], because then it will look at the correct index number. 
		//An array of length of 5, has an index of 4
		
// Question 4 - How do you access the first element in an array? 
		//It is index O, because an array is a zero index 
		
System.out.println("Question 5");
		int[] namesLenghts = new int[names.length]; //creates the array
		for (int i = 0; i < names.length; i++) { //loops through the names to find the length
		namesLenghts[i] = names[i].length(); //this calculates the length of each name in the name array
		}
		System.out.println();
		
		for (int nameLength : namesLenghts) {
		System.out.print(nameLength + " "); //printed the array
		}
		System.out.println();//printed a blank line
		
System.out.println("Question 6");
	double namesLenghtsSum = 0; //declared a sum variable 
	for (int i = 0; i < namesLenghts.length; i++) {	 //looping through the namesLengths array
	namesLenghtsSum += namesLenghts[i]; //adding the array together to namesLengthsSums
	}
	System.out.println(namesLenghtsSum); //sum of names is 23, printed out sum
	


//Testing Methods

System.out.println("Question 7");
String multiple = word("Gordon", 5); //this calls the method of 'word' and prints Gordon 5 times
System.out.println(multiple); //multiple equals the word method 

System.out.println("Question 8");
String firstName = "Gordon";
String lastName = "Desatoff";
String fullName = fullName(firstName, lastName); //this calls the method 
System.out.println(fullName);

System.out.println("Question 9");
int [] testNumbers = {70, 50, 50};
int sumTest = 0;
for (int test : testNumbers) {
	sumTest += test;
}
System.out.println(sumTest);

if (sumTest > 100) {	// if else statement used to print out true or false
	System.out.println("true");
} else {
	System.out.println("false");
}

System.out.println("Question 10");
double[] newDoubles = {3.5, 9.1, 23.15, 64.5, 2.08, 8.11, 28.99, 93.01, 5.02}; //average 26.38444
double result = average(newDoubles);
System.out.println(result);

System.out.println("Question 11");
double[] secondDoubles = {4.5, 9.1, 25.15, 64.5, 2.08, 10.11, 28.99, 95.01, 5.02}; //average 26.94
boolean result2 = average2 (newDoubles, secondDoubles);
System.out.println(result2);


System.out.println("Question 12");
boolean isHotOutside = true; //the code isn't looking at this boolean, but the boolean in the method
double moneyInPocket = 10.75;
boolean result3 = willBuyDrink(isHotOutside, moneyInPocket);
System.out.println("Will buy drink? " + result3); //result is printing false? 

System.out.println("Question 13");
boolean sunIsOut = true; //creating sunIsOut boolean variable
boolean isWatered = true; //creating isWatered boolean variable
boolean result4 = willFlowerGrow(sunIsOut, isWatered); //created variable4 to call method willFlowerGrow variables in parenthesis
System.out.println("Will my flower grow? " + result4); //sysout will my flower grow true or false with a string and the result4


} //end of main method	


//start of methods outside of main method
//Question 7
	public static String word(String word, int n) { //method signature that takes a String and an int to return the String n amount of times
	String result = ""; //this is an empty String
	for (int i = 0; i < n; i++) { //the for loop is used to iterate over as long as i is less than n which is the int
	result += word; //the result is a += of the word
	}
	return result;	//this returns the result of the above
	}

//Question 8
	public static String fullName(String firstName, String lastName) { //method signature determines, string is the return item,public static because it will return, fullName is the identifier, in the paraen are the parameters													
	String fullName = firstName + " " + lastName; { //creates the full name variable 
	return fullName; } //this is what to return 
	}

//Question 9
	public static boolean greaterThan(int[] testNumbers) {  //uses boolean to determine T/F, greaterThan is the identifier, created an array of test numbers
	int sumTest = 0; //declared sum of zero
		for (int number : testNumbers) { //created a enhanced for loop to loop thru array 
		sumTest += number; //sum of array
	} 
	return sumTest > 100; //boolean statement to test sumTest against the value of 100
	}
//Question 10
	public static double average (double[] newDoubles) { //creates a method called average
	double sumNewDouble = 0.0; //setting sumNewDouble to zero
	for (double newDouble : newDoubles) { //enhanced for loop to iterate through the newDoubles
	sumNewDouble += newDouble; //sums the newDoubles to the sumNewDouble
	}
	double averageDoubles = sumNewDouble / newDoubles.length; //calculates the average by sumNewDoubles by newDoubles array length
	
	return averageDoubles; //returns the average of doubles when called
	}
	
//Question 11
	public static boolean average2 (double[] newDoubles, double [] secondDoubles) { //boolean method because we want to return a true/false
	return average(newDoubles) > average(secondDoubles);

	}
	
//Question 12
	public static boolean willBuyDrink(boolean isHotOuside, double moneyInPocket) { //method name is willBuyDrink
	boolean isHotOutside = true; //this should be outside of the method?
	if (isHotOutside  == true && moneyInPocket > 10.50) { //will buy a drink only if isHotOutside == true && you have greater than 10.50 in pocket
		return true; //this would true if all of the if statement is met
	} else {
		return false; //if the if statement is not met then return false
	}
	}
//Question 13
	public static boolean willFlowerGrow(boolean sunIsOut, boolean isWatered) { //wanting to make a method that uses all boolean and &&
	boolean willFlowerGrow = sunIsOut && isWatered; //Flower will grow if both sun is out and is watered are true
	return willFlowerGrow; //return statement
	
	
	
} //end of outside of main method
} //end of public class
	
