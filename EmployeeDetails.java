package Week02;

class Employee{
	String empName;
	int empNO;
	float salary;
	String empDesig;
	byte expYrs;
	
	void setEmployee(String eN,int no,float sal,String des,byte ex) {
		empName=eN;
		empNO=no;
		salary=sal;
		empDesig=des;
		expYrs=ex;
	}
	void getEmployee() {
		System.out.println(empName+"\t"+empNO+"\t"+salary+"\t"+empDesig+"\t"+expYrs);
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		System.out.println("Name\tNO\tSalary\tDesignation\t\texpYrs");
		Employee rahul=new Employee();
		rahul.setEmployee("Rahul",34,80000.0f,"PM",(byte)10);
		rahul.getEmployee();
		Employee rakesh=new Employee();
		rakesh.empName="Rakesh Batra";
		rakesh.empNO=90;
		rakesh.salary=894576.0f;
		rakesh.empDesig="Project Lead";
		rakesh.expYrs=(byte)5;
		rakesh.getEmployee();
	}

}
