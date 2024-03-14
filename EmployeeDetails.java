package Week02;

class Employee{
	String empName;
	int empID;
	byte expYrs;
	String gender;
	double basicSalary;
	double bonus;
	double netSalary;
	void setEmployee(String eN,int eID,byte exp,String gend,double basicsal) {
		empName=eN;
		empID=eID;
		expYrs=exp;
		gender=gend;
		basicSalary=basicsal;
	}
	void getEmployee() {
		if(gender=="female") {
			bonus=basicSalary*10/100;
			netSalary=basicSalary+bonus;
		}
		else {
			netSalary=basicSalary;
		}
		System.out.println(empName+"\t"+empID+"\t"+expYrs+"\t"+gender+"\t\t"+basicSalary+"\t"+bonus+"\t\t"+netSalary);
	}
}
public class EmployeeDetails {

	public static void main(String[] args) {
		System.out.println("******************************************************************************************");
		System.out.println("Name\tID\tExpYrs\tGender\t\tBasicSalary\tBonus\t\tNetSalary");
		System.out.println("******************************************************************************************");
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.setEmployee("Surya",34,(byte)10,"male",100000.0d);
		emp2.setEmployee("Manya",67,(byte)05,"female",150000.0d);
		emp1.getEmployee();
		emp2.getEmployee();
	}

}
