package package1;

public class Arithmetic // Piller1
{
   public int sum(int a,int b)  
   {
	   int c;
	   c=a+b;
	   System.out.println("Result is "+c);
	   return c;
   }
   public int sub(int x,int y)
   {
	   int z;
	   z=x-y;
	   System.out.println("Result is "+z);
	   return z;
   }
   public void multi(int a1,int a2)
   {
	   int a3;
	   a3=a1*a2;
	   System.out.println("Result is "+a3);
   }
   public static void main(String[] args)  // Piller2
   {
	Arithmetic ob=new Arithmetic();  // piller3
	int sumResult=ob.sum(10, 2);  // piller4(call sum method)
	int subResult=ob.sub(10, 2);
	ob.multi(sumResult, subResult);
   }
	
}
