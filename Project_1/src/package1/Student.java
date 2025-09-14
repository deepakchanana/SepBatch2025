package package1;

// { } ---indicate boundary(body) of the class
// A class contains variable + method
public class Student  // piller1
{
    int age;  // variable datatype variablename(numeric value)
    
    public void display() // () indicate it is a method
    {
    	System.out.println("Welcome to all of you");
    }
    public int deepak(int a,int b)  // non void 
    {
    	int c=a+b;
    	System.out.println("Result is "+c);
    	return c;
    }
    public static void main(String[] args)  // piller2
    {
    	System.out.println("I am the boss I am the main method");
    	Student divya=new Student(); // piller3
    	divya.display();  // piller4(calling the method or variable)
    	divya.deepak(1222,55);
		
		
	}
}
