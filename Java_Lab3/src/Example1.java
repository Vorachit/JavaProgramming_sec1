import javax.swing.*;
import java.text.*;

public class Example1 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		final int BUFFET = 299;
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		
		double discount,totalPrice=0;
		totalPrice = BUFFET * numberofCustomer;
		int member;
		
		do {
			member = JOptionPane.showConfirmDialog(null, "Total price is " +  frm.format(totalPrice) + "baht." 
				   + "\nDo you hvae a member card?");
			}while(member==JOptionPane.CANCEL_OPTION);
		
		if(member == JOptionPane.YES_OPTION) {
			
			discount = totalPrice * 90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + discount + "baht.");
			
		}//end if
		else if(member == JOptionPane.NO_OPTION) {
			
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + totalPrice + "baht.");
			
		}//end else
		
	}

}
