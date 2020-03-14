package IOStreams;
import java.io.*;
public class Emploeeeeee implements Serializable{
	private String name;
	private int emp_id;
	private double sal;
	Emploeeeeee(String name,int emp_id,double sal){
		this.name=name;
		this.emp_id=emp_id;
		this.sal=sal;
	
}
	@Override
	public String toString() {
		return "Emploeeeeee [name=" + name + ", emp_id=" + emp_id + ", sal=" + sal + "]";
	}
}
