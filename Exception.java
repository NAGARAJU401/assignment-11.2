package Naga;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Naga
public class Exception {
	//public : members which can access as public,public members are visible to all other classes.
	//class : is a context of java that are used to create objects and to define object data types and methods.
	//classes are the basics of opps(object oriented programming)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
			//static used to prepare a field,method or inner classes as a class field.
			//void: it is void if the method does not return a value.
			//main:it is a function name When a program starts running, it has to start execution from somewhere.				
		//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		int i,j,k;//intializing 3 integer variables and their values
		i=10;
		j=0;
		k=i/j;
		System.out.println(k);
	/*In this program we get Arithmentic exception as an error
	 *if the divisor(denominator) is 0,it is undefined,here Jvm is
	 *unable to evaluate the result and thereby terminates the execution.
	 *Before terminating because java as friendly language it gives a message of the problem
	 *	
	 */		
	}

}
