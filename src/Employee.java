import java.util.Scanner;


public class Employee {
	private int iEmpID;
	private String sEmpName;
	private float fBasicSalary;
	private float fAllowance;
	private float fGrossSalary;
	private float fIncomeTax;
	private float fTaxPercent;
	private float fNetSalary;

	Scanner Input = new Scanner(System.in);
	
	Employee(){
		System.out.print("\t\t\tEmployee Database\n\n" + "Enter your Details-\n"+"Employee ID: ");
		this.iEmpID = Input.nextInt();
		System.out.print("Name: ");
		this.sEmpName= Input.nextLine();
		this.sEmpName= Input.nextLine();
		System.out.print("Basic Salary: ");
		this.fBasicSalary= Input.nextFloat();
	}
	
	
	float calAllowance(Employee object){
		return (float) (fBasicSalary*0.46);
	}
	
	float calGrossSalary(Employee object){
		return (float) (object.fAllowance+object.fBasicSalary);
	}
	
	float calIncomeTax(float fGrossSalary) {
		if (fGrossSalary < 5000)
			 fTaxPercent = 0;

		else if (fGrossSalary >= 5000 && fGrossSalary <= 10000)
			 fTaxPercent = 1;

		else if (fGrossSalary >= 10000 && fGrossSalary <= 20000)
			 fTaxPercent = 2;

		else if (fGrossSalary > 20000)
			 fTaxPercent = 3;
		
		return (fGrossSalary) * (fTaxPercent/ 10);
	}
	
	
	public int getiEmpID() {
		return iEmpID;
	}


	public String getsEmpName() {
		return sEmpName;
	}


	public float getfBasicSalary() {
		return fBasicSalary;
	}


	public float getfAllowance() {
		return fAllowance;
	}

	public float getfGrossSalary() {
		return fGrossSalary;
	}
	
	public Scanner getInput() {
		return Input;
	}
	
	void displayDetails(Employee object){
		System.out.println("\n\n\t\t\tEmployee Details\n\n\tID: " + object.iEmpID);
		System.out.print("\n\tName: "+ object.sEmpName);
		System.out.print("\n\tBasic Salary: " + object.fBasicSalary);
		object.fAllowance= calAllowance(object);
		System.out.print("\n\tAllowance: " + object.fAllowance);
		object.fGrossSalary= calGrossSalary(object);
		object.fIncomeTax= calIncomeTax(object.fGrossSalary);
		object.fNetSalary= (fGrossSalary-fIncomeTax);
		System.out.print("\n\tGross Salary: " + object.fGrossSalary);
		System.out.print("\n\tTax to be paid: " + object.fIncomeTax);
		System.out.println("\n\tNet Salary: " + object.fNetSalary);
	}
	
}
