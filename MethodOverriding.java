package Week09;

import java.util.Scanner;
class Student{
	String name;
	float[] CIE= {0,0,0};
	float avg;
	byte rollNo;
	void setStudent(String n,float ia[],byte rno) {
		float sum=0.0f;
		name=n;
		avg=0.0f;
		rollNo=rno;
		for(byte i=0;i<3;i++) {
			CIE[i]=ia[i];
			this.calculateAverage();
		}
	}
	void calculateAverage() {
		float sum=0.0f;
		for(byte i=0;i<3;i++) {
			sum=sum+CIE[i];
			avg=sum/3.0f;
		}
	}
	void showStudent() {
		System.out.println(rollNo+"\t"+name+"\t\t"+avg+"\t\t");
	}
}
class Grade extends Student{
	final byte grace=10;float attendance;
	Scanner inScanner=new Scanner(System.in);
	void setStudent(String n,float ia[],byte rno) {
		System.out.println("Enter the attendence of Student...");
		float attendence = inScanner.nextFloat();
		if(attendence>=75.0f) {
			ia[2]=grace;
			super.setStudent(n, ia, rno);
		}
		else {
			super.setStudent(n, ia, rno);		
		}
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		Grade deeps=new Grade();
		float[]CIE= {18.4f,23.7f,0};
		deeps.setStudent("Deepika", CIE,(byte)15);
		System.out.println("The Internal Details of a Student");
		System.out.println("Roll_No\t\tName\t\tAverage");
		deeps.showStudent();
	}
}
