//1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
//provide accessor methods on these attributes and allow them to call from outside of your class.

package sample;

public class shape {
	private int width;
	private int height;
	
	public void setwidth(int num)
	{
		this.width= num;
	}
	public int getwidth() {
		return width;
		
	}
	public void setheight(int num)
	{
		this.height= num;
	}
	public int getheight()
	{
		return  height;
	}
	public static void main(String[] args) {
		
		shape m1 = new shape();
		m1.setwidth(50);
		m1.setheight(100);
		System.out.println("widhth is:"+ m1.getwidth());
		System.out.println("height is:"+m1.getheight());

	}

}
