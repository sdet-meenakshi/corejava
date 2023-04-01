package satpractice;



public class three {
	int a=12; //global variable can be used through the class
	int b;

	public static void main(String[] args) {
		three mm=new three();
		mm.b=13;//define the variable inside the main method
		int c=mm.a;
		System.out.println(mm.b);
		System.out.println(c);
	
	}

}

// call a variable inside main method and print the value of variable
    /*define the variable outside the main method
    define the variable inside the main method*/

// define and declare variable inside main method and print the value of that variable

