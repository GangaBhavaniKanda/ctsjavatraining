//inheritance with Is-a relation
package example;
class Box2D{
	int length;
	int breadth;
	Box2D()
	{
		length = 3;
		breadth=4;
		
	}
	public void calArea()
	{
		System.out.println("area is"+ length*breadth);
	}
	static {System.out.println("this is static block inside the parent class");}
	 {System.out.println("this is non static block inside the parent class");}
}
class Box3D extends Box2D{
	int height;
	Box3D()
	{
		height=6;
	}
	public void calVolume()
	{
		System.out.println("volume is"+ length*breadth*height);
	}
	static {System.out.println("this is static block inside the child class");}
	 {System.out.println("this is non static block inside the child class");}
}

public class InheritanceExample {
	public static void main(String []args) {
		Box3D b=new Box3D();
		b.calArea();
		b.calVolume();
	}

}
