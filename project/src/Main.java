import java.util.*;
public class Main{
    public static void main (String[] args) {
        Employee e=new Employee();
       e=getEmployeeDetails();
      
       int pf=getPFPercentage();
       
      e.calculateNetSalary(pf);
        
    }
     public static Employee getEmployeeDetails(){
         Scanner sc=new Scanner(System.in);
         Employee emp=new Employee();
         System.out.println("Enter Id:");
         int id=sc.nextInt();
         System.out.println("Enter Name:");
         String name=sc.next();
         System.out.println("Enter salary:");
         double sal=sc.nextDouble();
         emp.setEmployeeId(id);
         emp.setEmployeeName(name);
         emp.setSalary(sal);
         return emp;
     }
     public static int getPFPercentage(){
    	 Scanner sc=new Scanner(System.in);
         int pf=sc.nextInt();
          return pf;
          
     }
}