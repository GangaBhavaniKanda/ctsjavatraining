package dto;

public class Users {
	String uname;
	String pswd;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPswd() {
		return pswd;
	}
	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
	@Override
	public String toString() {
		return "Users [uname=" + uname + ", pswd=" + pswd + "]";
	}
	public Users(String uname, String pswd) {
		super();
		this.uname = uname;
		this.pswd = pswd;
	}
	

}
