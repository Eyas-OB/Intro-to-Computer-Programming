
public class program02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//made a varable of type double named l 
// "l" is used as a varable name to repersent length and its value is 9.0

double l =9.0;

//made a varable of type double named w and its value is 12.5
// we chose "w" as a varable to repersent width 

double w = 12.5;

//made a string of type double named h and its value is 8.25
// "h" will repersent height

double h = 8.25; 

//the last varable we will need to initalize is ft of type string its value is
// "feet" to initilaze somthing of type string we will need to use "" for our value 

String ft = "feet";

//we want the floor surface area to be length*witdh 
//so in this code we took our existing values for length and with and 
//multplied them together to make length times width

double fsa = l*w; 

//the same concepth is applied here to find the wall surface area
//these are both standard formulas and do not need to be memorized 

double wsa = 2 * ((l * h) + (w * h));

//for our print statements we are using the "+" to sepreate print statments 
//from varables so for the print statement explaining the length we are saying 
//System.out.println("Given a length of: "+9.0+(" ")+feet);
//the actual values of these varables will be printed in the print statment thats why they do not 
//need to be in quotes
//the same will hold true for all of the other print statments

	System.out.println("Given a length of: "+l+(" ")+ft);
	System.out.println("A hieght of: "+h+(" ")+ft);	
	System.out.println("And a With of "+w+(" ")+ft);
	System.out.println("\nThe total floor area is "+fsa+(" ")+ft+" squared");	
	System.out.println("\nThe total wall surface area is "+wsa+(" ")+ft+" squared");
	}
}
