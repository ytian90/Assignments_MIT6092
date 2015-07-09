package assignment2;
/**
 * MIT6_092 Assignment 2
 * @author yutian
 * @since Jul 8, 2015
 */
public class FooCorporation {

	public static void main(String[] args) {
		
		System.out.println("Employee1 with base 7.50 and hours 35");
		System.out.println("Salary: " + getPay(7.50, 35) + "\n");
		
		System.out.println("Employee2 with base 8.20 and hours 47");
		System.out.println("Salary: " + getPay(8.20, 47) + "\n");
		
		System.out.println("Employee3 with base 10.00 and hours 73");
		System.out.println("Salary: " + getPay(10.00, 73));
		
	}
	
	public static double getPay(double basePay, int hoursWorked)
	{
		
		if (basePay < 8.00)
			System.err.println("Lower than minimum wage");
		if (hoursWorked > 60)
			System.err.println("Working hours should be less than 60");
		if (hoursWorked < 0)
			System.err.println("Working hours can't be negative number!");
		
		if (hoursWorked < 40)
			return basePay * hoursWorked;
		else
			return basePay * 40 + 1.5 * basePay * (hoursWorked - 40);
			
	}

}
