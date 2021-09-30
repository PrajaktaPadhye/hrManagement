package Module;

public class Employee{
	private int empid;
	private String empname;
	private int did;
	private  String empaddress;
	private String city;
	private String dob;
	Employee (){
		
	}

	public Employee(int empid, String empname, int did, String empaddress, String city, String bid) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.did = did;
		this.empaddress = empaddress;
		this.city = city;
		this.dob = bid;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", did=" + did + ", empaddress=" + empaddress
				+ ", city=" + city + ", dob=" + dob + "]";
	}
	
}
