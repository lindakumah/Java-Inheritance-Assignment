package javaInheritance;

class member{
	String Name;
	int Age;
	String PhoneNumber;
	int Address;
	int Salary;
	
	void printSalary(int salary) {
		this.Salary = salary;
		System.out.println("The salary of the employee is " + salary);
	}
	
}

class employee extends member{
	String specialization;
}

class manager extends member{
	String department;
}

public class Q2 {

	public static void main(String[] args) {
		
		employee secratary = new employee();
		secratary.Name = "Miss Sarah Mensah";
		secratary.Age = 34;
		secratary.PhoneNumber = "0265643892";
		secratary.Salary = 3000;
		
		System.out.println("Employee's name: " + secratary.Name + " Age: " + secratary.Age + " Phone Number: " + secratary.PhoneNumber + " Salary: " + secratary.Salary);
        
		manager accountsMgr = new manager();
		accountsMgr.Name = "Mr Enoch Gyasi";
		accountsMgr.Age = 39;
		accountsMgr.PhoneNumber = "0247356704";
		accountsMgr.Salary = 8000;
		
		System.out.println("Manager's name: " + accountsMgr.Name + " Age: " + accountsMgr.Age + " Phone Number: " + accountsMgr.PhoneNumber + " Salary: " + accountsMgr.Salary);

	}

}
