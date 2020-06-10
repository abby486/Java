//Display numbers from 3 to 30 except number 24  using while loop.

public class Except_Number
{
public static void main(String[] args)
{
int i=3;
while(i<=30)
{
if (i==24)
{
i= i+1;
continue;
}

System.out.println("\n"+ i);
i++;

}
}
} 
