class Rectangle
{
	int length, width;//declaration of variables
	void setData(int x, int y)//definition of method
	{
		length=x;
		width=y;
	}
	int rectArea()//definition of another method
	{
		int area=length*width;
		return(area);
	}
}
class Program_8_1//RectArea //class with main method
{
	public static void main(String args[])
	{
		int area1, area2;
		Rectangle rect1=new Rectangle();//creating objects
		Rectangle rect2=new Rectangle();
		rect1.length=15;//accessing variables
		rect1.width=10;
		area1=rect1.length*rect1.width;
		rect2.setData(20, 12);//Accessing methods
		area2=rect2.rectArea();
		System.out.println("Area1 = " +area1);
		System.out.println("Area2 = " +area2);
	}

}