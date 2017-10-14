package Game;

import javax.swing.JOptionPane;

public class TableForXandY {
	public static void main(String [] args)
	{
	int x = 0;
	int y = 0;
	{
		String aS = JOptionPane.showInputDialog("Input 'a' value");
		String bS = JOptionPane.showInputDialog("Input 'b' value");
		
		int a = Integer.parseInt(aS);
		int b = Integer.parseInt(bS);
		
		for(int i = 0; i < 10; i++)
		{
			x = i;
			y = a * (b^x);
			System.out.println("x" + i + " = " + x + "               " + "y" + i + " = " + y);
		}
	}
	}
}
