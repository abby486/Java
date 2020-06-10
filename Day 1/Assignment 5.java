// Using if…….else if….  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  

public class Result
{
public static void main(String[] args)
{
int i =80;

if(i<0 || i>100){
System.out.println("Invalid data");
}

else if(i>=75 )
System.out.println("Distinction");

else if(i>50 && i<=60)
System.out.println("First Class ");

else if(i>=35 && i<=50)
System.out.println("Second Class");

else if(i>35 )
System.out.println("You are pass");

else
System.out.println("You are fail");


}


}
