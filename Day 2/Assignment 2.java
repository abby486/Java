
/*
-Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments
*/

public class constructor {
	int i,j;
	constructor (int num)
	{
		this.i=num;
		this.j=0;
	}
	constructor()
	{
		System.out.println("default constructor");
	}
	constructor (int a ,int b  )
	{
		this.i=a;
		this.j=b;
	}
	

	public static void main(String[] args) {
		constructor m1= new constructor(200);
		constructor m2= new constructor();
		constructor m3= new constructor(300,400);
	

	}

}
