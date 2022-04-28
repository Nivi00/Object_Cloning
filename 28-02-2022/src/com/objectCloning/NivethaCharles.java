package com.objectCloning;

//step1
public class NivethaCharles implements Cloneable
{
	
	String name;
	int age;
	
	public NivethaCharles() 
	{

		name = "NivethaCharles";
		age = 47;
		
	}
	
	public void getDetails()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
	//step2
	public static void main(String[] args) throws CloneNotSupportedException
	{
		//step3
		NivethaCharles s1 = new NivethaCharles();
		s1.getDetails();
		
		System.out.println("================");
		
		//step4
		NivethaCharles s2 = (NivethaCharles) s1.clone();
		s2.getDetails();
		
	}

}
