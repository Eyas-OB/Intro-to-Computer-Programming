
public class program02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double l =9.0;
double w = 12.5;
double h = 8.25; 
String ft = "feet";
double fsa = l*w; 
double wsa = 2 * ((l * h) + (w * h));
	System.out.println("Given a length of: "+l+(" ")+ft);
	System.out.println("A hieght of: "+h+(" ")+ft);	
	System.out.println("And a With of "+w+(" ")+ft);
	System.out.println("\nThe total floor area is "+fsa+(" ")+ft+" squared");	
	System.out.println("\nThe total wall surface area is "+wsa+(" ")+ft+" squared");
	}
}
