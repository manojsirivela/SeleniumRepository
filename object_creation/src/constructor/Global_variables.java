package constructor;

public class Global_variables 
{
	// global variables a, name, email, fee declaration
	
	public        int a=135; // non static variable 
	              String name="Mindq123"; // non- static variable
    public static String email="info@mindqsys.com"; // static variable
           static double fee =11000.5268; // static variable
    
    public void m1()// non static method
    
    {
    	
    	System.out.println("printing non-static variable in non-static method "+ a);
    	System.out.println("printing static variable in non static method "+ email);
    }
    
   public static void m2() // static method
    {
    	new Global_variables().m1(); 
    	System.out.println("printing....vvvf static variable in static method "+ fee);
    	System.out.println("printing non-static variable in static method "+ new Global_variables().name);
    }

	public static void main(String[] args) 
	{
		m2(); // calling static method within same class
		//new Object_creation_pgrm().m3(176);
		

	}

}
