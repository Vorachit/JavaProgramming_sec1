import javax.swing.*;

import java.text.DecimalFormat;
import java.util.*;

public class Withdrawal {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("###,###.00");
		
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int withdrawMoney = Integer.parseInt(JOptionPane.showInputDialog("Your balance :" 
											+ frm.format(balance) + "\nInput money to withdraw: "));
		
		if(withdrawMoney > balance) {
			
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance"
												,"ERROR",JOptionPane.ERROR_MESSAGE);
			
		}
		else if(withdrawMoney <= balance && withdrawMoney >=20000 && withdrawMoney >= 100) {
			
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000 "
												,"ERROR",JOptionPane.ERROR_MESSAGE);
			
		}
		else if(withdrawMoney%100!=0 && withdrawMoney <= 100) {
			
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw " + withdrawMoney + " baht."
												,"ERROR",JOptionPane.ERROR_MESSAGE);
			
		}
		
		else {
		int bth = withdrawMoney / 1000;
		int bfh = (withdrawMoney - bth*1000)/500;
		int bh = (withdrawMoney - bth*1000 - bfh*500)/100;
			
			JOptionPane.showMessageDialog(null, "You withdraw " + withdrawMoney + " baht."
												+ "\n 1,000 = "+ bth
												+ "\n 500 = " + bfh
												+ "\n 100 = " + bh);
			
		};
	}

}
