	//Author: Divine Iloh
	//BINS 5312
	//Date: 02/24/2022
	
package GPA_Calculator;
import javax.swing.JOptionPane;

public class GPA_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declaring variables
		int courses = 0;
		String userInput = "";
		double GPA = 0;
		String A = "A", B = "B", C = "C", D = "D";
		double cumGPA = 0;
				
		//use JOptionPane to receive user input
		userInput = JOptionPane.showInputDialog("Enter Spring 2021 semester number of courses you took and passed");
		courses = Integer.parseInt(userInput); //converting userInput to int

		
		//use for loop to prompt user to enter grade letter for each course
		for (int x = 1; x <= courses; x++)
		{
			userInput = JOptionPane.showInputDialog("Enter Letter Grade for Course Number " + x);
			
			//if statement to determine if userInput equals grade A	
			if (userInput.equals(A))
					{GPA += 4.0;}
			
			//if else statement to determine if userInput equals grade B
			else if (userInput.equals(B))
				{GPA += 3.0;}
				
			//if else statement to determine if userInput equals grade C
			else if (userInput.equals(C))
				{GPA += 2.0;}
			
			//if else statement to determine if userInput equals grade D
			else if (userInput.equals(D))
				{GPA += 1.0;}
			
			//else statement to calculate every other input for grade as 0
			else
				{GPA =+ 0;}
				

		}
		
		//Calculate cumulative GPA
		cumGPA = GPA / courses;
		String msg = ("Your Spring 2021 Semester GPA is " + cumGPA);
		
		JOptionPane.showMessageDialog(null, msg);
		
		 
		
		
	}

}
