package example;

public class Overloading {

	public static void main(String[] args) {
		FindArea f=new FindArea();
		f.area(5);
		f.area(3,4);
		f.area(4, 5, 3);
		f.area(5, 4, 5, 4);

	}

}
class FindArea{
	public void area(int side) {
		System.out.println("area of square:"+(side*side));
	}
	public void area(int l,int b) {
		System.out.println("area of rectangle:"+(l*b));
	}
	public void area(int s1,int s2,int s3) {
		System.out.println("perimeter of triangle:"+(s1*s2*s3));
	}
	public void area(int s1,int s2,int s3,int s4 ) {
		System.out.println("area of rectangle:"+(s1*s2*s3*s4));
	}
}
