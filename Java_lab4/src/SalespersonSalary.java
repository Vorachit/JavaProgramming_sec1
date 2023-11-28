import java.util.*;

public class SalespersonSalary {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		
		int sales;
		double salary;
		
		while(true){
				
			System.out.print("\nEnter sales in dollars (or -1 to end) : ");
			sales = scan.nextInt();
			
			if(sales > SENTINEL) {
			salary = (sales * COMMISSION_RATE) + 1000;
			
			System.out.printf("Salary is : %.2f", salary);
	
			}
			else if(sales == SENTINEL) {
			System.out.println("bye");
			break;
			}
			}
		}
}
