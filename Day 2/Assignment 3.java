//Define a class "Emp" with private static member "int cnt".
//How will u make sure that outsiders can read the value of cnt ?

package sample;

public class Emp {
	private static int cnt=70;
	public static int getCnt() {
		return cnt;
	}

	public static void main(String[] args) {
	Emp m1 = new Emp();
	System.out.println(getCnt());

	}

}
