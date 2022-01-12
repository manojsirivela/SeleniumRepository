package p11;

import constructor.Global_variables; // other class from package constructor

public class Bot {

	public static void main(String[] args) 
	{
	 new Global_variables().m1(); // calling non static method
	 Global_variables.m2(); // calling static method
		int f= new Global_variables().a; //calling non static variable
		System.out.println(f);
		String j=Global_variables.email; // calling static variable
        System.out.println(j);		
	}

}
