package constructor;

public class Object_creation_pgrm 
{
  static void m1()
   {
	   System.out.println("hello world 123");
   }
	
   int m2()
   {
	   return 1000;
   }
	void m3(int a)
	{
		int k=100+a;
		System.out.println("the value of sum is "+ k);
	}
	
	public static void main(String[] args) 
	{
      //new Object_creation_pgrm().m3(167);
	 //m1();
		//creating reference object 'x' using constuctor
		Object_creation_pgrm x=new Object_creation_pgrm();	
		//calling non-static method 'm3' using object 'x'
		x.m3(250);
		int b=x.m2();// m2 is non-static method
		System.out.println("the value of return value is "+ b);
		m1();// m1 is static method
	}

}
