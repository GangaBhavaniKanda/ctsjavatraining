package predefinedFunctional_interfaces;

import java.util.function.Predicate;

 class User{
	int uid;
	String pswd;
	User(int uid,String str){
		this.uid=uid;
		this.pswd=str;
	}
}

public class UserAuthentication {

	public static void main(String[] args) {
		User u1=new User(12343,"ganga");
		User u2=new User(1234,"admin");
		Predicate<User> p= u->u.uid==1234 && u.pswd.equals("admin");
		if(p.test(u2))
			System.out.println("authenication successfull");
		else
			System.out.println("invalid authenication ");
									
		

	}

}
