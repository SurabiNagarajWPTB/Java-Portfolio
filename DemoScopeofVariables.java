package Week01;

class Hospital {
	//Instance variable
	String patientName;
	int patientid;
	//Static(class) variable
	static String DocName= "Dr.Murthy";
	void sethospital(String pN,int pId)
	{
	patientName=pN;
	patientid=pId;
	}
	String getpatientName()
	{
	return patientName;
	}
	int getpatientid()
	{ 
		return patientid;
	}
}
public class DemoScopeofVariables {

	public static void main(String[] args) {
		String hospitalName="Apollo Hosapital";
		Hospital patient1=new Hospital();
		patient1.sethospital("Anita Joseph",101);
		System.out.println("The patient " +patient1.getpatientName()+" With the Id " +patient1.getpatientid()+" is treated by " +patient1.DocName+"at " +hospitalName);
	}

}
