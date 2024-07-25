package demo.ptpl;
abstract class Employee {
    // Abstract methods
    abstract double calculateSalary();
    abstract void displayDetails();
}


class FullTimeEmployee extends Employee {
    double baseSalary;
    double benefits;

    
    public FullTimeEmployee(double baseSalary, double benefits) {
        this.baseSalary = baseSalary;
        this.benefits = benefits;
    }

   
    
    double calculateSalary() {
        return baseSalary + benefits;
    }

    
    void displayDetails() {
        System.out.println("Full-Time Employee Details:");
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Benefits: " + benefits);
        System.out.println("Total Salary: " + calculateSalary());
    }
}


class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    
    public PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    
    void displayDetails() {
        System.out.println("Part-Time Employee Details:");
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

public class Job {

	public static void main(String[] args) {
		FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(50000, 10000);
		PartTimeEmployee partTimeEmployee = new PartTimeEmployee(20, 100);
		fullTimeEmployee.displayDetails();
		partTimeEmployee.displayDetails();
	}

}
